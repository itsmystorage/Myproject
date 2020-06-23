$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resources/BookTicket.feature");
formatter.feature({
  "line": 2,
  "name": "Book the Flight Ticket",
  "description": "",
  "id": "book-the-flight-ticket",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SmokePack"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Verify oneway ticket booking",
  "description": "",
  "id": "book-the-flight-ticket;verify-oneway-ticket-booking",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@OneWayTicket"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on ClearTrip landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I should verify one way ticket check box",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I should enter valid destination\"\u003cFrom\u003e\"\"\u003cTO\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should enter valid date",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I select two adult two child one infant",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on more preference\u0027s",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I select first class",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I select preferred Airline Air India",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on search flights button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I should land on booking page",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "book-the-flight-ticket;verify-oneway-ticket-booking;",
  "rows": [
    {
      "cells": [
        "From",
        "To"
      ],
      "line": 19,
      "id": "book-the-flight-ticket;verify-oneway-ticket-booking;;1"
    },
    {
      "cells": [
        "London",
        "Ahmedabad"
      ],
      "line": 20,
      "id": "book-the-flight-ticket;verify-oneway-ticket-booking;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7932742200,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Verify oneway ticket booking",
  "description": "",
  "id": "book-the-flight-ticket;verify-oneway-ticket-booking;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@OneWayTicket"
    },
    {
      "line": 1,
      "name": "@SmokePack"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on ClearTrip landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I should verify one way ticket check box",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I should enter valid destination\"London\"\"\u003cTO\u003e\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should enter valid date",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I select two adult two child one infant",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on more preference\u0027s",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I select first class",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I select preferred Airline Air India",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on search flights button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I should land on booking page",
  "keyword": "Then "
});
formatter.match({
  "location": "BookTicketStepDefs.i_am_on_ClearTrip_landing_page()"
});
formatter.result({
  "duration": 3917453500,
  "status": "passed"
});
formatter.match({
  "location": "BookTicketStepDefs.i_should_verify_one_way_ticket_check_box()"
});
formatter.result({
  "duration": 127743300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "London",
      "offset": 33
    },
    {
      "val": "\u003cTO\u003e",
      "offset": 41
    }
  ],
  "location": "BookTicketStepDefs.i_should_enter_valid_destination(String,String)"
});
formatter.result({
  "duration": 233779000,
  "status": "passed"
});
formatter.match({
  "location": "BookTicketStepDefs.i_should_enter_valid_date()"
});
formatter.result({
  "duration": 222245400,
  "status": "passed"
});
formatter.match({
  "location": "BookTicketStepDefs.i_select_two_adult_two_child_one_infant()"
});
formatter.result({
  "duration": 440379700,
  "status": "passed"
});
formatter.match({
  "location": "BookTicketStepDefs.i_click_on_more_preference_s()"
});
formatter.result({
  "duration": 75236200,
  "status": "passed"
});
formatter.match({
  "location": "BookTicketStepDefs.i_select_first_class()"
});
formatter.result({
  "duration": 88551600,
  "status": "passed"
});
formatter.match({
  "location": "BookTicketStepDefs.i_select_preferred_Airline_Air_India()"
});
formatter.result({
  "duration": 124775000,
  "status": "passed"
});
formatter.match({
  "location": "BookTicketStepDefs.i_click_on_search_flights_button()"
});
formatter.result({
  "duration": 84596700,
  "status": "passed"
});
formatter.match({
  "location": "BookTicketStepDefs.i_should_land_on_booking_page()"
});
formatter.result({
  "duration": 30000,
  "status": "passed"
});
});