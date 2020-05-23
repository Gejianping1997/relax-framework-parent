package com.relax.service.managecms.dao;

import com.relax.framework.domain.cms.CmsPage;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Gejianping
 * @version 0.0.1
 * @date 2020/05/22 15:44:
 */
public interface CmsPageRepository extends MongoRepository<CmsPage,String> {
    /**
     * 使用默认方法 根据页面名称,站点id,页面网络路径 来查询要插入的页面是否在数据库中已经存在
     * @param pageName 页面查询条件
     * @param siteId 页面查询条件
     * @param pageWebPath 页面查询条件
     * @return
     */
    CmsPage findAllByPageNameAndSiteIdAndPageWebPath(String pageName,String siteId,String pageWebPath);

    /**
     * 使用默认方法 根据页面id删除页面
     * @param pageId
     * @return
     */
    CmsPage deleteCmsPageByPageId(String pageId);
}
