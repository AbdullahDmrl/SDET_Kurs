package Gun13;

import Gun00.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_ActionDragAndDropAlternate extends BaseStaticDriver {

    public static void main(String[] args) {
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        Actions aksiyonlar=new Actions(driver);

        WebElement sales=driver.findElement(By.id("credit1"));
        WebElement account=driver.findElement(By.id("loan"));

       // Action aksiyon= aksiyonlar.dragAndDrop(sales, account).build();

        Action aksiyon1=aksiyonlar.clickAndHold(sales).moveToElement(account).release().build(); // dragAnddrop farkli yontemi
        Bekle(3);
        aksiyon1.perform();

        Assert.assertEquals(account.getText(), sales.getText());
        BekleVeKapat();


    }
}
