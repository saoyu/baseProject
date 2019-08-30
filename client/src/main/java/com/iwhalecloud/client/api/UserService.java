package com.iwhalecloud.client.api;

import com.iwhalecloud.client.model.dto.UserDTO;
import com.iwhalecloud.client.model.param.UserParam;
import com.iwhalecloud.client.model.query.UserQuery;

import java.util.List;

/**
 * 用户服务
 * @author leeshaoyu
 * @description
 * @date 2019/8/22
 */
public interface UserService {

    /**
     *  通过id查询用户
     * @param id
     * @return UserDO
     */
    UserDTO selectUserById(Long id);

    UserDTO selectByUsername(String username);

    UserDTO selectBynickname(String username);

    List<UserDTO> listUser(UserQuery userQuery);

    int deleteUser(Long id);

    int updateUser(UserParam userParam);

    int insertUser(UserParam userParam);

    List<UserDTO> listAll();
}
