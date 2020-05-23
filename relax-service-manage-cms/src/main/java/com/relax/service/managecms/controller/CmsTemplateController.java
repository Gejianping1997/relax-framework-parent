package com.relax.service.managecms.controller;

import com.relax.framework.domain.cms.request.QueryTemplateRequest;
import com.relax.framework.model.response.QueryResponseResult;
import com.relax.service.api.cms.CmsTemplateControllerApi;
import com.relax.service.managecms.service.CmsTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Gejianping
 * @version 0.0.1
 * @date 2020/05/23 14:53:
 */
@RestController
@RequestMapping("/cms/template")
public class CmsTemplateController implements CmsTemplateControllerApi {

    @Autowired
    CmsTemplateService cmsTemplateService;

    @Override
    @GetMapping("/queryAllCmsTemplateList")
    public QueryResponseResult queryAllCmsTemplateList(QueryTemplateRequest queryTemplateRequest) {
        return cmsTemplateService.queryAllCmsTemplateList(queryTemplateRequest);
    }
}
