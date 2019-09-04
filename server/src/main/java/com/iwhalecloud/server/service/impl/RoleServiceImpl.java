package com.iwhalecloud.server.service.impl;

import com.iwhalecloud.client.api.RoleService;
import com.iwhalecloud.client.model.dto.RoleDTO;
import com.iwhalecloud.client.model.param.RoleDeleteParam;
import com.iwhalecloud.client.model.param.RoleSaveParam;
import com.iwhalecloud.client.model.query.RoleQuery;
import com.iwhalecloud.server.domain.RoleDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author leeshaoyu
 * @description
 * @date 2019/8/22
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDomain roleDomain;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public RoleDTO detailRole(RoleQuery roleQuery) {
        RoleDTO roleDTO = roleDomain.detailRole(roleQuery);
        return roleDTO;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public List<RoleDTO> listRole(RoleQuery roleQuery) {
        List<RoleDTO> roleDTOList = roleDomain.listRole(roleQuery);
        return roleDTOList;
    }

    @Override
    public Long saveRole(RoleSaveParam roleSaveParam) {
        return roleDomain.addRole(roleSaveParam);
    }

    @Override
    public void deleteRole(RoleDeleteParam roleDeleteParam) {
        roleDomain.deleteRole(roleDeleteParam);
    }
}
