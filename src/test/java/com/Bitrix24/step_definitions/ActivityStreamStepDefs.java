package com.Bitrix24.step_definitions;

import com.Bitrix24.pages.ActivityStream;
import com.Bitrix24.utilities.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;


public class ActivityStreamStepDefs extends ActivityStream {
protected WebDriver driver;


    @Given("I login as a user")
    public void i_login_as_a_user() {

        Driver.get().get(ConfigurationReader.get("url"));



        //send username and password ans clicking "login button:
        driver.manage().window().maximize();
        String usenameMarketing = ConfigurationReader.get("marketing__username");
        String passwordSales = ConfigurationReader.get("marketing_password");
        loginBar.sendKeys(usenameMarketing);
        passwordBar.sendKeys(passwordSales);

        BrowserUtils.waitFor(2);
        loginButton.click();
    }

    @When("I am on the {string}")
    public void i_am_on_the(String module) {
        homeToolBar("Task").click();
    }

    @Then("I should be able to create a  new task")
    public void i_should_be_able_to_create_a_new_task() {

    }

}
