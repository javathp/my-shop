package com.baibo.myshop.web.admin.service.Impl;

import com.baibo.myshop.commons.dto.BaseResult;
import com.baibo.myshop.commons.validator.BeanValidator;
import com.baibo.myshop.domain.TbContent;
import com.baibo.myshop.web.admin.abstracts.AbstractBaseServiceImpl;
import com.baibo.myshop.web.admin.dao.TbContentDao;
import com.baibo.myshop.web.admin.service.TbContentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Author:javathp
 * Date:Created in  9:32 2019/11/1
 * Modified by:
 */
@Service
@Transactional(readOnly = true)
public class TbContentServiceImpl extends AbstractBaseServiceImpl<TbContent, TbContentDao> implements TbContentService {

    @Override
    @Transactional(readOnly = false)
    public BaseResult save(TbContent tbContent) {
        String validator = BeanValidator.validator(tbContent);

        // 验证不通过
        if (validator != null) {
            return BaseResult.fail(validator);
        }

        // 验证通过
        else {
            tbContent.setUpdated(new Date());

            // 新增
            if (tbContent.getId() == null) {
                // 密码需要加密处理
                tbContent.setCreated(new Date());
                dao.insert(tbContent);
            }

            // 编辑用户
            else {
                update(tbContent);
            }

            return BaseResult.success("保存内容信息成功");
        }
    }

    @Override
    @Transactional(readOnly = false)
    public void deleteByCategoryId(String[] categoryIds) {
        dao.deleteByCategoryId(categoryIds);
    }
}
