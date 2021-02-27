package com.thoughtworks.capacity.gtb.mvc.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @ description:
 * @ Author: Ezio Liu
 * @ Date: 2021/2/27 10:35 下午
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User implements Serializable {

    @NotNull(message = "id must be not null")
    @Min(1)
    private long id;

    @NotBlank(message = "username be not blank")
    private String username;

    @NotBlank(message = "password be not blank")
    private String password;

    @Email
    private String email;
}
