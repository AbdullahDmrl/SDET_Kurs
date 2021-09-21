package Gun17.Scroll;

import Gun00.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _03_ScrollToWebElement extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://triplebyte.com/");
        JavascriptExecutor js=(JavascriptExecutor)driver;

        WebElement massiveButn= driver.findElement(By.cssSelector("a.massive-button"));

        js.executeScript("arguments[0].scrollIntoView()",massiveButn);  // belirtilen elamana kadar gider
        // arguments[0] : virgülden sonraki ilk eleman
        // gözükene kadar scroll yap => scrollIntoView()

        // click yapmak istersek
        js.executeScript("arguments[0].click()",massiveButn);

        BekleVeKapat();

    }
}
