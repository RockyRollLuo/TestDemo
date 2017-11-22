package com.rocky.util;

import java.util.ArrayList;

/**
 * Created by luoqi3 on 2017/11/15.
 */
public class Test {

    public ArrayList<MainObject> getList() {
        ArrayList<MainObject> list = new ArrayList<>();
        list.add(new MainObject(1, "京东集团A座", 1, "备注1"));
        list.add(new MainObject(2, "京东集团2座", 2, "备注2"));
        list.add(new MainObject(3, "京东集团A座", 3, "备注3"));
        list.add(new MainObject(4, "京东集团A座", 4, "备注4"));
        list.add(new MainObject(5, "京东集团A座", 5, "备注5"));
        return list;
    }


}
