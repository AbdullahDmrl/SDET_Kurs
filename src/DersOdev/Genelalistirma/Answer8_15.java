package DersOdev.Genelalistirma;

import Gun00.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Answer8_15 extends BaseStaticDriver {
    public static void main(String[] args) {


    // Soru8/9
        driver.get("https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html");
        WebElement normalsuccessMessageBtn= driver.findElement(By.id("normal-btn-success"));
        normalsuccessMessageBtn.click();
        Bekle(1);
        WebElement massegeCloseBtn= driver.findElement(By.cssSelector("button.close"));
        massegeCloseBtn.click();
        Bekle(1);

         // Soru10
         driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
         WebElement checkAll= driver.findElement(By.id("check1"));
         System.out.println(checkAll.getAttribute("value"));
         checkAll.click();
         Bekle(1);

        // Soru11
        driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");

         List<WebElement> dayS=driver.findElements(By.cssSelector("select[id='select-demo']>option"));
         int counterWed=0;
         for (int i=0;i<dayS.size();i++) {
             Select aDay=new Select(driver.findElement(By.id("select-demo")));
             aDay.selectByIndex(4);
             counterWed++;
             if (counterWed==5)break;
         }
         System.out.println(counterWed+" kere Carsamba secilmistir");

           // Soru12
         driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
         WebElement cooKies= driver.findElement(By.cssSelector("a.at-cv-button.at-cv-lightbox-yesno.at-cm-no-button"));
         Bekle(1);
         cooKies.click();
         WebElement inputForms= driver.findElement(By.xpath("//a[text()='Input Forms']"));
         inputForms.click();
         WebElement ajaxFromsubmit= driver.findElement(By.xpath("(//li[@class='tree-branch'])[2]//ul//following::li[6]//a"));
         ajaxFromsubmit.click();

         WebElement nameInput= driver.findElement(By.id("title"));
         nameInput.sendKeys("Musti");
         WebElement commMent= driver.findElement(By.id("description"));
         commMent.sendKeys("Wonder schon");
         WebElement subMit= driver.findElement(By.id("btn-submit"));
         subMit.click();

         WebDriverWait wait=new WebDriverWait(driver,30);
         wait.until(ExpectedConditions.textToBe(By.id("submit-control"),"Form submited Successfully!"));
         WebElement msjText= driver.findElement(By.id("submit-control"));
         System.out.println(msjText.getText());

        // Soru13
       driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
       WebElement cooKies13= driver.findElement(By.cssSelector("a.at-cv-button.at-cv-lightbox-yesno.at-cm-no-button"));
       Bekle(1);
       cooKies13.click();
       WebElement listBox= driver.findElement(By.xpath("//a[text()='List Box']"));
       listBox.click();
       WebElement boostRapBox= driver.findElement(By.xpath("(//li[@class='tree-branch'])[7]//ul//li//a"));
       boostRapBox.click();
       WebElement boostDualList= driver.findElement(By.cssSelector("ul.list-group>li"));
       boostDualList.click();
       WebElement buttonRight= driver.findElement(By.cssSelector("button.btn.btn-default.btn-sm.move-right"));
       buttonRight.click();
       WebElement boostDualListright= driver.findElement(By.cssSelector("div.dual-list.list-right.col-md-5>div>div+ul>:nth-child(6)"));
       boostDualListright.click();
       WebElement crasHustoOdio= driver.findElement(By.cssSelector("div.dual-list.list-right.col-md-5>div>div+ul>:nth-child(1)"));
       crasHustoOdio.click();
       WebElement buttonLeft= driver.findElement(By.cssSelector("button.btn.btn-default.btn-sm.move-left"));
       buttonLeft.click();
       WebElement morbiLeoRisus= driver.findElement(By.cssSelector("div.dual-list.list-right.col-md-5>div>div+ul>:nth-child(2)"));
       morbiLeoRisus.click();
       buttonLeft.click();
       List<WebElement> leftBox=driver.findElements(By.cssSelector("div.dual-list.list-left.col-md-5>div>div+ul>li"));
       for (WebElement e:leftBox){
           System.out.println(e.getText());
       }
       System.out.println("_______________________________");
       List<WebElement> rightBox=driver.findElements(By.cssSelector("div.dual-list.list-right.col-md-5>div>div+ul>li"));
       for (WebElement e:rightBox){
           System.out.println(e.getText());
       }

        // Soru14
       driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
       WebElement cooKies14= driver.findElement(By.cssSelector("a.at-cv-button.at-cv-lightbox-yesno.at-cm-no-button"));
       Bekle(1);
       cooKies14.click();
       WebElement enterMassage= driver.findElement(By.xpath("//input[@id='user-message' and @class='form-control']"));
       enterMassage.sendKeys("What a wonderful world");
       WebElement showMassageBtn= driver.findElement(By.cssSelector("button.btn.btn-default"));
       showMassageBtn.click();
       WebElement massageDisplay= driver.findElement(By.cssSelector("span#display"));
       System.out.println(massageDisplay.getText());

        // Soru15
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        WebElement cooKies15= driver.findElement(By.cssSelector("a.at-cv-button.at-cv-lightbox-yesno.at-cm-no-button"));
        Bekle(1);
        cooKies15.click();
        WebElement enterA= driver.findElement(By.cssSelector(" input#sum1"));
        enterA.sendKeys("30");
        WebElement enterB= driver.findElement(By.cssSelector(" input#sum2"));
        enterB.sendKeys("40");
        WebElement getTotal= driver.findElement(By.xpath("//button[@type='button' and @onclick='return total()']"));
        getTotal.click();
        WebElement totalDisplay= driver.findElement(By.cssSelector("span#displayvalue"));
        System.out.println(totalDisplay.getText());

        BekleVeKapat();
    }



}
