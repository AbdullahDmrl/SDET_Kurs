package Gun16.Window;

import Gun00.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _05_WindowGiris extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.selenium.dev/");

        List<WebElement> windowLinks=driver.findElements(By.cssSelector("a[target='_blank']"));
        for (WebElement window:windowLinks){
            window.click();
        }

        Set<String> idLer=driver.getWindowHandles(); // her acilan pencereye chrome bir string id veriyor.
        // bu tek olmak zorunda oldugu icin Set olarak tanimladik simdi o idleri alalim
        for (String id:idLer){
            System.out.println("id = " + id);
        }
        BekleVeKapat();
    }
}
