package Gun13;

import Gun00.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _05_DragAndDropByOrnek extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");
        Actions aksiyonlar=new Actions(driver);



        WebElement sleIder= driver.findElement(By.cssSelector("div#slider-range"));

        WebElement leftSleider= driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-state-default ui-corner-all'])[1]"));
        WebElement rightSleider= driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-state-default ui-corner-all'])[2]"));


        Action action=aksiyonlar.dragAndDropBy(leftSleider,-100,0).build();action.perform();
        Action action1=aksiyonlar.dragAndDropBy(rightSleider,200,0).build();action1.perform();

        double sleiderLength=sleIder.getSize().width;
        double slideRate=sleiderLength/500;  // her bir dolar için kaç birim surgu gidiyor. 500 dolar için 502

        // 200 -400 arası yapmak için.
        action=aksiyonlar.dragAndDropBy(leftSleider,199,0).build();action.perform();
        action1=aksiyonlar.dragAndDropBy(rightSleider,-98,0).build();action1.perform();

        BekleVeKapat();

    }
}
