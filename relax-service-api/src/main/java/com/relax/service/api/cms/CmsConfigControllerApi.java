package com.relax.service.api.cms;

import com.relax.framework.domain.cms.CmsConfig;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * @author Gejianping
 * @version 0.0.1
 * @date 2020/05/23 21:47:
 */
@Api(value="页面静态化程序 获取数据源 的接口",description = "页面静态化程序的 数据源 的 获取")
public interface CmsConfigControllerApi {

    /**
     * 根据 configId 查询获取 存储数据源的 CmsConfig实体 内的数据
     * @param configId
     * @return
     */
    @ApiOperation("根据 configId 查询获取 存储数据源的 CmsConfig实体 内的数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name="configId",value = "数据源配置项id",required=true,paramType="path",dataType="string"),
    })
    CmsConfig queryModelsByConfigId(String configId);
}
