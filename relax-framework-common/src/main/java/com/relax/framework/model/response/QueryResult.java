package com.relax.framework.model.response;

import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @author Gejianping
 * @version 1.0
 * @date 2020/5/7 15:07
 */
@Data
@ToString
public class QueryResult<T> implements Response {
    /** 数据列表 */
    private List<T> list;
    /** 数据总数 */
    private long total;
}