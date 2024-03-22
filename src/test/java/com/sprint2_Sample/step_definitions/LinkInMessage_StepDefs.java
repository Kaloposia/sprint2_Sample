package com.sprint2_Sample.step_definitions;

import com.sprint2_Sample.pages.MessagePage;
import com.sprint2_Sample.utilities.ConfigurationReader;
import com.sprint2_Sample.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LinkInMessage_StepDefs {

    MessagePage messagePage = new MessagePage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    @When("user clicks the message section")
    public void user_clicks_the_message_section() {

        messagePage.messageClick.click();

    }

    @Then("user should be able to click the link button")
    public void user_should_be_able_to_click_the_link_button() {
        messagePage.linkButton.click();
    }

    @Then("user should be able to fill {string} and {string} section")
    public void user_should_be_able_to_fill_and_section(String text, String link) {
        messagePage.text.sendKeys(ConfigurationReader.getProperty("text"));
        messagePage.link.sendKeys(ConfigurationReader.getProperty("link"));

    }

    @Then("user should be able to click save button")
    public void user_should_be_able_to_click_save_button() {
        messagePage.saveBtn.click();
    }


    @And("user clicks send button")
    public void userClicksSendButton() {
        messagePage.sendBtn.click();
    }

    @Given("clicks the {string}")
    public void clicks_the(String string) {
        messagePage.linkText.click();
    }

}