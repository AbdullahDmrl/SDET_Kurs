package Gun04.html_Antreman;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FinLinkText {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.practiceselenium.com");
        driver.manage().window().maximize();

        WebElement linkTalk= driver.findElement(By.linkText("Let's Talk Tea"));
        linkTalk.click();

        WebElement inpName=driver.findElement(By.className("form-value"));
        inpName.sendKeys("Aycan");

        WebElement eMail=driver.findElement(By.name("email"));
        eMail.sendKeys("aycan@yahoo.com");

        WebElement konu=driver.findElement(By.name("subject"));
        konu.sendKeys("Benefits of Green Tea");

        WebElement mesaj=driver.findElement(By.name("message"));
        mesaj.sendKeys("Antioxidants may lower the risk of some cancers.");

        WebElement submit= driver.findElement(By.className("form-submit"));
        submit.click();
        submit.getText();

        Thread.sleep(3000);
        driver.quit();
    }
}
