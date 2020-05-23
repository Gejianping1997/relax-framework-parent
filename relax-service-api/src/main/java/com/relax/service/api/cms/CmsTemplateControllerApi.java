package com.relax.service.api.cms;

import com.relax.framework.domain.cms.request.QuerySiteRequest;
import com.relax.framework.domain.cms.request.QueryTemplateRequest;
import com.relax.framework.model.response.QueryResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author Gejianping
 * @version 0.0.1
 * @date 2020/05/23 14:50:
 */
@Api(value="CMS页面模板管理接口",description = "CMS页面模板管理接口，提供页面模板的查询")
public interface CmsTemplateControllerApi {
    /** 查询所有CmsTemplate列表的数据源
     * @param queryTemplateRequest 页面请求所附带的条件
     * @return */
    @ApiOperation("分页查询页面列表")
    QueryResponseResult queryAllCmsTemplateList(QueryTemplateRequest queryTemplateRequest);
}
