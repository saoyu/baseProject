package com.iwhalecloud.client.model.query;

import lombok.Data;

import java.io.Serializable;

/**
 * @author leeshaoyu
 * @description
 * @date 2019/8/26
 */
@Data
public class RoleQuery implements Serializable {

    /**
     * 角色标识
     */
    private Long id;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 数据状态
     */
    private String status;
}