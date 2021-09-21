package Gun17.Scroll;

import Gun00.BaseStaticDriver;
import org.openqa.selenium.JavascriptExecutor;

public class _01_Scrollintro extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://triplebyte.com/");

        // JavaScript komutlarını çalıştırmak için önce js değişkeni tanımlandı.
        JavascriptExecutor js= (JavascriptExecutor)driver;

        js.executeScript("window.scrollBy(0,1500)");
        // javascript komutu internetten bulunarak , executeScript metodu ile çalıştırıldı
        // window.scrollBy(0, 5000)  : window u kaydır x ve y miktarınca.
        // Burada sayfa 3000 pixel kaydırıldı.

        Bekle(2);
        js.executeScript("window.scrollBy(0,-500)");
        // Burada sayfa -500 pixel kaydırıldı.  - (eksi verildiğinden yukarı kaydırıldı.)

        BekleVeKapat();


    }
}

