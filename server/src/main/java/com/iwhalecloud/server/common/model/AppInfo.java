//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.ztesoft.zsmart.nros.base.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *  
 * @author leeshoayu
 * @date 2019/8/22
 * @version 1.0
 */
@Component
public class AppInfo {
    @Value("${biztier.appid:999}")
    private String appId;

    public AppInfo() {
    }

    public String getAppId() {
        return this.appId;
    }
}
