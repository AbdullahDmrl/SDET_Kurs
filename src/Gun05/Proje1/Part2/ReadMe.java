package Part2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadMe {

    /*
        1) Bu siteye gidin. -> https://demo.applitools.com/

        2) Username kısmına "ttechno@gmail.com" girin.

        3) Password kısmına "techno123." girin.

        4) "Sign in" buttonunan tıklayınız.

        5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.(Assert kullanın )

        6) URL'in bu olduğunu doğrulayın. -> https://demo.applitools.com/app.html   (Assert kullanın )
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.applitools.com/");

        WebElement userName=driver.findElement(By.id("username"));
        userName.sendKeys("ttechno@gmail.com");


        WebElement passWord=driver.findElement(By.id("password"));
        passWord.sendKeys("techno123.");

        WebElement buton=driver.findElement(By.id("log-in"));
        buton.click();


        WebElement text=driver.findElement(By.id("time"));
        String actText=text.getText();
        Assert.assertEquals("Your nearest branch closes in: 30m 5s",actText);

        String url= driver.getCurrentUrl();
        Assert.assertEquals("https://demo.applitools.com/app.html",url);

        Thread.sleep(3000);
        driver.quit();

    }





}
