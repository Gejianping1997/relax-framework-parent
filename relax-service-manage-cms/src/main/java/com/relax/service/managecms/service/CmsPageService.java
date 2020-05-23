package com.relax.service.managecms.service;

import com.relax.framework.domain.cms.CmsPage;
import com.relax.framework.domain.cms.request.QueryPageRequest;
import com.relax.framework.model.response.CommonCode;
import com.relax.framework.model.response.QueryResponseResult;
import com.relax.framework.model.response.QueryResult;
import com.relax.service.managecms.dao.CmsPageRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

/**
 * @author Gejianping
 * @version 0.0.1
 * @date 2020/05/22 15:38:
 */
@Service
public class CmsPageService {

    @Autowired
    CmsPageRepository cmsPageRepository;

    public QueryResponseResult queryAllCmsPageList(Integer pageNum, Integer pageSize, QueryPageRequest queryPageRequest){
        if (queryPageRequest == null){
            queryPageRequest = new QueryPageRequest();
        }

        /** 定义条件匹配查询器,模糊查询pageAlias 开始  */
        ExampleMatcher exampleMatcher = ExampleMatcher.matching()
                .withMatcher("pageAlias", ExampleMatcher.GenericPropertyMatchers.contains());
        /** 定义条件匹配查询器,模糊查询pageAlias 开始  */

        /** 完全匹配 剩下属性 */
        CmsPage cmsPage = new CmsPage();
        /** PageAlias */
        if (StringUtils.isNoneEmpty(queryPageRequest.getPageAlias())) {
            cmsPage.setPageAlias(queryPageRequest.getPageAlias());
        }
        /** PageId */
        if (StringUtils.isNoneEmpty(queryPageRequest.getPageId())) {
            cmsPage.setPageId(queryPageRequest.getPageId());
        }
        /** PageName */
        if (StringUtils.isNoneEmpty(queryPageRequest.getPageName())) {
            cmsPage.setPageName(queryPageRequest.getPageName());
        }
        /** SiteId */
        if (StringUtils.isNoneEmpty(queryPageRequest.getSiteId())) {
            cmsPage.setSiteId(queryPageRequest.getSiteId());
        }
        /** TemplateId */
        if (StringUtils.isNoneEmpty(queryPageRequest.getTemplateId())) {
            cmsPage.setTemplateId(queryPageRequest.getTemplateId());
        }

        Example<CmsPage> example = Example.of(cmsPage,exampleMatcher);

        /** 分页参数 */
        if(pageNum <=0){
            pageNum = 1;
        }
        pageNum = pageNum -1;
        if(pageSize<=0){
            pageSize = 10;
        }

        Pageable pageable = PageRequest.of(pageNum,pageSize);
        Page<CmsPage> cmsPages = cmsPageRepository.findAll(example,pageable);

        QueryResult<CmsPage> queryResult = new QueryResult<CmsPage>();

        /** 数据列表 */
        queryResult.setList(cmsPages.getContent());
        /** 数据总记录数 */
        queryResult.setTotal(cmsPages.getTotalElements());

        QueryResponseResult<CmsPage> queryResponseResult = new QueryResponseResult<CmsPage>(CommonCode.SUCCESS,queryResult);
        return queryResponseResult;
    }
}
