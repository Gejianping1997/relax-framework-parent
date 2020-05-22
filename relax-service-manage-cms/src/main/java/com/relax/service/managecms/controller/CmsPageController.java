package com.relax.service.managecms.controller;

import com.relax.framework.domain.cms.request.QueryPageRequest;
import com.relax.framework.model.response.QueryResponseResult;
import com.relax.service.api.cms.CmsPageControllerApi;
import com.relax.service.managecms.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Gejianping
 * @version 0.0.1
 * @date 2020/05/22 15:21:
 */
@RestController
@RequestMapping("/cms/page")
public class CmsPageController implements CmsPageControllerApi {

    @Autowired
    PageService pageService;

    @Override
    @GetMapping("/queryAllCmsPageList/{pageNum}/{pageSize}")
    public QueryResponseResult queryAllCmsPageList(@PathVariable("pageNum") int pageNum,@PathVariable("pageSize") int pageSize, QueryPageRequest queryPageRequest) {
        return pageService.queryAllCmsPageList(pageNum,pageSize,queryPageRequest);
    }
}
