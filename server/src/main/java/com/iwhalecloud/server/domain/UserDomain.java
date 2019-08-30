package com.iwhalecloud.server.domain;

import com.iwhalecloud.client.model.dto.UserDTO;
import com.iwhalecloud.client.model.param.UserParam;
import com.iwhalecloud.client.model.query.UserQuery;
import com.iwhalecloud.server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author leeshaoyu
 * @description
 * @date 2019/8/22
 */
@Component
public class UserDomain {

    @Autowired
    private UserRepository userRepository;


    public UserDTO selectUserById(Long id) {
        return userRepository.selectById(id);
    }

    public UserDTO selectByUsername(String username) {
        return userRepository.selectByUsername(username);
    }

    public UserDTO selectBynickname(String nickname) {
        return userRepository.selectBynickname(nickname);
    }

    public List<UserDTO> listUser(UserQuery userQuery) {
        return userRepository.listUser(userQuery);
    }

    public int deleteUser(Long id) {
        return userRepository.deleteUser(id);
    }

    public int updateUser(UserParam userParam) {
        return userRepository.updateUser(userParam);
    }

    public int insertUser(UserParam userParam) {
        return userRepository.insertUser(userParam);
    }

    public List<UserDTO> listAll() {
        return userRepository.listAll();
    }
}
