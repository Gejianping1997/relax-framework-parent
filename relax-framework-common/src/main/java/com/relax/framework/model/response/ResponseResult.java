package com.relax.framework.model.response;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Gejianping
 * @version 1.0
 * @date 2020/5/7 15:06
 */
@Data
@ToString
@NoArgsConstructor
public class ResponseResult  implements Response {
    /** 操作是否成功 */
    boolean success = SUCCESS;

    /** 操作代码 */
    int code = SUCCESS_CODE;

    /** 提示信息 */
    String message;

    public ResponseResult(ResultCode resultCode){
        this.success = resultCode.success();
        this.code = resultCode.code();
        this.message = resultCode.message();
    }

    public static ResponseResult SUCCESS(){
        return new ResponseResult(CommonCode.SUCCESS);
    }
    public static ResponseResult FAIL(){
        return new ResponseResult(CommonCode.FAIL);
    }
}
