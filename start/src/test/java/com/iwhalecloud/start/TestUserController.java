package com.iwhalecloud.start;

import com.iwhalecloud.client.api.UserService;
import com.iwhalecloud.client.model.dto.UserDTO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author leeshaoyu
 * @description
 * @date 2019/8/30
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestUserController {

    @Autowired
    private UserService userService;
    @Test
    public void testSelectBynickname(){
        UserDTO leeshaoyu = userService.selectByUsername("leeshaoyu");
        Assert.assertNotNull("查询结果为空", leeshaoyu);
    }
}
