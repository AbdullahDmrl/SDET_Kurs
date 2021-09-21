package Gun13;

import Gun00.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _06_ActionShiftSendKeys extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://demoqa.com/auto-complete");
        Actions aksiyonlar=new Actions(driver);

        WebElement singleColor= driver.findElement(By.id("autoCompleteSingleInput"));

        Action action=aksiyonlar
                .moveToElement(singleColor)
                .click()
                .keyDown(Keys.SHIFT)
                .sendKeys("a")
                .keyUp(Keys.SHIFT)
                .sendKeys("hmet")
                .build();

        action.perform();

        BekleVeKapat();

    }
}
