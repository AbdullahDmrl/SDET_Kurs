package Gun16.Frame;

import Gun00.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
/*
   1-driver.get("http://chercher.tech/practice/frames"); sayfasına gidiniz.
   2-Inputa ülke adı yazınız
   3-CheckBox ı çekleyiniz.
   4-Select in 4.elemanını seçiniz.
 */

public class _04_IFrameSoru extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://chercher.tech/practice/frames");

        driver.switchTo().frame(0); // index ile
        WebElement inputTopic= driver.findElement(By.cssSelector("input[type='text']"));
        inputTopic.sendKeys("Deutschland");

        WebElement iFrame3= driver.findElement(By.id("frame3"));
        driver.switchTo().frame(iFrame3);
        //driver.switchTo().frame(0); bunu da yazarak yapariz cunku iframe3 iframe1 in icinde
        WebElement innerFrameCheckBox= driver.findElement(By.cssSelector("input#a"));
        innerFrameCheckBox.click();

         driver.switchTo().parentFrame();
         driver.switchTo().parentFrame(); //parentframe den iki tane yazmak zorundayiz cunku bir geri sayfaya git demek
      //  driver.switchTo().defaultContent();  //bundan bir tane yeterli direk ana sayfa git demek


        driver.switchTo().frame(1);
        Select aniMals=new Select(driver.findElement(By.id("animals")));
        aniMals.selectByIndex(3);

        BekleVeKapat();



    }
}
