package Gun16;

import Gun00.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/*
Senaryo
1-  https://www.demoblaze.com/index.html  siteyi açınız.
2- Samsung galaxy s6  linkine tıklayınız.
3- Sepete ekleyiniz.
4- Çıkan alerte accept yapınız.

     wait.until(ExpectedConditions.alertIsPresent());
 */


public class _01_WaitSoru extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.demoblaze.com/index.html");
        WebElement linkSamS6= driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']"));
        linkSamS6.click();
        WebElement addChartBtn= driver.findElement(By.cssSelector("a.btn.btn-success.btn-lg"));
        addChartBtn.click();
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        BekleVeKapat();



    }
}
