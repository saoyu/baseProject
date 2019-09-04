package com.iwhalecloud.server.common.convertor;

import com.iwhalecloud.client.model.dto.RoleDTO;
import com.iwhalecloud.client.model.param.RoleDeleteParam;
import com.iwhalecloud.client.model.param.RoleParam;
import com.iwhalecloud.client.model.param.RoleSaveParam;
import com.iwhalecloud.client.model.query.RoleQuery;
import com.iwhalecloud.server.dao.dataobject.generator.RoleDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 角色转换器
 *
 * @author leeshaoyu
 * @description
 * @date 2019/8/22
 */
@Mapper
public interface RoleConvertor {

    RoleConvertor INSTANCE = Mappers.getMapper(RoleConvertor.class);

    RoleDTO doToDTO(RoleDO roleDO);

    RoleDO paramToDO(RoleParam roleParam);

    List<RoleDTO> doListToDTOList(List<RoleDO> list);

    RoleQuery paramToQuery(RoleParam roleParam);

    RoleDO saveParamToDO(RoleSaveParam roleSaveParam);

    RoleDO deleteParamToDO(RoleDeleteParam roleDeleteParam);

}
