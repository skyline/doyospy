package com.doyospy.core.exception;

import com.doyospy.core.define.HttpStatusEnum;
import java.text.MessageFormat;

/**
 * 应用层异常处理
 * @author  Robin
 */
public class ApplicationException extends BaseException {
    /**
     * 构造函数
     * @param code      状态码
     * @param format    消息模板
     */
    public ApplicationException(Integer code, String format) {
        this.code = code;
        this.msg = format;
    }

    /**
     * 构造函数
     * @param msg       消息
     */
    public ApplicationException(String msg) {
        this.msg = msg;
        this.code = HttpStatusEnum.BAD_REQUEST.getCode();
    }

    /**
     * 实例化
     * @param msgFormat 信息格式
     * @param args      参数
     * @return          结果
     */
    @Override
    public BaseException newIntance(String msgFormat, Object... args) {
        return new ApplicationException(this.code, MessageFormat.format(msgFormat, args));
    }

    /**
     * 重写堆栈填充
     * @param msgFormat 信息格式
     * @return          结果
     */
    @Override
    public BaseException newInstanceSpecial(String msgFormat) {
        return new ApplicationException(this.code, msgFormat);
    }
}
