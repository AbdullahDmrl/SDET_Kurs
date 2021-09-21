package Gun16.Window;

import Gun00.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _07_WindowsClosing extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.selenium.dev/");


        List<WebElement> windowLinks=driver.findElements(By.cssSelector("a[target='_blank']"));
        for (WebElement window:windowLinks){
            window.click();
        }

        Set<String> idLer=driver.getWindowHandles();  // acik sayfalarin tüm id si alindi

        for (String id:idLer){
            driver.switchTo().window(id);
            Bekle(1);
            driver.close();   // driver acik olan tum sayfalari teker teker kapatir
        }



        BekleVeKapat();



    }
}
