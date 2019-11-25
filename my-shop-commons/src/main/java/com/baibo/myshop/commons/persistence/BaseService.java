package com.baibo.myshop.commons.persistence;

import com.baibo.myshop.commons.dto.BaseResult;
import com.baibo.myshop.commons.dto.PageInfo;

import java.util.List;

/**
 * 所有业务逻辑层的基类
 * <p>Title: BaseService</p>
 * <p>Description: </p>
 *
 * Author:javathp
 * Date:Created in  11:33 2019/10/29
 * Modified by:
 */
public interface BaseService<T extends BaseEntity> {
    /**
     * 查询全部
     * @return
     */
    public List<T> selectAll();

    /**
     * 保存信息
     * @param entity
     * @return
     */
    BaseResult save(T entity);

    /**
     * 删除用户信息
     * @param id
     */
    void delete(Long id);

    /**
     * 根据 ID 获取信息
     * @param id
     * @return
     */
    T getById(Long id);

    /**
     * 更新信息
     * @param entity
     */
    void update(T entity);

    /**
     * 批量删除
     * @param ids
     */
    void deleteMulti(String[] ids);

    /**
     * 分页查询
     * @param start
     * @param length
     * @return
     */
    PageInfo<T> page(int start, int length, int draw, T entity);

    /**
     * 查询总笔数
     * @return
     */
    int count(T entity);
}
