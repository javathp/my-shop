package com.baibo.myshop.web.api.web.controller.v1;

import com.baibo.myshop.commons.dto.BaseResult;
import com.baibo.myshop.domain.TbUser;
import com.baibo.myshop.web.api.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 会员管理
 * Author:javathp
 * Date:Created in  10:55 2019/11/19
 * Modified by:
 */
@RestController
@RequestMapping(value = "${api.path.v1}/users")
public class TbUserController {

    @Autowired
    private TbUserService tbUserService;
    @PostMapping(value = "login")
    public BaseResult login(TbUser tbUser){
        TbUser user = tbUserService.login(tbUser);
        if ( user == null ) {
            return BaseResult.fail("账号或密码不正确");
        }
        else {
            return BaseResult.success("登录成功",user);
        }
    }
}
