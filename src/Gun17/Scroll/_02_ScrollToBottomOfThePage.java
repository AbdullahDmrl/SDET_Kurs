package Gun17.Scroll;

import Gun00.BaseStaticDriver;
import org.openqa.selenium.JavascriptExecutor;

public class _02_ScrollToBottomOfThePage extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://triplebyte.com/");

        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); // sayfanin sonuna kadar

        Bekle(2);

        js.executeScript("window.scrollTo(0,0)"); // yukari icin (0,0) yaziyoruz

        // scrollTo : Verilen pixele gider.
        // scrollBy : Verilen kadar daha ileri gider.

        BekleVeKapat();
    }

}
