package com.baibo.myshop.web.admin.dao;

import com.baibo.myshop.commons.persistence.BaseDao;
import com.baibo.myshop.domain.TbUser;
import org.springframework.stereotype.Repository;

/**
 * Author:javathp
 * Date:Created in  10:02 2019/10/27
 * Modified by:
 */
@Repository
public interface TbUserDao extends BaseDao<TbUser> {

    /**
     * 根据邮箱查询用户信息
     *
     * @param email
     * @return
     */
    TbUser getByEmail(String email);
}

