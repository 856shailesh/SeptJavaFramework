package com.tmb.constants;

public final class FrameworkConstants {
    //Making class final so that it cannot be extended
    //Making method private so that these are not directly accessible and can only be accesed through getter method
    // Making default constructor so that to restrict the obj creation

    private static final String CHROMEDRIVERPATH = System.getProperty("user.dir")+"/src/test/resources/executables/chromedriver.exe";

    public static String getChromedriverpath(){
        return CHROMEDRIVERPATH;
    }
}
