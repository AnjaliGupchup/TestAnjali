package testSteps;

import core.TestException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class CustomerHomeSteps extends BaseSteps{

    public CustomerHomeSteps() throws IOException {
    }

//    @And("Logged in customer should be able to see {string}")
//    public void verification_of_fields(String fields) {
//        cppo.visibility_check(fields);
//    }


    @When("{string} customer clicks on deposit button")
    public void cstmr_clicks_depositbtn(String custname) throws TestException {
        cppo.clickOnElement("Deposit");
    }


    @And("customer enters {string} to be deposited")
    public void amountToBeDeposited(String amount) throws Exception{
        cppo.amount_to_deposit(amount);
    }
}
