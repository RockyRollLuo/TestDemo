package com.rocky.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by luoqi3 on 2017/12/22.
 */
public class test {

    public static void main(String[] args) throws Exception{
        Date currentDate=new Date();

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date createDate=sdf.parse("2017-12-22 12:00:00");

        System.out.println("创建日期:"+sdf.format(createDate));
        System.out.println("当前日期:"+sdf.format(currentDate));

        System.out.println("相差"+(new Date().getTime()-createDate.getTime())/(3600000.0));
        System.out.println(1000*60*60);




    }

}
