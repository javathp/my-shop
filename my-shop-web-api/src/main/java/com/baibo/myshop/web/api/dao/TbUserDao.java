package com.baibo.myshop.web.api.dao;

import com.baibo.myshop.domain.TbUser;
import org.springframework.stereotype.Repository;

/**
 * 会员管理
 * Author:javathp
 * Date:Created in  10:38 2019/11/19
 * Modified by:
 */
@Repository
public interface TbUserDao {

    /**
     * 功能描述:登录
     * @param: tbUser 
     * @return: com.baibo.myshop.domain.TbUser
     * @author javathp
     * @date 2019-11-19
     */
    TbUser login(TbUser tbUser);
}
