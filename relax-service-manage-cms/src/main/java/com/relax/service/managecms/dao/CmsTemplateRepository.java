package com.relax.service.managecms.dao;

import com.relax.framework.domain.cms.CmsTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Gejianping
 * @version 0.0.1
 * @date 2020/05/23 14:56:
 */
public interface CmsTemplateRepository extends MongoRepository<CmsTemplate,String> {
}
