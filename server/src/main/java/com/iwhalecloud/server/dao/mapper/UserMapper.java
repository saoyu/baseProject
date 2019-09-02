package com.iwhalecloud.server.dao.mapper;

import com.iwhalecloud.client.model.query.UserQuery;
import com.iwhalecloud.server.dao.dataobject.generator.UserDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 用户自定义Mapper
 * @author leeshaoyu
 * @description
 * @date 2019/8/26
 */
@Component
@Mapper
public interface UserMapper {
    /**
     * 根据用户名来查询用户详情
     * @param username
     * @return
     */
    UserDO selectByUsername(@Param("username") String username);

    /**
     * 根据用户昵称来查询用户详情
     * @param nickname
     * @return
     */
    UserDO selectByNickname(@Param("nickname") String nickname);

    /**
     * 查询用户列表
     * @param userQuery
     * @return
     */
    List<UserDO> listUser(UserQuery userQuery);

    /**
     * 查询用户详情
     * @param userDO
     * @return
     */
    UserDO selectUser(UserDO userDO);

    /**
     * 查询所有
     * @return
     */
    List<UserDO> listAll(@Param("status") String status);
}
