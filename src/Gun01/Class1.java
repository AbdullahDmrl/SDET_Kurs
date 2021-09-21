package Gun01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {

    public static void main(String[] args) throws InterruptedException {
        // hangi browserı kullanacağımı ve tarayıcının path ini verdim.
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        // çalıştıracağımız driverı kontrol edecek değişkeni tanımladım: driver
        WebDriver driver = new ChromeDriver();


        // siteyi açtım
        driver.get("https://www.techno.study/");

        // bunlari mutlaka yapmak lazim yoksa arka planda calisir.
        Thread.sleep(3000); // Thread.sleep(3000) 3 saniye bekle ?
        driver.quit();    //bu komutu bir alternatifi de close() dur.
    }

   // quit(): bütün açılmış tarayıcıları kapatır.
   // close(): sadece aktif olanı kapatır.



}
