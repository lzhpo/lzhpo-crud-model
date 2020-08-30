package com.lzhpo.lzhpocrudmodel.crudmodel;

import com.lzhpo.lzhpocrudmodel.constant.CrudModelConstant;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Base Mapper
 *
 * @author Zhaopo Liu
 * @date 2020/8/27 11:18
 */
public interface BaseMapper<T> {

    /**
     * 获取单条数据
     *
     * @param entity entity
     * @return T
     */
    T findOne(T entity);

    /**
     * 获取列表数据
     *
     * @param entity entity
     * @return List
     */
    List<T> findList(T entity);

    /**
     * 获取所有列表数据
     *
     * @return List
     */
    List<T> findAll();

    /**
     * 根据id获取列表数据
     *
     * @param ids ids
     * @return List
     */
    List<T> findListById(@Param(CrudModelConstant.PARAM_IDS) Long[] ids);

    /**
     * 插入单条数据
     *
     * @param entity entity
     * @return int
     */
    int insert(T entity);

    /**
     * 更新单条数据
     *
     * @param entity entity
     * @return int
     */
    int update(T entity);

    /**
     * 删除单条数据
     *
     * @param entity entity
     * @return int
     */
    int delete(T entity);

    /**
     * 批量删除
     *
     * @param ids ids
     * @return int
     */
    int batchDelete(@Param(CrudModelConstant.PARAM_IDS) Long[] ids);


}
