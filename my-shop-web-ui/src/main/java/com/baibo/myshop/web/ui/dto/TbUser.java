package com.baibo.myshop.web.ui.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Author:javathp
 * Date:Created in  12:48 2019/11/19
 * Modified by:
 */
@Data
public class TbUser implements Serializable {

    private Long id;
    private String username;
    private String password;
    private String phone;
    private String email;
    private String verification;

}
