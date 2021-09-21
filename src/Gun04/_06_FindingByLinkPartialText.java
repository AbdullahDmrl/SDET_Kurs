package Gun04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_FindingByLinkPartialText {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.practiceselenium.com");

        // driver.findElement(By.partialLinkText("linkin text inin bir parçası"));
        // sadece a tag lerinde çalışır
        WebElement element = driver.findElement(By.partialLinkText("Passion"));
        System.out.println(element.getAttribute("href"));  // http://www.practiceselenium.com/our-passion.html
        System.out.println(element.getAttribute("data-url"));  // our-passion.html
        System.out.println(element.getText());  // Our Passion

        WebElement element1=driver.findElement(By.partialLinkText("Let's Talk "));
        System.out.println(element1.getAttribute("href"));  // http://www.practiceselenium.com/let-s-talk-tea.html
        System.out.println(element1.getText());   // Let's Talk Tea

        Thread.sleep(3000);
        driver.quit();
    }
}
