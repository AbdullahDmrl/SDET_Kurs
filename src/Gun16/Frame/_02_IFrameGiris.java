package Gun16.Frame;

import Gun00.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_IFrameGiris extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://chercher.tech/practice/frames");
        // bunlardan hizli olani index ve element olarak bulma
     //   driver.switchTo().frame(0);  // index e göre bulma
     //   driver.switchTo().frame("frame1"); // id veya name e göre bulma
        WebElement iFrame= driver.findElement(By.id("frame1"));
        driver.switchTo().frame(iFrame);  // element olarak bulma

        WebElement inputTopic= driver.findElement(By.cssSelector("input[type='text']"));
        inputTopic.sendKeys("Deutschland");

        BekleVeKapat();
    }
}
