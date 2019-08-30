package com.iwhalecloud.server.dao.mapper;

import com.iwhalecloud.client.model.query.UserQuery;
import com.iwhalecloud.server.dao.dataobject.generator.UserDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author leeshaoyu
 * @description
 * @date 2019/8/26
 */
@Component
@Mapper
public interface UserMapper {
    UserDO selectByUsername(String username);

    UserDO selectByNickname(String nickname);

    List<UserDO> listUser(UserQuery userQuery);

    List<UserDO> listAll();
}
