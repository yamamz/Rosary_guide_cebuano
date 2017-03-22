package com.yamamz.santosrosaryo.model;

/**
 * Created by AMRI on 2/7/2017.
 */

public class Mystery {

    private String day;
    private String mystery;
    private Integer image;

    public Mystery(String day, String mystery, Integer image) {
        this.day = day;
        this.mystery = mystery;
        this.image = image;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMystery() {
        return mystery;
    }

    public void setMystery(String mystery) {
        this.mystery = mystery;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }
}
