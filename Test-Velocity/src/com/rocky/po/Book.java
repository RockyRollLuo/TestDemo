package com.rocky.po;

import java.util.Date;

/**
 * Created by luoqi3 on 2017/11/11.
 */
public class Book {
    private String bookid;//id
    private String bookname;//书名
    private Date publishDate;//出版日期
    private int bookprice;//价格

    public String getBookid() {
        return bookid;
    }
    public String getBookname() {
        return bookname;
    }
    public Date getPublishDate() {
        return publishDate;
    }
    public int getBookprice() {
        return bookprice;
    }
    public void setBookid(String bookid) {
        this.bookid = bookid;
    }
    public void setBookname(String bookname) {
        this.bookname = bookname;
    }
    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }
    public void setBookprice(int bookprice) {
        this.bookprice = bookprice;
    }


}
