package Gun16.Window;

import Gun00.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _06_WindowsSwitch extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.selenium.dev/");
        String anaSayfaId=driver.getWindowHandle(); // ana sayfanin id si alindi

        List<WebElement> windowLinks=driver.findElements(By.cssSelector("a[target='_blank']"));
        for (WebElement window:windowLinks){
            window.click();
        }

        Set<String> idLer=driver.getWindowHandles();  // acik sayfalarin tüm id si alindi
                                                    // Ben burada ana sayfanin id sini yazdirmak istemeseydim
        for (String id:idLer){
            if (id.equals(anaSayfaId))continue;
            System.out.println("id = " + id);
            driver.switchTo().window(id); // o pencereye gecis yapiyor. Bunu test etmek icin o sayfanin title yazdiralim
            System.out.println("title= "+driver.getTitle());
        }

        BekleVeKapat();

    }
//   id = CDwindow-F60B6C0CB64B7AB72A2255175D3CF31B
//   title= SeleniumHQ Browser Automation               ana sayfa
//   id = CDwindow-E5453A972618E0107AEBF24F9BB62F45
//   title= NAACP Legal Defense and Educational Fund, Inc.
//   id = CDwindow-F9755EE9B410703FF057D28F1AA84D22
//   title= Donate to the Equal Justice Initiative


//    ana sayfa alinmamis hali
//    id = CDwindow-050EE425DCE0F9FE4811B5712E55AF13
//    title= NAACP Legal Defense and Educational Fund, Inc.
//    id = CDwindow-704EC3F4C70019D19356999F1546B309
//    title= Donate to the Equal Justice Initiative



}
