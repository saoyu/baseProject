package com.iwhalecloud.client.model.query;

import lombok.Data;

/**
 * @author leeshaoyu
 * @description
 * @date 2019/8/26
 */
@Data
public class AuthorityQuery {

    private Long id;

    private Long roleId;

    private String name;

    private String status;

}