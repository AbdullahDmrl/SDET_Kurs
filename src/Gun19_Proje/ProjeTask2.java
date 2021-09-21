package Gun19_Proje;

import Gun00.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ProjeTask2 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demowebshop.tricentis.com/");

        WebElement logIn= driver.findElement(By.className("ico-login"));
        logIn.click();
        WebElement eMail=driver.findElement(By.name("Email"));
        eMail.sendKeys("ademirel@yahoo.com");
        WebElement passWord= driver.findElement(By.id("Password"));
        passWord.sendKeys("1234Ad");
        WebElement loginBtn=driver.findElement(By.cssSelector("input.button-1.login-button"));
        loginBtn.click();


        WebElement aDemirel=driver.findElement(By.linkText("ademirel@yahoo.com"));
        aDemirel.click();

        WebElement adResses=driver.findElement(By.linkText("Addresses"));
        adResses.click();

        WebElement adressList=driver.findElement(By.cssSelector("div.address-list"));
        List<WebElement> adresler=driver.findElements(By.cssSelector("input.button-2.delete-address-button"));

        if (adressList.getText().equals("No addresses")){
            WebElement demoLogo=driver.findElement(By.cssSelector("div.header-logo>a>img"));
            demoLogo.click();
        }
        else
        {
           for (WebElement adress:adresler){
               Bekle(1);
               adress.click();
               Bekle(1);
               driver.switchTo().alert().accept();
           }
            Bekle(2);
            WebElement demoLogo=driver.findElement(By.cssSelector("div.header-logo>a>img"));
            demoLogo.click();
        }

        WebElement compuTers=driver.findElement(By.linkText("Computers"));
        compuTers.click();

        WebElement deskTabs=driver.findElement(By.linkText("Desktops"));
        deskTabs.click();

        WebElement buildExpeComBtn=driver.findElement(By.xpath("(//input[@class='button-2 product-box-add-to-cart-button'])[3]"));
        buildExpeComBtn.click();
        WebElement proCessorFast=driver.findElement(By.cssSelector("input#product_attribute_74_5_26_82"));
        proCessorFast.click();
        WebElement ram8G=driver.findElement(By.cssSelector("input#product_attribute_74_6_27_85"));
        ram8G.click();
        WebElement hdD=driver.findElement(By.cssSelector("input#product_attribute_74_3_28_87"));
        hdD.click();
        WebElement softWare=driver.findElement(By.cssSelector("input#product_attribute_74_8_29_90"));
        softWare.click();
        WebElement addChartBtn=driver.findElement(By.id("add-to-cart-button-74"));
        addChartBtn.click();

        WebElement shoppIngCart=driver.findElement(By.xpath("//span[text()='Shopping cart']"));
        shoppIngCart.click();

        WebElement agreeCheckBox=driver.findElement(By.id("termsofservice"));
        agreeCheckBox.click();
        WebElement checkOut=driver.findElement(By.cssSelector("button#checkout"));
        checkOut.click();

        WebElement comPany=driver.findElement(By.id("BillingNewAddress_Company"));
        comPany.sendKeys("Techno Study0");

        Select countRy=new Select(driver.findElement(By.cssSelector("select#BillingNewAddress_CountryId")));
        countRy.selectByVisibleText("Germany");

        WebElement ciTy=driver.findElement(By.id("BillingNewAddress_City"));
        ciTy.sendKeys("Frankfurtt");

        WebElement adRess1=driver.findElement(By.id("BillingNewAddress_Address1"));
        adRess1.sendKeys("Barborosa 46");

        WebElement adRess2=driver.findElement(By.id("BillingNewAddress_Address2"));
        adRess2.sendKeys("Ladstuhl");

        WebElement zippCode=driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
        zippCode.sendKeys("696780");

        WebElement phoneNum=driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
        phoneNum.sendKeys("0155354789560");

        Bekle(1);

        WebElement ConTinue=driver.findElement(By.xpath("(//input[@class='button-1 new-address-next-step-button'])[1]"));
        ConTinue.click();
        Bekle(1);
        WebElement shipConTinue=driver.findElement(By.cssSelector("input[onclick='Shipping.save()']"));
        shipConTinue.click();
        Bekle(1);
        WebElement shipMetConTinue=driver.findElement(By.cssSelector("input[onclick='ShippingMethod.save()']"));
        shipMetConTinue.click();

        WebElement cashOnDel=driver.findElement(By.id("paymentmethod_0"));
        cashOnDel.click();

        WebElement payMetCon=driver.findElement(By.cssSelector("input[onclick='PaymentMethod.save()']"));
        payMetCon.click();

        WebElement payInfoCon=driver.findElement(By.cssSelector("input.button-1.payment-info-next-step-button"));
        payInfoCon.click();

        WebElement confimOrder=driver.findElement(By.cssSelector("input.button-1.confirm-order-next-step-button"));
        confimOrder.click();

        WebElement msjText=driver.findElement(By.xpath("//strong[text()='Your order has been successfully processed!']"));
        String expecTed="Your order has been successfully processed!";
        Assert.assertEquals(expecTed,msjText.getText());

        BekleVeKapat();
    }
}
