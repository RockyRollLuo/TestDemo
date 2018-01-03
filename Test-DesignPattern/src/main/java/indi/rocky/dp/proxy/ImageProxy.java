package indi.rocky.dp.proxy;

/**
 * Created by luoqi on 2018/1/3.
 */
public class ImageProxy implements Image{

    private ImageReal imageReal;
    private String fileName;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        if (imageReal == null) {
            imageReal=new ImageReal(fileName);
        }
        imageReal.display();
    }
}
