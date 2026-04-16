package testNG.testcases.homeassignment6;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testNG.testcases.ReadExcel;

public class LegalEntityDynamicParametrization extends ProjectSpecificMethod {

     @DataProvider(name="fetchData")
    public String[][] sendData() throws IOException{
        String[][] data = ReadExcel.readData();      
        return data;
    }

    @Test(dataProvider="fetchData")
    public void createNewLegalEntity(String name, String companyName){

        // Enter the Company name as 'TestLeaf'.
        driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("'Salesforce Automation by "+name);

        // Enter the Company name as 'TestLeaf'.
        driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys(companyName);

        // Click on Save
        driver.findElement(By.xpath("//button[text()='Save']")).click();

    }

}
