package com.iwhalecloud.start.controller;

import com.iwhalecloud.client.api.RoleService;
import com.iwhalecloud.client.model.dto.RoleDTO;
import com.iwhalecloud.client.model.param.RoleDeleteParam;
import com.iwhalecloud.client.model.param.RoleSaveParam;
import com.iwhalecloud.client.model.query.RoleQuery;
import com.ztesoft.zsmart.nros.base.model.ResponseMsg;
import com.ztesoft.zsmart.nros.base.util.CommonFunctions;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 角色controller
 *
 * @author leeshoayu
 * @version 1.0
 * @date 2019/8/22
 */
@RestController
@RequestMapping("/role")
@Api(value = "角色", tags = "Role-角色信息")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @PostMapping("/detail-role")
    @ApiOperation("查询角色详情")
    public ResponseMsg<RoleDTO> detailRole(@RequestBody RoleQuery roleQuery){
        return CommonFunctions.runSupplier(() -> roleService.detailRole(roleQuery), "查询失败");
    }

    @PostMapping("list-role")
    @ApiOperation("查询角色列表")
    public ResponseMsg<List<RoleDTO>> listRole(@RequestBody RoleQuery roleQuery){
        return CommonFunctions.runSupplier(() -> roleService.listRole(roleQuery), "查询失败");
    }

    @PostMapping("save-role")
    @ApiOperation("修改/保存角色")
    public ResponseMsg saveRole(@RequestBody RoleSaveParam roleSaveParam){
        return CommonFunctions.runSupplier(() -> roleService.saveRole(roleSaveParam), "修改/保存失败");
    }

    @DeleteMapping("delete-role")
    @ApiOperation("删除角色")
    public ResponseMsg deleteRole(@RequestBody RoleDeleteParam roleDeleteParam){
        roleService.deleteRole(roleDeleteParam);
        return new ResponseMsg().success();
    }

}
