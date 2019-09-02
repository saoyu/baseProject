package com.iwhalecloud.server.dao.mapper.generator;

import com.iwhalecloud.server.dao.dataobject.generator.UserDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 *  用户
 * @author leeshoayu
 * @date 2019/8/21
 * @version 1.0
 */
@Component
@Mapper
public interface UserDOMapper {

    /**
     * 根据主键删除数据库记录
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入数据库记录
     * @param record
     * @return
     */
    int insert(UserDO record);

    /**
     * 插入数据库记录
     * @param record
     * @return
     */
    int insertSelective(UserDO record);

    /**
     * 根据主键获取一条数据库记录
     * @param id
     * @return
     */
    UserDO selectByPrimaryKey(Long id);

    /**
     * 根据主键来更新数据库记录
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(UserDO record);

    /**
     * 根据主键来更新数据库记录
     * @param record
     * @return
     */
    int updateByPrimaryKey(UserDO record);
}