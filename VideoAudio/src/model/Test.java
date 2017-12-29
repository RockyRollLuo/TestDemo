package model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by luoqi3 on 2017/12/28.
 */
public class Test {
    public static void main(String[] args) {
        Date nowTime=new Date();

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println(nowTime.getTime());



    }
}
