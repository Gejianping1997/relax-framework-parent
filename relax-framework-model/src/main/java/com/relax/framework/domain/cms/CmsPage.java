package com.relax.framework.domain.cms;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

/** 
 * @author Gejianping
 * @version 0.0.1
 * @date 2020/05/22 14:11:
 */
@Data
@ToString
@Document(collection = "cms_page")
public class CmsPage {
    /** 
     * 页面名称、别名、访问地址、类型（静态/动态）、页面模版、状态
     */
    /** 站点ID */
    private String siteId;
    /**页面ID */
    @Id
    private String pageId;
    /** 页面名称 */
    private String pageName;
    /** 别名 */
    private String pageAlias;
    /** 访问地址 */
    private String pageWebPath;
    /** 物理路径 */
    private String pagePhysicalPath;
    /** 类型（静态/动态） */
    private String pageType;
    /** 创建时间 */
    private Date pageCreateTime;
    /** 模版id */
    private String templateId;
    /** 静态文件Id */
    private String htmlFileId;
    /** 数据Url */
    private String dataUrl;

    /** 参数 */
    @Transient
    private String pageParameter;
    /** 页面模版 */
    @Transient
    private String pageTemplate;
    /** 页面静态化内容 */
    @Transient
    private String pageHtml;
    /** 状态 */
    @Transient
    private String pageStatus;
    /** 参数列表 */
    @Transient
    private List<CmsPageParam> pageParams;




}