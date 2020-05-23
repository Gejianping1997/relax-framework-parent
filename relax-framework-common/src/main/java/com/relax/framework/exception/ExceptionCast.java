package com.relax.framework.exception;

import com.relax.framework.model.response.ResultCode;

/**
 * @author Gejianping
 * @version 0.0.1
 * @date 2020/05/23 16:55:
 */
public class ExceptionCast {
    public static void cast(ResultCode resultCode) {
        throw new CustomException(resultCode);
    }
}
