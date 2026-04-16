package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadStepDefinitions extends BaseClass {

    @When("Click on the Crmsfa link")
    public void clickCrmsfa(){
    driver.findElement(By.partialLinkText("CRM")).click();
    }
@And("Click on the Leads link")
   public void clickLeadsLink(){
    driver.findElement(By.linkText("Leads")).click();
     }

     @And("Click on the CreateLead link")
    public void createLeadLink(){
    driver.findElement(By.linkText("Create Lead")).click();
    }

    @And("Enter the Companyname as (.*)$")
    public void enterCompanyName(String companyName){
     driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
    }

    @And("Enter the Firstname as (.*)$")
    public void enterFirstName(String firstName){
    driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
    }

    @And("Enter the Lastname as (.*)$")
    public void enterLastName(String lastName){
    driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
    }

    @And("Click on the CreateLead button")
    public void clickCreateLeadButton(){
driver.findElement(By.name("submitButton")).click();

    }
@Then("Lead should be creates")
    public void verifyLeadCreation(){
System.out.println("Lead is Created");

    }

}
