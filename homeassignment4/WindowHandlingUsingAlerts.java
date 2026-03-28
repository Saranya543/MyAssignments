package org.testleaf.week4.homeassignment4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

//Interacting with a webpage, focusing on window handling, using Selenium WebDriver
public class WindowHandlingUsingAlerts {
    public static void main(String[] args) throws InterruptedException {
        //Initialize ChromeDriver
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("guest");
        ChromeDriver driver = new ChromeDriver(opt);

        //Load the URL
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();

        //Add an implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        //Enter the username and password
        driver.findElement(By.id("username")).sendKeys("DemoCSR");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();

        // Click on CRM/SFA link
        driver.findElement(By.linkText("CRM/SFA")).click();

        //Click on the Contacts button
        driver.findElement(By.linkText("Contacts")).click();

        //Click on Merge Contacts
        driver.findElement(By.linkText("Merge Contacts")).click();

        //Click on the widget of the "From Contact"
        driver.findElement(By.xpath("(//td[@class='titleCell']/following-sibling::td/a)[1]")).click();

        //Switch to child window
        Set<String> allAddress = driver.getWindowHandles();
        
        List<String> address = new ArrayList<String>(allAddress);
        String childWindow = address.get(1);
        driver.switchTo().window(childWindow);

        //Click on the first resulting contact
        driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();

        //Switch to parent window
        String parentWindow = address.get(0);
        driver.switchTo().window(parentWindow);

        //Click on the widget of the "To Contact"
        driver.findElement(By.xpath("(//td[@class='titleCell']/following-sibling::td/a)[2]")).click();

        //Switch to Child window
        Set<String> allAddress1 = driver.getWindowHandles();
        List<String> address1 = new ArrayList<String>(allAddress1);
        String childWindow1 = address1.get(1);
         driver.switchTo().window(childWindow1);
         //Thread.sleep(5000);

        //Click on the second resulting contact
        driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();

        //Click on the Merge button
        String parentWindow1 = address1.get(0);
        driver.switchTo().window(parentWindow1);
        driver.findElement(By.linkText("Merge")).click();

        //Accept the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();

        //Verify the title of the page
        String titleOfResultingPage = driver.getTitle();
        System.out.println(titleOfResultingPage);
        String expectedTitle = "Merge Contacts | opentaps CRM";
        String actualTitle = titleOfResultingPage;
        Assert.assertEquals(actualTitle,expectedTitle);

        //Close the window
        driver.close();


    }

}
