package com.cloud.base.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.ServletModelAttributeMethodProcessor;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class WebMvcConfigurationConfig extends WebMvcConfigurationSupport {

    @Autowired
    private CloudHandlerInterceptor handlerInterceptor;

    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(handlerInterceptor).addPathPatterns("/**");
        super.addInterceptors(registry);
    }

    @Autowired
    private CloudRequestResponseBodyMethodProcessor methodProcessor;

    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        super.addArgumentResolvers(argumentResolvers);
        argumentResolvers.add(methodProcessor);
    }

    public void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> returnValueHandlers) {
        super.addReturnValueHandlers(returnValueHandlers);
        returnValueHandlers.add(methodProcessor);
    }

    @PostConstruct
    public void init() {
        final List<HandlerMethodArgumentResolver> argumentResolvers = new ArrayList<>(requestMappingHandlerAdapter().getArgumentResolvers());
        argumentResolvers.add(0, methodProcessor);
        requestMappingHandlerAdapter().setArgumentResolvers(argumentResolvers);

        final List<HandlerMethodReturnValueHandler> returnValueHandlers = new ArrayList<>(requestMappingHandlerAdapter().getReturnValueHandlers());
        returnValueHandlers.add(0, methodProcessor);
        requestMappingHandlerAdapter().setReturnValueHandlers(returnValueHandlers);
    }

}
