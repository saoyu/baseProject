package com.iwhalecloud.server.dao.mapper;

import com.iwhalecloud.server.dao.dataobject.generator.AuthorityDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface AuthorityMapper {

    List<AuthorityDO> listByRoleId(Long roleId);
}