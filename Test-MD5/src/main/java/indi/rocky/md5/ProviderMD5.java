package indi.rocky.md5;

import sun.misc.BASE64Encoder;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by luoqi3 on 2017/12/21.
 */
public class ProviderMD5 {

    /**
     * 加密1
     * @return
     */
    public static String providerMD5Str(String originStr){
        String md5Str="";
        try{
            MessageDigest digest=MessageDigest.getInstance("MD5");

            byte[] result=digest.digest(originStr.getBytes());

            StringBuffer sb=new StringBuffer();
            // 把每一个byte 做一个与运算 0xff;
            for(byte b:result){
                int number=b&0xff;
                String str=Integer.toHexString(number);
                if(str.length()==1){
                    sb.append("0");
                }
                sb.append(str);
            }
            md5Str=sb.toString();

        }catch (Exception e) {
            System.out.println("异常："+e);
            return md5Str;
        }
        return  md5Str;
    }


    /**
     * 解密1
     * @param md5Str
     * @return
     */
    public static String consumerMD5Str(String md5Str){
        String orignStr="";





        return orignStr;
    }

    /**
     * 解密2
     * @param inStr
     * @return
     */
    public static String convertMD5(String inStr){

        char[] a = inStr.toCharArray();
        for (int i = 0; i < a.length; i++){
            a[i] = (char) (a[i] ^ 't');
        }
        String s = new String(a);
        return s;

    }


    /**
     * 加密2
     * @param inStr
     * @return
     */
    public static String string2MD5(String inStr){
        MessageDigest md5 = null;
        try{
            md5 = MessageDigest.getInstance("MD5");
        }catch (Exception e){
            System.out.println(e.toString());
            e.printStackTrace();
            return "";
        }
        char[] charArray = inStr.toCharArray();
        byte[] byteArray = new byte[charArray.length];

        for (int i = 0; i < charArray.length; i++)
            byteArray[i] = (byte) charArray[i];
        byte[] md5Bytes = md5.digest(byteArray);
        StringBuffer hexValue = new StringBuffer();
        for (int i = 0; i < md5Bytes.length; i++){
            int val = ((int) md5Bytes[i]) & 0xff;
            if (val < 16)
                hexValue.append("0");
            hexValue.append(Integer.toHexString(val));
        }
        return hexValue.toString();
    }




    public static void main(String[] args){
        String orignStr="siteId=39&courierId=1931";

        String MD5Str=providerMD5Str(orignStr);

        String getOriginStr=consumerMD5Str(MD5Str);


        System.out.println("--------------方式一-------------------");
        System.out.println("原始待加密字符串："+orignStr);
        System.out.println("MD5加密字符串："+MD5Str);
        System.out.println("解密后MD5后字符串："+getOriginStr);

        System.out.println("--------------方式二-------------------");
        System.out.println("原始待加密字符串："+orignStr);
        System.out.println("MD5加密字符串1："+string2MD5(orignStr));
        System.out.println("MD5加密字符串2："+convertMD5(orignStr));
        System.out.println("解密后MD5后字符串："+convertMD5(convertMD5(orignStr)));

    }

}
