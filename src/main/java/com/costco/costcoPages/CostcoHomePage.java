package com.costco.costcoPages;

import configuration.common.WebTestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.costco.costoPageElements.CostcoHomePageElements.*;
import static configuration.common.GlobalReUsableMethods.*;

public class CostcoHomePage extends WebTestBase {

    @FindBy(xpath = enterProductNameInSearchBoxFieldWebElement)
    public WebElement enterProductNameInSearchBoxField;
    @FindBy(xpath = clickOnSearchButtonWebElement)
    public WebElement clickOnSearchButton;
    @FindBy(xpath = clickOnPriceDropDownListWebElement)
    public WebElement clickOnPriceDropDownList;
    @FindBy(xpath = selectPrice200_500FromDropDownListWebElement)
    public WebElement selectPrice200_500FromDropDownList;
    @FindBy(xpath = verifyBikeTextWebElement)
    public WebElement verifyBikeText;
    @FindBy(xpath = clearTextFromSearchBoxWebElement)
    public WebElement clearTextFromSearchBox;
    //=======================================================================================================================
//    @FindBy(xpath = hoverMouseOnPhotoWebElement)
//    public WebElement hoverMouseOnPhoto;
    @FindBy(xpath = selectCanvasPrintsWebElement)
    public WebElement selectCanvasPrints;


    public void checkSearchBoxWithValidProducts(String productName) throws InterruptedException {
        // enter, click, verify, clear, navigateBack , navigateForward, getCurrentUrl
        enterValueOnElement(enterProductNameInSearchBoxField, productName);
        waitFor(3);
        clickOnElement(clickOnSearchButton);
        waitFor(3);
//        clickOnElement(clickOnPriceDropDownList);
//        waitFor(5);
//        clickOnElement(selectPrice200_500FromDropDownList);
//        waitFor(5);
//        verifyText(verifyBikeText, "Bike", "text not match");
//        waitFor(3);
//        clearField(clearTextFromSearchBox);
//        navigateBack();
//        waitFor(2);
//        navigateForward();
//        waitFor(5);
//        System.out.println("Current URL: " + getCurrentUrl());
    }


//=======================================================================================================================

    public void checkPhotoWebElementOnCostcoHomePage() throws InterruptedException {
//
//        mouseHoverByWebElement("//a[@id='Home_Ancillary_7']");
//        waitFor(10);
//        clickById(selectCanvasPrints);

    }


}
