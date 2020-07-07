package com.example.webclient.pojo;

import java.util.Map;

/**
 * Created By Seungmin lee
 * User: dnx
 * Date: 2020-06-18
 * Description:
 */
public class ResultFrom {

    private boolean result;
    private String result_code;
    private String result_message;

    public ResultFrom() {}

    public ResultFrom(boolean result, String result_code, String result_message) {
        this.result = result;
        this.result_code = result_code;
        this.result_message = result_message;
    }

//    public ResultFrom(boolean result, int result_code, String result_message, Map<String, Object> data) {
//        this.result = result;
//        this.result_code = result_code;
//        this.result_message = result_message;
//        this.data = data;
//    }

    public String toString() {
        return "ResultFrom{ " +
                "result=" + result +
                " result_code='" + result_code + '\'' +
                ", result_message='" + result_message + '\'' +
                '}';
    }

    public String test() {
        return "what???";
    }
}
