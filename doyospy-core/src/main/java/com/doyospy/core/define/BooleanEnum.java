package com.doyospy.core.define;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 布尔枚举
 * @author  Robin
 */
@Getter
@AllArgsConstructor
public enum BooleanEnum {
    TRUE(1, "是"),
    FALSE(0, "否");

    private final Integer value;
    private final String desc;
}
