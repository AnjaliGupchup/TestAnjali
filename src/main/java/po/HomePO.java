package po;

import core.TestFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.common;

import java.io.IOException;

public class HomePO extends common {

    @FindBy(xpath = "//*[contains(text(),'Customer Login']")
    private WebElement cstLogin;

    @FindBy(xpath="//*[contains(text(),'Manager Login']")
    private WebElement bnkmngrLogin ;


    public HomePO() throws IOException {
        super();
        PageFactory.initElements(driver, this);
    }


}
