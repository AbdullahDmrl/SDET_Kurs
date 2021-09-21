package Gun10.Soru1;

import Gun00.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Seneryo1 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.saucedemo.com/");

        WebElement userName= driver.findElement(By.xpath("//input[@id='user-name']"));
        userName.sendKeys("standard_user");
        WebElement passWord= driver.findElement(By.xpath("//input[@id='password']"));
        passWord.sendKeys("secret_sauce");
        WebElement loginButton=driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();



        List<WebElement> İtemler=driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        for (WebElement e : İtemler)
        {
            System.out.println(e.getText());
        }

        BekleVeKapat();

    }
}
