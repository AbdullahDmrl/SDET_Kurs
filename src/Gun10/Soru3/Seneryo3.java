package Gun10.Soru3;

import Gun00.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Seneryo3 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.saucedemo.com/");
       LogInn();

        List<WebElement> eklemeButonu=driver.findElements(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']"));
        for (WebElement e : eklemeButonu){
           e.click();
        }
       WebElement sepet= driver.findElement(By.xpath("//span[@class='shopping_cart_badge']"));
       sepet.click();

       List<WebElement> silmeButonu=driver.findElements(By.xpath("//button[@class='btn btn_secondary btn_small cart_button']"));
       for (WebElement e : silmeButonu)
       {
           e.click();
       }

        WebElement ürünSayi= driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        System.out.println(ürünSayi.getText());
        Assert.assertEquals("",ürünSayi.getText());



        BekleVeKapat();
    }

   public static void LogInn() {

       WebElement userName= driver.findElement(By.xpath("//input[@id='user-name']"));
       userName.sendKeys("standard_user");
       WebElement passWord= driver.findElement(By.xpath("//input[@id='password']"));
       passWord.sendKeys("secret_sauce");
       WebElement loginButton=driver.findElement(By.xpath("//input[@id='login-button']"));
       loginButton.click();


   }

}
