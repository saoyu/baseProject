package com.iwhalecloud.server.common.enums;

/**
 * 性别枚举类
 * @author leeshaoyu
 * @description
 * @date 2019/8/27
 */
public enum  GenderEnum {

    MALE("男", "male"),
    FAMALE("女", "famale"),
    UNKNOWN("未知", "unknown");

    //成员变量
    private String name;
    private String state;

    //构造方法
    GenderEnum(String name, String state) {
        this.name = name;
        this.state = state;
    }

    // 普通方法
    public static String getNameByState(String state) {
        for (GenderEnum o : GenderEnum.values()) {
            if (o.getState().equals(state)) {
                return o.name;
            }
        }
        return null;
    }

    // get set 方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
