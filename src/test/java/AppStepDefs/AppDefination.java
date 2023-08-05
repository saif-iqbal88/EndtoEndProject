package AppStepDefs;

import Core.AppHelper;
import POM.AppElements;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;

public class AppDefination {

    static AndroidDriver driver;

    AppElements elements;

    @Given("app apk is there")
    public void appApkIsThere() throws MalformedURLException, InterruptedException {
        AppHelper helper = new AppHelper();
        driver=helper.apkLaunch();

    }

    @When("user enters {string}and {string}")
    public void userEntersUsernameAndPassWord(String username, String passWord) throws InterruptedException {
        elements = new AppElements(driver);
        elements.inputField(username,passWord);


    }

    @Then("user will navigate to home screen")
    public void userWillNavigateToHomeScreen() {
        System.out.println("USer will navigate to home screen");
    }
}
