package com.doyospy.core.exception;

import com.doyospy.core.define.HttpStatusEnum;
import java.text.MessageFormat;

/**
 * 重复异常
 * @author  Robin
 */
public class DuplicateException extends BaseException {
    /**
     * 构造函数
     * @param code      状态码
     * @param format    消息模板
     */
    public DuplicateException(Integer code, String format) {
        this.code = code;
        this.msg = format;
    }

    /**
     * 构造函数
     * @param msg       消息模板
     */
    public DuplicateException(String msg) {
        this.msg = msg;
        this.code = HttpStatusEnum.LOCKED.getCode();
    }

    /**
     * 实例化
     * @param msgFormat 信息格式
     * @param args      参数
     * @return          结构
     */
    @Override
    public BaseException newIntance(String msgFormat, Object... args) {
        return new DuplicateException(this.code, MessageFormat.format(msgFormat, args));
    }

    /**
     * 重写堆栈填充
     * @param msgFormat 信息格式
     * @return          结果
     */
    @Override
    public BaseException newInstanceSpecial(String msgFormat) {
        return new DuplicateException(this.code, msgFormat);
    }
}
