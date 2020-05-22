package com.relax.framework.domain.cms;

import lombok.Data;
import lombok.ToString;

/**
 * @author Gejianping
 * @version 0.0.1
 * @date 2020/05/22 14:16:
 */
@Data
@ToString
public class CmsPageParam {
    /** 参数名称 */
    private String pageParamName;
    /** 参数值 */
    private String pageParamValue;
}
