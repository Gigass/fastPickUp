package com.gigass.response;


/**
 * @program: 枚举
 * @description:枚举
 * @author:
 * @create: 2019-06-02
 **/


public enum UnicomResponseEnums {

    SYSTEM_ERROR("-001", "系统异常"),
    BAD_REQUEST("-002", "错误的请求参数"),
    NOT_FOUND("-003", "找不到请求路径！"),
    CONNECTION_ERROR("-004", "网络连接请求失败！"),
    METHOD_NOT_ALLOWED("-005", "不合法的请求方式"),
    DATABASE_ERROR("-004", "数据库操作执行异常"),
    BOUND_STATEMENT_NOT_FOUNT("-006", "找不到方法！"),
    REPEAT_REGISTER("001", "重复注册"),
    NO_USER_EXIST("002", "用户不存在"),
    INVALID_PASSWORD("003", "密码错误"),
    NO_PERMISSION("004", "非法请求！"),
    SUCCESS_OPTION("005", "操作成功！"),
    NOT_MATCH("-007", "用户名和密码不匹配"),
    FAIL_GETDATA("-008", "获取信息失败"),
    SUCCESS_GETDATA("-008", "获取信息成功"),
    BAD_REQUEST_TYPE("-009", "错误的请求类型"),
    INVALID_MOBILE("010", "无效的手机号码"),
    INVALID_EMAIL("011", "无效的邮箱"),
    INVALID_GENDER("012", "无效的性别"),
    REPEAT_MOBILE("014", "已存在此手机号"),
    REPEAT_EMAIL("015", "已存在此邮箱地址"),
    NO_RECORD("016", "没有查到相关记录"),
    LOGOUT_SUCCESS("018", "已退出登录"),
    SENDEMAIL_SUCCESS("019", "邮件已发送，请注意查收"),
    TOKEN_FAILURE("020", "TOKEN失效！"),
    No_FileSELECT("021", "未选择文件"),
    ADD_FAIL("022", "新增失败"),
    NOLOGIN("023", "未登陆"),
    ILLEGAL_ARGUMENT("024", "参数错误"),
    ERROR_IDCODE("025", "验证码不正确"),
    TOKEN_EMPTY("026", "Authorization为空"),
    DIS_LOGIN("027", "未登录"),
    NO_CODE("028", "未传code"),
    LOGIN_FAIL_CHANGE("029", "切换设备，重新登陆"),
    ACCESS_TOKEN_ERRO("030", "ACCESS_TOKEN请求异常"),
    VERIFY_FAIL("030", "校验失败"),
    POST_EXP("031", "请求异常，请联系管理员！"),
    UPDATE_EXP("032", "更新失败！"),
    PICSAVE_EXP("033", "图片保存失败！"),
    LOGIN_FAIL("034","登陆失败！"),
    FILEUPLOAD_FAIL("035", "上传失败"),
    DELETE_FAIL("036", "删除失败"),
    ERRO_VAL("037", "错误参数"),
    No_FileExist("038", "文件不存在"),
    CREATE_EXP("039", "创建失败！"),
    UPDATE_FAIL("040", "更新失败"),
    Inventory_shortage("041", "库存不足"),
    DB_ERRO("042", "数据库异常"),
    OPERATION_DATA_FAILED("043", "数据操作失败"),
    JSON_EXP("044", "JSON转换异常"),
    HYSTRIX_API_NOUSED("045", "服务熔断降级，请待会使用"),
    JSON_PARAM_NO("046","参数中没有{0}的值"),
    JSON_PARAM_ERROR("047","参数{0}值转换异常"),
    EXCEL_IMPORT_ERROR("049","Excel导入失败"),
    API_SIGN_ERROR("048","接口验证错误"),
    API_NO_EXAMINE("049","接口不是审核状态"),
    ERROR_APP_KEY("050","无效APPKEY"),
    SQL_ERROR("051","sql语句：{0}执行错误！"),
    API_CAN_NOT_UPDATE("052","当前单据不是【未审核】,不能进行编辑或者保存"),
    REPEAT_METHOD("053","方法名重复"),
    CUSTOMBUTTON_FAIL("054","自定义按钮失败");


    private String status;
    private String message;

    private UnicomResponseEnums(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public void enu(String status, String message) {
        this.status = status;
        this.message = message;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}