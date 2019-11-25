package com.baibo.myshop.web.admin.test;

import com.baibo.myshop.domain.TbUser;
import com.baibo.myshop.web.admin.service.TbUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.DigestUtils;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Author:javathp
 * Date:Created in  10:22 2019/10/27
 * Modified by:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml", "classpath:spring-context-druid.xml", "classpath:spring-context-mybatis.xml"})
public class TbUserServiceTest {

    @Autowired
    private TbUserService tbUserService;

    @Test
    public void testSelectAll(){
        List<TbUser> tbUserList = tbUserService.selectAll();
        for (TbUser tbUser : tbUserList) {
            System.out.println(tbUser);
        }
    }
    @Test
    public void testInsert(){
        TbUser tbUser = new TbUser();
        tbUser.setEmail("admin1@admin.com");
        tbUser.setPassword(DigestUtils.md5DigestAsHex("123456".getBytes()));
        tbUser.setPhone("15888888889");
        tbUser.setUsername("test3");
        tbUser.setCreated(new Date());
        tbUser.setUpdated(new Date());

        tbUserService.save(tbUser);
    }
    @Test
    public void testDelete(){
        tbUserService.delete(41l);
    }
    @Test
    public void testGetById(){
        TbUser tbUser = tbUserService.getById(37l);
        System.out.println(tbUser);
    }
    @Test
    public void testUpdate(){
        TbUser tbUser = tbUserService.getById(37l);
        tbUser.setEmail("admin@qq.com");
        tbUser.setPassword(DigestUtils.md5DigestAsHex("123456".getBytes()));
        tbUserService.update(tbUser);
    }

}