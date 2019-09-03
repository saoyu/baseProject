package com.iwhalecloud.client.model.param;

import lombok.Data;

import java.util.Date;

/**
 * @author leeshaoyu
 * @description
 * @date 2019/8/26
 */
@Data
public class UserParam {

    /**
     * 用户标识
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 头像
     */
    private String icon;

    /**
     * 性别
     */
    private String gender;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 省份
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 区
     */
    private String county;

    /**
     * 地址
     */
    private String address;

    /**
     * QQ
     */
    private String qq;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 邮箱
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

    /**
     * 角色id
     */
    private Long roleId;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 修改时间
     */
    private Date gmtModified;

}