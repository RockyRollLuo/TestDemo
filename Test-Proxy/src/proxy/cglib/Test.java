package proxy.cglib;

/**
 * Created by luoqi3 on 2017/12/4.
 */
public class Test {
    public static void main(String[] args){
        BookFacedCglib cglib=new BookFacedCglib();
        BookFaceImpl bookCglib=(BookFaceImpl)cglib.getInstance(new BookFaceImpl());
        bookCglib.addBook();
    }
}
