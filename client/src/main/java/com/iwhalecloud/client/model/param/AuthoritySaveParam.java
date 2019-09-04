package com.iwhalecloud.client.model.param;

import lombok.Data;

/**
 * @author leeshaoyu
 * @description
 * @date 2019/8/26
 */
@Data
public class AuthoritySaveParam {

    private Long id;

    private Long roleId;

    private String name;

    private String status;

}