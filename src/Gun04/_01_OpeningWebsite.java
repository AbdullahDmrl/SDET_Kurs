package Gun04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_OpeningWebsite {
    public static void main(String[] args) throws InterruptedException {

        // hangi browserı kullanacağımı ve tarayıcının path ini verdim.
    System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

      // çalıştıracağımız driverı kontrol edecek değişkeni tanımladım: driver
     WebDriver driver=new ChromeDriver();
      // siteyi açtım
     driver.get("http://www.practiceselenium.com/");


     Thread.sleep(3000);
     driver.quit();
    }
 //   driver.findElement(By.);     Eleman bulunamazsa hata üretir.
    // driver.findElement(By.id("id"));
    // driver.findElement(By.name("name"));
    // driver.findElement(By.className("class name buraya yazılır"));
    // driver.findElement(By.linkText("linkin tam text i buraya yazılır"));
    // driver.findElement(By.partialLinkText("linkin text inin bir parçası"));
    // driver.findElement(By.tagName("tagAdı"));
    // driver.findElement(By.cssSelector("tagAdı[özellikAdi=‘değer’]"));
    // driver.findElement(By.xpath("//tagAdı[@özellikAdi=‘değer’]"));

}
