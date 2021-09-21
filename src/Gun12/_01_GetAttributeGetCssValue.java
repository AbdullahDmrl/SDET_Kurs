package Gun12;

import Gun00.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_GetAttributeGetCssValue extends BaseStaticDriver {

    public static void main(String[] args) {

        driver.get("https://www.snapdeal.com/");

        WebElement inputValEnter=driver.findElement(By.id("inputValEnter"));

        //tag in içdeki keylerin değerlerini yani ismlerini almamızı sağlar
        System.out.println(inputValEnter.getAttribute("name"));   // keyword    isimlerini verir
        System.out.println(inputValEnter.getAttribute("type"));    // text
        System.out.println(inputValEnter.getAttribute("class"));    //  col-xs-20 searchformInput keyword

        // Elemeanın CSS yani ekran gözüken tüm özelliklerini; font renk vs ulaşmamızı sağlar
        System.out.println(inputValEnter.getCssValue("color"));   // rgba(51, 51, 51, 1)
        System.out.println(inputValEnter.getCssValue("font-size")); //  14px
        System.out.println(inputValEnter.getCssValue("background"));  // rgba(244, 244, 244, 0.6) none repeat scroll 0% 0% / auto padding-box border-box

        BekleVeKapat();
    }
}
