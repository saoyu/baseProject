package com.iwhalecloud.server.service.impl;

import com.iwhalecloud.client.api.UserService;
import com.iwhalecloud.client.model.dto.UserDTO;
import com.iwhalecloud.client.model.param.UserParam;
import com.iwhalecloud.client.model.query.UserQuery;
import com.iwhalecloud.server.domain.UserDomain;
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
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDomain userDomain;

    /**
     * 通过id查询用户
     * @param id
     * @return UserDO
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public UserDTO selectUserById(Long id) {
        return userDomain.selectUserById(id);
    }

    /**
     * 通过用户名查询用户
     * @param username
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public UserDTO selectByUsername(String username) {
        return userDomain.selectByUsername(username);
    }

    /**
     * 通过昵称查询用户
     * @param nickname
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public UserDTO selectByNickname(String nickname) {
        return userDomain.selectByNickname(nickname);
    }

    /**
     * 查询用户列表
     * @param userQuery
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public List<UserDTO> listUser(UserQuery userQuery) {
        return userDomain.listUser(userQuery);
    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public int deleteUser(Long id) {
        return userDomain.deleteUser(id);
    }

    /**
     * 更新用户
     * @param userParam
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public int updateUser(UserParam userParam) {
        return userDomain.updateUser(userParam);
    }

    /**
     * 新增用户
     * @param userParam
     * @return
     */
    @Override
    public int insertUser(UserParam userParam) {
        return userDomain.insertUser(userParam);
    }

    /**
     * 查询所有用户
     * @return
     */
    @Override
    public List<UserDTO> listAll() {
        return userDomain.listAll();
    }

    /**
     * 重置密码
     * @param userParam
     * @return
     */
    @Override
    public int updatePassword(UserParam userParam) {
        return userDomain.updateUser(userParam);
    }

    /**
     * 查询用户详情
     * @param userQuery
     * @return
     */
    @Override
    public UserDTO detailUser(UserQuery userQuery) {
       UserDTO userDTO = userDomain.detailUser(userQuery);
       return userDTO;
    }
}
