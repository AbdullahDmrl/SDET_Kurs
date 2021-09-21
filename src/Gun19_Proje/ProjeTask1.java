package Gun19_Proje;

import Gun00.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class ProjeTask1 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demowebshop.tricentis.com/");

        String anaId= driver.getWindowHandle();

       WebElement logIn= driver.findElement(By.className("ico-login"));
       logIn.click();
        WebElement eMail=driver.findElement(By.name("Email"));
        eMail.sendKeys("ademirel@yahoo.com");
        WebElement passWord= driver.findElement(By.id("Password"));
        passWord.sendKeys("1234Ad");
        WebElement loginBtn=driver.findElement(By.cssSelector("input.button-1.login-button"));
        loginBtn.click();

        WebElement facebookBtn=driver.findElement(By.linkText("Facebook"));
        facebookBtn.click();
        Set<String> idLer=driver.getWindowHandles();
        for (String id:idLer){
            if (id.equals(anaId)) continue;
            driver.switchTo().window(id);
        }

        String secUrl=driver.getCurrentUrl();
        System.out.println(secUrl);
        Assert.assertTrue(secUrl.contains("facebook"));
        for (String id:idLer){
            if (id.equals(anaId)) continue;
            driver.switchTo().window(id);
            String anaId2=id;
        }

        driver.switchTo().window(anaId);
        WebElement conTactUs=driver.findElement(By.linkText("Contact us"));
        conTactUs.click();

        WebElement enQuiry= driver.findElement(By.id("Enquiry"));
        enQuiry.sendKeys("What a wonderful life");

        WebElement subMit=driver.findElement(By.name("send-email"));
        subMit.click();

        WebElement resultMsj= driver.findElement(By.cssSelector("div[class=result]"));
        String expected="Your enquiry has been successfully sent to the store owner.";
        Assert.assertEquals(expected,resultMsj.getText());

       for (String id:idLer){
           driver.switchTo().window(id).close();
       }

    }
}
