package com.doyospy.core.define;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * HTTP状态码
 * @author  Robin
 */
@Getter
@AllArgsConstructor
public enum HttpStatusEnum {
    CONTINUE(100, "继续请求"),
    SWITCHING_PROTOCOLS(101, "切换协议"),
    PROCESSING(102, "处理中"),
    EARLY_HINTS(103, "早期提示"),
    SUCCESS(200, "请求成功"),
    CREATED(201, "资源创建成功"),
    ACCEPTED(202, "请求被接受"),
    NON_AUTHORITATIVE_INFORMATION(203, "非授权信息"),
    NO_CONTENT(204, "请求成功，但没有返回任何内容"),
    RESET_CONTENT(205, "重置内容"),
    PARTIAL_CONTENT(206, "部分内容"),
    MULTI_STATUS(207, "多状态"),
    ALREADY_REPORTED(208, "已报告"),
    IM_USED(226, "IM Used"),
    MULTIPLE_CHOICES(300, "请求的资源可在多处得到"),
    MOVED_PERMANENTLY(301, "请求的资源已被永久移动到新位置"),
    FOUND(302, "请求的资源已被临时移动到新位置"),
    SEE_OTHER(303, "请求的资源已被临时移动到新位置"),
    NOT_MODIFIED(304, "请求的资源未被修改"),
    USE_PROXY(305, "请求的资源必须通过代理访问"),
    UNUSED(306, "请求的资源不再可用"),
    TEMPORARY_REDIRECT(307, "临时重定向"),
    PERMANENT_REDIRECT(308, "请求的资源已被永久移动到新位置"),
    BAD_REQUEST(400, "请求参数有误"),
    UNAUTHORIZED(401, "未授权"),
    FORBIDDEN(403, "访问受限，授权过期"),
    NOT_FOUND(404, "请求的资源不存在"),
    METHOD_NOT_ALLOWED(405, "不被允许的请求方法"),
    CONFLICT(409, "请求的资源与资源的当前状态发生冲突"),
    GONE(410, "请求的资源已永久删除"),
    LENGTH_REQUIRED(411, "服务器拒绝在没有定义Content-Length字段的情况下接受请求"),
    PRECONDITION_FAILED(412, "在请求头中定义的预处理失败"),
    PAYLOAD_TOO_LARGE(413, "请求的负载过大"),
    REQUEST_ENTITY_TOO_LARGE(414, "请求的实体过大"),
    UNSUPPORTED_MEDIA_TYPE(415, "请求的媒体类型不支持"),
    REQUESTED_RANGE_NOT_SATISFIABLE(416, "请求的范围无法满足请求"),
    EXPECTATION_FAILED(417, "服务器无法满足Expect的请求头信息"),
    I_AM_A_TEAPOT(418, "服务器拒绝服务，通常是为了防止服务器过载"),
    MISDIRECTED_REQUEST(421, "请求被重定向到错误的目的地"),
    UNPROCESSABLE_ENTITY(422, "请求的资源无法处理"),
    LOCKED(423, "请求的资源被锁定"),
    FAILED_DEPENDENCY(424, "由于之前的某个请求发生的错误，导致当前请求失败"),
    UPGRADE_REQUIRED(426, "客户端需要升级才能使用当前请求的资源"),
    PRECONDITION_REQUIRED(428, "客户端请求中的前提条件被服务器评估为失败"),
    TOO_MANY_REQUESTS(429, "客户端的请求次数超过限额"),
    REQUEST_HEADER_FIELDS_TOO_LARGE(431, "由于请求头字段过大，导致服务器拒绝服务"),
    UNAVAILABLE_FOR_LEGAL_REASONS(451, "由于服务器上存储的资源无法公开，导致服务器拒绝服务"),
    ERROR(500, "服务器内部错误"),
    NOT_IMPLEMENTED(501, "接口未实现"),
    BAD_GATEWAY(502, "网关错误"),
    SERVICE_UNAVAILABLE(503, "服务不可用"),
    GATEWAY_TIMEOUT(504, "网关超时"),
    HTTP_VERSION_NOT_SUPPORTED(505, "不支持的HTTP版本"),
    VARIANT_ALSO_NEGOTIATES(506, "服务器无法根据客户端请求的内容特性完成请求"),
    INSUFFICIENT_STORAGE(507, "服务器暂时无法处理请求，稍后重试"),
    LOOP_DETECTED(508, "服务器在处理请求时发生了循环引用"),
    NOT_EXTENDED(510, "获取资源所需要的策略并没有被满足"),
    NETWORK_AUTHENTICATION_REQUIRED(511, "客户端需要进行身份验证才能获取网络访问权限"),
    ;

    private final Integer code;
    private final String msg;
}
