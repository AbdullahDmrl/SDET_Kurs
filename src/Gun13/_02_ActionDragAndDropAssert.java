package Gun13;

import Gun00.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _02_ActionDragAndDropAssert extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://demo.guru99.com/test/drag_drop.html");
        Actions aksiyonlar=new Actions(driver);

        WebElement yaziBank=driver.findElement(By.id("credit2"));
        WebElement kutuBank=driver.findElement(By.id("bank"));

        Action aksiyon= aksiyonlar.dragAndDrop(yaziBank, kutuBank).build();
        Bekle(3);
        aksiyon.perform();

        Assert.assertEquals(kutuBank.getText(), yaziBank.getText());
       BekleVeKapat();
    }
}
