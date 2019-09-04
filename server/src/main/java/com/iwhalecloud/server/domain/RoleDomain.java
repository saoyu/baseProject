package com.iwhalecloud.server.domain;

import com.iwhalecloud.client.model.dto.RoleDTO;
import com.iwhalecloud.client.model.param.RoleDeleteParam;
import com.iwhalecloud.client.model.param.RoleSaveParam;
import com.iwhalecloud.client.model.query.RoleQuery;
import com.iwhalecloud.server.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author leeshaoyu
 * @description
 * @date 2019/8/22
 */
@Component
public class RoleDomain {

    @Autowired
    private RoleRepository roleRepository;

    /**
     * 查询角色详情
     * @param roleQuery
     * @return
     */
    public RoleDTO detailRole(RoleQuery roleQuery) {
        RoleDTO roleDTO = roleRepository.selectRoleById(roleQuery.getId());
        return roleDTO;
    }

    public List<RoleDTO> listRole(RoleQuery roleQuery) {
        return roleRepository.listRole(roleQuery);
    }

    public Long addRole(RoleSaveParam roleSaveParam) {
        return roleRepository.addRole(roleSaveParam);
    }

    public void deleteRole(RoleDeleteParam roleDeleteParam) {
        roleRepository.deleteRole(roleDeleteParam);
    }
}
