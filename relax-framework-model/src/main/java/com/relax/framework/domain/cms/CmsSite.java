package com.relax.framework.domain.cms;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @author Gejianping
 * @version 0.0.1
 * @date 2020/05/23 10:07:
 */
@Data
@ToString
@Document(collection = "cms_site")
public class CmsSite {

    /** 站点ID */
    @Id
    private String siteId;
    /** 站点名称 */
    private String siteName;
    /** 站点名称 */
    private String siteDomain;
    /** 站点端口 */
    private String sitePort;
    /** 站点访问地址 */
    private String siteWebPath;
    /** 创建时间 */
    private Date siteCreateTime;

}