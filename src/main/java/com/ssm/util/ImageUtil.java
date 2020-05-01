package com.ssm.util;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import com.ssm.util.PathUtil;

import javax.imageio.ImageIO;
import javax.xml.bind.DatatypeConverter;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;

public class ImageUtil {
  
  private static final SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
  
  private static final Random r = new Random();
  
  // 接收图片流urldata和路径  添加水印输出到指定路径
  public static String generateThumbnail(String imgData, String targetAddr) throws IOException {
    byte[] imagedata = DatatypeConverter.parseBase64Binary(imgData.substring(imgData.indexOf(",") + 1));
    BufferedImage bufferedImage = ImageIO.read(new ByteArrayInputStream(imagedata));
    BufferedImage thumbnail = Thumbnails.of(bufferedImage).size(200, 200)
      .watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File("/Users/zhangfei/Pictures/shui.png")), 0.25f)
      .outputQuality(0.8f).asBufferedImage();
    makeDirPath(targetAddr);
    String readFileName = getRandomFileName();
    String extension = getExName(imgData);
    String path = PathUtil.getImgBasePath() + targetAddr + readFileName + "." + extension;
    ImageIO.write(thumbnail, getExName(imgData), new File(path));
    return path;
  }
  
  // 获取图片后缀
  private static String getExName (String imgData) {
    String str = imgData.substring(imgData.indexOf("image/") + 1, imgData.indexOf("image/") + 2);
    return str == "j" ? "jpg" : "png";
  }

  private static void makeDirPath(String targetAddr) {
    String readFileParentPath = PathUtil.getImgBasePath() + targetAddr;
    File dirPath = new File(readFileParentPath);
    if(!dirPath.exists()) {
      dirPath.mkdirs();
    }
  }


  public static String getRandomFileName() {
    // 获取随机图片名称
    int rNum = r.nextInt(89999) + 10000;
    String nowTimeStr = sDateFormat.format(new Date());
    return nowTimeStr + rNum;
  }
}
