package util;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
/**
 * Created by luoqi3 on 2017/11/27.
 */
public class DownloadVideo {

    public void downloadVideo(String videourl){
        try{
            URL url = new URL(videourl);
            URLConnection uc = url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(uc.getInputStream()));
            String str= null;
            String xz = "";
            while((str=br.readLine())!=null){
                if(str.indexOf(".swf")!=-1){
                    try{
                        xz = str.substring(str.lastIndexOf("http"),str.indexOf(".swf") + 4);
                    }catch(Exception e){
                    }
                }
            }
            getDondow(xz,System.getProperty("user.dir")+"videos/");
        }catch(Exception e){

        }

    }
    //下载视频方法
    private static void getDondow(String url,String pathName)throws Exception{
        URL ul = new URL(url);
        HttpURLConnection conn = (HttpURLConnection) ul.openConnection();
        BufferedInputStream bi = new BufferedInputStream(conn.getInputStream());
        FileOutputStream bs = new FileOutputStream(pathName);
        System.out.println("文件大约："+(conn.getContentLength()/1024)+"K");
        byte[] by = new byte[1024];
        int len = 0;
        while((len=bi.read(by))!=-1){
            bs.write(by,0,len);
        }
        bs.close();
        bi.close();

    }


}
