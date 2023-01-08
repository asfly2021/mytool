package com.as.mytool.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Program mytool
 * @Description 通用返回结果
 * @Auther fusheng
 * @Data 2023-01-08 21:33
 * @Version 1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TResult {
    private Integer code;

    private Object data;
}
