package po;

import core.TestException;
import core.TestFactory;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.common;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class CustomerPO extends common {


    @FindBy(xpath = "//div//select[@id='userSelect']")
    public WebElement custNameDropDown;

    @FindBy(xpath = "//*[@id='userSelect']/option")
    public List<WebElement> cstNameList;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[1]/div[1]/button")
    private WebElement cstTabLogin;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/form/button")
    private WebElement loginBTN;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]")
    public static WebElement accountNolbl;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/text()[2]")
    public static WebElement balancelbl;

    @FindBy(xpath ="/html/body/div/div/div[2]/div/div[2]/text()[3]")
    public static WebElement currencylbl;

    @FindBy(xpath ="//button[@ng-click='deposit()']")
    public static WebElement depositbtn;

    @FindBy(xpath ="//input[@placeholder='amount']")
    public static WebElement amt;

    @FindBy(xpath ="//button[@type='submit']")
    public static WebElement deposit;


    public CustomerPO() throws IOException {
        super();
        PageFactory.initElements(driver, this);
    }

    public void clickCustLogin() {
        try {
            Thread.sleep(2000);
            webElementClick(cstTabLogin);
        } catch (TestException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void clickOnElement(String elName) throws TestException {
        WebElement el = null;
        try {
            switch (elName) {
                case "user select drop down":
                    el = custNameDropDown;
                    break;
                case "Login":
                    el = loginBTN;
                    break;
                case "Deposit":
                    el = depositbtn;
                    break;
                default:
                    System.out.println("Element not found");
                    Assert.fail();
            }

            webElementClick(el);
        } catch (AssertionError ae) {
            ae.printStackTrace();
            Assert.fail();
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }

    }


    public void custSelect(String custname) throws TestException {
        boolean exist = true;
        for (WebElement el : cstNameList) {
            if (el.getText().contains(custname)) {
                webElementClick(el);
                exist = true;
                break;
            } else {
                exist = false;
            }
        }

        if (!exist) {
            System.out.println("Customer not found");
            Assert.fail();
        }

        webElementClick(loginBTN);

    }

    public static void amount_to_deposit(String amount) throws Exception{
//        int i=Integer.parseInt(amount);
        webElementClick(amt);
        amt.sendKeys(amount);
        webElementClick(deposit);
    }

//    public static void visibility_check(String s) {
//
//        String[] data = s.split(",");
//        for (int i = 0; i < data.length; i++) {
//            switch (data[i]) {
//                case "Account Number":
//                    if (data[i].contentEquals(accountNolbl.getText()))
//                        System.out.println("Account no. field is verified");
//                    break;
//                case "Balance":
//                    if (data[i].contentEquals(balancelbl.getText()))
//                        System.out.println("Balance field is verified");
//                    break;
//                case "Currency":
//                    if (data[i].contentEquals(currencylbl.getText()))
//                        System.out.println("Currency field is verified");
//                    break;
//                default:
//                    System.out.println("Fields not found");
//                    //Assert.fail();
//            }
//        }
//    }



}