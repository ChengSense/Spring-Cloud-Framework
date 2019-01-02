/*
 * Copyright 2002-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cloud.base.interceptor;

import com.cloud.base.bean.CloudRequest;
import com.cloud.base.bean.CloudResponse;
import com.cloud.base.cache.CloudRedisTemplate;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import javax.servlet.http.HttpServletRequest;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class CloudRequestResponseBodyMethodProcessor implements HandlerMethodArgumentResolver, HandlerMethodReturnValueHandler {

    public boolean supportsParameter(MethodParameter parameter) {
        return true;
    }

    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
        HandlerMethodArgumentResolver resolver = getArgumentResolver(parameter);
        return setUserInfo(webRequest, resolver.resolveArgument(parameter, mavContainer, webRequest, binderFactory));
    }

    private HandlerMethodArgumentResolver getArgumentResolver(MethodParameter parameter) {
        HandlerMethodArgumentResolver result = this.argumentResolverCache.get(parameter);
        if (result == null) {
            Iterator iterator = this.requestMappingHandlerAdapter.getArgumentResolvers().iterator();
            while (iterator.hasNext()) {
                HandlerMethodArgumentResolver methodArgumentResolver = (HandlerMethodArgumentResolver) iterator.next();
                if (methodArgumentResolver instanceof CloudRequestResponseBodyMethodProcessor) continue;
                if (methodArgumentResolver.supportsParameter(parameter)) {
                    result = methodArgumentResolver;
                    this.argumentResolverCache.put(parameter, methodArgumentResolver);
                    break;
                }
            }
        }
        return result;
    }

    private Object setUserInfo(NativeWebRequest webRequest, Object obj) {
        if (obj instanceof CloudRequest) {
            HttpServletRequest request = webRequest.getNativeRequest(HttpServletRequest.class);
            CloudRequest cloudRequest = (CloudRequest) obj;
            String token = request.getHeader("token");
            if (StringUtils.isNotBlank(token)) {
                cloudRequest.setToken(token);
                CloudRequest user = cloudRedisTemplate.get(token);
                if (user != null && user instanceof CloudRequest) {
                    cloudRequest.setUserId(user.getUserId());
                    cloudRequest.setToken(token);
                }
            }
        }
        return obj;
    }

    public boolean supportsReturnType(MethodParameter methodParameter) {
        return true;
    }

    public void handleReturnValue(Object obj, MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest) throws Exception {
        HandlerMethodReturnValueHandler resolver = getReturnValueHandler(methodParameter);
        resolver.handleReturnValue(new CloudResponse<>(obj), methodParameter, modelAndViewContainer, nativeWebRequest);
    }

    private HandlerMethodReturnValueHandler getReturnValueHandler(MethodParameter parameter) {
        HandlerMethodReturnValueHandler result = this.returnValueHandlerCache.get(parameter);
        if (result == null) {
            Iterator iterator = this.requestMappingHandlerAdapter.getReturnValueHandlers().iterator();
            while (iterator.hasNext()) {
                HandlerMethodReturnValueHandler methodReturnValueHandler = (HandlerMethodReturnValueHandler) iterator.next();
                if (methodReturnValueHandler instanceof CloudRequestResponseBodyMethodProcessor) continue;
                if (methodReturnValueHandler.supportsReturnType(parameter)) {
                    result = methodReturnValueHandler;
                    this.returnValueHandlerCache.put(parameter, methodReturnValueHandler);
                    break;
                }
            }
        }
        return result;
    }

    @Autowired
    private CloudRedisTemplate cloudRedisTemplate;
    @Autowired
    private RequestMappingHandlerAdapter requestMappingHandlerAdapter;

    private final Map<MethodParameter, HandlerMethodArgumentResolver> argumentResolverCache = new ConcurrentHashMap(256);
    private final Map<MethodParameter, HandlerMethodReturnValueHandler> returnValueHandlerCache = new ConcurrentHashMap(256);

}
