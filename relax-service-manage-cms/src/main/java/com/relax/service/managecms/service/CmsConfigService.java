package com.relax.service.managecms.service;

import com.relax.framework.domain.cms.CmsConfig;
import com.relax.service.managecms.dao.CmsConfigRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author Gejianping
 * @version 0.0.1
 * @date 2020/05/23 21:56:
 */
@Service
public class CmsConfigService {

    @Autowired
    CmsConfigRepository cmsConfigRepository;

    public CmsConfig queryModelsByConfigId(String configId){
        Optional<CmsConfig> cmsConfigOptional = cmsConfigRepository.findById(configId);
        if (cmsConfigOptional.isPresent()){
            return cmsConfigOptional.get();
        }
        return null;
    }
}
