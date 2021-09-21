package Gun13;

import Gun00.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _07_YonTuslarileSecim extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://demoqa.com/auto-complete");
        Actions aksiyonlar=new Actions(driver);

        WebElement multiblrInput= driver.findElement(By.id("autoCompleteMultiple"));

        Action action=aksiyonlar
                .moveToElement(multiblrInput)
                .click()
                .sendKeys("e")
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ENTER)
                .build();

        action.perform();

        BekleVeKapat();

    }
}
