package po;

import org.openqa.selenium.chrome.ChromeDriver;
import utilities.common;

import java.io.IOException;
//import utilities.TestConfig;

public class AppHomePO extends common {

    public AppHomePO() throws IOException {
        super();
    }

    public void navigate_to_URL()
    {

        String strURL = prjProperties.get("baseURL");
        driver.get(strURL);
    }

}
