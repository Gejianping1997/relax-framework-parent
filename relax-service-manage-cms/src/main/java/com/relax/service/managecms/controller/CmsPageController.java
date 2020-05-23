package com.relax.service.managecms.controller;

import com.relax.framework.domain.cms.request.QueryPageRequest;
import com.relax.framework.model.response.QueryResponseResult;
import com.relax.service.api.cms.CmsPageControllerApi;
import com.relax.service.managecms.service.CmsPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

/**
 * @author Gejianping
 * @version 0.0.1
 * @date 2020/05/22 15:21:
 */
@RestController
@RequestMapping("/cms/page")
public class CmsPageController implements CmsPageControllerApi {

    @Autowired
    CmsPageService cmsPageService;

    @Override
    @GetMapping("/queryAllCmsPageList/{pageNum}/{pageSize}")
    public QueryResponseResult queryAllCmsPageList(@PathVariable("pageNum") int pageNum,@PathVariable("pageSize") int pageSize,QueryPageRequest queryPageRequest) {
        return cmsPageService.queryAllCmsPageList(pageNum,pageSize,queryPageRequest);
    }
}
