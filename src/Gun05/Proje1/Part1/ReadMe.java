package Gun05.Proje1.Part1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert.*;
public class ReadMe {

    /*

        1) Bu siteye gidin. ->  http://demoqa.com/text-box

        2) Full Name kısmına "Automation" girin.   classname

        3) Email kısmına "Testing" girin.

        4) Current Address kısmına "Testing Current Address" girin.

        5) Permanent Address kısmına "Testing Permanent Address" girin.

        6) Submit butonuna tıklayınız.

        7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.

        8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.

     */
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demoqa.com/text-box");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        WebElement fullName= driver.findElement(By.id("userName"));
        fullName.sendKeys("Automation");

        WebElement email= driver.findElement(By.id("userEmail"));
        email.sendKeys("Testing@gmail.com");

         WebElement curAdress= driver.findElement(By.id("currentAddress"));
         curAdress.sendKeys("Testing Current Address");

        WebElement parAdress= driver.findElement(By.id("permanentAddress"));
        parAdress.sendKeys("Testing Permanent Address");

        WebElement submit=driver.findElement(By.id("submit"));
        submit.click();

       WebElement isim=driver.findElement(By.id("name"));
       String text= isim.getText();
        Assert.assertEquals("Name:Automation",text);

        WebElement mail=driver.findElement(By.id("email"));
        String text1= mail.getText();
        Assert.assertEquals("Email:Testing@gmail.com",text1);

        Thread.sleep(3000);
        driver.quit();

    }


}
