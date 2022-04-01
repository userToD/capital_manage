package com.yan.pojo.result;
import lombok.Data;

@Data
public class ResultJson {
    private boolean success;//请求结果[true,false]

    private int code;//返回编码

    private Object data;//返回数据

    private String message;//返会描述

    public ResultJson(){
        this.success=true;
        this.code=99;
    }

    public ResultJson(Object data){
        this.success=true;
        this.code=99;
        this.data=data;
    }

    public ResultJson(int code,String message){
        this.success=false;
        this.code=code;
        this.message=message;
    }

    public boolean isSuccess() {
        return success;
    }
}
