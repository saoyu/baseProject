package com.iwhalecloud.server.domain;

import com.iwhalecloud.client.model.dto.UserDTO;
import com.iwhalecloud.client.model.param.UserParam;
import com.iwhalecloud.client.model.query.UserQuery;
import com.iwhalecloud.server.repository.UserRepository;
import com.ztesoft.zsmart.nros.base.exception.ExceptionHandler;
import org.apache.commons.lang3.StringUtils;
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

    public UserDTO selectByNickname(String nickname) {
        return userRepository.selectByNickname(nickname);
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
        //参数校验
        if (StringUtils.isBlank(userParam.getUsername())){
            ExceptionHandler.publish("BASE-USER-0001","用户名为空");
        }
        if (userRepository.selectByUsername(userParam.getUsername()) != null){
            ExceptionHandler.publish("BASE-USER-0001","用户名已存在");
        }
        return userRepository.insertUser(userParam);
    }

    public List<UserDTO> listAll() {
        return userRepository.listAll();
    }
}
