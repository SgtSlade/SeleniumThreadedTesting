package com.sgtslade;

import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public class TestRunner{

    private final Map<String,WebDriver> drivers = new HashMap<>();

    public Map<String,WebDriver> getDrivers(){
        return drivers;
    }

    public void runTest(String driverName, DriverTest test){
        Thread thread = new Thread(() -> test.test(drivers.get(driverName)));
        thread.start();
    }

}
