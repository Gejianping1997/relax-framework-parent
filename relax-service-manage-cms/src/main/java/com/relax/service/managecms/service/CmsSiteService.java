package com.relax.service.managecms.service;

import com.relax.framework.domain.cms.CmsSite;
import com.relax.framework.domain.cms.request.QuerySiteRequest;
import com.relax.framework.model.response.CommonCode;
import com.relax.framework.model.response.QueryResponseResult;
import com.relax.framework.model.response.QueryResult;
import com.relax.service.managecms.dao.CmsSiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Gejianping
 * @version 0.0.1
 * @date 2020/05/23 10:04:
 */
@Service
public class CmsSiteService {

    @Autowired
    CmsSiteRepository cmsSiteRepository;

    public QueryResponseResult queryAllCmsSiteList(QuerySiteRequest querySiteRequest){
        List<CmsSite> cmsSiteList = cmsSiteRepository.findAll();

        QueryResult<CmsSite> queryResult = new QueryResult<>();
        queryResult.setList(cmsSiteList);
        queryResult.setTotal(cmsSiteList.size());

        QueryResponseResult<CmsSite> queryResponseResult = new QueryResponseResult<>(CommonCode.SUCCESS,queryResult);

        return queryResponseResult;
    }
}
