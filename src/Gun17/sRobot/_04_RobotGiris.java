package Gun17.sRobot;

import Gun00.BaseStaticDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class _04_RobotGiris extends BaseStaticDriver {
    public static void main(String[] args) throws AWTException {
        driver.get("https://blog.112dijital.com/web-push-notification-bildirim-kurulumu-detayli-anlatim/");


        Robot rbt=new Robot();

        // Block yapmak icin uc defa tab a basip enter yapmam lazim
         Bekle(2);
        rbt.keyPress(KeyEvent.VK_TAB);// keyPress TAB tuşuna basıldı         //1
        rbt.keyRelease(KeyEvent.VK_TAB);// keyRelease TAB tuşunu bıraktı.

         Bekle(2);
         rbt.keyPress(KeyEvent.VK_TAB); // keyPress TAB tuşuna basıldı      // 2
         rbt.keyRelease(KeyEvent.VK_TAB); // keyRelease TAB tuşunu bıraktı.

         Bekle(2);
         rbt.keyPress(KeyEvent.VK_TAB); // keyPress TAB tuşuna basıldı      // 3
         rbt.keyRelease(KeyEvent.VK_TAB); // keyRelease TAB tuşunu bıraktı.

         Bekle(2);
         rbt.keyPress(KeyEvent.VK_ENTER); // keyPress TAB tuşuna basıldı  // enter
         rbt.keyRelease(KeyEvent.VK_ENTER); // keyRelease TAB tuşunu bıraktı.



       BekleVeKapat();
    }
}