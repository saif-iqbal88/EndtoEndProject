package POM;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class AppElements {
        AndroidDriver driver;
public AppElements(AndroidDriver driver){
        this.driver=driver;
        }
public void inputField(String username,String passWord) throws InterruptedException{


        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@text='Continue']")).click();

        Thread.sleep(1000);
        driver.findElement( By.xpath("//*[@text='OK']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Username']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Username']")).sendKeys(username);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Password']")).sendKeys(passWord);
        driver.findElement(By.xpath("//*[@text='Login']")).click();

        /*driver.findElement(By.xpath("//*[@hint='Username']")).click();
        driver.findElement(By.xpath("//*[@hint='Username']")).click();
        driver.findElement(By.xpath("//*[@hint='Username']")).click();
        driver.findElement(By.xpath("//*[@hint='Username']")).click();
        driver.findElement(By.xpath("//*[@hint='Username']")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.LinearLayout' and ./*[@id='action_mode_bar_stub']]")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.LinearLayout' and ./*[@id='action_mode_bar_stub']]")).click();*/

        }


}
