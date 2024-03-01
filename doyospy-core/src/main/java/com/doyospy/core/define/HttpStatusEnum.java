package com.doyospy.core.define;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum HttpStatusEnum {
    SUCCESS(200, "请求成功"),
    CREATED(201, "资源创建成功"),
    ACCEPTED(202, "请求被接受"),
    NO_CONTENT(204, "请求成功，但没有返回任何内容"),
    MOVED_PERMANENTLY(301, "请求的资源已被永久移动到新位置"),
    FOUND(302, "请求的资源已被临时移动到新位置"),
    SEE_OTHER(303, "请求的资源已被临时移动到新位置"),
    NOT_MODIFIED(304, "请求的资源未被修改"),
    TEMPORARY_REDIRECT(307, "临时重定向"),
    BAD_REQUEST(400, "请求参数有误"),
    UNAUTHORIZED(401, "未授权"),
    FORBIDDEN(403, "访问受限，授权过期"),
    NOT_FOUND(404, "请求的资源不存在"),
    BAD_METHOD(405, "请求方法有误"),
    CONFLICT(409, "请求的资源与资源的当前状态发生冲突"),
    UNSUPPORTED_MEDIA_TYPE(415, "请求的媒体类型不支持"),
    ERROR(500, "服务器内部错误"),
    NOT_IMPLEMENTED(501, "接口未实现"),
    WARN(601, "系统警告消息"),
    ;

    private final Integer code;
    private final String msg;
}
