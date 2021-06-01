package com.iotch.util;

import java.io.File;

public class PathUtil {

    private static String separator = System.getProperty("file.separator");

    public static String getCurrentPath(){
        String path = Thread.currentThread().getContextClassLoader().getResource("").getPath().replace("%20"," ");
        return path;
    }

    /**
     * 或图片存放的基础路径
     * @return
     */
    public static String getImgBasePath(){
        String os = System.getProperty("os.name");
        String basePath = "";
        if(os.toLowerCase().startsWith("win")){
            String currentPath = getCurrentPath();
            int i = currentPath.indexOf(":/");
            String rootPath = currentPath.substring(i - 1,i)+":";
            basePath = rootPath+"/image/";
        }else {
            basePath = "/home/image";
        }
        basePath = basePath.replace("/",separator);
        String mkdirsPath = getMkdirsPath(basePath);
        return mkdirsPath;
    }

    /**
     * 获得创建目录的路径或已有无需创建的目录路径
     * @param path
     * @return
     */
    public static String getMkdirsPath(String path){
        try {
            File file = new File(path);
            if(!file.exists()){
                boolean mkdirs = file.mkdirs();
            }
            return path;//只要返回了该路径,证明路径已经存在
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 获得用户图片路径
     * @param usercode
     * @return
     */
    public static String getUserImagePath(String usercode){
        String imagePath = "/upload/item/user/"+usercode+"/";
        return imagePath.replace("/",separator);
    }

    /**
     * 工具类测试main函数
     * @param args
     */
    public static void main(String[] args) {
        String separator = System.getProperty("file.separator");
        System.out.println("separator:"+separator);
        String currentPath = getCurrentPath();
        System.out.println("currentPath:"+currentPath);
        int i = currentPath.indexOf(":/");
        int j = currentPath.indexOf("webapps");//没有为-1
        System.out.println("webapps:"+j);
        String substring = currentPath.substring(i - 1);
        System.out.println("substring:"+substring);
        System.out.println("substring.separator:"+substring.replace("/",separator));
        String rootPath = currentPath.substring(i - 1,i)+":";
        System.out.println("rootPath:"+rootPath);
        String os = System.getProperty("os.name");
        System.out.println("os:"+os);
        String imgBasePath = getImgBasePath();
        System.out.println("imgBasePath:"+imgBasePath);
        System.out.println("当前线程:"+PathUtil.getCurrentPath());
        System.out.println(PathUtil.getCurrentPath().substring(0,PathUtil.getCurrentPath().indexOf("class")));
    }
}
