@login
Feature: As a user I should be able to add link in message


  Scenario: User should be able to add link in the message
    Given the user logged in as "<userType>"
    Given the user logged in with username as "User1" and password as "UserUser123"

    Given the user is on the login page
    When user clicks the message section
    Then user should be able to click the link button
    And user should be able to fill "text" and "link" section
    And user should be able to click save button
    And user clicks send button


    Scenario: Verify that by clicking on the link the user can navigate to the correct URL
      Given clicks the "text"
      Then user should navigate to the correct "link"


      Scenario: Verify that the link is opened in a new tab.
       // Given clicks the "text"
        Then user should navigate to the correct "link" in a new tap
