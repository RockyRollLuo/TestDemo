package com.rocky.util;

/**
 * Created by luoqi3 on 2017/11/15.
 */
public class MainObject {
    private int id;
    private String keyWord;
    private int  roadNo;
    private String remark;

    public MainObject(int id,String keyWord,int roadNo,String remark){
        this.id=id;
        this.keyWord=keyWord;
        this.roadNo=roadNo;
        this.remark=remark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public int getRoadNo() {
        return roadNo;
    }

    public void setRoadNo(int roadNo) {
        this.roadNo = roadNo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
