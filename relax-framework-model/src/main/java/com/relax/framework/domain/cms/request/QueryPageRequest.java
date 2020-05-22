package com.relax.framework.domain.cms.request;

import com.relax.framework.model.request.RequestData;
import lombok.Data;

/**
 * @author Gejianping
 * @version 0.0.1
 * @date 2020/05/22 14:24:
 */
@Data
public class QueryPageRequest extends RequestData {
    /** 接收页面查询的查询条件 */
    /** 站点id */
    private String siteId;
    /** 页面ID */
    private String pageId;
    /** 页面名称 */
    private String pageName;
    /** 别名 */
    private String pageAlias;
    /** 模版id */
    private String templateId;
}
