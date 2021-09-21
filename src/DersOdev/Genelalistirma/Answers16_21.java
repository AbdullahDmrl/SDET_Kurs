package DersOdev.Genelalistirma;

import Gun00.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Answers16_21 extends BaseStaticDriver {
    public static void main(String[] args) {
       // Soru16
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
         WebElement cooKies16= driver.findElement(By.cssSelector("a.at-cv-button.at-cv-lightbox-yesno.at-cm-no-button"));
         cooKies16.click();
         WebElement inputForms= driver.findElement(By.xpath("//a[text()='Input Forms']"));
         inputForms.click();
         WebElement radioDemoBtn= driver.findElement(By.xpath("(//a[text()='Radio Buttons Demo'])[2]"));
         radioDemoBtn.click();
         Bekle(1);
         WebElement getCheckoutBtn= driver.findElement(By.id("buttoncheck"));
         getCheckoutBtn.click();
         WebElement RadioBtnNotcheckt= driver.findElement(By.cssSelector("p.radiobutton"));
         System.out.println(RadioBtnNotcheckt.getText());
         WebElement radioMaleBtn= driver.findElement(By.xpath("(//input[@value='Male'])[1]"));
         radioMaleBtn.click();
         WebElement getCheckoutBtn1= driver.findElement(By.id("buttoncheck"));
         getCheckoutBtn1.click();
         WebElement RadioBtnNotcheckt1= driver.findElement(By.cssSelector("p.radiobutton"));
         System.out.println(RadioBtnNotcheckt1.getText());

        // Soru17

        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        WebElement cooKies17= driver.findElement(By.cssSelector("a.at-cv-button.at-cv-lightbox-yesno.at-cm-no-button"));
        cooKies17.click();
        WebElement inputForms17= driver.findElement(By.xpath("//a[text()='Input Forms']"));
        inputForms17.click();
        WebElement radioDemoBtn17= driver.findElement(By.xpath("(//a[text()='Radio Buttons Demo'])[2]"));
        radioDemoBtn17.click();
        WebElement groupRadioMale= driver.findElement(By.xpath("//input[@name='gender' and @value='Male']"));
        groupRadioMale.click();
        WebElement ageGroup= driver.findElement(By.xpath("//input[@name='ageGroup' and @value='0 - 5']"));
        ageGroup.click();
        WebElement getValues= driver.findElement(By.cssSelector("button[onclick='getValues();']"));
        getValues.click();

        WebElement groupRadioText= driver.findElement(By.className("groupradiobutton"));
        System.out.println(groupRadioText.getText());

        // Soru18
        driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
        WebElement filterBytask= driver.findElement(By.id("task-table-filter"));
        filterBytask.sendKeys("in progress");
        List<WebElement> taBle=driver.findElements(By.cssSelector("table#task-table>tbody>tr"));

        for (WebElement e:taBle){
            System.out.println(e.getText());
        }



        // Soru19
       driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
       JavascriptExecutor js=(JavascriptExecutor)driver;
       js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

       WebElement filterBtn= driver.findElement(By.cssSelector("button.btn.btn-default.btn-xs.btn-filter"));
       filterBtn.click();
       WebElement firsName= driver.findElement(By.cssSelector("input[placeholder='First Name']"));
       firsName.sendKeys("an");

       List<WebElement> nameS=driver.findElements(By.cssSelector("div.panel.panel-primary.filterable>table>tbody>tr"));
       for (WebElement e:nameS){

           System.out.println(e.getText());
       }
       Bekle(2);
       firsName.clear();
       WebElement userName= driver.findElement(By.cssSelector("input[placeholder='Username']"));
       userName.sendKeys("ar");

       List<WebElement> nameS1=driver.findElements(By.cssSelector("div.panel.panel-primary.filterable>table>tbody>tr"));
       for (WebElement e:nameS1){

           System.out.println(e.getText());
       }

        // Soru20
       driver.get("https://en.wikipedia.org/wiki/FIFA_World_Cup");

       List<WebElement> contentsTopics=driver.findElements(By.cssSelector("li[class*='toclevel-1']"));
       JavascriptExecutor js20=(JavascriptExecutor) driver;
       js20.executeScript("window.scrollBy(0,500)");

       WebElement attenDance= driver.findElement(By.xpath("(//span[text()='Attendance'])[1]"));
       attenDance.click();

       List<WebElement> hostCountries=driver.findElements(By.cssSelector("td[style='text-align:left']>a"));
       for (WebElement host:hostCountries){
           System.out.println(host.getText());
       }

        // Soru21
        driver.get("https://en.wikipedia.org/wiki/FIFA_World_Cup");

        List<WebElement> contentsTopic=driver.findElements(By.cssSelector("li[class*='toclevel-1']"));
        JavascriptExecutor js1=(JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,700)");

        WebElement allTimetabChampios= driver.findElement(By.xpath("(//span[text()='All-time table for champions'])[1]"));
        allTimetabChampios.click();

        List<WebElement> teAms=driver.findElements(By.cssSelector("td[align=left]>span[style='white-space:nowrap']>a"));
        List<WebElement> particiPations=driver.findElements(By.xpath("(//table[@class='wikitable sortable jquery-tablesorter'])[3]/tbody/tr/td[3]"));

        for (int i = 0; i < teAms.size(); i++) {

            if (!teAms.get(i).getText().equals("Argentina"))continue;
            System.out.println(teAms.get(i).getText()+"  "+particiPations.get(i).getText());
        }

        BekleVeKapat();
    }
}
