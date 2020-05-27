package com.relax.service.managecms.dao;

import com.relax.framework.domain.cms.CmsConfig;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Gejianping
 * @version 0.0.1
 * @date 2020/05/23 21:59:
 */
public interface CmsConfigRepository extends MongoRepository<CmsConfig,String> {
}
