package Gun14.Alert;

/*
    JavaScript has three kind of popup boxes: Alert box, Confirm box, and Prompt box.

      Interview sorusu
      - Alertleri nasıl kullanırsın ?

      driver.switch().alert() bunula kullanırım.

      komutları;
      accept -> OK, TAMAM butonuna basmamızı sağlıyor.
      dismiss -> CANCEL, HAYIR yani olumsuz butonuna basmamızı sağlıyor.
      gettext -> alertin mesajını alıyoruz.
      SendKeys -> prompt(Alertin giriş kutusu olan hali) , yazı gönderiyoruz.
 */

import Gun00.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_IntroAlert extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://www.seleniumeasy.com/test/javascript-alert-box-demo.html");

       WebElement alerButton= driver.findElement(By.cssSelector("button[onclick='myAlertFunction()']"));

       // WebElement alerButton= driver.findElement(By.xpath("//button[text()='Click me!']"));
        alerButton.click();
        Bekle(1);

        String expectedText="I am an alert box!";
        Assert.assertEquals(expectedText, driver.switchTo().alert().getText());

       driver.switchTo().alert().accept();


       BekleVeKapat();
    }
}
