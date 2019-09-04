package com.iwhalecloud.server.dao.mapper.generator;

import com.iwhalecloud.server.dao.dataobject.generator.AuthorityDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface AuthorityDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AuthorityDO record);

    int insertSelective(AuthorityDO record);

    AuthorityDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AuthorityDO record);

    int updateByPrimaryKey(AuthorityDO record);
}