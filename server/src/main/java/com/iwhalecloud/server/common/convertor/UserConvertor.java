package com.iwhalecloud.server.common.convertor;

import com.iwhalecloud.client.model.dto.UserDTO;
import com.iwhalecloud.client.model.param.UserParam;
import com.iwhalecloud.server.dao.dataobject.generator.UserDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 用户转换器
 *
 * @author leeshaoyu
 * @description
 * @date 2019/8/22
 */
@Mapper
public interface UserConvertor {

    UserConvertor INSTANCE = Mappers.getMapper(UserConvertor.class);

    UserDTO doToDTO(UserDO userDO);

    UserDO paramToDO(UserParam userParam);

    List<UserDTO> doListToDTOList(List<UserDO> list);

}
