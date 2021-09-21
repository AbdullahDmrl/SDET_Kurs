package Gun18;

import Gun00.BaseStaticDriver;
import org.openqa.selenium.Dimension;

public class _01_WindowSize extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        driver.manage().window().maximize(); // Ekranı tam hale getiriyor.

        Bekle(3);
        Dimension newDimention=new Dimension(600,1200);
        driver.manage().window().setSize(newDimention);

        Dimension currDimentions=driver.manage().window().getSize();
        System.out.println(currDimentions);
        System.out.println(currDimentions.width);
        System.out.println(currDimentions.height);



        BekleVeKapat();
    }
}
