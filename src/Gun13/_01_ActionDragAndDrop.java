package Gun13;
import Gun00.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _01_ActionDragAndDrop extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        Actions aksiyonlar=new Actions(driver);

        WebElement oslo=driver.findElement(By.id("box1"));
        WebElement norvec=driver.findElement(By.id("box101"));

        Action aksiyon= aksiyonlar.dragAndDrop(oslo, norvec).build();
        Bekle(3);
        aksiyon.perform();

      BekleVeKapat();

// Actions  sadece Webelement leri etkiliyebiliyor   !!!!!!!!!!!!


    }
}
