package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.TestCapture;

import java.util.concurrent.TimeUnit;

public class TestFactory {
//    public static boolean initialised = true;
    public TestFactory() {
//        getDriver();
    }

    public static WebDriver driver;

    public static WebDriver getDriver(){

        String path=System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", path +"//src//main//resources//drivers//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        return driver;
    }



}
