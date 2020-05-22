package com.relax.service.api.cms;

import com.relax.framework.domain.cms.request.QueryPageRequest;
import com.relax.framework.model.response.QueryResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * @author Gejianping
 * @version 0.0.1
 * @date 2020/05/22 14:27:
 */
@Api(value="CMS页面管理接口",description = "CMS页面管理接口，提供页面的增、删、改、查")
public interface CmsPageControllerApi {
    /** 查询所有CmsPage列表的数据源
     * @param pageNum 请求第几页的数据
     * @param pageSize 请求的每页的数据是多少
     * @param queryPageRequest 页面请求所附带的条件
     * @return */
    QueryResponseResult queryAllCmsPageList(Integer pageNum, Integer pageSize, QueryPageRequest queryPageRequest);
}
