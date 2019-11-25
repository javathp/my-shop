package com.baibo.myshop.web.admin.web.controller;

import com.baibo.myshop.commons.constant.ConstantUtils;
import com.baibo.myshop.commons.utils.CookieUtils;
import com.baibo.myshop.domain.TbUser;
import com.baibo.myshop.web.admin.service.TbUserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Author:javathp
 * Date:Created in  14:20 2019/10/24
 * Modified by:
 */
@Controller
public class LoginController{

    @Autowired
    private TbUserService tbUserService;

    /**
     * 功能描述:跳转登录页面
     * @return: java.lang.String
     * @author javathp
     * @date 2019-10-26
     */
    @GetMapping(value = {"","login"})
    public String login(HttpServletRequest req){
        String userInfo = CookieUtils.getCookieValue(req, ConstantUtils.COOKIE_NAME_USER_INFO);
        if (StringUtils.isNotBlank(userInfo)) {
            String[] userInfoArray = userInfo.split(":");
            String email = userInfoArray[0];
            String password = userInfoArray[1];
            req.setAttribute("email",email);
            req.setAttribute("password",password);
            req.setAttribute("isRemember",true);
        }
        return "login";
    }

    /**
     * 功能描述:登录逻辑
     * @param: email
     * @param: password
     * @return: java.lang.String
     * @author javathp
     * @date 2019-10-26
     */
    @PostMapping(value = "login")
    public String login(String email, String password, String isRemember, HttpServletRequest req, HttpServletResponse resp,Model model) {
        Boolean checked = isRemember == null ? false : true;
        TbUser tbUser = tbUserService.login(email, password);
//      登录失败
        if (tbUser == null) {
            model.addAttribute("message","用户邮箱或密码错误,请重新登录！");
//            req.setAttribute("message","用户邮箱或密码错误！");
            return login(req);
        } else {
//      登录成功
//          将登陆信息放入会话
            req.getSession().setAttribute(ConstantUtils.SESSION_USER, tbUser);
//        记住我
            if (checked) {
//       用户信息存储一周
                CookieUtils.setCookie(req, resp ,ConstantUtils.COOKIE_NAME_USER_INFO, String.format("%s:%s",email,password),7*24*60*60);
            } else {
                CookieUtils.deleteCookie(req, resp, ConstantUtils.COOKIE_NAME_USER_INFO);
            }
            return "redirect:main";
        }
    }

    /**
     * 功能描述:注销
     * @param: request
     * @return: java.lang.String
     * @author javathp
     * @date 2019-10-26
     */
    @GetMapping(value = "loginout")
    public String loginout(HttpServletRequest request){
        request.getSession().invalidate();
        return "login";
    }

}
