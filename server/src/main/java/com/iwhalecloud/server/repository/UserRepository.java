package com.iwhalecloud.server.repository;

import com.iwhalecloud.client.model.dto.UserDTO;
import com.iwhalecloud.client.model.param.UserParam;
import com.iwhalecloud.client.model.query.UserQuery;
import com.iwhalecloud.server.common.convertor.UserConvertor;
import com.iwhalecloud.server.dao.dataobject.generator.UserDO;
import com.iwhalecloud.server.dao.mapper.UserMapper;
import com.iwhalecloud.server.dao.mapper.generator.UserDOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author leeshaoyu
 * @description
 * @date 2019/8/22
 */
@Repository
public class UserRepository {

    @Autowired
    private UserDOMapper userDOMapper;

    @Autowired
    private UserMapper userMapper;

    public UserDTO selectById(Long id) {
        return UserConvertor.INSTANCE.doToDTO(userDOMapper.selectByPrimaryKey(id));
    }

    public UserDTO selectByUsername(String username) {
        return UserConvertor.INSTANCE.doToDTO(userMapper.selectByUsername(username));
    }

    public UserDTO selectByNickname(String nickname) {
        return UserConvertor.INSTANCE.doToDTO(userMapper.selectByNickname(nickname));
    }

    public List<UserDTO> listUser(UserQuery userQuery) {
        return UserConvertor.INSTANCE.doListToDTOList(userMapper.listUser(userQuery));
    }

    public int deleteUser(Long id) {
        return userDOMapper.deleteByPrimaryKey(id);
    }

    public int updateUser(UserParam userParam) {
        UserDO userDO = UserConvertor.INSTANCE.paramToDO(userParam);
        return userDOMapper.updateByPrimaryKeySelective(userDO);
    }

    public int insertUser(UserParam userParam) {
        UserDO userDO = UserConvertor.INSTANCE.paramToDO(userParam);
        return userDOMapper.insertSelective(userDO);
    }

    public List<UserDTO> listAll() {
        return UserConvertor.INSTANCE.doListToDTOList(userMapper.listAll("1"));
    }
}
