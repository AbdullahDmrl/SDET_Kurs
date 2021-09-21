package Gun14.Wait;

import Gun00.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
        Bu siteye gidiniz.  [https://www.seleniumeasy.com/test/basic-first-form-demo.html]
        (https://www.seleniumeasy.com/test/basic-first-form-demo.html)
        Input forms'a tıklayınız.
        Ajax from Submit'e tıklayınız.
        Name giriniz.
        Comment giriniz.
        Submit'e tıklayınız.
        Form submited Successfully! yazısı görüntülenmelidir.
        Yazıyı yazdırınız.
        */
public class _07_FillingFormTask extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

        WebElement yesNobtn= driver.findElement(By.cssSelector("a.at-cv-button.at-cv-lightbox-yesno.at-cm-no-button"));
        yesNobtn.click();

        WebElement inputForm= driver.findElement(By.xpath("//a[text()='Input Forms']"));
        inputForm.click();
        WebElement ajaxForm= driver.findElement(By.xpath("(//li[@class='tree-branch'])[2]//ul//following::li[6]//a"));
        ajaxForm.click();

        WebElement naMe= driver.findElement(By.id("title"));
        naMe.sendKeys("Artist");
        WebElement desCription= driver.findElement(By.id("description"));
        desCription.sendKeys("Alles Gute");
        WebElement btnSubmit= driver.findElement(By.id("btn-submit"));
        btnSubmit.click();

       WebDriverWait wait=new WebDriverWait(driver,30);
       wait.until(ExpectedConditions.textToBe(By.id("submit-control"),"Form submited Successfully!"));

       WebElement mesaj=driver.findElement(By.id("submit-control"));
       Assert.assertEquals("Form submited Successfully!",mesaj.getText());

       BekleVeKapat();
    }
}
