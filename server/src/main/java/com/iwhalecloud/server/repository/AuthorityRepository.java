package com.iwhalecloud.server.repository;

import com.iwhalecloud.client.model.dto.AuthorityDTO;
import com.iwhalecloud.client.model.param.AuthoritySaveParam;
import com.iwhalecloud.client.model.query.AuthorityQuery;
import com.iwhalecloud.server.common.convertor.AuthorityConvertor;
import com.iwhalecloud.server.dao.dataobject.generator.AuthorityDO;
import com.iwhalecloud.server.dao.mapper.AuthorityMapper;
import com.iwhalecloud.server.dao.mapper.generator.AuthorityDOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 角色仓储
 * @author leeshaoyu
 * @description
 * @date 2019/8/22
 */
@Repository
public class AuthorityRepository {

    @Autowired
    private AuthorityDOMapper authorityDOMapper;

    @Autowired
    private AuthorityMapper authorityMapper;

    public void addAuthority(AuthoritySaveParam authoritySaveParam) {
        AuthorityDO authorityDO = AuthorityConvertor.INSTANCE.saveParamToDO(authoritySaveParam);
        authorityDOMapper.insertSelective(authorityDO);
    }

    public AuthorityDTO detailAuthority(AuthorityQuery authorityQuery) {
        AuthorityDO authorityDO = authorityDOMapper.selectByPrimaryKey(authorityQuery.getId());
        return AuthorityConvertor.INSTANCE.doToDTO(authorityDO);
    }

    public List<AuthorityDTO> listByRoleId(Long roleId) {
        List<AuthorityDO> authorityDOList =  authorityMapper.listByRoleId(roleId);
        return AuthorityConvertor.INSTANCE.doListToDTOList(authorityDOList);
    }

    public void deleteAuthority(Long id) {
        authorityDOMapper.deleteByPrimaryKey(id);
    }
}