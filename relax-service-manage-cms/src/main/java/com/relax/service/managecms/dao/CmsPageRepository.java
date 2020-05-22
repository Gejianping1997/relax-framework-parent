package com.relax.service.managecms.dao;

import com.relax.framework.domain.cms.CmsPage;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Gejianping
 * @version 0.0.1
 * @date 2020/05/22 15:44:
 */
public interface CmsPageRepository extends MongoRepository<CmsPage,String> {

}
