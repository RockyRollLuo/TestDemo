package indi.rocky.dp.proxy;

/**
 * Created by luoqi on 2018/1/3.
 */
public class ImageReal implements Image {

    private String fileName;

    public ImageReal(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    public void display() {
        System.out.println("Displaying "+fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading "+fileName);

    }


}
