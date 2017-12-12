package indi.rocky.groovy;


/**
 * Created by luoqi3 on 2017/12/5.
 */

public class App {
    public static void main(String[] args){
        String name="Rocky";
        String age="18";
        String birthday="2000-09-18";

        Person rocky=new Person(name,age,birthday);
        System.out.print(rocky.toString());

    }
}
