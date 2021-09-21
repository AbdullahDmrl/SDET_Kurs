package Gun15.Proje2;

/*
1) Bu siteye gidin --> http://zero.webappsecurity.com/login.html

2) Login'e "username" -- Password'a "password" yazın . Sign in button'ına tıklayınız.

3) Transfer founds butonuna tıklayınız.

4) From account kısmından herhangı bir(Random'la tıklatın) değer seçınız.

5) To account kısmından herhangı bir(Random'la tıklatın.) değer seçınız.

6) Her hangi bir amount gırınız.

7) Her hangi bir description giriniz.

8)Continue butonuna tiklayiniz.

9)Submit butonuna tiklayiniz.

10) "You successfully submitted your transaction" Yazısı gözükmesi gerekiyor.
 */

import Gun00.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Soru1 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://zero.webappsecurity.com/login.html");

        WebElement logIn= driver.findElement(By.cssSelector("input#user_login"));
        logIn.sendKeys("username");
        WebElement passWord= driver.findElement(By.id("user_password"));
        passWord.sendKeys("password");
        WebElement subMit= driver.findElement(By.name("submit"));
        subMit.click();
        WebElement safeBack= driver.findElement(By.id("primary-button"));
        safeBack.click();

      WebElement transFound= driver.findElement(By.id("transfer_funds_link"));
      transFound.click();

      List<WebElement> opTions=driver.findElements(By.cssSelector("select#tf_fromAccountId>option"));
      int rand=(int) (Math.random()* (opTions.size()+1));

      Select fromAccount=new Select(driver.findElement(By.id("tf_fromAccountId")));
      fromAccount.selectByVisibleText(opTions.get(rand).getText());

      List<WebElement> secenekler=driver.findElements(By.cssSelector("select#tf_toAccountId>option"));
      int random=(int) (Math.random()* (secenekler.size()+1));
      Select toAccount=new Select(driver.findElement(By.id("tf_toAccountId")));
      toAccount.selectByVisibleText(secenekler.get(random).getText());

      WebElement amaUnt= driver.findElement(By.id("tf_amount"));
      amaUnt.sendKeys("100");
      WebElement desCriptin= driver.findElement(By.id("tf_description"));
      desCriptin.sendKeys("Kira odemesi");

      WebElement conTinue= driver.findElement(By.id("btn_submit"));
      conTinue.click();
      WebElement SubMit= driver.findElement(By.id("btn_submit"));
      SubMit.click();

      WebElement text=driver.findElement(By.cssSelector("div.alert.alert-success"));
      String expected="You successfully submitted your transaction.";
      Assert.assertEquals(expected,text.getText());


    BekleVeKapat();

    }
}
