package com.example.lou.wechat;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Lou on 2018/4/23.
 */
//Serializable序列化接口将内存数据变成可储存的对象
public class Inform implements Serializable {

    private String title;
    private String desc;
    private Date pubTime;
    private int imgId;
    public Inform(){

    }

    public Inform(String title, String desc, Date pubTime, int imgId) {
        this.title = title;
        this.desc = desc;
        this.pubTime = pubTime;
        this.imgId = imgId;
    }




    public void setTitle(String title) {
        this.title = title;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

     public void  setPubTime(Date pubTime) {
        this.pubTime = pubTime;
    }

    public Date getPubTime() {return pubTime;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }



    public int getImgId() {
        return imgId;
    }
    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", pubTime=" + pubTime +
                ", imgId=" + imgId +
                '}';
    }



}
