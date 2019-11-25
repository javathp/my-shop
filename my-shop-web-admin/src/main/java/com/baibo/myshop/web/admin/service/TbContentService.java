package com.baibo.myshop.web.admin.service;

import com.baibo.myshop.commons.persistence.BaseService;
import com.baibo.myshop.domain.TbContent;

/**
 * Author:javathp
 * Date:Created in  8:36 2019/11/1
 * Modified by:
 */
public interface TbContentService extends BaseService<TbContent> {
    /**
     * 根据类目 ID 删除内容
     * @param categoryIds
     */
    void deleteByCategoryId(String[] categoryIds);

}
