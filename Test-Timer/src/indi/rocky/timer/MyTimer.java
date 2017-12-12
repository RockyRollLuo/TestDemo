package indi.rocky.timer;

import java.util.Date;
import java.util.Timer;

/**
 * Created by luoqi on 2017/12/7.
 */
public class MyTimer {

    public static void main(String[] args){
        Timer timer=new Timer();

        Date date=new Date();
        MyTimerTask myTimerTask=new MyTimerTask(date.toString());

        //timer调用mytimerTask任务
        //第一次执行是在当前时间的两秒之后，之后每隔3秒执行一次
        timer.schedule(myTimerTask,2000L,3000L);


    }

}
