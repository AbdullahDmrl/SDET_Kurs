package Gun06;

import Gun00.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_FindingElements_tag extends BaseStaticDriver {

    public static void main(String[] args){
        // BaseStaticDriver class inin tüm static kismi otomatik geldi
        driver.get("http://www.practiceselenium.com");

        List<WebElement> liList = driver.findElements(By.tagName("li"));
        System.out.println(liList);

        for (WebElement e : liList) {

            System.out.println(e.getText());
        }

        BekleVeKapat();
    }

    // driver.findElements(By.);   WebElement cinsinden liste döndürür

  //  Bulunulan sayfadaki verilen kritere göre bütün elelamanları bulur.
  //  Bulamazsa list i boş oalrak döndürür.
    // Ancak find.Element ise throw Exception yapar


}
