package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.CityPairPage;
import pageObjects.ConfirmationPage;
import pageObjects.FlightsPage;
import pageObjects.PassengerDetailsPage;

public class StepDefinition {

	CityPairPage citypairpage = new CityPairPage();
	FlightsPage flightspage = new FlightsPage();
	PassengerDetailsPage passengerdetailspage = new PassengerDetailsPage();
	ConfirmationPage confirmationpage = new ConfirmationPage();

	@Given("I launch browser {string}")
	public void i_launch_browser(String browser) {

		citypairpage.startApplication(browser);

	}

	@Given("I navigate to {string} application")
	public void i_navigate_to_application(String applicationUrl) {

		citypairpage.enterUrl(applicationUrl);

	}

	@When("I am on landing page I select {string} for the departure airport")
	public void i_am_on_landing_page_I_select_for_the_departure_airport(String departureCity)
			throws InterruptedException {
		citypairpage.selectDepartureCity(departureCity);

	}

	@When("I am on landing page I select {string} for the destination airport")
	public void i_am_on_landing_page_I_select_for_the_destination_airport(String departureCity) {
		citypairpage.selectDestinationCity(departureCity);
	}

	@When("I am on landing page I click on Find Flights button")
	public void i_am_on_landing_page_I_click_on_Find_Flights_button() {
		citypairpage.clickFindFlights();
	}

	@When("I select on flgihts by clicking on Choose the Flight button")
	public void i_select_on_flgihts_by_clicking_on_Choose_the_Flight_button() {
		flightspage.selectFlight();
	}

	@When("I Enter the all the fields to purchase the ticket")
	public void i_Enter_the_all_the_fields_to_purchase_the_ticket() {
		try {
			passengerdetailspage.enterPassengerDetails();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("I Click on Purchase Flight")
	public void i_Click_on_Purchase_Flight() {
		passengerdetailspage.clickPurchaseNow();

	}

	@Then("I validate ticket is purchased by validation text {string}")
	public void i_validate_ticket_is_purchased_by_validation_text(String text) {
		confirmationpage.validatePurchaseText(text);
	}

	@Then("flight confirmation number is generated")
	public void flight_confirmation_number_is_generated() {

	}

}
