package Gun17.Scroll;

import Gun00.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

/*
Günün Sorusu : driver.get("https://www.youtube.com/%22);
burada bir video aratınız, ilgili 80 tane kadar videonun ekranda gözükmesini sağlatınız.


 */
public class sGununSorus extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.youtube.com");
        JavascriptExecutor js=(JavascriptExecutor)driver;

        WebElement aggReeBtn= driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[6]"));
        aggReeBtn.click();
        WebElement youTube= driver.findElement(By.xpath("//input[@id='search']"));
        youTube.sendKeys("Funny cat videos");
        WebElement youTubeClick= driver.findElement(By.id("search-icon-legacy"));
        youTubeClick.click();

        List<WebElement> videOs=driver.findElements(By.className("style-scope ytd-item-section-renderer"));
        js.executeScript("window.scrollBy(0,6000)");
        Bekle(1);
        js.executeScript("window.scrollBy(0,6000)");
        Bekle(1);
        js.executeScript("window.scrollBy(0,6000)");
        Bekle(1);
        js.executeScript("window.scrollBy(0,6000)");

        BekleVeKapat();


    }
}
