package Gun18;

import Gun00.BaseStaticDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class _02_EkranKaydet extends BaseStaticDriver {
    public static void main(String[] args) throws IOException {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement inputName= driver.findElement(By.id("txtUsername"));
        inputName.sendKeys("Admin");
        WebElement inputPassword= driver.findElement(By.id("txtPassword"));
        inputPassword.sendKeys("admin12");
       WebElement loginBtn= driver.findElement(By.id("btnLogin"));
       loginBtn.click();

        List<WebElement> hataMsjes=driver.findElements(By.id("spanMessage")); // hata oldugunda cikan mesajin lokation i
        if (hataMsjes.size()==0)
        {
            System.out.println("Login oldum: Çünkü sayfada bu hata mesajı elementi bulunamadı.");
        }

        else
        {
            System.out.println("Login olamadı. Çünkü hala aynı sayfdadayım.");
            //Hata oldu screen schot alayim
            LocalDateTime date=LocalDateTime.now();
            DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd.MM.yyyy");

            TakesScreenshot tss=(TakesScreenshot) driver;           // ekran gör alma degiskeni tanimlandi
            File screenShots=tss.getScreenshotAs(OutputType.FILE);  // file olarak hafizada olusturuldu
            FileUtils.copyFile(screenShots,new File("screenShots/Orange/"+date.format(formatter)+"Logincontrl.png")); // kayit yeri gösterildi
            // hafızadaki ekranDosyasi nı al bunu verdiğim yola ve isme kaydet.
            // jpg,bmp,gif ..

            // Ödev buradaki dosya adını zamana bağlı hale getiriniz ki hep üstüne kaydetmesin
            // mesala 20210526111201  gib...

        }


        BekleVeKapat();
    }
}
