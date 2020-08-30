package com.lzhpo.lzhpocrudmodel.crudmodel;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Base Service
 *
 * @author Zhaopo Liu
 * @date 2020/8/27 11:18
 */
public abstract class BaseService<D extends BaseMapper<T>, T extends BaseEntity<T>> {

    @Autowired
    protected D dao;

    /**
     * 获取单条数据
     *
     * @param entity entity
     * @return T
     */
    public T findOne(T entity) {
        return dao.findOne(entity);
    }

    /**
     * 查询列表
     *
     * @param entity entity
     * @return List
     */
    public List<T> findList(T entity) {
        return dao.findList(entity);
    }

    /**
     * 查询所有列表
     *
     * @return List
     */
    public List<T> findAll() {
        return dao.findAll();
    }

    /**
     * 查询列表
     *
     * @param ids ids
     * @return List
     */
    public List<T> findListById(Long[] ids) {
        if (ids == null || ids.length == 0) {
            return new ArrayList<>();
        }
        return dao.findListById(ids);
    }

    /**
     * 查询分页
     *
     * @param page   page
     * @param entity entity
     * @return PageInfo
     */
    public PageInfo<T> findPage(PageInfo<T> page, T entity) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        return new PageInfo<>(dao.findList(entity));
    }

    /**
     * 删除
     *
     * @param entity entity
     * @return int
     */
    @Transactional(rollbackFor = Exception.class)
    public int delete(T entity) {
        return dao.delete(entity);
    }

    /**
     * 批量删除
     *
     * @param ids ids
     * @return int
     */
    @Transactional(rollbackFor = Exception.class)
    public int batchDelete(Long[] ids) {
        return this.dao.batchDelete(ids);
    }

    /**
     * 插入数据
     *
     * @param entity entity
     * @return int
     */
    @Transactional(rollbackFor = Exception.class)
    public int insert(T entity) {
        return dao.insert(entity);
    }

    /**
     * 更新数据
     *
     * @param entity entity
     * @return int
     */
    @Transactional(rollbackFor = Exception.class)
    public int update(T entity) {
        return dao.update(entity);
    }

}
