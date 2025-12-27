Feature: To signup for a new user account 
  Scenario Outline: Signup for new user account 
    Given User launches the appliaction "https://parabank.parasoft.com/parabank/index.html"
    When User clicks on Register link 
    Then User will get the registration window on same page
    When User enters firstName as "<FirstName>" and lastName as "<LastName>"
    And User enters address as "<Address>" and city as "<City>" and state as "<State>"
    And User enters zip code as "<ZipCode>" and phone number as "<PhoneNumber>" and ssn as "<SSN>"
    And User enters userName as "<UserName>" and password as "<Password>" and confirms password as "<ConfirmPassword>"
    And Clicks on register button
    Then User will get successful registration message.
    And User clicks on logout button 
    And User closes the application
    
  Examples:
  | FirstName | LastName | Address | City   | State       | ZipCode |PhoneNumber |  SSN     | UserName | Password  | ConfirmPassword |
  | Vinoth    | R        |   ABC   | Mumbai | Maharashtra | 400069  | 123456789  | 11223344 | vinoth6  | vinoth321 |    vinoth321    | 
  | Anand     | A        |   ABC   | Nagpur | Maharashtra | 440002  | 987654321  | 99887755 | anand6   | anand321  |    anand321     | 
