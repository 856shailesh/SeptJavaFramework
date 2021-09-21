package com.tmb.constants;

public final class FrameworkConstants {
    //Making class final so that it cannot be extended
    //Making method private so that these are not directly accessible and can only be accesed through getter method
    // Making default constructor so that to restrict the obj creation

    private static final String RESOURCESPATH = System.getProperty("user.dir") + "/src/test/resources";
    private static final String CHROMEDRIVERPATH = RESOURCESPATH + "/executables/chromedriver.exe";
    private static final String CONFIGFILEPATH = RESOURCESPATH + "/config/config.properties";
    private static final int EXPLICITWAIT = 10;

    public static int getExplicitwait(){
        return EXPLICITWAIT;
    }

    public static String getConfigFilepath() {
        return CONFIGFILEPATH;
    }

    public static String getChromeDriverpath() {
        return CHROMEDRIVERPATH;
    }


}
