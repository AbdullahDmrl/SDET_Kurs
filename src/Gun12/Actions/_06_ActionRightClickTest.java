package Gun12.Actions;

import Gun00.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _06_ActionRightClickTest extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/buttons");

        Actions actions=new Actions(driver);
        WebElement rigtClick= driver.findElement(By.id("rightClickBtn"));
        Action action= actions.moveToElement(rigtClick).contextClick().build(); // context :sağ clik

        action.perform();


        BekleVeKapat();

    }
}
