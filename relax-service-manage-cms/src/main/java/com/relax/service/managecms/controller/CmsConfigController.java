package com.relax.service.managecms.controller;

import com.relax.framework.domain.cms.CmsConfig;
import com.relax.service.api.cms.CmsConfigControllerApi;
import com.relax.service.managecms.service.CmsConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Gejianping
 * @version 0.0.1
 * @date 2020/05/23 21:56:
 */
@RestController
@RequestMapping("/cms/config")
public class CmsConfigController implements CmsConfigControllerApi {

    @Autowired
    CmsConfigService cmsConfigService;

    @Override
    @GetMapping("/queryModelsByConfigId/{configId}")
    public CmsConfig queryModelsByConfigId(@PathVariable("configId") String configId) {
        return cmsConfigService.queryModelsByConfigId(configId);
    }
}
