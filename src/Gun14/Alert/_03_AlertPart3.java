package Gun14.Alert;

import Gun00.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_AlertPart3 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://www.seleniumeasy.com/test/javascript-alert-box-demo.html");

        WebElement cilick= driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
        cilick.click();

        driver.switchTo().alert().sendKeys("Aycan");
        driver.switchTo().alert().accept();

        String expecTed="You have entered 'Aycan' !";
        Assert.assertEquals(expecTed,driver.switchTo().alert().getText());
        BekleVeKapat();

    }
}
