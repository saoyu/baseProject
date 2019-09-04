package com.iwhalecloud.client.model.param;

import lombok.Data;

/**
 * @author leeshaoyu
 * @description
 * @date 2019/8/26
 */
@Data
public class RoleDeleteParam {

    /**
     * 角色标识
     */
    private Long id;

    /**
     * 数据状态
     */
    private String status;
}