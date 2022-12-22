package stepdefinitions;

import com.driver.WebdriverIntializer;
import com.pages.AddUser_Page;
import com.pages.Login_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddUser_Steps {

    private AddUser_Page addUser = new AddUser_Page(WebdriverIntializer.getDriver());
    private Login_Page lgn = new Login_Page(WebdriverIntializer.getDriver());

    @Given("Click On User Management")
    public void click_On_User_Management() {
        lgn.enterUsername("superadmin");
        lgn.enterPassword("stanley@123");
        lgn.clickOnSignin();
        addUser.clickOnUserMGMT();
    }

    @When("Click On User Module")
    public void click_On_UserModule() {
        addUser.clickOnUsermodule();
    }

    @And("Click On Add User Button")
    public void click_On_Add_User_Button() throws InterruptedException {
        addUser.clickOnAddUserBtn();
    }

    @And("Enter User Details {string} {string} {string} {string} {string} {string}")
    public void enter_UserDetails(String emailId, String firstName, String lastName, String phoneNumber, String userName, String customerName) {
        addUser.enterUserDetails(emailId, firstName, lastName, phoneNumber, userName, customerName);
    }

    @Then("Click On Add Button")
    public void click_On_Add_Button() {
        addUser.clickOnAddButton();
    }
}
