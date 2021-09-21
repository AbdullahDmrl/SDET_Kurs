package DersOdev.Soru1;

import Gun00.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
/*
Ödev 1 : http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html
         buradaki ülke ve şehirleri findElements ile topluca bularak bir döngü ile bütün şehirleri doğru ülkere dağıtınız.
 */

public class Cevap1 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");
        Actions actions=new Actions(driver);

     List<WebElement>  cyTies=driver.findElements(By.cssSelector("div[id='answerDiv']>div"));
     List<WebElement> destBoxes=driver.findElements(By.cssSelector("div[class='destinationBox']"));

        for (WebElement cyTY : cyTies) {
            for (WebElement destBox : destBoxes) {
                Action action = actions.clickAndHold(cyTY).moveToElement(destBox).release(destBox).build();
                action.perform();
                if ((cyTY.getCssValue("background-color").equals("rgba(0, 128, 0, 1)")))
                    break;
            }

        }


       BekleVeKapat();



    }
}
