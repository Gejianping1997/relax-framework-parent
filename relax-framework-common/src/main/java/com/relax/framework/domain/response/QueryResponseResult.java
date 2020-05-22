package com.relax.framework.domain.response;

import lombok.Data;
import lombok.ToString;

/**
 * @author Gejianping
 * @version 1.0
 * @date 2020/5/7 14:58
 */
@Data
@ToString
public class QueryResponseResult<T> extends ResponseResult {
    QueryResult<T> queryResult;

    public QueryResponseResult(ResultCode resultCode,QueryResult queryResult){
        super(resultCode);
        this.queryResult = queryResult;
    }
}
