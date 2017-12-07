package com.imooc.common;

import com.imooc.object.User;

import java.beans.PropertyEditorSupport;

/**
 * 属性编辑器
 * 继承PropertyEditorSupport类
 *
 * 以String类型传递参数
 */
public class MyPropertyEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        User user = new User();
        String[] textArray = text.split(",");
        user.setName(textArray[0]);
        user.setAge(Integer.parseInt(textArray[1]));
        this.setValue(user);
    }

    public static void main(String[] args) {
        MyPropertyEditor editor = new MyPropertyEditor();
        editor.setAsText("tom,22");
        System.out.println(editor.getValue());
    }
}
