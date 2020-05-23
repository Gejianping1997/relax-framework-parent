package com.relax.service.managecms.controller;

import com.relax.framework.domain.cms.request.QuerySiteRequest;
import com.relax.framework.model.response.QueryResponseResult;
import com.relax.service.api.cms.CmsSiteControllerApi;
import com.relax.service.managecms.service.CmsSiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Gejianping
 * @version 0.0.1
 * @date 2020/05/23 10:03:
 */
@RestController
@RequestMapping("/cms/site")
public class CmsSiteController implements CmsSiteControllerApi {

    @Autowired
    CmsSiteService cmsSiteService;

    @Override
    @GetMapping("/queryAllCmsSiteList")
    public QueryResponseResult queryAllCmsSiteList(QuerySiteRequest querySiteRequest) {
        return cmsSiteService.queryAllCmsSiteList(querySiteRequest);
    }
}
