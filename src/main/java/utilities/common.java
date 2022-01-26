package utilities;

import core.TestException;
import core.TestFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.TestConfig;

import java.io.IOException;
import java.util.HashMap;

public class common {

//    public static TestConfig tstCnfig;
    public static WebDriver driver;
    public static HashMap<String,String> prjProperties;
    public static boolean initialised = true;

    public common() throws IOException {
       if(initialised == true){
           driver = TestFactory.getDriver();
//         tstCnfig = new TestConfig();
           prjProperties = TestConfig.getConfigDetails();
           initialised = false;
       }
    }

    public static void getURL(String browser){


    }



    public static void webElementClick(WebElement element) throws TestException {
        if (!element.isEnabled()) {
            throw new TestException(element.getText()+ " is not clicked as it is disabled");
        }
        try {
            element.click();
        } catch (Exception e) {
            TestCapture.captureScreenshot(driver, element.getText());
            e.printStackTrace();
        }
    }
}

