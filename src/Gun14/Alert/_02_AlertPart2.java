package Gun14.Alert;

import Gun00.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_AlertPart2 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://www.seleniumeasy.com/test/javascript-alert-box-demo.html");

        WebElement clicMe= driver.findElement(By.xpath("(//button[text()='Click me!'])[2]"));
        clicMe.click();
        String expected="Press a button!";
        Assert.assertEquals(expected,driver.switchTo().alert().getText());
        System.out.println(driver.switchTo().alert().getText());

        driver.switchTo().alert().dismiss();



        BekleVeKapat();

    }
}
