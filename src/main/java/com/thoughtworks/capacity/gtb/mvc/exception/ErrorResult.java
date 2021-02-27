package com.thoughtworks.capacity.gtb.mvc.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ description:
 * @ Author: Ezio Liu
 * @ Date: 2021/2/27 10:31 下午
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResult {
    private String message;
}
