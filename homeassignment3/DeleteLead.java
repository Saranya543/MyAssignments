package org.testleaf.week3.homeassignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class DeleteLead {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("guest");
        ChromeDriver driver = new ChromeDriver(opt);
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();

        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();

        // Click on CRM/SFA link
        driver.findElement(By.linkText("CRM/SFA")).click();

        // Click on the Leads tab
        driver.findElement(By.linkText("Leads")).click();

        // Click "Find leads"
        driver.findElement(By.linkText("Find Leads")).click();

        // Click on the "Phone" tab
        driver.findElement(By.xpath("//span[text()='Phone']")).click();

        // Enter the phone number
        driver.findElement(By.name("phoneNumber")).sendKeys("12347890");

        // Click the "Find leads" button
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

        Thread.sleep(5000);

        // Capture the lead ID of the first resulting lead
        WebElement leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]"));
        String firstLeadID = leadID.getText();
        System.out.println(firstLeadID);

        // Click the first resulting lead
        leadID.click();

        // Click the "Delete" button
        driver.findElement(By.linkText("Delete")).click();

        // Click "Find leads" again
        driver.findElement(By.linkText("Find Leads")).click();

        // Enter the captured lead ID.
        driver.findElement(By.name("id")).sendKeys(firstLeadID);

        // Click the "Find leads" button
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

        Thread.sleep(8000);
        // Verify the presence of the message "No records to display" in the Lead
        // List.This message confirms the successful deletion

        WebElement message = driver.findElement(By.xpath("//div[@class='x-paging-info']"));

        // Get the text from the element
        String actualMessage = message.getText();
        System.out.println(actualMessage);

        // Expected Text
        String expectedMessage = "No records to display";

        // Verify using assert
        Assert.assertEquals(actualMessage, expectedMessage);

        // Close the browser Window
        driver.close();

    }

}
