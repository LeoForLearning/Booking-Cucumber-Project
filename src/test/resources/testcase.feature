@flightbooking @BAT
Feature: Validate user is able to book a flight in the production

  
  Scenario Outline: Title of your scenario
    Given I launch browser "chrome"
    And   I navigate to "https://blazedemo.com/" application
    When  I am on landing page I select <Deperature> for the departure airport
    And   I am on landing page I select <Destination> for the destination airport
    And   I am on landing page I click on Find Flights button
    And   I select on flgihts by clicking on Choose the Flight button
    And   I Enter the all the fields to purchase the ticket 
    And   I Click on Purchase Flight
    Then  I validate ticket is purchased by validation text "Thank you for your purchase today!"
    And   flight confirmation number is generated 
    
    Examples: 
      | Deperature   | Destination |
      | Boston       | Rome        |
      | Paris        | London      |
      | Mexico City  | Dublin      |
    
