package com.iwhalecloud.server.dao.mapper;

import com.iwhalecloud.client.model.query.RoleQuery;
import com.iwhalecloud.server.dao.dataobject.generator.RoleDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface RoleMapper {

    List<RoleDO> listRole(RoleQuery roleQuery);
}