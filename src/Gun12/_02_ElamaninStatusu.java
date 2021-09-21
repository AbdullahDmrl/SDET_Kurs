package Gun12;

import Gun00.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/*
Elemanları statüsü

isSelect();boolean:  checkbox, radiobutton
isEnabled();boolean
isDisplay();boolean

isEnabled()
Monday : true
Sunday : false

isSelect:
Tuesday : true
Friday  : false

isDisplay()
Monday : true
Sunday : true
 */
public class _02_ElamaninStatusu extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox"); // siteyi açtım

        WebElement sali=driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));
        System.out.println(sali.isDisplayed());     // true
        System.out.println(sali.isEnabled());       //true
        System.out.println(sali.isSelected());      // false
        Bekle(2);
        sali.click();
        System.out.println(sali.isSelected());      //true

        System.out.println();

        WebElement sunDay= driver.findElement(By.id("gwt-debug-cwCheckBox-Sunday-input"));
        System.out.println(sunDay.isDisplayed());    // true
        System.out.println(sunDay.isEnabled());      //false
        System.out.println(sunDay.isSelected());    //false

        BekleVeKapat();

    }
}
