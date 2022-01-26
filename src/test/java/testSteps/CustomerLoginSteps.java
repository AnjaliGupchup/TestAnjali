package testSteps;

import core.TestException;
import io.cucumber.java.en.When;
import po.CustomerPO;

import java.io.IOException;

public class CustomerLoginSteps extends BaseSteps {
    public CustomerLoginSteps() throws IOException {
    }

    @When("^Customer login tab is clicked$")
    public void navigate_to_cst_login_page() {
        cppo.clickCustLogin();
    }

    @When("{string} customer is able to login")
    public void customerIsClicked(String custname) throws TestException {
        cppo.clickOnElement("user select drop down");
        cppo.custSelect(custname);
        cppo.clickOnElement("Login");
        cppo.clickOnElement("Deposit");


    }

}