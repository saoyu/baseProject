package com.iwhalecloud.client.model.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 角色DTO
 * @author leeshaoyu
 * @description
 * @date 2019/8/22
 */
@Data
public class RoleDTO implements Serializable {

    /**
     * 角色标识
     */
    private Long id;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 修改时间
     */
    private Date gmtModified;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 数据状态
     */
    private String status;
}