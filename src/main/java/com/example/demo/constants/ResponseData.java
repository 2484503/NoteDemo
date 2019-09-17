package com.example.demo.constants;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lijn
 * @version 1.0
 * @date 2019/9/16 11:14
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseData {

    private int status;

    private String message;

    private Object data;

    public static ResponseData success() {
        return ResponseData.builder().status(5000).message("成功").build();
    }

    public static ResponseData success(Object data) {
        return ResponseData.builder().status(5000).message("成功").data(data).build();
    }

    public static ResponseData success(String message, Object data) {
        return ResponseData.builder().status(5000).message(message).data(data).build();
    }

    public static ResponseData failure() {
        return ResponseData.builder().status(7000).message("失败").build();
    }

    public static ResponseData failure(String message, Object data) {
        return ResponseData.builder().status(7000).message(message).data(data).build();
    }

    public static ResponseData failure(Object data) {
        return ResponseData.builder().status(7000).message("失败").data(data).build();
    }
}
