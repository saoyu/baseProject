package com.iwhalecloud.server.dao.dataobject.generator;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 *  用户角色
 * @author leeshoayu
 * @date 2019/9/3
 * @version 1.0
 */
@Data
public class RoleDO implements Serializable {

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

    /**
     * 描述
     */
    private String remark;

    private static final long serialVersionUID = 1L;
}