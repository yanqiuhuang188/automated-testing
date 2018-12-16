package com.nimble.testing.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @Auther: YanQiu
 * @Date: 2018/12/09
 * @Description:
 */
public class PropertiesUtil {
    public static Properties getProperties(String filePath){
        FileInputStream fis;
        Properties properties = new Properties();

        try {
            fis= new FileInputStream(filePath);
            properties.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
}
