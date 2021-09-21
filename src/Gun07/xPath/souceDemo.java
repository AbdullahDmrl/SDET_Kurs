package Gun07.xPath;

import Gun00.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class souceDemo extends BaseStaticDriver {
    public static void main(String[] args) {

       driver.get("https://www.saucedemo.com/");
        WebElement userName= driver.findElement(By.xpath("//input[@id='user-name']"));
        userName.sendKeys("standard_user");
        WebElement passWord= driver.findElement(By.xpath("//input[@id='password']"));
        passWord.sendKeys("secret_sauce");
        WebElement loginButton=driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();

        WebElement suceBack=driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        suceBack.click();
        WebElement addChart=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        addChart.click();
        WebElement backProduct=driver.findElement(By.xpath("//button[@id='back-to-products']"));
        backProduct.click();

        WebElement suceTshirt=driver.findElement(By.xpath("//*[text()='Sauce Labs Bolt T-Shirt']"));
        suceTshirt.click();
        WebElement addChart1=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
        addChart1.click();

        WebElement sePet=driver.findElement(By.xpath("//div[@id='shopping_cart_container']"));
        sePet.click();
        WebElement checkOut=driver.findElement(By.xpath("//button[@id='checkout']"));
        checkOut.click();

        WebElement ilkIsim=driver.findElement(By.xpath("//input[@id='first-name']"));
        ilkIsim.sendKeys("Abdullah");
        WebElement sonIsim=driver.findElement(By.xpath("//input[@id='last-name']"));
        sonIsim.sendKeys("Demirel");
        WebElement zipCode=driver.findElement(By.xpath("//input[@id='postal-code']"));
        zipCode.sendKeys("66849");
        WebElement devam=driver.findElement(By.xpath("//input[@id='continue']"));
        devam.click();



       WebElement price1Element=driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[1]"));
       String strPrice1=price1Element.getText();
       WebElement price2Element=driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[2]"));
       String strPrice2=price2Element.getText();
       WebElement subTotalElment=driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
       String strSubTop=subTotalElment.getText();

       double price1=strToDouble(strPrice1);
     System.out.println("price1 = " + price1);
       double price2=strToDouble(strPrice2);
     System.out.println("price2 = " + price2);
       double totalPrice=strToDouble(strSubTop);
     System.out.println("totalPrice = " + totalPrice);

       double expected=price1+price2;

        Assert.assertTrue(expected==totalPrice);

       BekleVeKapat();
    }
    public static double strToDouble(String fiyat){
     String strFiyat=fiyat.replaceAll("[^0-9.]","");   //[^\\d.] ayni sey

     return Double.parseDouble(strFiyat);
    }

}
