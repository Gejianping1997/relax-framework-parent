package com.relax.service.managecms.service;

import com.relax.framework.domain.cms.CmsTemplate;
import com.relax.framework.domain.cms.request.QueryTemplateRequest;
import com.relax.framework.model.response.CommonCode;
import com.relax.framework.model.response.QueryResponseResult;
import com.relax.framework.model.response.QueryResult;
import com.relax.service.managecms.dao.CmsTemplateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Gejianping
 * @version 0.0.1
 * @date 2020/05/23 14:54:
 */
@Service
public class CmsTemplateService {

    @Autowired
    CmsTemplateRepository cmsTemplateRepository;

    public QueryResponseResult queryAllCmsTemplateList(QueryTemplateRequest queryTemplateRequest){
        List<CmsTemplate> cmsTemplateList = cmsTemplateRepository.findAll();

        QueryResult<CmsTemplate> queryResult = new QueryResult<>();
        queryResult.setList(cmsTemplateList);
        queryResult.setTotal(cmsTemplateList.size());

        QueryResponseResult<CmsTemplate> queryResponseResult = new QueryResponseResult<>(CommonCode.SUCCESS,queryResult);

        return queryResponseResult;
    }
}
