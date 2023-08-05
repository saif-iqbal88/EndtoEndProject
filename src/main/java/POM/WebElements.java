package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class WebElements {
    WebDriver driver;

    By BankManagerLogin = By.xpath("//button[@ng-click=\"manager()\"]");

    By clickaddcustomer = By.xpath("//button[@class=\"btn btn-lg tab\"]");

    By FirstName = By.xpath("//input[@placeholder=\"First Name\"]");

    By LastName = By.xpath("//input[@placeholder=\"Last Name\"]");

    By PostCode = By.xpath("//input[@placeholder=\"Post Code\"]");

    By AddCustomerButton = By.xpath("//button[@type=\"submit\"]");

    By openaccount = By.xpath("//button[@ng-click=\"openAccount()\"]");

    By clickcustomername = By.xpath("//select[@name=\"userSelect\"]");

    By clickrightcustomer = By.xpath("//option[@value=\"6\"]");

    By clickoncurrency = By.xpath("//select[@name=\"currency\"]");

    By clickondollar = By.xpath("//option[@value=\"Dollar\"]");

    By clickprocess = By.xpath("//button[@type=\"submit\"]");



 public WebElements(WebDriver driver){
    this.driver=driver;
    this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
   public void bankmanagerlogin (){
       driver.findElement(BankManagerLogin).click();

   }
   public void addcustomer (){

     driver.findElement(clickaddcustomer).click();
   }
   public void customerdata (String Firstname, String Lastname, String Postcode) throws InterruptedException{
       driver.findElement(FirstName).sendKeys(Firstname);
       driver.findElement(LastName).sendKeys(Lastname);
       driver.findElement(PostCode).sendKeys(Postcode);

   }
    public void addcustomerbutton () throws InterruptedException {
     Thread.sleep(3000);
       driver.findElement(AddCustomerButton).click();
        driver.switchTo().alert().dismiss();
    }
    public void opentheaccount () throws InterruptedException {
        Thread.sleep(3000);
     driver.findElement(openaccount).click();
    }
    public void customername () throws InterruptedException {
     Thread.sleep(3000);
        driver.findElement(clickcustomername).click();
    }

    public void rightcustomer () throws InterruptedException {
     Thread.sleep(2000);

     driver.findElement(clickrightcustomer).click();
    }

    public void currency () throws InterruptedException {
     Thread.sleep(2000);
     driver.findElement(clickoncurrency).click();
    }
    public void dollar (){

     driver.findElement(clickondollar).click();
    }
    public void process (){
     driver.findElement(clickprocess).click();
    }
   }

