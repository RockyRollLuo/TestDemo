package indi.rocky.timer;

import java.util.TimerTask;

/**
 * Created by luoqi on 2017/12/7.
 */
public class MyTimerTask extends TimerTask{

    private String name;

    /**
     * 含参构造器
     * @param inputName
     */
    public MyTimerTask(String inputName){
        this.name=inputName;
    }


    /**
     * 重写run方法
     */
    @Override
    public void run() {
        System.out.println("The current name is "+name);

    }


    //getter & setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
