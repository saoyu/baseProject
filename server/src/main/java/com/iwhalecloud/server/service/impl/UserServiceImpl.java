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
     *
     * @param id
     * @return UserDO
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public UserDTO selectUserById(Long id) {
        return userDomain.selectUserById(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public UserDTO selectByUsername(String username) {
        return userDomain.selectByUsername(username);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public UserDTO selectBynickname(String nickname) {
        return userDomain.selectBynickname(nickname);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public List<UserDTO> listUser(UserQuery userQuery) {
        return userDomain.listUser(userQuery);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int deleteUser(Long id) {
        return userDomain.deleteUser(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int updateUser(UserParam userParam) {
        return userDomain.updateUser(userParam);
    }

    @Override
    public int insertUser(UserParam userParam) {
        return userDomain.insertUser(userParam);
    }

    @Override
    public List<UserDTO> listAll() {
        return userDomain.listAll();
    }
}
