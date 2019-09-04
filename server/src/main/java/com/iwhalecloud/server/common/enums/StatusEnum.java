package com.iwhalecloud.server.common.enums;

/**
 * 状态枚举类
 * @author leeshaoyu
 * @description
 * @date 2019/8/27
 */
public enum StatusEnum {
    DISABLE("无效", "X"),
    ENABLE("有效", "A");

    private String name;
    private String state;

    StatusEnum(String name, String state) {
        this.name = name;
        this.state = state;
    }

    // 普通方法
    public static String getNameByState(String state) {
        for (StatusEnum statusEnum : StatusEnum.values()) {
            if (statusEnum.getState().equals(state)) {
                return statusEnum.name;
            }
        }
        return null;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
