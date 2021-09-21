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

        4) Payee dropdown'unundan rastgele (Random) bir değer seçiniz.

        5) Account dropdown'unundan rastgele (Random) bir değer seçiniz..

        6) Amount'a bir değer girin..

        7) Date'de bir tarih seçiniz.

        8) Description'ı her hangi bir şekilde doldurun.

        11) Pay button'una tıklayınız.

        12) The payment was successfully submitted. mesajının göründüğünü doğrulayınız.
 */

public class Soru2 extends BaseStaticDriver {
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

        WebElement morService= driver.findElement(By.id("online-banking"));
        morService.click();
        WebElement payBill= driver.findElement(By.id("pay_bills_link"));
        payBill.click();

        List<WebElement> payeeList=driver.findElements(By.cssSelector("select#sp_payee>option"));
        int rand=(int) (Math.random()* (payeeList.size()+1));
        Select paYee=new Select(driver.findElement(By.id("sp_payee")));
        paYee.selectByVisibleText(payeeList.get(rand).getText());

        List<WebElement> accountList=driver.findElements(By.cssSelector("select#sp_account>option"));
        int random=(int) (Math.random()* (accountList.size()+1));
        Select accCount=new Select(driver.findElement(By.id("sp_account")));
        accCount.selectByVisibleText(accountList.get(random).getText());

        WebElement amoUnt= driver.findElement(By.id("sp_amount"));
        amoUnt.sendKeys("100");
        WebElement daTe=driver.findElement(By.id("sp_date"));
        daTe.click();
        WebElement dateClick=driver.findElement(By.xpath("//a[text()='18']"));
        dateClick.click();
        WebElement desCription= driver.findElement(By.id("sp_description"));
        desCription.sendKeys("Monthly rent");
        WebElement paY= driver.findElement(By.id("pay_saved_payees"));
        paY.click();

        String expected="The payment was successfully submitted.";
        WebElement text=driver.findElement(By.xpath("//span[text()='The payment was successfully submitted.']"));
        Assert.assertEquals(expected,text.getText());
        BekleVeKapat();


    }
}
