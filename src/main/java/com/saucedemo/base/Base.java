package com.saucedemo.base;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;


public class Base {
    public static WebDriver driver;
    public static Properties props = new Properties();

    public Base(){
        try {
            File file =new File("src/main/java/com/saucedemo/properties/config.properties");
            FileInputStream fls = new FileInputStream(file);
            props.load(fls);
        }catch (FileNotFoundException e){
            e.getStackTrace();
        }catch(IOException e){
            e.getStackTrace();
        }

    }
@BeforeTest
public static void launchBrowser(){

        if (props.getProperty("browser").equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (props.getProperty("browser").equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }else {
            throw new Error("Browser Not Supported");
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(props.getProperty("url"));
}

@AfterTest
public void tearDown(){
        driver.quit();
}
}
