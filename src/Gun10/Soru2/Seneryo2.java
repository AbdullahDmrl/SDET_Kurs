package Gun10.Soru2;

import Gun00.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Seneryo2 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.saucedemo.com/");

        String[] isimListesi={"standard_user", "locked_out_user", "problem_user", "performance_glitch_user"};

        for (String user:isimListesi){
          //Bekle(2);
            WebElement userName= driver.findElement(By.xpath("//input[@id='user-name']"));
            userName.clear();
            userName.sendKeys(user);
            WebElement passWord= driver.findElement(By.xpath("//input[@id='password']"));
            passWord.clear();
            passWord.sendKeys("secret_sauce");
            WebElement loginButton=driver.findElement(By.xpath("//input[@id='login-button']"));
            loginButton.click();

            List<WebElement> producT =driver.findElements(By.xpath("//div[@class='header_secondary_container']"));
            if (producT.size()==1){
                System.out.println(user+":  basri ile login oldu");
                driver.navigate().back();
            }
            else {
                WebElement error= driver.findElement(By.xpath("//h3[@data-test='error']"));
                System.out.println(user+": "+error.getText());
            }

        }

        BekleVeKapat();

    }


}
