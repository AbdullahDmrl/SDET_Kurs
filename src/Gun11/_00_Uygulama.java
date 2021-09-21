package Gun11;

import Gun00.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _00_Uygulama extends BaseStaticDriver {

    public static void main(String[] args) {

        driver.get("https://www.saucedemo.com/");
        WebElement userName= driver.findElement(By.xpath("//input[@id='user-name']"));
        userName.sendKeys("standard_user");
        WebElement passWord= driver.findElement(By.xpath("//input[@id='password']"));
        passWord.sendKeys("secret_sauce");
        WebElement loginButton=driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();

    // atasina gitme veya geri gitme
        // //dic[class='inventory_item_name']"
        // //div[text()='Sauce Labs Backpack']//parent::a//parent::div    parent in önündeki cizgi tek de olabilir ciftte
        // //div[text()='Sauce Labs Backpack']//parent::*//parent::div    * da kullanabiliriz

        WebElement ata= driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']//parent::a//parent::div"));
        System.out.println(ata.getAttribute("class"));   // inventory_item_label class ismini alma

        WebElement basata= driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']//ancestor::*")); // html lang
        WebElement basataDiv= driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']//ancestor::div"));
        System.out.println(basataDiv.getAttribute("id"));   // root id ismi
        //div[text()='Sauce Labs Backpack']/../../..   -> aynı işlemi yapar.  /.. (//..) birt üste gider  cift te olabilir ayni

    // Index ile bulma
        // //div[@class='inventory_item_name']  baktigimiz da 6 tane cikiyor ben 4 üncüsünü almak istersem
        // (//div[@class='inventory_item_name'])[4]  burada paranteze almak zorundayim
        WebElement dortElm= driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[4]"));
        System.out.println(dortElm.getText());   //Sauce Labs Fleece Jacket



    //   / child demek sonuna bunu yapinca child gider
        // //*[@id='java_technologies']//child::li
        // //div[@class='cart_list']//a    ikiside ayni child yazmaya biliriz. tek de olabilir ciftte

    // Kardes sibling
        //*[@type='submit']//following-sibling::input
        // (//div[@id='inventory_container'])[2] bu aydiden iki tane vardi ikincisine geldim
        // (//div[@id='inventory_container'])[2]//div//following-sibling::div  buradan alta inip ikinci kardese gittim

        WebElement kardes= driver.findElement(By.xpath("(//div[@id='inventory_container'])[2]/div/div/following-sibling::div"));
        System.out.println(kardes.getAttribute("class"));   //inventory_item


        BekleVeKapat();
    }
}
