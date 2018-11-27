package com.lyt.lyt.vo.knet;

public class KnetAllmProductInfoVo {
    private String id;
    private String modifyUser;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser;
    }
    @Override
    public String toString() {
        return "KnetAllmProductInfoVo{" +
                "id='" + id + '\'' +
                ", modifyUser='" + modifyUser + '\'' +
                '}';
    }
}
