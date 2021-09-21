package Gun04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_FindingByClassName {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.practiceselenium.com");

        // driver.findElement(By.className("class name buraya yazılır"));
        // aynı locator dan birden fazla var ise ilkini getirir.

        WebElement element= driver.findElement(By.className("editor_collections"));
        System.out.println(element.getText());          // Loose Tea ilkini getirdi
        System.out.println(element.getLocation());      //(587, 584)



        Thread.sleep(3000);
        driver.quit();
    }
}
