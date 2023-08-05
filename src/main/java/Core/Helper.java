package Core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class Helper {
    public WebDriver driver;
    public WebDriver chromeLaunch(){

    ChromeOptions options = new ChromeOptions();
    Map<String, Object> prefs = new HashMap<String, Object>();
    Map<String, Object> profile = new HashMap<String, Object>();
    Map<String, Integer> contentSettings = new HashMap<String, Integer>();
    //0 - Default, 1 - Allow, 2 - Block
        contentSettings.put("notifications", 2);
        contentSettings.put("geolocation", 2);
        profile.put("managed_default_content_settings", contentSettings);
        prefs.put("profile", profile);
        options.setExperimentalOption("prefs", prefs);
        options.addArguments("--remote-allow-origins=*");
//
//        options.addArguments("--no-sandbox");
//        options.addArguments("--disable-dev-shm-usage");
//        options.addArguments("--headless");
        WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver(options);

        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
    // driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
    //driver.get("https://chaldal.com/");

        driver.manage().window().maximize();
        return driver;

}
}
