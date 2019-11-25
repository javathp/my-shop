package com.baibo.myshop.web.api.service;

import com.baibo.myshop.domain.TbUser;

/**
 * 会员管理
 * Author:javathp
 * Date:Created in  10:45 2019/11/19
 * Modified by:
 */
public interface TbUserService {
    /**
     * 功能描述:会员管理
     * @param: tbUser
     * @return: com.baibo.myshop.domain.TbUser
     * @author javathp
     * @date 2019-11-19
     */
    TbUser login(TbUser tbUser);
}
