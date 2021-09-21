package Gun17.sRobot;

import Gun00.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
/*
1- Adım DosyaSeç click
2- dosya yolunu hafızaya atmam lazım-> hafızaya alma komutyla yapacağız.
   hafızadaki dosya yolunu yapıştır-> ctrl+v
3- ENTER
 */

public class _05_RobotFileUpload extends BaseStaticDriver {
    public static void main(String[] args) throws AWTException {

        driver.get("http://demo.guru99.com/test/upload/");

     //  WebElement chooseFile= driver.findElement(By.id("uploadfile_0"));  //InvalidArgumentException: invalid argument
     //  chooseFile.click(); // Bu durumla karsilastigimizda ustündeki elemani alabiliriz
        WebElement chooseFileDiv= driver.findElement(By.id("file_wraper0"));
        chooseFileDiv.click();

        // Stringi hafızaya-clipboard a kopyalama kodu
        StringSelection stringSelection = new StringSelection("C:\\Users\\ademi\\OneDrive\\Desktop\\Selenium");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection , null);
        // Verilen stringi clipboard a set ediyor.

        // ctrl+v    yapistir
        Robot rbt=new Robot();
        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_V);
        Bekle(2);
        rbt.keyRelease(KeyEvent.VK_CONTROL);
        rbt.keyRelease(KeyEvent.VK_V);
        Bekle(2);

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);
        Bekle(2);

        WebElement submitBtn=driver.findElement(By.id("submitbutton"));
        submitBtn.click();
        Bekle(2);

        BekleVeKapat();
    }
}
