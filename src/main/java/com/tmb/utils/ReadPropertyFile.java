package com.tmb.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public final class ReadPropertyFile {
    private ReadPropertyFile() {
    }

    public static String getValue(String key) throws Exception {
        String value = "";
        Properties property = new Properties();
        FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/config/config.properties");
        property.load(file);
        if (value == null) {
            throw new Exception("Property name" + key + "not found . Please check config.prop");
        }
        return value;
    }
}
