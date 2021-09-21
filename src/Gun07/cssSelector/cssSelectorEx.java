package Gun07.cssSelector;

import Gun00.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class cssSelectorEx extends BaseStaticDriver {
    public static void main(String[] args){

        driver.get("https://formsmarts.com/form/yu?mode=h5");
       Bekle(1);

        WebElement busiNess=driver.findElement(By.cssSelector("input[name$='4586']"));
        busiNess.click();

      //   WebElement discoVer= driver.findElement(By.cssSelector("select[name$='4588']"));
      //  discoVer.sendKeys("Online Advertising");  ikiside oluyor
       Select discoVer = new Select(driver.findElement(By.cssSelector("select[name$='4588']")));
       discoVer.selectByValue("Online Advertising"); //Bu degeri tasiyani bulur
       // discoVer.deselectByIndex(1);    // index e göre secer 0 dan baslar index oldugu icin

        WebElement everDay=driver.findElement(By.cssSelector("input[name$='89585']"));
        everDay.click();

        WebElement gooD=driver.findElement(By.cssSelector("input[name$='4589']"));
        gooD.click();

        Select useXyz = new Select(driver.findElement(By.cssSelector("select[name$='4597']")));
        useXyz.selectByIndex(2);  //index ile secme  0 dan basliyor unutma


        BekleVeKapat();
    }

}
