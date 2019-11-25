package com.baibo.myshop.web.admin.web.interceptor;

import com.baibo.myshop.commons.constant.ConstantUtils;
import com.baibo.myshop.domain.TbUser;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登录拦截
 * Author:javathp
 * Date:Created in  10:12 2019/10/26
 * Modified by:
 */
public class LoginInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        TbUser tbUser = (TbUser) request.getSession().getAttribute(ConstantUtils.SESSION_USER);
        if (tbUser == null) {
            response.sendRedirect("/login");
        }
//      放行
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
