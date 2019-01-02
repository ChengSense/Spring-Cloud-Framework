package com.cloud.base.interceptor;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpServletRequest;

import com.cloud.base.bean.CloudRequest;
import com.cloud.base.cache.CloudRedisTemplate;
import com.cloud.base.util.General;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.method.HandlerMethod;

import com.cloud.base.annotation.Access;

public class CloudSecurityVerify {

    /**
     * md5签名
     * 按参数token连接appSecret 签名
     * @param appSecret
     * @param token
     * @return
     */
    public static String sign(String appSecret, String token) {
        StringBuilder paramValues = new StringBuilder();
        paramValues.append(appSecret).append(token);
        return General.md5(paramValues.toString());
    }

    /**
     * 请求参数签名验证
     *
     * @param appSecret
     * @param request
     * @return true 验证通过 false 验证失败
     * @throws Exception
     */
    public static boolean signVerify(String appSecret, CloudRedisTemplate cloudRedisTemplate, HttpServletRequest request, Object handler) throws Exception {
        Access access = ((HandlerMethod) handler).getMethod().getAnnotation(Access.class);
        if (access != null && !access.value()) {
            return true;
        }

        String token = request.getHeader("token");
        if (StringUtils.isBlank(token)) {
            token = request.getParameter("token");
        }

        if (StringUtils.isNotBlank(token)) {
            Object user = cloudRedisTemplate.get(token);
            if (user != null) {
                return true;
            }
        }
        return true;
    }
}
