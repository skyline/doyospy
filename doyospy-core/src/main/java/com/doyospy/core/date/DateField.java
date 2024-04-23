package com.doyospy.core.date;

import java.util.Calendar;

/**
 * 日期各个部分的枚举
 * @author  Robin
 */
public enum DateField {
    /**
     * 世纪
     */
    ERA(Calendar.ERA),
    /**
     * 年
     */
    YEAR(Calendar.YEAR),
    /**
     * 月
     */
    MONTH(Calendar.MONTH),
    /**
     * 一年中第几周
     */
    WEEK_OF_YEAR(Calendar.WEEK_OF_YEAR),
    /**
     * 一月中第几周
     */
    WEEK_OF_MONTH(Calendar.WEEK_OF_MONTH),
    /**
     * 一月中第几天
     */
    DAY_OF_MONTH(Calendar.DAY_OF_MONTH),
    /**
     * 一年中第几天
     */
    DAY_OF_YEAR(Calendar.DAY_OF_YEAR),
    /**
     *  一周中第几天，1表示周日，2表示周一，7表示周六
     */
    DAY_OF_WEEK(Calendar.DAY_OF_WEEK),
    /**
     * 天所在的周是这个月的第几周
     */
    DAY_OF_WEEK_IN_MONTH(Calendar.DAY_OF_WEEK_IN_MONTH),
    /**
     * 上午或下午
     */
    AM_PM(Calendar.AM_PM),
    /**
     * 小时，用于12小时制
     */
    HOUR(Calendar.HOUR),
    /**
     * 小时，用于24小时制
     */
    HOUR_OF_DAY(Calendar.HOUR_OF_DAY),
    /**
     * 分钟
     */
    MINUTE(Calendar.MINUTE),
    /**
     * 秒
     */
    SECOND(Calendar.SECOND),
    /**
     * 毫秒
     */
    MILLISECOND(Calendar.MILLISECOND),
    ;

    private final int value;

    /**
     * 构造函数
     * @param value
     */
    DateField(int value) {
        this.value = value;
    }

    /**
     * 获取枚举值
     * @return  枚举值
     */
    public int getValue() {
        return this.value;
    }

    /**
     * 将 {@link Calendar}相关值转换为DatePart枚举对象<br>
     *
     * @param calendarPartIntValue Calendar中关于Week的int值
     * @return DateField
     */
    public static DateField of(int calendarPartIntValue) {
        switch (calendarPartIntValue) {
            case Calendar.ERA:
                return ERA;
            case Calendar.YEAR:
                return YEAR;
            case Calendar.MONTH:
                return MONTH;
            case Calendar.WEEK_OF_YEAR:
                return WEEK_OF_YEAR;
            case Calendar.WEEK_OF_MONTH:
                return WEEK_OF_MONTH;
            case Calendar.DAY_OF_MONTH:
                return DAY_OF_MONTH;
            case Calendar.DAY_OF_YEAR:
                return DAY_OF_YEAR;
            case Calendar.DAY_OF_WEEK:
                return DAY_OF_WEEK;
            case Calendar.DAY_OF_WEEK_IN_MONTH:
                return DAY_OF_WEEK_IN_MONTH;
            case Calendar.AM_PM:
                return AM_PM;
            case Calendar.HOUR:
                return HOUR;
            case Calendar.HOUR_OF_DAY:
                return HOUR_OF_DAY;
            case Calendar.MINUTE:
                return MINUTE;
            case Calendar.SECOND:
                return SECOND;
            case Calendar.MILLISECOND:
                return MILLISECOND;
            default:
                return null;
        }
    }
}
