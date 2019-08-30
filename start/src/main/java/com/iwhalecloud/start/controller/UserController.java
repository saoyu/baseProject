package com.iwhalecloud.start.controller;

import com.iwhalecloud.client.api.UserService;
import com.iwhalecloud.client.model.dto.UserDTO;
import com.iwhalecloud.client.model.param.UserParam;
import com.iwhalecloud.client.model.query.UserQuery;
import com.iwhalecloud.server.common.model.ResponseMsg;
import com.iwhalecloud.server.common.utils.CommonFunctions;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *  用户controller
 * @author leeshoayu
 * @date 2019/8/22
 * @version 1.0
 */
@RestController
@RequestMapping("/user")
@Api(value = "用户", tags = "用户接口")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    @ApiOperation("测试")
    public String user(){
        return "sds";
    }

    @GetMapping("/select-by-id")
    @ApiOperation("通过id查询用户详情")
    public ResponseMsg<UserDTO> selectUserById(@RequestParam Long id){
        return CommonFunctions.runSupplier(()->userService.selectUserById(id), "查询失败");
    }

    @GetMapping("/list-all")
    @ApiOperation("通过用户名查询用户详情")
    public List<UserDTO> listAll(){
        return userService.listAll();
    }


    @GetMapping("/select-by-username")
    @ApiOperation("通过用户名查询用户详情")
    public UserDTO selectByUsername(@RequestParam String username){
        return userService.selectByUsername(username);
    }

    @GetMapping("/select-by-nickname")
    @ApiOperation("通过昵称查询用户详情")
    public UserDTO selectBynickname(@RequestParam String nickname){
        return userService.selectBynickname(nickname);
    }

    @PostMapping("/list-user")
    @ApiOperation("查询用户列表")
    public List<UserDTO> listUser(@RequestBody UserQuery userQuery){
        return userService.listUser(userQuery);
    }

    @PostMapping("/insert-user")
    @ApiOperation("新增用户")
    public int insertUser(@RequestBody UserParam userParam) {
        return userService.insertUser(userParam);
    }

/*    @PostMapping("/batch-insert-user")
    @ApiOperation("批量新增用户")
    public ResponseMsg InsertUser(@RequestBody UserParam userParam) {
        return userService.InsertUser(userParam);
    }*/

    @DeleteMapping("/delete-user")
    @ApiOperation("新增用户")
    public int deleteUser(@RequestParam Long id) {
        return userService.deleteUser(id);
    }

    @PutMapping("/update-user")
    @ApiOperation("更新用户信息")
    public int updateUser(@RequestBody UserParam userParam) {
        return userService.updateUser(userParam);
    }

}
