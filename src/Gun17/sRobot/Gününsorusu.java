package Gun17.sRobot;

import Gun00.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

/*
Günün Sorusu : driver.get("https://www.youtube.com/%22);
burada bir video aratınız, ilgili 80 tane kadar videonun ekranda gözükmesini sağlatınız.
 */

public class Gününsorusu extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.youtube.com");
        WebElement agree= driver.findElement(By.xpath("//span[text()='I agree']"));
        agree.click();
        Bekle(3);
        WebElement youTube= driver.findElement(By.xpath("//input[@id='search']"));
        youTube.sendKeys("breakfast at tiffany's");
        Bekle(3);
        WebElement youTubeClick= driver.findElement(By.id("search-icon-legacy"));
        youTubeClick.click();

        JavascriptExecutor js=(JavascriptExecutor) driver;
        Bekle(1);
        js.executeScript("window.scrollBy(0,5000)");
        Bekle(1);
        js.executeScript("window.scrollBy(0,5000)");
        Bekle(1);
        js.executeScript("window.scrollBy(0,5000)");

        List<WebElement> videOs=driver.findElements(By.id("inline-title-icon"));
        js.executeScript("arguments[0].scrollIntoView()",videOs.get(80));

        System.out.println(videOs.get(80).getText());



        //  BekleVeKapat();
    }
}
