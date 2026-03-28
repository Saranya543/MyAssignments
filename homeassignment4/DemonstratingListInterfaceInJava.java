package org.testleaf.week4.homeassignment4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemonstratingListInterfaceInJava {
    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();

        // Navigate to amazon.in
        driver.get("https://www.amazon.in/");

        // Maximize the window and add implicit wait
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        // Search phones in the search field
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
        driver.findElement(By.id("nav-search-submit-button")).click();

        // Find the lowest price from the list of phones
        // Writing common locator / xpath matching all the phone price in the page and
        // get into List<Element>

        List<WebElement> allPhonePrices = driver.findElements(By.className("a-price-whole"));
        int size = allPhonePrices.size();

        // Create new list to store the price values
        List<Integer> priceList = new ArrayList<>();

        // Iterate the list of webelemnts and get the price values and store as int
        // values in list priceList
        for (int i = 0; i < size; i++) {
            try {
                String price = allPhonePrices.get(i).getText().replace(",", "");
                int priceValue = Integer.parseInt(price);
                priceList.add(priceValue);
            } catch (NumberFormatException e) {

            }

        }
        //Sort the List
        Collections.sort(priceList);
        System.out.println(priceList);

        //Get the first value in the least which is the least price
        Integer lowestPrice = priceList.get(0);
        System.out.println("LowestPrice in the list is :" + lowestPrice);
        driver.close();

    }

}
