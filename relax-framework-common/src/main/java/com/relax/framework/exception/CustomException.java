package com.relax.framework.exception;

import com.relax.framework.model.response.ResultCode;

/**
 * @author Gejianping
 * @version 0.0.1
 * @date 2020/05/23 16:53:
 */
public class CustomException extends RuntimeException {
    private ResultCode resultCode;

    public CustomException(ResultCode resultCode) {
        this.resultCode = resultCode;
    }
    public ResultCode getResultCode() {
        return this.resultCode;
    }
}
