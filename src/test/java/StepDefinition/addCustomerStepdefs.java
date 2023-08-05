package StepDefinition;

import Core.Helper;
import POM.WebElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class addCustomerStepdefs {

    public static WebDriver driver;
    WebElements elements;

    @Given("XYZ Bank login Page")

    public void xyzBankLoginPage() throws InterruptedException{
        Helper helper = new Helper();
        driver = helper.chromeLaunch();
    }





    @When("Click on Bank Manager Login")
    public void clickOnBankManagerLogin() throws InterruptedException {
        elements=new WebElements(driver);
        elements.bankmanagerlogin();
        
    }

    @And("Click Add Customer")
    public void clickAddCustomer() throws InterruptedException {
        elements.addcustomer();

    }

    @And("sends customer {string} and {string} and {string}")
    public void sendsCustomerFirstNameAndLastNameAndPostCode(String FirstName, String LastName, String PostCode) throws InterruptedException {
       elements.customerdata(FirstName, LastName, PostCode);


    }

    @And("click on Add Customer button")
    public void clickOnAddCustomerButton() throws InterruptedException {
        elements.addcustomerbutton();

    }

    @Then("go to next page")
    public void goToNextPage() {
    }


    @Given("XYZ Bank Open Account Page")
    public void xyzBankOpenAccountPage() throws InterruptedException {
        System.out.println("XYZ Bank Open Account Page");
        
    }

    @When("Click on Open Account")
    public void clickOnOpenAccount() throws InterruptedException {
        elements=new WebElements(driver);
        elements.opentheaccount();

    }

    @And("Click on Customer Name")
    public void clickOnCustomerName() throws InterruptedException {
     elements.customername();
    }

    @And("Click on desired Customer")
    public void clickOnDesiredCustomer() throws InterruptedException {
        elements.rightcustomer();

    }

    @And("Click on Currency")
    public void clickOnCurrency() throws InterruptedException {
        elements.currency();

    }

    @And("Click on desired currency")
    public void clickOnDesiredCurrency() {
        elements.dollar();

    }

    @And("Click on Process")
    public void clickOnProcess() {
        elements.process();
    }

    @Then("Next Page")
    public void nextPage() {
    }
}
