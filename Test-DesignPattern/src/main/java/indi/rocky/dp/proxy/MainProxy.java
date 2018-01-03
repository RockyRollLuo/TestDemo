package indi.rocky.dp.proxy;

/**
 * Created by luoqi on 2018/1/3.
 */
public class MainProxy {
    public static void main(String[] args) {
        Image image = new ImageProxy("test.image.jpg");

        //第一次访问，图像将从磁盘加载
        System.out.println("第一次访问，图像将从磁盘加载");
        image.display();

        //之后的访问图像将不再从此磁盘加载
        System.out.println("之后的访问实际类已存在，不需要再次从磁盘加载");
        image.display();
    }
}
