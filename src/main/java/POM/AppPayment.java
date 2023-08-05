package POM;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class AppPayment {
     AndroidDriver driver;

    public AppPayment(AndroidDriver driver) {
        this.driver = driver;
    }

    public void makepayment () throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@text='Make Payment']")).click();
    }

    public void inputField(String phonenumber, String Customer, String Amount, String Country) throws InterruptedException {


        //Thread.sleep(4000);
        //driver.findElement(By.xpath("//*[@hint='Phone']")).click();

        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@text='Phone']")).sendKeys(phonenumber);
       // Thread.sleep(1000);
        //driver.findElement(By.xpath("//*[@text='Name']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Name']")).sendKeys(Customer);
        //Thread.sleep(1000);
        //driver.findElement(By.xpath("//*[@text='Amount']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Amount']")).sendKeys(Amount);
        //Thread.sleep(1000);
        //driver.findElement(By.xpath("//*[@text='Country']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Country']")).sendKeys(Country);

    }
    public void sendpayment(){
        driver.findElement(By.xpath("//*[@text='Send Payment']")).click();
    }
}