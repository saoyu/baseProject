package com.iwhalecloud.server.dao.mapper.generator;

import com.iwhalecloud.server.dao.dataobject.generator.RoleDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 *
 * @author leeshoayu
 * @date 2019/9/3
 * @version 1.0
 */
@Component
@Mapper
public interface RoleDOMapper {

    /**
     * 通过id删除记录
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 新增记录
     * @param record
     * @return
     */
    int insert(RoleDO record);

    /**
     * 新增记录
     * @param record
     * @return
     */
    int insertSelective(RoleDO record);

    /**
     * 通过主键查询记录
     * @param id
     * @return
     */
    RoleDO selectByPrimaryKey(Long id);

    /**
     * 通过主键更新数据库记录
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(RoleDO record);

    /**
     * 通过主键更新数据库记录
     * @param record
     * @return
     */
    int updateByPrimaryKey(RoleDO record);
}