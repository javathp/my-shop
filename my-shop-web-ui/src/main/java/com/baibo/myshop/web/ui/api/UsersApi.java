package com.baibo.myshop.web.ui.api;

import com.baibo.myshop.commons.utils.HttpClientUtils;
import com.baibo.myshop.commons.utils.MapperUtils;
import com.baibo.myshop.web.ui.dto.TbUser;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.List;

/**
 * 会员管理接口
 * <p>Title: ContentsApi</p>
 * <p>Description: </p>
 *
 * Author:javathp
 * Date:Created in  13:42 2019/11/19
 * Modified by:
 */
public class UsersApi {

    /**
     * 登录
     * @param tbUser
     * @return
     */
    public static TbUser login(TbUser tbUser) throws Exception {
        List<BasicNameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair("username", tbUser.getUsername()));
        params.add(new BasicNameValuePair("password", tbUser.getPassword()));

        String json = HttpClientUtils.doPost(API.API_USERS_LOGIN, params.toArray(new BasicNameValuePair[params.size()]));
        TbUser user = MapperUtils.json2pojoByTree(json, "data", TbUser.class);
        return user;
    }
}
