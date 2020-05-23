package com.relax.framework.domain.cms.response;

import com.relax.framework.domain.cms.CmsPage;
import com.relax.framework.model.response.ResponseResult;
import com.relax.framework.model.response.ResultCode;
import lombok.Data;

/**
 * @author Gejianping
 * @version 0.0.1
 * @date 2020/05/23 11:50:
 */
@Data
public class CmsPageResult extends ResponseResult {
        CmsPage cmsPage;
        public CmsPageResult(ResultCode resultCode, CmsPage cmsPage) {
            super(resultCode);
            this.cmsPage = cmsPage;
        }
}
