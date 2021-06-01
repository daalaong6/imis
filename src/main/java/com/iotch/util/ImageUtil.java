package com.iotch.util;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class ImageUtil {
    private static String basePath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
    private static final SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
    private static final Random r = new Random();
    private static Logger logger = LoggerFactory.getLogger(ImageUtil.class);

    /**
     *
     * @param thumbnail
     * @param targetRelativePath :要输出图片文件的相对路径,如"/upload/items/user",经过以下函数将根据相对路径targetRelativePath生成绝对路径,如"H:/image/upload/items/user",存储文件的文件夹
     * @param fileName :当文件名为空时使用随机文件名
     * @return
     */
    public static String generateThumbnail(File thumbnail, String targetRelativePath,String fileName){
        String realFileName = getRandomFileName();
        String extension = getFileExtension(thumbnail);
        String parentPath = makeDirParentPath(targetRelativePath);
        if(fileName!=null){
            realFileName = fileName;
        }
        String fullAbsolutePath = parentPath + realFileName + extension;
        logger.debug("current absolutePath is:"+fullAbsolutePath);
        try {
            Thumbnails.of(thumbnail).
                    size(200,200).
                    watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File(basePath+"/watermark.jpg")),0.25f).
                    outputQuality(0.8f).toFile(fullAbsolutePath);
        } catch (IOException e) {
            logger.error(e.toString());
            e.printStackTrace();
        }
        return fullAbsolutePath;
    }

    private static String getFileExtension(File cFile) {
        String originalFileName =  cFile.getName();
        return originalFileName.substring(originalFileName.lastIndexOf("."));
    }

    /**
     * 创建目标所涉及到的目录
     * @param targetRelativePath
     */
    private static String makeDirParentPath(String targetRelativePath) {
        String realFileParentPath = PathUtil.getImgBasePath()+targetRelativePath;
        String parentPath = PathUtil.getMkdirsPath(realFileParentPath);
        return parentPath;
    }

    /**
     *
     * @return
     */
    private static String getRandomFileName() {
        int rannum = r.nextInt(89999)+10000;
        String nowTimeStr = sDateFormat.format(new Date());
        return nowTimeStr+rannum;
    }

    public static void main(String[] args) throws IOException {
        String basePath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        String outputFile = PathUtil.getImgBasePath() + PathUtil.getUserImagePath("test01");
        String mkdirsPath = PathUtil.getMkdirsPath(outputFile);
        Thumbnails.of(new File(basePath+"/xiaohuangren.jpg")).size(200,200).watermark(Positions.BOTTOM_RIGHT,
                ImageIO.read(new File(basePath+"/watermark.jpg")),0.25f).outputQuality(0.8f).
                toFile(mkdirsPath+"00001.jpg");
    }
}
