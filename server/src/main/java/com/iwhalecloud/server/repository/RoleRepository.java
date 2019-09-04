package com.iwhalecloud.server.repository;

import com.iwhalecloud.client.model.dto.RoleDTO;
import com.iwhalecloud.client.model.param.RoleDeleteParam;
import com.iwhalecloud.client.model.param.RoleSaveParam;
import com.iwhalecloud.client.model.query.RoleQuery;
import com.iwhalecloud.server.common.convertor.RoleConvertor;
import com.iwhalecloud.server.dao.dataobject.generator.RoleDO;
import com.iwhalecloud.server.dao.mapper.RoleMapper;
import com.iwhalecloud.server.dao.mapper.generator.RoleDOMapper;
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
public class  RoleRepository {

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private RoleDOMapper roleDOMapper;

    /**
     * 通过id查询角色信息
     * @param id
     * @return
     */
    public RoleDTO selectRoleById(Long id){
        RoleDO roleDO = roleDOMapper.selectByPrimaryKey(id);
        return RoleConvertor.INSTANCE.doToDTO(roleDO);
    }

    public List<RoleDTO> listRole(RoleQuery roleQuery) {
        List<RoleDO> roleDOList = roleMapper.listRole(roleQuery);
        return RoleConvertor.INSTANCE.doListToDTOList(roleDOList);
    }

    public Long addRole(RoleSaveParam roleSaveParam) {
        RoleDO roleDO = RoleConvertor.INSTANCE.saveParamToDO(roleSaveParam);
        roleDOMapper.insertSelective(roleDO);
        return roleDO.getId();
    }

    public void deleteRole(RoleDeleteParam roleDeleteParam) {
        roleDOMapper.deleteByPrimaryKey(roleDeleteParam.getId());
    }
}
