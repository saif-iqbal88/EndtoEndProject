package AppStepDefs;

import Core.AppHelper;
import POM.AppElements;
import POM.AppPayment;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;

import static AppStepDefs.AppDefination.driver;

public class PaymentMethod {

     //AndroidDriver driver;

    AppPayment elements;
    @Given("The app apk is there")
    public void theAppApkIsThere() {
      // AppHelper helper = new AppHelper();
       //driver=helper.apkLaunch();

    }
    @When("User Click on make payment button")
    public void userClickOnMakePaymentButton() throws InterruptedException {
        elements = new AppPayment(driver);
        elements.makepayment();

    }

    @When("user enters {string}and {string} and {string} and {string}")
    public void userEntersPhonenumberAndCustomerAndAmountAndCountry(String phonenumber, String Customer , String Amount, String Country) throws InterruptedException {

        elements.inputField(phonenumber, Customer, Amount, Country);

    }
    @And("user clicks on send payment")
    public void userClicksOnSendPayment() {
        elements.sendpayment();
    }

    @Then("The user will navigate to home screen")
    public void theUserWillNavigateToHomeScreen() {
    }



}
