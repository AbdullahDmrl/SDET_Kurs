package Gun11;

import Gun00.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
   /*
   Senaryo
   1- https://www.facebook.com/ sitesine giriniz.
   2- Yeni hesap oluştura tıklayınız.

   a[id^='u_0_2'][class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']

   3- Formdaki tüm bilgileri giriniz.
   vorname    input[id^='u_'][class='inputtext _58mg _5dba _2ph-']
   nachname       input[id^='u_'][class='inputtext _58mg _5dba _2ph-']
    email        input[id^='u_'][name='reg_email__']
    password    input#password_step_input      id

    Dogum gümu
    gün        select#day       id
    ay         select#month
    yil        select#year


    cinsiyet    //label[text()='Male']       click


 */



public class _04_FacebookSelect extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.facebook.com");


        WebElement cooki=driver.findElement(By.cssSelector("button[class='_42ft _4jy0 _9o-t _4jy3 _4jy1 selected _51sy']"));
        cooki.click();

        WebElement newAccount= driver.findElement(By.cssSelector(" a[id^='u_0_2'][class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
        newAccount.click();

        WebElement vorName= driver.findElement(By.cssSelector("input[id^='u_'][name='firstname']"));
        vorName.sendKeys("Abdullah");

        WebElement nachName= driver.findElement(By.cssSelector("input[id^='u_'][name='lastname']"));
        nachName.sendKeys("Demirel");

        WebElement eMail= driver.findElement(By.cssSelector("input[id^='u_'][name='reg_email__']"));
        eMail.sendKeys("0 532 3152545");

        WebElement passWord= driver.findElement(By.cssSelector("input[id='password_step_input'][name='reg_passwd__']"));
        passWord.sendKeys("Burdur5429");


        WebElement day=driver.findElement(By.cssSelector("select[id='day']"));       //select#day
        Select gun=new Select(day);
        gun.selectByValue("11");
        WebElement month=driver.findElement(By.cssSelector("select[name='birthday_month'][id='month']"));
        Select ay=new Select(month);
        ay.selectByIndex(11);
        WebElement year=driver.findElement(By.cssSelector("select[name='birthday_year'][id='year']"));
        Select yil=new Select(year);
        yil.selectByValue("1971");


        WebElement gender=driver.findElement(By.xpath("//label[text()='Male']"));
        gender.click();



    BekleVeKapat();
    }
}
