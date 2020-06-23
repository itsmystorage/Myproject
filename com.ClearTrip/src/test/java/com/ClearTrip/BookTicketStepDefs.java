package com.ClearTrip;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookTicketStepDefs extends BaseMain{

BookTicket BT = new BookTicket();


    @Given("^I am on ClearTrip landing page$")
    public void i_am_on_ClearTrip_landing_page()  {
BT.Naviage();
    }

    @Given("^I should verify one way ticket check box$")
    public void i_should_verify_one_way_ticket_check_box(){
BT.Verify_checkbox();
    }

    @Given("^I should enter valid destination\"([^\"]*)\"\"([^\"]*)\"$")
    public void i_should_enter_valid_destination(String arg1, String arg2){
BT.EnterDestination();
    }

    @Given("^I should enter valid date$")
    public void i_should_enter_valid_date()  {
BT.EnterDate();
    }

    @Given("^I select two adult two child one infant$")
    public void i_select_two_adult_two_child_one_infant() {
BT.AddPeople();
    }

    @Given("^I click on more preference's$")
    public void i_click_on_more_preference_s(){
BT.GiveRefrence();
    }

    @Given("^I select first class$")
    public void i_select_first_class()  {
BT.SelectEconomy();
    }

    @Given("^I select preferred Airline Air India$")
    public void i_select_preferred_Airline_Air_India()  {
BT.TypeAirline();
    }

    @When("^I click on search flights button$")
    public void i_click_on_search_flights_button()  {
BT.ClickSearchFlight();
    }

    @Then("^I should land on booking page$")
    public void i_should_land_on_booking_page()  {

    }

}
