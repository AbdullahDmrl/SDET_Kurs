package DersOdev.Frame_Window_Wait;

import Gun00.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;

public class Cevaplar extends BaseStaticDriver {
    public static void main(String[] args) {

     // Soru1
        driver.get("http://demo.guru99.com/test/guru99home/");
        String anaSayfaId= driver.getWindowHandle();
        driver.switchTo().frame("a077aa5e");
        WebElement imgIframeEnabled= driver.findElement(By.cssSelector("img[src='Jmeter720.png']"));
        imgIframeEnabled.click();
        Set<String> idLer=driver.getWindowHandles();
        for (String id:idLer){
              if (id.equals(anaSayfaId))continue;
              driver.switchTo().window(id);
        }
          Bekle(1);
         WebElement phyTon= driver.findElement(By.cssSelector("i.fa.fa-code"));
         phyTon.click();
         System.out.println("Url= "+driver.getCurrentUrl());  //Url= https://www.guru99.com/python-tutorials.html
        for (String id:idLer) {
            driver.switchTo().window(id);
            driver.close();
        }

        // Soru2/3
        driver.get("https://chercher.tech/practice/frames");
        WebElement iFrame= driver.findElement(By.id("frame1"));
        driver.switchTo().frame(iFrame);
        WebElement inputTopic= driver.findElement(By.cssSelector("input[type='text']"));
        inputTopic.sendKeys("Deutschland");
        WebElement iFrame3= driver.findElement(By.id("frame3"));
        driver.switchTo().frame(iFrame3);
        WebElement innerFrameCheckBox= driver.findElement(By.cssSelector("input#a"));
        innerFrameCheckBox.click();

        driver.switchTo().defaultContent();

        WebElement iframe2= driver.findElement(By.id("frame2"));
        driver.switchTo().frame(iframe2);
       Select aniMals=new Select(driver.findElement(By.id("animals")));
       aniMals.selectByIndex(2);

        // Soru4
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

        // Soru 5
         driver.get("https://www.seleniumeasy.com/test/jquery-download-progress-bar-demo.html");
          WebElement downLoadBtn=driver.findElement(By.id("downloadButton"));
          downLoadBtn.click();
          WebDriverWait wait=new WebDriverWait(driver,30);
          wait.until(ExpectedConditions.textToBe(By.className("progress-label"),"Complete!"));
          WebElement progressTale=driver.findElement(By.className("progress-label"));
          System.out.println(progressTale.getText());

        // Soru6
        driver.get(" https://www.seleniumeasy.com/test/bootstrap-download-progress-demo.html");
        WebElement crlBtn= driver.findElement(By.id("cricle-btn"));
        crlBtn.click();
        WebDriverWait wait1=new WebDriverWait(driver,60);
        wait1.until(ExpectedConditions.textToBe(By.className("percenttext"),"100%"));
        WebElement textCrl= driver.findElement(By.className("percenttext"));
        System.out.println(textCrl.getText());

        //Soru7
        driver.get("https://business.twitter.com/en/solutions-new.html");
        String anaId7=driver.getWindowHandle();

        WebElement cookiesOkBtn= driver.findElement(By.xpath("//button[text()='OK']"));
        cookiesOkBtn.click();
        WebElement cookiesDclnBtn= driver.findElement(By.xpath("//button[text()='Decline']"));
        cookiesDclnBtn.click();
        Bekle(1);
        WebElement titLe1= driver.findElement(By.cssSelector("h2.b01__headline.twtr-type--headline-xxl.twtr-color--white "));
        System.out.println(titLe1.getText());

        WebElement developerBlog= driver.findElement(By.cssSelector("a[title='Developer blog']"));
        developerBlog.click();

        Set<String> idLer7=driver.getWindowHandles();
        for (String id:idLer7){
            if (id.equals(anaId7))continue;
             driver.switchTo().window(id);
        }
        WebElement devTitle2=driver.findElement(By.cssSelector("a.type--bold-36.color--neutral-white--has-hover"));
        System.out.println(devTitle2.getText());
        driver.close();

        driver.switchTo().window(anaId7);
        WebElement titLe3= driver.findElement(By.cssSelector("h2.b01__headline.twtr-type--headline-xxl.twtr-color--white "));
        System.out.println(titLe3.getText());

        Assert.assertEquals(titLe1,titLe3);

       BekleVeKapat();

    // Soru9
       driver.get("https://www.naukri.com/");
       WebDriverWait wait9=new WebDriverWait(driver,30);
       wait9.until(ExpectedConditions.visibilityOfElementLocated(By.id("geoLocPopUp")));
       WebElement localShare= driver.findElement(By.cssSelector("span#block"));
       localShare.click();

       WebElement serviCes= driver.findElement(By.xpath("//div[text()='Services']"));
       serviCes.click();

       BekleVeKapat();

       // Soru10
        driver.get("http://the-internet.herokuapp.com/windows");
        String anaId10= driver.getWindowHandle();
        System.out.println("Url1= "+driver.getCurrentUrl());
        String url1= driver.getCurrentUrl();
        Bekle(1);
        WebElement clickHere= driver.findElement(By.xpath("//a[text()='Click Here']"));
        clickHere.click();

        Set<String> idEs=driver.getWindowHandles();
        for (String id:idEs){
            if (id.equals(anaId10)) continue;
            driver.switchTo().window(id);

        }
        Bekle(1);

        String url2= driver.getCurrentUrl();
        System.out.println("Url2= "+url2);
        driver.close();

        driver.switchTo().window(anaId10);
        String url3=driver.getCurrentUrl();
        System.out.println("Url3= "+url3);

        Assert.assertEquals(url1,url3);

        BekleVeKapat();
    }
}
