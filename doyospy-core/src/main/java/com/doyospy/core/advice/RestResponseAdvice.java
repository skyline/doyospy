//package com.doyospy.core.advice;
//
//import com.doyospy.core.annotation.RestResponse;
//import com.doyospy.core.result.ResponseResult;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import lombok.SneakyThrows;
//import org.springframework.core.MethodParameter;
//import org.springframework.http.MediaType;
//import org.springframework.http.converter.HttpMessageConverter;
//import org.springframework.http.server.ServerHttpRequest;
//import org.springframework.http.server.ServerHttpResponse;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;
//
///**
// * Rest响应处理
// * @author  Robin
// */
//@RestControllerAdvice
//public class RestResponseAdvice implements ResponseBodyAdvice<Object> {
//    private final ObjectMapper objectMapper;
//
//    public RestResponseAdvice(ObjectMapper objectMapper) {
//        this.objectMapper = objectMapper;
//    }
//
//    @Override
//    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
//        return returnType.hasMethodAnnotation(RestResponse.class);
//    }
//
//    @SneakyThrows
//    @Override
//    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
//        if (body instanceof String) {
//            return objectMapper.writeValueAsString(ResponseResult.success(body));
//        }
//        if (body instanceof ResponseResult) {
//            return body;
//        }
//        return ResponseResult.success(body);
//    }
//}
