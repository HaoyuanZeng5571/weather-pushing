package com.pt.vx.pojo;

import com.pt.vx.pojo.BirthDay;

public class User {

    private String Vx;
    private String templateId;
    private String userName;
    private String address;
    private String city;

    public String getVx() {
        return Vx;
    }

    public void setVx(String vx) {
        Vx = vx;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
