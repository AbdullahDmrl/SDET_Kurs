package Gun05.Proje1.Part3;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadMe {

    /*

        1) Bu siteye gidin. -> https://www.snapdeal.com/

        2) "teddy bear" aratın ve  Search butonuna tıklayın.

        3) Bu yazının göründüğünü doğrulayınız. -> (We've got 918 results for 'teddy bear')
        Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.

        4) Snepdeal logosuna tıklayınız.

        5) URL'in bu olduğunu doğrulayın. (https://www.snapdeal.com/)

     */

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(" https://www.snapdeal.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        WebElement urGirme=driver.findElement(By.id("inputValEnter"));
        urGirme.sendKeys("teddy bear");

        WebElement arama=driver.findElement(By.className("searchTextSpan"));
        arama.click();

        WebElement message=driver.findElement(By.id("searchMessageContainer"));
        String actText=message.getText();
        Assert.assertEquals("We've got 453 results for 'teddy bear'",actText);


        WebElement snapDeal= driver.findElement(By.cssSelector("img[title='Snapdeal']"));
        snapDeal.click();


      // Thread.sleep(2000);
      // driver.navigate().back();

        String url= driver.getCurrentUrl();
        Assert.assertEquals("https://www.snapdeal.com/",url);

        Thread.sleep(3000);
        driver.quit();

    }


}
