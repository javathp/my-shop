package com.baibo.myshop.web.api.dao;

import com.baibo.myshop.domain.TbContent;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Author:javathp
 * Date:Created in  14:42 2019/11/16
 * Modified by:
 */
@Repository
public interface  TbContentDao {

    /**
     * 功能描述:根据类别id查询内容
     * @param: tbContent
     * @return: java.util.List<com.baibo.myshop.domain.TbContent>
     * @author javathp
     * @date 2019-11-16
     */
    List<TbContent> selectByCategoryId(TbContent tbContent);
}
