package com.iwhalecloud.client.model.query;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author leeshaoyu
 * @description
 * @date 2019/8/26
 */
@Data
public class UserQuery implements Serializable {

    /**
     *  用户标识
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 性别
     */
    private String gender;

    /**
     *  邮箱
     */
    private String email;

    /**
     * 身份证号
     */
    private String idCardNumber;

    /**
     * 注册时间
     */
    private Date registeDateTime;

    /**
     * 状态
     */
    private String status;
}