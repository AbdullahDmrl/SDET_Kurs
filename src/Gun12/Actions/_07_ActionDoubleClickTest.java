package Gun12.Actions;

import Gun00.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _07_ActionDoubleClickTest extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/buttons");

        Actions actions=new Actions(driver);

        WebElement dubbleKlick= driver.findElement(By.id("doubleClickBtn"));

        Action action=actions.moveToElement(dubbleKlick).doubleClick().build();
        action.perform();


    BekleVeKapat();


    }
}
