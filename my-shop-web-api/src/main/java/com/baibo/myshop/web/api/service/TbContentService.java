package com.baibo.myshop.web.api.service;

import com.baibo.myshop.domain.TbContent;

import java.util.List;

/**
 * Author:javathp
 * Date:Created in  14:45 2019/11/16
 * Modified by:
 */
public interface TbContentService {


    /**
     * 功能描述:根据类别id查询内容
     * @param: categoryId
     * @return: java.util.List<com.baibo.myshop.domain.TbContent>
     * @author javathp
     * @date 2019-11-16
     */
    List<TbContent> selectByCategoryId(Long categoryId);
}
