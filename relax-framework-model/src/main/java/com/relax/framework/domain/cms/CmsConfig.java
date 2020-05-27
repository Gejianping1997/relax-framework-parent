package com.relax.framework.domain.cms;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * @author Gejianping
 * @version 0.0.1
 * @date 2020/05/23 21:50:
 */
@Data
@ToString
@Document(collection = "cms_config")
public class CmsConfig {
    @Id
    private String id;
    private String name;
    private List<CmsConfigModel> model;

}
