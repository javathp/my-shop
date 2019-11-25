package com.baibo.myshop.web.admin.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Author:javathp
 * Date:Created in  9:49 2019/10/26
 * Modified by:
 */
@Controller
public class MainController {

    /**
     * 功能描述:跳转到首页
     * @return: java.lang.String
     * @author javathp
     * @date 2019-10-26
     */
    @GetMapping(value = "main")
    public String main(){
        return "main";
    }
}
