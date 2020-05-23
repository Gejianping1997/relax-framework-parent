package com.relax.framework.domain.cms.response;

import com.relax.framework.model.response.ResultCode;

/**
 * @author Gejianping
 * @version 0.0.1
 * @date 2020/05/23 16:58:
 */
public enum  CmsCode implements ResultCode {
    CMS_ADDPAGE_EXISTS(false,24001,"页面已存在！");

    /** 操作结果 */
    boolean success;
    /** 操作代码 */
    int code;
    /** 提示信息 */
    String message;

    private CmsCode(boolean success, int code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

    @Override
    public boolean success() {
        return success;
    }

    @Override
    public int code() {
        return code;
    }

    @Override
    public String message() {
        return message;
    }
}
