package com.ebay.pages;

import configuration.common.WebTestBase;
import configuration.utilities.DataReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static com.ebay.pageElement.EbayHomePageElements.*;
import static configuration.common.GlobalReUsableMethods.*;

import static configuration.utilities.DataDriven.getItemsListFromDB;


public class EbayHomePage extends WebTestBase {

    public static DataReader excelReader = new DataReader();


    // Modern Approach: @FindBy
    @FindBy(xpath = ebaySearchBoxWebElement)
    public WebElement ebaySearchBox;
    @FindBy(xpath = ebaySearchButtonWebElement)
    public WebElement ebaySearchButton;


    public void checkSearchBoxWithValidProducts(String productName) throws InterruptedException {
        enterValueOnElement(ebaySearchBox, productName);
        waitFor(3);
        clickOnElement(ebaySearchButton);
    }

    public static List<String> getItemsListFromExcel() throws Exception, IOException, SQLException, ClassNotFoundException {
        String path = "DataTest/AutomationAmazonTest.xlsx";
        String[] myStringArray = excelReader.fileReader2(path, 0);
        for (int i = 1; i < myStringArray.length; i++)
            System.out.println(myStringArray[i] + " ");
        ArrayList<String> list = new ArrayList<String>();

        // Using add() method to add elements in array_list
        //System.out.println();
        for (int i = 0; i < myStringArray.length; i++) {
            list.add(myStringArray[i]);
            //System.out.print(list.get(i+1) + " ");
        }
        return list;
    }

    public void inputProductItemSearchBoxFromExcel() throws Exception {
        for (int i = 0; i < getItemsListFromExcel().size() - 1; i++) {
            ebaySearchBox.clear();
            waitFor(5);
            ebaySearchBox.sendKeys(getItemsListFromExcel().get(i + 1));
            waitFor(5);
            ebaySearchButton.click();
        }

    }

    // Data driven approach from Database
    public void searchProductUsingValidProductName3() throws Exception {
        for (String st : getItemsListFromDB()) {
            ebaySearchBox.clear();
            ebaySearchBox.sendKeys(st);
            ebaySearchButton.click();
//            String expectedProductName = "\"" + st + "\"";
//            String actualProductName = driver.findElement(By.xpath(verifySearchedProductWebElement)).getText();
//            Assert.assertEquals(actualProductName, expectedProductName, "Product name doest match");
        }
    }

}
