package org.testleaf.week2.day2.homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.By.ById;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class CreateLead {
public static void main(String[] args) {
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("guest");
        ChromeDriver driver = new ChromeDriver(opt);
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();

        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        
        //Click on CRM/SFA link
        driver.findElement(By.linkText("CRM/SFA")).click();

        //Click on the Leads tab
        driver.findElement(By.linkText("Leads")).click();

        //Click on the Create Lead button
        driver.findElement(By.linkText("Create Lead")).click();

        //Enter a CompanyName
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CG");

        //Enter a FirstName
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saranya");

        //Enter a LastName
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Shanmugam");

        //Enter a Title
        driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Automation");

        //Click the CreateLead button
        driver.findElement(By.name("submitButton")).click(); 
        

        //verify Title
        WebElement title = driver.findElement(By.id("viewLead_generalProfTitle_sp"));

        //Get the text from the element
        String actualTitle = title.getText();
        System.out.println(actualTitle);

        //Expected Text
        String expectedTitle = "Automation";

        //Verify using assert
        Assert.assertEquals(actualTitle, expectedTitle);
        
        //Close the browser Window
        driver.close();
    }

}

