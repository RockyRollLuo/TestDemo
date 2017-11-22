package com.rocky.util;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by luoqi3 on 2017/11/11.
 */
public class HelloVelocity {
    public static void main(String[] args){
        //初始化模板引擎
        VelocityEngine ve=new VelocityEngine();
        ve.setProperty(RuntimeConstants.RESOURCE_LOADER,"classpath");
        ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
        ve.init();

        //获取模板文件，先写好hellovelocity.vm文件
        Template t=ve.getTemplate("hellovelocity.vm");

        //这是变量
        VelocityContext ctx=new VelocityContext();
        ctx.put("name","myVelocityStr");

        List list=new ArrayList();
        list.add("listitem1");
        list.add("listitem2");
        list.add("listitem3");
        ctx.put("list",list);

        //输出
        StringWriter sw=new StringWriter();
        t.merge(ctx,sw);
        System.out.println(sw.toString());

    }
}
