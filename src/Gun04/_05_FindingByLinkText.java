package Gun04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05_FindingByLinkText {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.practiceselenium.com");
        driver.manage().window().maximize();

        // driver.findElement(By.linkText("linkin tam text i buraya yazılır"));
        // sadece a tag lerinde çalışır
        WebElement element =driver.findElement(By.linkText("Check Out"));

        // Elemanın ın özelliklerini alma
        // String deger = submitButton.getAttribute("özellikeAdı");
        // Yok ise null değeri döndürür.
        System.out.println(element.getAttribute("data-title"));  // Check Out
        System.out.println(element.getAttribute("data-url")); // check-out.html


        WebElement element1= driver.findElement(By.linkText("Welcome"));
        System.out.println(element1.getAttribute("data-title"));  // Welcome
        System.out.println(element1.getAttribute("data-url"));   // welcome.html
        System.out.println(element1.getText());                        // Welcome
        System.out.println("element1 = " + element1);  // element1 = [[ChromeDriver: chrome on WINDOWS (ddc624ca439b49da5aa9a8a372967108)] -> link text: Welcome]

        Thread.sleep(3000);
        driver.quit();



    }
}
