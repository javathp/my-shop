package com.baibo.myshop.web.admin.dao;

import com.baibo.myshop.commons.persistence.BaseDao;
import com.baibo.myshop.domain.TbContent;
import org.springframework.stereotype.Repository;

/**
 * Author:javathp
 * Date:Created in  8:38 2019/11/1
 * Modified by:
 */
@Repository
public interface TbContentDao extends BaseDao<TbContent> {
    /**
     * 根据类目 ID 删除内容
     *
     * @param categoryIds
     */
    void deleteByCategoryId(String[] categoryIds);
}
