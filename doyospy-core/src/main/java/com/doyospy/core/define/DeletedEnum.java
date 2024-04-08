package com.doyospy.core.define;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 删除状态枚举
 * @author  Robin
 */
@Getter
@AllArgsConstructor
public enum DeletedEnum {
    UNDELETED(0, "未删除"),
    DELETED(1, "已删除"),
    ;

    private final Integer value;
    private final String desc;
}
