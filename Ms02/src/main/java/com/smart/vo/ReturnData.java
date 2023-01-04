package com.smart.vo;

public class ReturnData<T> {

    /**
     * 请求响应code，默认成功 其他为失败
     */
    private int code;

    /**
     * 响应异常码详细信息
     */
    private String message;

    /**
     * 数据
     */
    private T data;

    public ReturnData() {

    }



    /**
     * 内部使用，用于构造成功的结果
     *
     * @param code    返回码
     * @param message 返回信息
     * @param data    返回数据
     */
    private ReturnData(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 快速创建成功结果并返回结果数据
     *
     * @param data 数据
     * @return ReturnData
     */
    public static <T> ReturnData<T> success(T data) {
        return new ReturnData<>(0, "success", data);
    }

    /**
     * 快速创建成功结果
     *
     * @return ReturnData
     */
    public static ReturnData<String> success() {
        return success("success");
    }

    /**
     * 系统异常类没有返回数据
     *
     * @return ReturnData
     */
    public static ReturnData<?> fail() {
        return new ReturnData<String>(1000,"fail","");
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

