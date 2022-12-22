package stepdefinitions;

import com.driver.WebdriverIntializer;
import com.pages.AddCustomer_Page;
import com.pages.AddUser_Page;

import com.pages.Login_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddCustomer_Steps {
    private AddCustomer_Page addCustomer = new AddCustomer_Page(WebdriverIntializer.getDriver());
    private Login_Page lgn = new Login_Page(WebdriverIntializer.getDriver());
    private AddUser_Page addUser = new AddUser_Page(WebdriverIntializer.getDriver());


    @Given("Click On UserMgmt")
    public void click_On_UserMgmt(){
        lgn.enterUsername("superadmin");
        lgn.enterPassword("Stanley@123");
        lgn.clickOnSignin();
        addUser.clickOnUserMGMT();
    }

    @When("Click On CustomerModule")
    public void click_On_CustomerModule() throws InterruptedException {
        addCustomer.clickOnCustomerModule();
    }

    @And("Click On Add Customer Button")
    public void click_On_Add_Customer_Button(){
        addCustomer.clickOnAddCustomerButton();
    }

    @And("Enter Details Into Customer Form {string} {string} {string} {string} {string} {string}")
    public void enterCustomerDetails(String customerName, String customerEmailId, String primaryContactNumber,
                                     String secondaryContactNumber, String communicationAddress, String billingAddress){
        addCustomer.enterCustomerDetails(customerName, customerEmailId, primaryContactNumber,
                 secondaryContactNumber, communicationAddress, billingAddress );
    }
    @And("Click On Submit Button")
    public void click_On_Submit_Button() throws InterruptedException {
        addCustomer.clickOnSubmitbtn();
    }

    @Then("Verify the Customer Created or Not {string} {string}")
    public void verify_Customer_Craetion(String expectedMessage, String status) throws InterruptedException {
        addCustomer.VerifyExpectedMessage(expectedMessage, status);
    }
}
