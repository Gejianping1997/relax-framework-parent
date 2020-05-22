package com.relax.service.api.cms;

import com.relax.framework.domain.cms.request.QueryPageRequest;
import com.relax.framework.model.response.QueryResponseResult;

/**
 * @author Gejianping
 * @version 0.0.1
 * @date 2020/05/22 14:27:
 */
public interface CmsPageControllerApi {
    /** 查询所有CmsPage列表的数据源
     * @param page 请求第几页的数据
     * @param size 请求的每页的数据是多少
     * @param queryPageRequest 页面请求所附带的条件
     * @return */
    QueryResponseResult queryAllCmsPageList(Integer page, Integer size, QueryPageRequest queryPageRequest);
}
