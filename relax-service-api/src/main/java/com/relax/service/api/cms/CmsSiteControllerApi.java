package com.relax.service.api.cms;

import com.relax.framework.domain.cms.request.QueryPageRequest;
import com.relax.framework.domain.cms.request.QuerySiteRequest;
import com.relax.framework.model.response.QueryResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * @author Gejianping
 * @version 0.0.1
 * @date 2020/05/23 09:58:
 */
@Api(value="CMS站点管理接口",description = "CMS站点管理接口，提供站点的查询")
public interface CmsSiteControllerApi {
    /** 查询所有CmsSite列表的数据源
     * @param querySiteRequest 页面请求所附带的条件
     * @return */
    @ApiOperation("分页查询页面列表")
    QueryResponseResult queryAllCmsSiteList(QuerySiteRequest querySiteRequest);
}
