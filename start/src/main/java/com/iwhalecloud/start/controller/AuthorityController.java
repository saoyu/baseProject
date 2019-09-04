package com.iwhalecloud.start.controller;

import com.iwhalecloud.client.api.AuthorityService;
import com.iwhalecloud.client.model.dto.AuthorityDTO;
import com.iwhalecloud.client.model.param.AuthoritySaveParam;
import com.iwhalecloud.client.model.query.AuthorityQuery;
import com.ztesoft.zsmart.nros.base.model.ResponseMsg;
import com.ztesoft.zsmart.nros.base.util.CommonFunctions;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 权限控制器
 *
 * @author leeshoayu
 * @version 1.0
 * @date 2019/8/22
 */
@RestController
@RequestMapping("/authority")
@Api(value = "权限", tags = "AuthorityController")
public class AuthorityController {

    @Autowired
    private AuthorityService authorityService;

    @PostMapping("/detail-authority")
    @ApiOperation("查询权限详情")
    public ResponseMsg<AuthorityDTO> detailAuthority(@RequestBody AuthorityQuery authorityQuery) {
        return CommonFunctions.runSupplier(() -> authorityService.detailAuthority(authorityQuery),"查询失败");
    }

    @PostMapping("/delete-authority")
    @ApiOperation("删除权限")
    public ResponseMsg<AuthorityDTO> deleteAuthority(@RequestParam Long id) {
        authorityService.deleteAuthority(id);
        return new ResponseMsg().success();
    }

    @PostMapping("/save-authority")
    @ApiOperation("保存权限")
    public ResponseMsg<AuthorityDTO> saveAuthority(@RequestBody AuthoritySaveParam authoritySaveParam) {
        authorityService.saveAuthority(authoritySaveParam);
        return new ResponseMsg().success();
    }

    @PostMapping("/list-authority-by-id")
    @ApiOperation("通过roleId查询权限列表")
    public ResponseMsg<List<AuthorityDTO>> listByRoleId(@RequestParam Long roleId) {
        return CommonFunctions.runSupplierByList(()->authorityService.listByRoleId(roleId),"查询失败");

    }
}