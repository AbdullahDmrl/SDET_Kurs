package Gun17.sRobot;

import Gun00.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class _06_RobotFileUpload2 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://demo.guru99.com/test/upload/");

        WebElement chooseFile= driver.findElement(By.id("uploadfile_0"));
        chooseFile.sendKeys("C:\\Users\\ademi\\OneDrive\\Desktop\\Selenium");

        WebElement submitBtn=driver.findElement(By.id("submitbutton"));
        submitBtn.click();
        Bekle(2);

        BekleVeKapat();
    }
}
