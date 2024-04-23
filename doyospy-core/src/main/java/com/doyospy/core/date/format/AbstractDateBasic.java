package com.doyospy.core.date.format;

import java.io.Serializable;
import java.util.Locale;
import java.util.TimeZone;

/**
 * 抽象日期类
 *
 * @author  Robin
 */
public abstract class AbstractDateBasic implements DateBasic, Serializable {
    private static final long serialVersionUID = 1L;

    protected final String pattern;

    protected final TimeZone timeZone;

    protected final Locale locale;

    /**
     * 构造函数，内部使用
     * @param pattern   日期格式
     * @param timeZone  非空时区
     * @param locale    日期地理位置
     */
    protected AbstractDateBasic(String pattern, TimeZone timeZone, Locale locale) {
        this.pattern = pattern;
        this.timeZone = timeZone;
        this.locale = locale;
    }

    /**
     * 获取日期格式
     * @return  日期格式
     */
    @Override
    public String getPattern() {
        return pattern;
    }

    /**
     * 获取非空时区
     * @return  时区
     */
    @Override
    public TimeZone getTimeZone() {
        return timeZone;
    }

    /**
     * 获取日期地理位置
     * @return  日期地理位置
     */
    @Override
    public Locale getLocale() {
        return locale;
    }

    public int hasCode() {
        return pattern.hashCode() + 13 * (timeZone.hashCode() + 13 * locale.hashCode());
    }
}
