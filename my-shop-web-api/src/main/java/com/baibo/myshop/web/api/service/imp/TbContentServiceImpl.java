package com.baibo.myshop.web.api.service.imp;

import com.baibo.myshop.domain.TbContent;
import com.baibo.myshop.domain.TbContentCategory;
import com.baibo.myshop.web.api.dao.TbContentDao;
import com.baibo.myshop.web.api.service.TbContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author:javathp
 * Date:Created in  14:46 2019/11/16
 * Modified by:
 */
@Service
public class TbContentServiceImpl implements TbContentService {

    @Autowired
    private TbContentDao tbContentDao;

    @Override
    public List<TbContent> selectByCategoryId(Long categoryId) {
        TbContentCategory tbContentCategory = new TbContentCategory();
        tbContentCategory.setId(categoryId);
        TbContent tbContent = new TbContent();
        tbContent.setTbContentCategory(tbContentCategory);
        return tbContentDao.selectByCategoryId(tbContent);
    }
}
