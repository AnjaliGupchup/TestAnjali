package testSteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import po.AppHomePO;
import po.CustomerPO;
import utilities.TestConfig;

import java.io.IOException;

public class BaseSteps {

    AppHomePO aphm = new AppHomePO();
    CustomerPO cppo = new CustomerPO();

    public BaseSteps() throws IOException {
    }
}
