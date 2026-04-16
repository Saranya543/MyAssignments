package testNG.testcases.homeassignment6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SalesforceLegalEntity extends ProjectSpecificMethod {
    @Test
    public void createNewLegalEntity() throws InterruptedException {

        // Enter the Company name as 'TestLeaf'.
        driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");

        // Enter Description as 'Salesforces'
        driver.findElement(By.xpath("//label[text()='Description']/following-sibling::div/textarea"))
                .sendKeys("Salesforce");

        // Select Status as 'Active'      
        WebElement statusField = driver.findElement(By.xpath("//label[text()='Status']//following::button[1]"));
        driver.executeScript("arguments[0].scrollIntoView(true);", statusField);
        statusField.click();
        driver.findElement(By.xpath("//span[@class='slds-media__body']/span[text()='Active']")).click();

        // Click on Save
        driver.findElement(By.xpath("//button[text()='Save']")).click();

        // Verify the Alert message displayed for name
        WebElement alert = driver.findElement(
                By.xpath("//header[@class='pageErrorHeader slds-popover__header']//div[@class='slds-media__body']"));
        String alertMessage = alert.getText();
        System.out.println("Alertmessage is : " + alertMessage);

    }

}
