package com.sgtslade;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\serge\\Desktop\\AvailabilityBot\\drivers\\chromeDriver\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","C:\\Users\\serge\\Desktop\\AvailabilityBot\\drivers\\firefoxDriver\\geckodriver.exe");

        ChromeDriver cd = new ChromeDriver();
        FirefoxDriver fd = new FirefoxDriver();

        TestRunner testRunner = new TestRunner();

        testRunner.getDrivers().put("chrome",cd);
        testRunner.getDrivers().put("firefox",fd);

        DriverTest exampleTest = driver -> {
            driver.get("https://google.com");
            driver.get("https://facebook.com");
            driver.get("https://youtube.com");
        };

        testRunner.runTest("chrome", exampleTest);
        testRunner.runTest("firefox", exampleTest);

    }
}
