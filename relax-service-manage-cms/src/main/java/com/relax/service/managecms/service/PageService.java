package com.relax.service.managecms.service;

import com.relax.framework.domain.cms.CmsPage;
import com.relax.framework.domain.cms.request.QueryPageRequest;
import com.relax.framework.model.response.CommonCode;
import com.relax.framework.model.response.QueryResponseResult;
import com.relax.framework.model.response.QueryResult;
import com.relax.service.managecms.dao.CmsPageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author Gejianping
 * @version 0.0.1
 * @date 2020/05/22 15:38:
 */
@Service
public class PageService {

    @Autowired
    CmsPageRepository cmsPageRepository;

    public QueryResponseResult queryAllCmsPageList(Integer pageNum, Integer pageSize, QueryPageRequest queryPageRequest){
        /** 分页参数 */
        if(pageNum <=0){
            pageNum = 1;
        }
        pageNum = pageNum -1;
        if(pageSize<=0){
            pageSize = 10;
        }

        Pageable pageable = PageRequest.of(pageNum,pageSize);
        Page<CmsPage> cmsPages = cmsPageRepository.findAll(pageable);

        QueryResult<CmsPage> queryResult = new QueryResult<CmsPage>();

        /** 数据列表 */
        queryResult.setList(cmsPages.getContent());
        /** 数据总记录数 */
        queryResult.setTotal(cmsPages.getTotalElements());

        QueryResponseResult<CmsPage> queryResponseResult = new QueryResponseResult<CmsPage>(CommonCode.SUCCESS,queryResult);
        return queryResponseResult;
    }
}
