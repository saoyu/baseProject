package com.iwhalecloud.client.model.param;

import lombok.Data;

/**
 * @author leeshaoyu
 * @description
 * @date 2019/8/26
 */
@Data
public class RoleParam {


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