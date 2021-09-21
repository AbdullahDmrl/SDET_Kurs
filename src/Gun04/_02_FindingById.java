package Gun04;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingById {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.practiceselenium.com");
        driver.manage().window().maximize();


        // driver.findElement(By.id("id")); id yi kopyala
        WebElement element= driver.findElement(By.id("wsb-element-00000000-0000-0000-0000-000450914894"));
        System.out.println("elemnt :"+element.getText());  // String text = element.getText(); // görünen text ini verir
                                                // Yok ise null değeri döndürür.
                                                // Loose Tea (ismini verdi)

        // driver.findElement(By.name("name")); name i yaziyoruz. Once id ve name aranir.
        WebElement elem=driver.findElement(By.name("generator"));
        System.out.println("elem :"+elem.getText());

        WebElement element1= driver.findElement(By.id("wsb-element-00000000-0000-0000-0000-000450914893"));
        System.out.println("elemnt1 :"+element1.getText());   // Flavored Tea


        // benim alistirmam
        WebElement more= driver.findElement(By.id("wsb-element-00000000-0000-0000-0000-000450914883"));
        more.click();  // Elemana Click yapmar
        WebElement text= driver.findElement(By.id("wsb-element-00000000-0000-0000-0000-000450914921"));
        String acText=text.getText();
        System.out.println("acText = " + acText);
        Assert.assertEquals("Menu",acText);



        Thread.sleep(3000);
        driver.quit();




    }
}
