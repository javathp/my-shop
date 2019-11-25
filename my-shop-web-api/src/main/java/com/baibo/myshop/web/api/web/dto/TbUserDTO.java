package com.baibo.myshop.web.api.web.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

/**
 * Author:javathp
 * Date:Created in  13:14 2019/11/19
 * Modified by:
 */
public class TbUserDTO implements Serializable {

    private Long id;
    private String username;

    @JsonIgnore
    private String password;
    private String phone;
    private String email;
}
