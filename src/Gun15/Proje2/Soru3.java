package Gun15.Proje2;

import Gun00.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
/*
1) Bu siteye gidin --> http://zero.webappsecurity.com/login.html

2) Login'e "username" -- Password'a "password" yazın. Sign in button'una tıklayınız.

3) Paybils button'ına tıklayınız.

4) Purchase Foreign Currency'ya tıklayınız.

5) Currency kısmından rastgele(RANDOM) bir değer seçiniz. (Dropdown'ın içindeki Select One değerini, Random'a dahil etmeyin.)

6) Amount'a bir değer girin.

7) U.S. dollar (USD)'ı seçiniz.

8) Purchase button'una tıklayınız.

9) Foreign currency cash was successfully purchased. yazısı görünmelidir.
 */


public class Soru3 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://zero.webappsecurity.com/login.html");

        WebElement loGin= driver.findElement(By.cssSelector("input#user_login"));
        loGin.sendKeys("username");

        WebElement passWord= driver.findElement(By.cssSelector("input#user_password"));
        passWord.sendKeys("password");
        WebElement siGn=driver.findElement(By.cssSelector("input[name=submit]"));
        siGn.click();
        WebElement safeBack=driver.findElement(By.cssSelector("button#primary-button"));
        safeBack.click();
        WebElement onlineBank=driver.findElement(By.id("online-banking"));
        onlineBank.click();
        WebElement paybills=driver.findElement(By.id("pay_bills_link"));
        paybills.click();
        WebElement Foreign=driver.findElement(By.xpath("//a[text()='Purchase Foreign Currency']"));
        Foreign.click();

        List<WebElement> curRency=driver.findElements(By.cssSelector("select#pc_currency>option"));
        int max=curRency.size()+1;
        int rand=(int) (Math.random()*((max-1)+1))+1;
        Select fromAccount=new Select(driver.findElement(By.id("pc_currency")));
        fromAccount.selectByVisibleText(curRency.get(rand).getText());

       WebElement AmOunt=driver.findElement(By.id("pc_amount"));
       AmOunt.sendKeys("3000");
       WebElement dollAr=driver.findElement(By.id("pc_inDollars_true"));
       dollAr.click();
       WebElement purChase=driver.findElement(By.id("purchase_cash"));
       purChase.click();

       WebElement text2=driver.findElement(By.id("alert_content"));
       String expected= "Foreign currency cash was successfully purchased.";
       Assert.assertEquals(expected,text2.getText());



       BekleVeKapat();


    }
}
