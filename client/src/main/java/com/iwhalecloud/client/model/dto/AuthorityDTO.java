package com.iwhalecloud.client.model.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class AuthorityDTO implements Serializable {
    private Long id;

    private Long roleId;

    private String name;

    private Date gmtCreate;

    private Date gmtModified;

    private String status;

    private static final long serialVersionUID = 1L;
}