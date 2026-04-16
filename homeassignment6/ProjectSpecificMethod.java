package testNG.testcases.homeassignment6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethod {
    public ChromeDriver driver;

    @Parameters({ "url", "username", "password" })
    //Initializing the driver and login o the salesforce application with username and password
    @BeforeMethod
    public void preConditions(String URL, String uName, String pwd) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--user-data-dir=C:\\SeleniumProfile");
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.get(URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.id("username")).sendKeys(uName);
        driver.findElement(By.id("password")).sendKeys(pwd);
        driver.findElement(By.id("Login")).click();

                // Click on the toggle menu button from left corner
        driver.findElement(By.xpath("//button[@title='App Launcher']")).click();

        // Click View All and click Legal Entities from App Launcher
        driver.findElement(By.xpath("//button[text()='View All']")).click();

        driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Legal Entities");
        driver.findElement(By.xpath("//mark[text()='Legal Entities']")).click();

        // Click on New Legal Entity
        driver.findElement(By.xpath("//div[text()='New']")).click();
    }

    @AfterMethod
    public void postconditions(){
        driver.close();
    }

  

}
