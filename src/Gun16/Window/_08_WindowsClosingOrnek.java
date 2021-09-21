package Gun16.Window;

import Gun00.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _08_WindowsClosingOrnek extends BaseStaticDriver {
    public static void main(String[] args) {
        // driver en son kapatilan sayfada kalir. bizim bir onceki ornegimize devam edersek

        driver.get("https://www.selenium.dev/");
        String anaSayfaId=driver.getWindowHandle(); // ana sayfanin id si alindi

        List<WebElement> windowLinks=driver.findElements(By.cssSelector("a[target='_blank']"));
        for (WebElement window:windowLinks){
            window.click();
        }

        Set<String> idLer=driver.getWindowHandles();  // acik sayfalarin tüm id si alindi

        for (String id:idLer){
            if (id.equals(anaSayfaId))continue;
            driver.switchTo().window(id);
            Bekle(1);
            driver.close();
        }
        // driver en son yukarıdaki kapatılan sayfaya switch olmuştu onu gösteriyordu,
        // eğer alttaki anasayfaya switch eden set eden komut olmasa idi, driver kapatılan sayfayı gösterdiğinden
        // hata verecekti.Bu yüzden en son stiwch işlemini yaparak driver ı ana sayfaya set(switch) ettik
        driver.switchTo().window(anaSayfaId);
        System.out.println("Title= "+driver.getTitle());

         BekleVeKapat();


    }
}
