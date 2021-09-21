package DersOdev.Soru2;

import Gun00.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
/*
Ödev 2 : http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html
         buradaki bütün öğrencileri bütün kutucukları doldurana kadar atınız.
 */

public class Cevap2 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");
        Actions actions=new Actions(driver);

       List<WebElement> avaibleStudents=driver.findElements(By.cssSelector("li[id*='node']"));
       List<WebElement> destBoxes=driver.findElements(By.cssSelector("ul[id*='box']"));

        for (WebElement student : avaibleStudents) {
            for (WebElement destBox : destBoxes) {

                Action aksiyon =actions.clickAndHold(student).moveToElement(destBox).release(destBox).build();
                aksiyon.perform();

            }

        }

        BekleVeKapat();
    }

}
