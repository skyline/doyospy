package com.doyospy.core.result;

import com.doyospy.core.annotation.RestResponse;
import com.doyospy.core.define.HttpStatusEnum;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * 返回结果集
 * @author  Robin
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseResult<T> {
    /**
     * 状态码
     */
    private Integer code;

    /**
     * 信息
     */
    private String msg;

    /**
     * 数据
     */
    private T data;

    /**
     * 全参数方法
     * @param code
     * @param msg
     * @param data
     * @return
     * @param <T>
     */
    private static <T> ResponseResult<T> response(Integer code, String msg, T data) {
        ResponseResult<T> responseResult = new ResponseResult<>();
        responseResult.setCode(code);
        responseResult.setMsg(msg);
        responseResult.setData(data);
        return responseResult;
    }

    /**
     * 不带数据参数的方法
     * @param code
     * @param msg
     * @return
     * @param <T>
     */
    private static <T> ResponseResult<T> response(Integer code, String msg) {
        ResponseResult<T> responseResult = new ResponseResult<>();
        responseResult.setCode(code);
        responseResult.setMsg(msg);
        return responseResult;
    }

    /**
     * 成功返回，不带参数
     * @return
     * @param <T>
     */
    public static <T> ResponseResult<T> success() {
        return response(HttpStatusEnum.SUCCESS.getCode(), HttpStatusEnum.SUCCESS.getMsg());
    }

    /**
     * 成功返回，带状态码和信息参数
     * @param code
     * @param msg
     * @return
     * @param <T>
     */
    public static <T> ResponseResult<T> success(Integer code, String msg) {
        return response(code, msg);
    }

    /**
     * 返回成功，带信息和数据
     * @param msg
     * @param data
     * @return
     * @param <T>
     */
    public static <T> ResponseResult<T> success(String msg, T data) {
        return response(HttpStatusEnum.SUCCESS.getCode(), msg, data);
    }

    /**
     * 成功返回，带状态码、信息和数据参数
     * @param code
     * @param msg
     * @param data
     * @return
     * @param <T>
     */
    public static <T> ResponseResult<T> success(Integer code, String msg, T data) {
        return response(code, msg, data);
    }

    /**
     * 返回成功，带数据参数
     * @param data
     * @return
     * @param <T>
     */
    public static <T> ResponseResult<T> success(T data) {
        return response(HttpStatusEnum.SUCCESS.getCode(), HttpStatusEnum.SUCCESS.getMsg(), data);
    }

    /**
     * 返回成功，带信息参数
     * @param msg
     * @return
     * @param <T>
     */
    public static <T> ResponseResult<T> success(String msg) {
        return response(HttpStatusEnum.SUCCESS.getCode(), msg);
    }

    /**
     * 返回失败，不带参数
     * @return
     * @param <T>
     */
    public static <T> ResponseResult<T> error() {
        return response(HttpStatusEnum.ERROR.getCode(), HttpStatusEnum.ERROR.getMsg());
    }

    /**
     * 返回失败，带枚举参数
     * @param httpStatusEnum
     * @return
     * @param <T>
     */
    public static <T> ResponseResult<T> error(HttpStatusEnum httpStatusEnum) {
        return response(httpStatusEnum.getCode(), httpStatusEnum.getMsg());
    }

    /**
     * 返回失败，带状态码、信息和数据参数
     * @param code
     * @param msg
     * @param data
     * @return
     * @param <T>
     */
    public  static <T> ResponseResult<T> error(Integer code, String msg, T data) {
        return response(code, msg, data);
    }

    /**
     * 返回失败，带状态码和信息参数
     * @param code
     * @param msg
     * @return
     * @param <T>
     */
    public  static <T> ResponseResult<T> error(Integer code, String msg) {
        return response(code, msg);
    }

    /**
     * 返回失败，带信息和数据参数
     * @param msg
     * @param data
     * @return
     * @param <T>
     */
    public static <T> ResponseResult<T> error(String msg, T data) {
        return response(HttpStatusEnum.ERROR.getCode(), msg, data);
    }

    /**
     * 返回失败，带信息参数
     * @param msg
     * @return
     * @param <T>
     */
    public static <T> ResponseResult<T> error(String msg) {
        return response(HttpStatusEnum.ERROR.getCode(), msg);
    }

    /**
     * 返回失败，带数据参数
     * @param data
     * @return
     * @param <T>
     */
    public static <T> ResponseResult<T> error(T data) {
        return response(HttpStatusEnum.ERROR.getCode(), HttpStatusEnum.ERROR.getMsg(), data);
    }
}
