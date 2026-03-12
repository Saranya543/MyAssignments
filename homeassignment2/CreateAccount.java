package org.testleaf.week2.day2.homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

//import io.cucumber.java.eo.Se;

public class CreateAccount {
    public static void main(String[] args) {
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("guest");
        ChromeDriver driver = new ChromeDriver(opt);

        // Load the URL
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();

        // Enter Username and password
        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();

        // Click on CRM/SFA link
        driver.findElement(By.linkText("CRM/SFA")).click();

        // Click on the Accounts tab.
        driver.findElement(By.linkText("Accounts")).click();

        // Click on the Create Account button
        driver.findElement(By.linkText("Create Account")).click();

        // Enter an account name
        String actName = "Testing" + System.currentTimeMillis();
        driver.findElement(By.id("accountName")).sendKeys(actName);
        System.out.println(actName);

        // Enter a description
        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");

        // Select "ComputerSoftware" as the industry

        WebElement industry = driver.findElement(By.name("industryEnumId"));
        Select options = new Select(industry);
        options.selectByVisibleText("Computer Software");

        //Select "S-Corporation" as ownership using SelectByVisibleText

        WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
        Select ownershipOption = new Select(ownership);
        ownershipOption.selectByVisibleText("S-Corporation");

        //Select "Employee" as the source using SelectByValue

        WebElement source = driver.findElement(By.id("dataSourceId"));
        Select sourceOption = new Select(source);
        sourceOption.selectByValue("LEAD_EMPLOYEE");

        //Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex

        WebElement marketingCampaign = driver.findElement(By.id("marketingCampaignId"));
        Select marketingOption = new Select(marketingCampaign);
        marketingOption.selectByIndex(6);

        //Select "Texas" as the state/province using SelectByValue

        WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
        Select stateOption = new Select(state);
        stateOption.selectByValue("TX");

        //Click the "Create Account" button
       driver.findElement(By.className("smallSubmit")).click();

       //Verify that the account name is displayed correctly
       WebElement account = driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]/span"));
       String accountName = account.getText();
       System.out.println(accountName);
       String actualAccountName = accountName.substring(0,accountName.length()-8);
       System.out.println(actualAccountName);


        //Expected Text
        String expectedAccountName= actName;

        //Verify using assert
        Assert.assertEquals(actualAccountName, expectedAccountName);
        
        //Close the browser Window
        driver.close();


    }
}

