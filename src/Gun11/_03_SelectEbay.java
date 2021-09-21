package Gun11;

import Gun00.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_SelectEbay extends BaseStaticDriver {

   /*
  Senaryo :
  1- https://www.ebay.com/ sitesini açın
  2- Arama seçim menüsünden 2984  değerli elemanı seçtiriniz. selectByValue
  3- Arama işlemini yaptırınız.
 */

    public static void main(String[] args) {

        driver.get("https://www.ebay.com/");

        Select dropBox=new Select(driver.findElement(By.cssSelector("select#gh-cat")));
        dropBox.selectByValue("2984");

        WebElement searchBtn=driver.findElement(By.cssSelector("input#gh-btn"));
        searchBtn.click();


    Bekle(10);
    BekleVeKapat();
    }
}
