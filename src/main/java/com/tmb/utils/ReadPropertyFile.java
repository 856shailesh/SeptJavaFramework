package com.tmb.utils;

import com.tmb.constants.FrameworkConstants;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

public final class ReadPropertyFile {
    private ReadPropertyFile() {
    }

    private static Properties property = new Properties();
    private static final Map<String, String> CONFIGMAP = new HashMap<>();

    static {
        try {
            FileInputStream file = new FileInputStream(FrameworkConstants.getConfigFilePath());
            property.load(file);

            /*
            for (Object key : property.keySet()) {
                CONFIGMAP.put(String.valueOf(key), String.valueOf(property.get(key))); //Convert obj into String
            } */

            for (Map.Entry<Object, Object> entry : property.entrySet()) {
                CONFIGMAP.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()).trim());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //property will act as a Hashtabel- little slow but thread safe
    //

    public static String get(String key) throws Exception {
        if (Objects.isNull(key) || Objects.isNull(CONFIGMAP.get(key))) {
            throw new Exception("Property name " + key + " not found . Please check config.prop");
        }
        return CONFIGMAP.get(key);
    }

    public static String getValue(String key) throws Exception {
        if (Objects.isNull(property.getProperty(key)) || Objects.isNull(key)) {
            throw new Exception("Property name " + key + " not found . Please check config.prop");
        }
        return property.getProperty(key);
    }
}
