package com.iwhalecloud.client.api;

import com.iwhalecloud.client.model.dto.RoleDTO;
import com.iwhalecloud.client.model.param.RoleDeleteParam;
import com.iwhalecloud.client.model.param.RoleSaveParam;
import com.iwhalecloud.client.model.query.RoleQuery;

import java.util.List;

/**
 * RoleService
 * @author leeshaoyu
 * @description
 * @date 2019/8/22
 */
public interface RoleService {

    /**
     * 查询角色详情
     * @param roleQuery
     * @return
     */
    RoleDTO detailRole(RoleQuery roleQuery);

    List<RoleDTO> listRole(RoleQuery roleQuery);

    Long saveRole(RoleSaveParam roleSaveParam);

    void deleteRole(RoleDeleteParam roleDeleteParam);
}
