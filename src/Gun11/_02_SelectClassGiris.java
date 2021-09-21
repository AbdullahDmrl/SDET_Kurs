package Gun11;

import Gun00.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_SelectClassGiris extends BaseStaticDriver {
    /*
     select class ı
     görünen text ile seçim için: selectByVisibleText
     valueden seçim için        : selectByValue
     sırasından seçim için      : selectByIndex
 */

    public static void main(String[] args) {

        driver.get("https://www.amazon.com/");

       // WebElement dropBox=driver.findElement(By.id("searchDropdownBox"));   böyle daha pratik

        Select dropBox=new Select(driver.findElement(By.id("searchDropdownBox")));// select olmali
        dropBox.selectByVisibleText("Books");

        WebElement searchBtn=driver.findElement(By.id("nav-search-submit-button"));
        searchBtn.click();

        Bekle(10);
        BekleVeKapat();







    }


}
