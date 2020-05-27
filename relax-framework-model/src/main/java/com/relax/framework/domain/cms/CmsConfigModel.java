package com.relax.framework.domain.cms;

import lombok.Data;
import lombok.ToString;

import java.util.Map;

/**
 * @author Gejianping
 * @version 0.0.1
 * @date 2020/05/23 21:51:
 */
@Data
@ToString
public class CmsConfigModel {
    private String key;
    private String name;
    private String url;
    private Map mapValue;
    private String value;

}
