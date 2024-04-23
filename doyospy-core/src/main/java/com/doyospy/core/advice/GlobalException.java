package com.doyospy.core.advice;

import com.doyospy.core.define.HttpStatusEnum;
import com.doyospy.core.result.ResponseResult;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import javax.servlet.http.HttpServletRequest;
import java.net.BindException;
import java.nio.file.AccessDeniedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 异常处理配置
 * @author Robin
 */
@RestControllerAdvice
public class GlobalException {
    private static final Logger log = LoggerFactory.getLogger(GlobalException.class);

    /**
     * 权限校验异常
     * @param   e           错误
     * @param   request     请求
     * @return  结果集
     */
    @ExceptionHandler(AccessDeniedException.class)
    public ResponseResult<Void> handleAccessDeniedException(AccessDeniedException e, HttpServletRequest request) {
        String requestURI = request.getRequestURI();
        log.error("请求地址'{}', 权限校验失败'{}'，请联系管理员！", requestURI, e.getMessage());
        return ResponseResult.error(HttpStatusEnum.FORBIDDEN.getCode(), HttpStatusEnum.FORBIDDEN.getMsg());
    }

    /**
     * 请求方式不支持异常
     * @param   e           错误
     * @param   request     请求
     * @return  结果集
     */
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public ResponseResult<Void> handleHttpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException e, HttpServletRequest request) {
        String requestURI = request.getRequestURI();
        log.error("请求地址'{}', 不支持'{}'请求，请联系管理员！", requestURI, e.getMethod());
        return ResponseResult.error(HttpStatusEnum.METHOD_NOT_ALLOWED.getCode(), HttpStatusEnum.METHOD_NOT_ALLOWED.getMsg());
    }

    /**
     * 未知的运行时异常
     * @param   e           错误
     * @param   request     请求
     * @return  结果集
     */
    @ExceptionHandler(RuntimeException.class)
    public ResponseResult<Void> handleRuntimeException(RuntimeException e, HttpServletRequest request) {
        String requestURI = request.getRequestURI();
        log.error("请求地址'{}', 未知异常'{}', 请联系管理员！", requestURI, e.getMessage());
        return ResponseResult.error(e.getMessage());
    }

    /**
     * 系统异常
     * @param   e           错误
     * @param   request     请求
     * @return  结果集
     */
    @ExceptionHandler(Exception.class)
    public ResponseResult<Void> handleException(Exception e, HttpServletRequest request) {
        String requestURI = request.getRequestURI();
        log.error("请求地址'{}', 系统异常'{}', 请联系管理员！", requestURI, e.getMessage());
        return ResponseResult.error(e.getMessage());
    }

    /**
     * 绑定异常
     * @param   e           错误
     * @param   request     请求
     * @return  结果集
     */
    @ExceptionHandler(BindException.class)
    public ResponseResult<Void> handleBindException(BindException e, HttpServletRequest request) {
        String requestURI = request.getRequestURI();
        log.error("请求地址'{}', 参数绑定异常'{}', 请联系管理员！", requestURI, e.getMessage());
        return ResponseResult.error(e.getMessage());
    }

    /**
     * 参数校验异常
     * @param   e           错误
     * @param   request     请求
     * @return  结果集
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Object handleMethodArgumentNotValidException(MethodArgumentNotValidException e, HttpServletRequest request) {
        String requestURI = request.getRequestURI();
        log.error("请求地址'{}', 参数绑定异常'{}', 请联系管理员！", requestURI, e.getMessage());
        return ResponseResult.error(e.getMessage());
    }
}
