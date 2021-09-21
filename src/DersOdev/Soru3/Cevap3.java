package DersOdev.Soru3;

import Gun00.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
/*
  ayın sorusu
Ödev 3: http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html
         buradaki bütün şehirleri bütün ülkere doğru şekilde topluca dağıtınız.
 */

public class Cevap3 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html");
        Actions actions=new Actions(driver);

        List<WebElement> citiesList=driver.findElements(By.cssSelector("li[id*='node']"));
        List<WebElement> destBoxesList=driver.findElements(By.cssSelector("ul[id*='box']"));

       // WebElement correctAnswer= driver.findElement(By.cssSelector("li.correctAnswer"));

        for (WebElement city : citiesList) {
            for (WebElement destBox : destBoxesList) {

                Action aksiyon = actions.clickAndHold(city).moveToElement(destBox).release(destBox).build();
                aksiyon.perform();
                Bekle(1);
                if (city.getCssValue("background-color").equals("rgba(0, 128, 0, 1)")) break;

            }
        }


        BekleVeKapat();


    }
}
