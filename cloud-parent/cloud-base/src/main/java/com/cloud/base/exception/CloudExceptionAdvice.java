package com.cloud.base.exception;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cloud.base.cache.CloudRedisTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cloud.base.ExceptionConstant;

@ControllerAdvice
public class CloudExceptionAdvice {

    private Logger log = LoggerFactory.getLogger(CloudExceptionAdvice.class);

    /**
     * 全局异常处理
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Map<String, Object> exceptionHandler(Exception ex) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", ExceptionConstant.REQUEST_ERROR.getCode());
        map.put("msg", ExceptionConstant.REQUEST_ERROR.getMsg());
        log.error(ex.getMessage());
        return map;
    }

    /**
     * 拦截参数校验异常 MethodArgumentNotValidException.class
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public Map<String, Object> cloudExceptionHandler(MethodArgumentNotValidException ex) {
        Map<String, Object> map = new HashMap<>();
        List<FieldError> fieldErrors = ex.getBindingResult().getFieldErrors();
        fieldErrors.forEach(error -> map.put("msg", error.getDefaultMessage()));
        log.error(ex.getMessage());
        return map;
    }

    /**
     * 拦截自定义异常 CloudException.class
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = CloudException.class)
    public Map<String, Object> cloudExceptionHandler(CloudException ex) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", ex.getCode());
        map.put("msg", ex.getMsg());
        return map;
    }

}
