package Gun06;

import Gun00.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Navigating extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.navigate().to("http://www.practiceselenium.com");

        WebElement linkimiz= driver.findElement(By.linkText("Check Out"));
        linkimiz.click();

        Bekle(2);
        driver.navigate().back();

        Bekle(2);
        driver.navigate().forward();

        BekleVeKapat();
    }
    // driver.navigate.to("url") ve driver.get("url")

 //  driver.navigate.to :
 //  geçmişi tutabiliyor, back ve next yapabiliyoruz.
 //  sayfanın tümünün yüklenmesini beklemez.
 //  driver.navigate.back;
 //  driver.navigate.forward;

 //   driver.get :
 //   geçmişi tutmaz.
 //   Sayfanın tümünün yüklenmesini bekler.

}
