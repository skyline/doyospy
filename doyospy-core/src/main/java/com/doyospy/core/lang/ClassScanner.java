package com.doyospy.core.lang;

import java.io.Serializable;

/**
 * 类扫描器
 */
public class ClassScanner implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 包名
     */
    private final String packageName;

    /**
     * 构造函数，默认UTF-8编码
     */
    public ClassScanner() {
        this(null);
    }

    /**
     * 构造函数，默认UTF-8编码
     * @param packageName 包名，所有包传入“”或者null
     */
    public ClassScanner(String packageName) {
        this.packageName = packageName;
    }

//    /**
//     * 构造函数，默认UTF-8编码
//     * @param packageName
//     * @param classFilter
//     */
//    public ClassScanner(String packageName, Filter<Class<?>> classFilter) {
//        this(packageName, classFilter, null);
//    }
}
