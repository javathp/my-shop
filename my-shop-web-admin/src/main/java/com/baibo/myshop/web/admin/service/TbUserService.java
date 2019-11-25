package com.baibo.myshop.web.admin.service;

import com.baibo.myshop.commons.persistence.BaseService;
import com.baibo.myshop.domain.TbUser;

/**
 * Author:javathp
 * Date:Created in  10:07 2019/10/27
 * Modified by:
 */
public interface TbUserService extends BaseService<TbUser> {

    /**
     * 用户登录
     *
     * @param email
     * @param password
     * @return
     */
    TbUser login(String email, String password);
}
