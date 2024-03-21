package com.sprint2_Sample.step_definitions;

import com.sprint2_Sample.pages.LoginPage;
import com.sprint2_Sample.utilities.ConfigurationReader;
import com.sprint2_Sample.utilities.Driver;
import io.cucumber.java.en.Given;

public class LoginStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String string) {

    }

    LoginPage loginPage = new LoginPage();

    @Given("the user logged in with username as {string} and password as {string}")
    public void the_user_logged_in_with_username_as_and_password_as(String userName, String password) {
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("hr_username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("hr_password"));
        loginPage.submit.click();


    }

}
