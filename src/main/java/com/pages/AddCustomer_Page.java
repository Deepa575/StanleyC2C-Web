package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AddCustomer_Page {

    private WebDriver driver;


    private By customerModule_link = By.xpath("//a[text()='Customers']");
    private By addCustomer_btn = By.xpath("//button[text()=' Add Customer ']");
    private By customerName_txt = By.name("name");
    private By customerEmail_txt = By.name("email");
    private By primaryContactNumber_int = By.xpath("//strong[text()='Primary Contact Number']//parent::label//following-sibling::div//input");
    private By secondaryContactNumber_int = By.xpath("//strong[text()='Secondary Contact Number']//parent::label//following-sibling::div//input");
    private By communicationAddress_txt = By.name("com_address");
    private By billingAddress_txt = By.name("billing_address");
    private By cancel_btn = By.xpath("//button[text()='Cancel ']");
    private By submit_btn = By.xpath("//button[text()=' Submit ']");
    private By message_toaster = By.xpath("//*[@id=\"toast-container\"]/div/div");

    private By errorMessage = By.xpath("//div[@id='toast-container']//div//div");

    String submitbtn = null;

    public AddCustomer_Page(WebDriver driver) {
        this.driver = driver;
    }


    public void clickOnCustomerModule() throws InterruptedException {

        driver.findElement(customerModule_link).click();

    }

    public void clickOnAddCustomerButton() {

        driver.findElement(addCustomer_btn).click();
    }

    public void enterCustomerDetails(String customerName, String customerEmailId, String primaryContactNumber,
                                     String secondaryContactNumber, String communicationAddress, String billingAddress) {
        driver.findElement(customerName_txt).sendKeys(customerName);
        driver.findElement(customerEmail_txt).sendKeys(customerEmailId);
        driver.findElement(primaryContactNumber_int).sendKeys(primaryContactNumber);
        driver.findElement(secondaryContactNumber_int).sendKeys(secondaryContactNumber);
        driver.findElement(communicationAddress_txt).sendKeys(communicationAddress);
        driver.findElement(billingAddress_txt).sendKeys(billingAddress);
    }

    public void clickOnCancelbtn() {
        driver.findElement(cancel_btn).click();
    }

    public void clickOnSubmitbtn() throws InterruptedException {
        if (driver.findElement(submit_btn).isEnabled()) {
            driver.findElement(submit_btn).click();
            submitbtn = "Enabled";
        } else
            submitbtn = "Disabled";
    }

    public void VerifyExpectedMessage(String expectedMessage, String status) {

        if ("Created".equals(status) && "Enabled".equals(submitbtn)) {
            String successfullMessage = driver.findElement(message_toaster).getText();
            Assert.assertEquals(expectedMessage, successfullMessage);
            System.out.println(successfullMessage);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        } else if ("Failed".equals(status) && "Enabled".equals(submitbtn)) {
            String errorMessageMessage = driver.findElement(errorMessage).getText();
            Assert.assertEquals(errorMessageMessage, expectedMessage);
            System.out.println(errorMessageMessage);
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        } else if ("Disabled".equals(submitbtn)) {
            System.out.println("Else IF 2");
            Assert.assertEquals(submitbtn, "Disabled");
            System.out.println("Please Eneter Mandatory Fields");
        }
    }
}
