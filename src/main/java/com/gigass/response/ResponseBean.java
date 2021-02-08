package com.gigass.response;


/**
 * @program:
 * @description:返回的JSON数据结构标准
 * @author:
 * @create: 2018-10-17 09:01
 **/
public class ResponseBean<T>  {


    private boolean success = true;
    private T data;
    private String errCode;
    private String errMsg;
    private String errMsgDetail;

    public ResponseBean() {
    }

    public ResponseBean(boolean success, T data) {
        super();
        this.success = success;
        this.data = data;
    }

    public ResponseBean(boolean success) {
        super();
        this.success = success;
    }

    @Override
    public String toString() {
        return "ResponseBean{" +
                "success=" + success +
                ", data=" + data +
                ", errCode='" + errCode + '\'' +
                ", errMsg='" + errMsg + '\'' +
                '}';
    }

    public ResponseBean(boolean success, T data, String errCode, String errMsg) {
        super();
        this.success = success;
        this.data = data;
        this.errCode = errCode;
        this.errMsg = errMsg;
        this.errMsgDetail = errMsg;
    }

    public ResponseBean(boolean success, String errCode, String errMsg, String errMsgDetail) {
        this.success = success;
        this.errCode = errCode;
        this.errMsg = errMsg;
        this.errMsgDetail = errMsgDetail;
    }

    public ResponseBean(boolean success, String errCode, String errMsg) {
        this.success = success;
        this.errCode = errCode;
        this.errMsg = errMsg;
        this.errMsgDetail = errMsg;
    }
    public ResponseBean(boolean success, UnicomResponseEnums enums) {
        this.success = success;
        this.errCode = enums.getStatus();
        this.errMsg = enums.getMessage();
        this.errMsgDetail = enums.getMessage();
    }
    public ResponseBean(boolean success, UnicomResponseEnums enums, String errMsgDetail) {
        this.success = success;
        this.errCode = enums.getStatus();
        this.errMsg = enums.getMessage();
        this.errMsgDetail = errMsgDetail;
    }
    public ResponseBean(boolean success, T data, UnicomResponseEnums enums) {
        this.success = success;
        this.data = data;
        this.errCode = enums.getStatus();
        this.errMsg = enums.getMessage();
        this.errMsgDetail = enums.getMessage();
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public void setErrMsgDetail(String errMsgDetail) {
        this.errMsgDetail = errMsgDetail;
    }

    public String getErrMsgDetail() {
        return errMsgDetail;
    }
}