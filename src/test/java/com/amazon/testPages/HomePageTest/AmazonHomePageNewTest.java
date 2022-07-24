package com.amazon.testPages.HomePageTest;

import com.amazon.pages.AmazonHomePageNew;
import configuration.common.WebTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static com.amazon.pageElement.HomePageElements.verifySearchedProductWebElement;

public class AmazonHomePageNewTest extends WebTestBase {
    AmazonHomePageNew homePage2;

    @BeforeMethod
    public void getInit(){
        homePage2= PageFactory.initElements(driver, AmazonHomePageNew.class);
    }



    @Test(enabled = false)
    @Ignore
    public void verifySearchProductUsingValidProductName() {

        homePage2.searchProductUsingValidProductName();

        // Verification method
        String expectedProductName = "\"Hand Sanitizer\"";
        String actualProductName = driver.findElement(By.xpath(verifySearchedProductWebElement)).getText();
        Assert.assertEquals(actualProductName, expectedProductName, "Product name doest match");

    }


    @Test
    public void verifySearchProductUsingValidProductName1() {
        // Action method
        homePage2.searchProductUsingValidProductName();

        // Verification method
        String expectedProductName = "\"Hand Sanitizer\"";
        String actualProductName = driver.findElement(By.xpath(verifySearchedProductWebElement)).getText();
        Assert.assertEquals(actualProductName, expectedProductName, "Product name doest match");

    }

    @Test @Ignore
    public void verifySearchProductUsingValidProductName7() {
        // Action method
        homePage2.searchProductUsingValidProductName();

        // Verification method
        String expectedProductName = "\"Hand Sanitizer1\"";
        String actualProductName = driver.findElement(By.xpath(verifySearchedProductWebElement)).getText();
        Assert.assertEquals(actualProductName, expectedProductName, "Product name doest match");

    }
  @Test @Ignore
    public void verifySearchProductUsingValidProductNameFromDirectArray() throws InterruptedException {
        // Action method
        homePage2.searchProductUsingValidProductName1();
    }
    @Test @Ignore
    public void verifySearchProductUsingValidProductNameFromExcel() throws Exception {
        // Action method
        homePage2.searchProductUsingValidProductName2();
    }
    @Test(dataProvider="RegistrationDataFromExcel") @Ignore
    public void verifySearchProductUsingValidProductNameFromDataProvider() throws Exception {
        // Action method
        homePage2.searchProductUsingValidProductName4();
    }



}
