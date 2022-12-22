package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddUser_Page {
    private WebDriver driver;

    private By userMGMT = By.xpath("//button[text()=' User Management ']");
    private By users_link = By.xpath("//a[text()=' Users']");
    private By addUser_btn = By.xpath("//button[text()=' Add User ']");
    private By email_txt = By.xpath("//input[@placeholder='Email']");
    private By firstName_txt = By.name("firstName");
    private By lastName_txt = By.name("lastName");
    private By phone_txt = By.id("phone");
    private By userName_txt = By.xpath("//input[@placeholder='Enter User Name']");
    private By customersList_select = By.id("customers");
    private By add_btn = By.xpath("//button[text()='Add']");

    public AddUser_Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnUserMGMT() {
        driver.findElement(userMGMT).click();
    }

    public void clickOnUsermodule() {
        driver.findElement(users_link).click();
    }

    public void clickOnAddUserBtn() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(addUser_btn).click();
    }
    public void enterUserDetails(String emailId, String firstName, String lastname, String phoneNumber, String userName,
                                 String customerName) {
        driver.findElement(email_txt).sendKeys(emailId);
        driver.findElement(firstName_txt).sendKeys(firstName);
        driver.findElement(lastName_txt).sendKeys(lastname);
        driver.findElement(phone_txt).sendKeys(phoneNumber);
        driver.findElement(userName_txt).sendKeys(userName);
        driver.findElement(customersList_select).click();
        driver.findElement(By.xpath("//option[text()='"+customerName+"']")).click();
        driver.findElement(userName_txt).click();

    }

    public void clickOnAddButton(){

        if(driver.findElement(add_btn).isEnabled()){
            driver.findElement(add_btn).click();
        }else {
            System.out.println("Disabled");
        }

    }

}
