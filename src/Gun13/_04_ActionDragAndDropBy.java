package Gun13;

import Gun00.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _04_ActionDragAndDropBy extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");
        Actions aksiyonlar=new Actions(driver);

        WebElement surGu=driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-state-default ui-corner-all'])[1]"));

        Action aksiyon= (Action) aksiyonlar.dragAndDropBy(surGu,100,0);
        Bekle(3);
        aksiyon.perform();
        Bekle(3);





        BekleVeKapat();

    }
}
