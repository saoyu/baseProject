package com.iwhalecloud.server.common.convertor;

import com.iwhalecloud.client.model.dto.AuthorityDTO;
import com.iwhalecloud.client.model.param.AuthorityParam;
import com.iwhalecloud.client.model.param.AuthoritySaveParam;
import com.iwhalecloud.server.dao.dataobject.generator.AuthorityDO;
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
public interface AuthorityConvertor {

    AuthorityConvertor INSTANCE = Mappers.getMapper(AuthorityConvertor.class);

    AuthorityDTO doToDTO(AuthorityDO authorityDO);

    AuthorityDO paramToDO(AuthorityParam authorityParam);

    AuthorityDO saveParamToDO(AuthoritySaveParam authoritySaveParam);

    List<AuthorityDTO> doListToDTOList(List<AuthorityDO> authorityDOList);
//
//    UserQuery paramToQuery(UserParam userParam);



}
