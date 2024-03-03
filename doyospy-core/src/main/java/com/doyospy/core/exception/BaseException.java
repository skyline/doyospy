//package com.doyospy.core.exception;
//
//import java.text.MessageFormat;
//
///**
// * 异常处理基类
// * @author  Robin
// */
//public abstract class BaseException extends RuntimeException {
//    /**
//     * 状态码
//     */
//    protected Integer code;
//
//    /**
//     * 消息
//     */
//    protected String msg;
//
//    /**
//     * 异常构造器
//     * @param code          状态码
//     * @param msgFormat     消息模板，内部会用MessageFormat拼接，模板类似：userId={0}, date={1}
//     * @param args          参数
//     */
//    public BaseException(Integer code, String msgFormat, Object... args) {
//        super(MessageFormat.format(msgFormat, args));
//        this.code = code;
//        this.msg = MessageFormat.format(msgFormat, args);
//    }
//
//    /**
//     * 默认构造器
//     */
//    public BaseException() {
//        super();
//    }
//
//    /**
//     * 异常构造器
//     * @param message   信息
//     * @param cause     异常
//     */
//    public BaseException(String message, Throwable cause) {
//        super(message, cause);
//    }
//
//    /**
//     * 异常构造器
//     * @param cause     异常
//     */
//    public BaseException(Throwable cause) {
//        super(cause);
//    }
//
//    /**
//     * 异常构造器
//     * @param message   信息
//     */
//    public BaseException(String message) {
//        super(message);
//    }
//
//    /**
//     * 实例化异常
//     * @param msgFormat 信息格式
//     * @param args      参数
//     * @return  结果集
//     */
//    public abstract BaseException newIntance(String msgFormat, Object... args);
//
//    /**
//     * 实例化异常
//     * @param msgFormat 信息格式
//     * @return  结果集
//     */
//    public abstract BaseException newInstanceSpecial(String msgFormat);
//
//    /**
//     * 重写堆栈填充，不填充错误堆栈信息
//     * @return  异常结果
//     */
//    public Throwable fillInStackTrace() {
//        return this;
//    }
//
//    @Override
//    public String getMessage() {
//        return this.msg;
//    }
//}