package com.baibo.myshop.web.admin.web.interceptor;

import com.baibo.myshop.commons.constant.ConstantUtils;
import com.baibo.myshop.domain.TbUser;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 权限拦截
 * Author:javathp
 * Date:Created in  10:36 2019/10/26
 * Modified by:
 */
public class PermissionInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        if (modelAndView != null && modelAndView.getViewName() != null && modelAndView.getViewName().endsWith("login")) {
            TbUser tbUser = (TbUser) request.getSession().getAttribute(ConstantUtils.SESSION_USER);
            if (tbUser != null) {
                response.sendRedirect("/main");
            }
        }
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
