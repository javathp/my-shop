package com.baibo.myshop.web.api.service.imp;

import com.baibo.myshop.domain.TbUser;
import com.baibo.myshop.web.api.dao.TbUserDao;
import com.baibo.myshop.web.api.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

/**
 * Author:javathp
 * Date:Created in  10:47 2019/11/19
 * Modified by:
 */
@Service
public class TbUserServiceImpl implements TbUserService {

    @Autowired
    private TbUserDao tbUserDao;
    @Override
    public TbUser login(TbUser tbUser) {
        TbUser user = tbUserDao.login(tbUser);
        if (user != null) {
//          将明文密码加密
            String password = DigestUtils.md5DigestAsHex(tbUser.getPassword().getBytes());
            if (password.equals(user.getPassword())) {
                return user;
            }
        }
        return null;
    }
}
