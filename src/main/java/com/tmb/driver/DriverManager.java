package com.tmb.driver;

import org.openqa.selenium.WebDriver;

//final : no one can extend this class and use getDriver direcly
//private const : stop obj creation
//Default value of Thread local : null
public final class DriverManager {
    private DriverManager() {
    }

    private static ThreadLocal<WebDriver> dr = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return dr.get();
    }

    public static void setDriver(WebDriver driverref) {
        dr.set(driverref);
    }

    public static void unload() {
        dr.remove();
    }
}
