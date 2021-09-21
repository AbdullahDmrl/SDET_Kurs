package Gun05;

import Gun00.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert.*;

public class _01_SendKeysCritic extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://www.practiceselenium.com");

        WebElement checkOut=driver.findElement(By.linkText("Check Out"));
        //   WebElement checkOut=driver.findElement(By.cssSelector("a[href='check-out.html']"));
        checkOut.click();

        Bekle(1);

        WebElement eMail= driver.findElement(By.id("email"));
        // WebElement eMail= driver.findElement(By.cssSelector("input.span6"));
        eMail.sendKeys("ademirel@yahoo.com");

        WebElement isim= driver.findElement(By.id("name"));
        //WebElement isim= driver.findElement(By.cssSelector("input#name"));
        // WebElement isim= driver.findElement(By.cssSelector("#name"));
        isim.sendKeys("Abdullah");

        WebElement adress= driver.findElement(By.id("address"));
        // WebElement adress= driver.findElement(By.cssSelector("textarea[rows='3']"));
        adress.sendKeys("Baspinar Koyu Turkiye");

        Bekle(1);


        WebElement placeOrder=driver.findElement(By.className("btn-primary"));
        //WebElement placeOrder=driver.findElement(By.cssSelector("button[class^=btn]"));
        placeOrder.click();

        WebElement text=driver.findElement(By.cssSelector("div.txt"));
        String strText= text.getText();  // mutlaka yapmak lazim asagidaki ciktilara dikkat et
        System.out.println("text :"+text);  // text :[[ChromeDriver: chrome on WINDOWS (18d186941a6c8abfc7c73ae653a32828)]...
        System.out.println("strText = " + strText); // strText = Menu
        Assert.assertEquals("Menu",strText);

        String url= driver.getCurrentUrl(); // su an acik olan url yi verir
        Assert.assertEquals("http://www.practiceselenium.com/menu.html?",url);


        BekleVeKapat();

    }
}
