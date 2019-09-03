package com.iwhalecloud.client.api;

import com.iwhalecloud.client.model.dto.UserDTO;
import com.iwhalecloud.client.model.param.UserParam;
import com.iwhalecloud.client.model.query.UserQuery;

import java.util.List;

/**
 * UserService
 * @author leeshaoyu
 * @description
 * @date 2019/8/22
 */
public interface UserService {

    /**
     * 通过id查询用户
     * @param id
     * @return UserDO
     */
    UserDTO selectUserById(Long id);

    /**
     * 通过用户名查询用户
     * @param username
     * @return UserDO
     */
    UserDTO selectByUsername(String username);

    /**
     * 通过昵称查询用户
     * @param nickname
     * @return UserDO
     */
    UserDTO selectByNickname(String nickname);

    /**
     * 查询用户列表
     * @param userQuery
     * @return
     */
    List<UserDTO> listUser(UserQuery userQuery);

    /**
     * 删除用户
     * @param id
     * @return
     */
    int deleteUser(Long id);

    /**
     * 更新用户信息
     * @param userParam
     * @return
     */
    int updateUser(UserParam userParam);

    /**
     * 新增用户
     * @param userParam
     * @return
     */
    int insertUser(UserParam userParam);

    /**
     * 查询所有用户
     * @return
     */
    List<UserDTO> listAll();

    /**
     * 修改密码
     * @param userParam
     * @return
     */
    int updatePassword(UserParam userParam);

    UserDTO detailUser(UserQuery userQuery);
}
