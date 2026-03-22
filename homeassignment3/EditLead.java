package org.testleaf.week3.homeassignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

//To edit lead information on a web application using Selenium WebDriver

public class EditLead {
    public static void main(String[] args) {

        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("guest");
        ChromeDriver driver = new ChromeDriver(opt);

        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();

        driver.findElement(By.id("username")).sendKeys("DemoCSR");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();

        // Click on CRM/SFA link
        driver.findElement(By.linkText("CRM/SFA")).click();

        // Click on the Leads tab
        driver.findElement(By.linkText("Leads")).click();

        // Click on the Create Lead button
        driver.findElement(By.linkText("Create Lead")).click();

        // Enter a CompanyName
        driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("CG");

        // Enter a FirstName
        driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Saranya");

        // Enter a LastName
        driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Shanmugam");

        // Enter the Department Field
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Healthcare");

        // Enter the Description Field
        driver.findElement(By.id("createLeadForm_description")).sendKeys("Creating Lead");

        // Enter your email in the E-mail address Field
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("saran@gmail.com");

        // Select State/Province as NewYork

        WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select stateOption = new Select(state);
        stateOption.selectByVisibleText("New York");

        // Click on the Create Button.
        driver.findElement(By.name("submitButton")).click();

        // Click on the edit button
        driver.findElement(By.linkText("Edit")).click();

        // Clear the Description Field
        driver.findElement(By.id("updateLeadForm_description")).clear();

        // Fill the Important Note Field with Any text
        driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("testing");

        // Click on the update button
        driver.findElement(By.name("submitButton")).click();

        // Get the Title of the Resulting Page

        String titleOfResultingPage = driver.getTitle();
        System.out.println("Title of Resulting page : " + titleOfResultingPage);

        //Close the browser window.
        driver.close();

    }

}
