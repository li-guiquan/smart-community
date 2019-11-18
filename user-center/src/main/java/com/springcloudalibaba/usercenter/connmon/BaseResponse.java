package com.springcloudalibaba.usercenter.connmon;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BaseResponse<T> {
    private String msg;
    private Integer status;
    private T data;
    public  static <T> BaseResponse success(T data){
        return BaseResponse.builder()
                .msg(ResponseStatus.SUCCESS.getMsg())
                .status(ResponseStatus.SUCCESS.getStatus())
                .data(data)
                .build();
    }

    public  static <T> BaseResponse error(T data){
        return BaseResponse.builder()
                .msg(ResponseStatus.ERROR.getMsg())
                .status(ResponseStatus.ERROR.getStatus())
                .data(data)
                .build();
    }

}
