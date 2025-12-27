Feature: Login page validation
  Scenario: Login page validation 
    Given User launches the app "https://parabank.parasoft.com/parabank/index.html"
    When User enters credentials 
      | vinoth6 | vinoth321 |
    And Clicks on login button
    Then User should succesfully logged in to the application 