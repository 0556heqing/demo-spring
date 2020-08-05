package com.heqing.demo.spring.mongodb.dao;

import com.heqing.demo.spring.mongodb.util.PageInfoUtil;
import org.springframework.data.mongodb.core.query.Query;

import java.io.Serializable;
import java.util.List;

/**
 * 数据访问基础类
 */
public interface BaseDao<T, PK extends Serializable> {

    /**
     * 增加
     *
     * @param entity 列
     * @return int 成功数量
     */
    int save(T entity);

    /**
     * 增加多条
     *
     * @param entityList 多条列
     * @return int 成功数量
     */
    int saveBatch(List<T> entityList);

    /**
     * 根据主键修改
     *
     * @param entity 列
     * @return int 成功数量
     */
    int updateByKey(T entity);

    /**
     * 根据主键获取
     *
     * @param key 主键
     * @return int 成功数量
     */
    T getOneByKey(PK key);

    /**
     * 根据多个主键获取多条
     *
     * @param keyList 主键集合
     * @return List<T> 列信息
     */
    List<T> listByKey(List<PK> keyList);

    /**
     * 根据主键删除
     *
     * @param pk 列
     * @return int 成功数量
     */
    int delete(PK pk);

    /**
     * 根据多个主键删除
     *
     * @param pkList 列
     * @return int 成功数量
     */
    int deleteBatch(List<PK> pkList);

    /**
     * 返回所有数据
     * @return List<T> 列信息
     */
    List<T> list();

    /**
     * 根据条件返回数据
     * @return List<T> 列信息
     */
    List<T> list(T t);

    /**
     * 获取总数
     * @return 总数
     */
    long count();

    /**
     * 根据条件返回数量
     * @return 总数
     */
    long count(T t);

    /**
     * 根据条件返回数据
     * @return List<T> 列信息
     */
    PageInfoUtil<T> listByPage(T t, int pageNum, int pageSize);

}
