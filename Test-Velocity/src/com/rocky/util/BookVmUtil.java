package com.rocky.util;


import com.rocky.po.Book;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;

/**
 * Created by luoqi3 on 2017/11/11.
 */
public class BookVmUtil {

    /***
     * 通过模板路径创建
     * @param templateFile 模板路径
     */
    public void velocityTestOne(String templateFile){
        try{
            VelocityEngine velocityEngine=new VelocityEngine();
            velocityEngine.init();
            VelocityContext context=new VelocityContext();
            context.put("mylist",getBooks());
            Template template=null;

            try{
                template=velocityEngine.getTemplate(templateFile,"UTF-8");
            }catch (ResourceNotFoundException e1){
                System.out.println("VelocityTestUtil error,ResourceNotFoundException:"
                        + templateFile);

            }catch (ParseErrorException e2){
                System.out.println("VelocityTestUtil error,ParseErrorException:"
                        + templateFile + ":" + e2);
            }

            BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));//这里我直接打印了，也可以写到其他文件，或用于页面展示

            if(template!=null){
                template.merge(context,bw);
            }
            bw.flush();
            bw.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void velocityTestWithPropertiesSet(String templateFile,Properties prop) {
        try {
            System.out.println("revoke method : velocityTestWithPropertiesSet");
            //单例实例化  RuntimeSingleton.init();
            //Velocity velocity = new Velocity();
            //velocity.init();
            //Velocity.init();//同上
            //非单例实例化 ri = new RuntimeInstance();，如果同时使用多个Velocity，必须使用这个方法！
            VelocityEngine velocityEngine = new VelocityEngine();
            velocityEngine.init(prop);
            System.out.println("ss--"+velocityEngine.getProperty(Velocity.FILE_RESOURCE_LOADER_PATH));

            VelocityContext context = new VelocityContext();
            context.put("mylist", getBooks());
            Template template = null;//模版
            try {
                //template = velocity.getTemplate(templateFile,"UTF-8");
                //template = Velocity.getTemplate(templateFile,"UTF-8");//单例。注意设置编码，避免中文乱码
                template = velocityEngine.getTemplate(templateFile,"UTF-8");//非单例。注意设置编码，避免中文乱码
            } catch (ResourceNotFoundException e1) {
                System.out.println("VelocityTestUtil error,ResourceNotFoundException:"
                        + templateFile);
            } catch (ParseErrorException e2) {
                System.out.println("VelocityTestUtil error,ParseErrorException:"
                        + templateFile + ":" + e2);
            }
            BufferedWriter writer = writer = new BufferedWriter(
                    new OutputStreamWriter(System.out));//这里我直接打印了，也可以写到其他文件，或用于页面展示

            if (template != null){
                template.merge(context, writer);
            }
            writer.flush();
            writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public ArrayList getBooks(){
        ArrayList list=new ArrayList();

        Book bk1=new Book();
        bk1.setBookid("id1");
        bk1.setBookname("基督山伯爵");
        bk1.setBookprice(23);
        bk1.setPublishDate(new Date());

        Book bk2=new Book();
        bk2.setBookid("id2");
        bk2.setBookname("三个火枪手");
        bk2.setBookprice(35);
        bk2.setPublishDate(new Date());

        list.add(bk1);
        list.add(bk2);

        return list;
    }

    public static void main(String[] args) {
        // bin/org/test/book.vm  (java project)
        // WebContent/WEB-INF/classes/org/test/book.vm  (web project)

        BookVmUtil v1 = new BookVmUtil();
        v1.velocityTestOne("bin/com/rocky/vm/book.vm");//路径默认工程路径

//        BookVmUtil v2 = new BookVmUtil();

//        Properties prop = new Properties();
        //设置输入输出编码类型
//        prop.setProperty(Velocity.INPUT_ENCODING, "UTF-8");
//        prop.setProperty(Velocity.OUTPUT_ENCODING, "UTF-8");
        //指定一个绝对路径作为模版路径
        //  D:/MyProject/my-workSpace/Mytest/bin/org/test
//        prop.setProperty(Velocity.FILE_RESOURCE_LOADER_PATH, "D:/MyProject/my-workSpace/Mytest/bin/org/test");

//      v2.velocityTestOne("bin/org/test/book2.vm"); //当FILE_RESOURCE_LOADER_PATH=.或/
//        v2.velocityTestWithPropertiesSet("book2.vm",prop);

    }

}
