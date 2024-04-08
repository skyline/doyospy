package com.doyospy.core.util;

import org.hashids.Hashids;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ID序列化工具类
 * @author  Robin
 */
public class IdUtil {
    private static final Logger log = LoggerFactory.getLogger(IdUtil.class);
    private static final Hashids hashids = new Hashids("@q#w$E.R&t*y=hfl", 8);
    private static final long MAX = 9007199254740992L;

    /**
     * 编码
     * @param   id  待编码ID参数
     * @return  编码结果
     */
    public static String encode(Long id) {
        if (id == null || id == 0) {
            return "";
        }
        return hashids.encode(id);
    }

    /**
     * 解码
     * @param   id  待解码参数
     * @return  解码结果
     */
    public static Long decode(String id) {
        if (id == null || "".equals(id)) {
            return null;
        }
        try {
            long[] arr = hashids.decode(id);
            if (arr == null || arr.length == 0) {
                return null;
            }
            return arr[0];
        }
        catch (Exception e) {
            log.info("id解码错误，id:{}", id, e);
            return null;
        }
    }
}
