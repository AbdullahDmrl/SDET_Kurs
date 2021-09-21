package Gun13;

import Gun00.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _08_ActionHoverOver extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.etsy.com/");
        Actions aksiyonlar=new Actions(driver);

        WebElement coKies= driver.findElement(By.cssSelector(".wt-btn.wt-btn--filled.wt-mb-xs-0"));
        coKies.click();

        WebElement jewelleryAccecories= driver.findElement(By.id("catnav-primary-link-10855"));
        WebElement nackLaces= driver.findElement(By.id("side-nav-category-link-10873"));

        Action action=aksiyonlar.moveToElement(jewelleryAccecories).build(); action.perform();
        Bekle(1);
        action=aksiyonlar.moveToElement(nackLaces).click().build(); action.perform();
        Bekle(3);

        BekleVeKapat();


    }
}
