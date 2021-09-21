package Gun12.Actions;

import Gun00.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _05_ActionClickTest extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://demoqa.com/buttons");

        Bekle(2);
        WebElement clickButton=driver.findElement(By.xpath("//button[text()='Click Me']"));

        Actions aksiyonlar=new Actions(driver);// driver üzerinden aksiyonları çalıştırmak için değişken tanımladım
        System.out.println("Aksiyon öncesi");

        Action aksiyon=aksiyonlar.moveToElement(clickButton).click().build();// Aksiyon hazırlandı.henğz hareket yok
        System.out.println("Aksiyon tanımlandı");

        Bekle(3);
        System.out.println("Aksiyon gerçekleşti");
        aksiyon.perform(); // Aksiyonu gerçekleştir.

        Bekle(2);
        BekleVeKapat();

    }
}
