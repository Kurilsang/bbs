package com.easyjava.test.entity.enums;


public enum UserSexEnum {
    WOMAN(0,"女"),
    MAN(1,"男"),
    SECREACY(2,"保密");


    private Integer type;
    private String desc;

    UserSexEnum(Integer type, String desc) {
        this.type = type;
        this.desc = desc;
    }
    public static UserSexEnum getUserStatusEnum(Integer type) {
        for(UserSexEnum item : UserSexEnum.values()) {
            if(item.getType().equals(type)) {
                return item;
            }
        }
        return null;
    }
    public Integer getType() {
        return type;
    }
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
