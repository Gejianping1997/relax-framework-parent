package com.relax.service.managecms.dao;

import com.relax.framework.domain.cms.CmsSite;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Gejianping
 * @version 0.0.1
 * @date 2020/05/23 10:06:
 */
public interface CmsSiteRepository  extends MongoRepository<CmsSite,String> {
}
