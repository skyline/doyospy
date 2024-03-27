package com.doyospy.core.result;

import lombok.Data;
import java.util.List;

/**
 * 分页数据封装
 * @author  Robin
 */
@Data
public class PageData<T> {
    /**
     * 当前页码
     */
    private Integer pageNum;

    /**
     * 每页数量
     */
    private Integer pageSize;

    /**
     * 总页数
     */
    private Integer totalPage;

    /**
     * 总数量
     */
    private Integer totalCount;

    /**
     * 数据列表
     */
    private List<T> list;
}
