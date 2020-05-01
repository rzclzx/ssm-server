package com.ssm.util;

public class PathUtil {
  
  private static String separator = System.getProperty("file.separator");
  
  public static String getImgBasePath() {
    String os = System.getProperty("os.name");
    
    String basePath = "";
    
    if(os.toLowerCase().startsWith("win")) {
      basePath = "D:/project/dev/image/";
    }else {
      basePath = "/Users/zhangfei/Pictures/";
    }
    basePath = basePath.replace("/", separator);
    return basePath;
  }
  
  public static String getShopImagePath(long shopId) {
    String imagePath = "shop/" + shopId + "/";
    return imagePath.replace("/", separator);
  }
}
