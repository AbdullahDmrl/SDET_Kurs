package Gun10.Soru4;

import Gun00.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Seneryo4 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.saucedemo.com/");

        WebElement userName= driver.findElement(By.xpath("//input[@id='user-name']"));
        userName.sendKeys("standard_user");
        WebElement passWord= driver.findElement(By.xpath("//input[@id='password']"));
        passWord.sendKeys("secret_sauce");
        WebElement loginButton=driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();

        ArrayList<String> itemsName=new ArrayList<>();

        List<WebElement> İtemler=driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        for (WebElement e : İtemler)
        {   itemsName.add(e.getText());    }

        List<WebElement> eklemeButonu=driver.findElements(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']"));
        for (WebElement e : eklemeButonu)
        {  e.click();  }
        WebElement sepet= driver.findElement(By.xpath("//span[@class='shopping_cart_badge']"));
        sepet.click();

        List<WebElement> spetItems=driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        for (WebElement e:spetItems)
        {
          Assert.assertTrue(itemsName.contains(e.getText()));
          // boolean evetMi=itemsName.contains(e.getText());
          // System.out.println(evetMi);

        }


    BekleVeKapat();

    }
}
