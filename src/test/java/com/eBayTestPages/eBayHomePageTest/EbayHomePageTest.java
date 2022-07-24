package com.eBayTestPages.eBayHomePageTest;



import configuration.common.WebTestBase;
import com.ebay.pages.EbayHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class EbayHomePageTest extends WebTestBase {
    EbayHomePage homePage;

    @BeforeMethod
    public void getInit(){
        homePage= PageFactory.initElements(driver, EbayHomePage.class);
    }
    @Test
    public void verifyEbaySearchBox() throws InterruptedException {
        homePage.checkSearchBoxWithValidProducts("Designer Handbags");
        waitFor(3);
//        navigateBack();
//        waitFor(2);
//        navigateForward();
//        waitFor(2);
//        System.out.println("Current URL==========> " + getCurrentUrl());

    }
@Test @Ignore
    public void getDataFromExcelSheet() throws Exception {
    homePage.inputProductItemSearchBoxFromExcel();
}




}
