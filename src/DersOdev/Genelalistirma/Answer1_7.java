package DersOdev.Genelalistirma;

import Gun00.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Answer1_7 extends BaseStaticDriver {
    public static void main(String[] args) {

      // Soru1
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement alertS= driver.findElement(By.id("alerttest"));
        alertS.click();
        System.out.println("url Alert Test= "+driver.getCurrentUrl());

       // Soru2
        driver.navigate().back();
        System.out.println("url acilis sayfasi= "+driver.getCurrentUrl());

        WebElement basicAjax= driver.findElement(By.id("basicajax"));
        basicAjax.click();
        System.out.println("url Basic Ajax= "+driver.getCurrentUrl());

        // Soru3
        driver.navigate().back();
        WebElement findByPlayground= driver.findElement(By.id("findby"));
        findByPlayground.click();
        WebElement prag5= driver.findElement(By.id("a31"));
        System.out.println("index5= "+prag5.getText());

        // Soru4
        driver.navigate().back();
        WebElement seArch= driver.findElement(By.id("search"));
        seArch.click();
        WebElement heAder= driver.findElement(By.xpath("//h1[contains(text(),'Search Engine')]"));
        System.out.println(heAder.getText());

        WebElement serchBtn=driver.findElement(By.name("btnG"));
        serchBtn.click();
        System.out.println("url search= "+driver.getCurrentUrl());

        // Soru5
        driver.navigate().back();
        driver.navigate().back();
        WebElement calcuLater= driver.findElement(By.id("calculatetest"));
        calcuLater.click();
        Bekle(1);
        WebElement numBer1= driver.findElement(By.name("number1"));
        numBer1.sendKeys("30");
        WebElement numBer2= driver.findElement(By.id("number2"));
        numBer2.sendKeys("40");
        Bekle(1);
        WebElement calculateBtn=driver.findElement(By.id("calculate"));
        calculateBtn.click();
        WebElement ansWer= driver.findElement(By.id("answer"));
        System.out.println("Cevap = "+ansWer.getText());
        Bekle(1);

        // Soru6
        driver.navigate().back();
        driver.navigate().back();
        WebElement fakeAlerts= driver.findElement(By.id("fakealerttest"));
        fakeAlerts.click();
        Bekle(1);
        WebElement showAlertBox= driver.findElement(By.id("fakealert"));
        showAlertBox.click();
        WebElement text=driver.findElement(By.id("dialog-text"));
        System.out.println("fake alert text = "+text.getText());
        WebElement okaY= driver.findElement(By.id("dialog-ok"));
        okaY.click();
        Bekle(1);

        // Soru7
        WebElement modalDialogBox= driver.findElement(By.id("modaldialog"));
        modalDialogBox.click();
        Bekle(1);
        WebElement modalText=driver.findElement(By.cssSelector("h2#dialog-text"));
        System.out.println("Modal dialog text = "+modalText.getText());
        WebElement okayModal= driver.findElement(By.id("dialog-ok"));
        okayModal.click();


        BekleVeKapat();

    }
}
