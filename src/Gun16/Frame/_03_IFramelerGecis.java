package Gun16.Frame;

import Gun00.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_IFramelerGecis extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://chercher.tech/practice/frames");

        WebElement iFrame1= driver.findElement(By.id("frame1"));
        driver.switchTo().frame(iFrame1);
        WebElement inputTopic= driver.findElement(By.cssSelector("input[type='text']"));
        inputTopic.sendKeys("Deutschland");

        // aynı sıradaki diğer IFRAME geçiş için mutlaka , ana bölüme geri dönülmeli.
        driver.switchTo().defaultContent();// Ana sayfaya geri getiriyorur gittiğim framaden(sayfadan)
        //driver.switchTo().parentFrame(); // bir geri sayfaya git demektir.yukarıdaki kodla aynı işi görüyor.


        WebElement iframe2= driver.findElement(By.id("frame2"));
        driver.switchTo().frame(iframe2);
        Select aniMals=new Select(driver.findElement(By.id("animals")));
        aniMals.selectByIndex(2);

        BekleVeKapat();


        // Switch sadece Alert, Window ve Iframe lere yapilir

    }
}
