@SmokePack
Feature: Book the Flight Ticket
  @OneWayTicket
  Scenario Outline:Verify oneway ticket booking
    Given I am on ClearTrip landing page
    And I should verify one way ticket check box
    And I should enter valid destination"<From>""<TO>"
    And I should enter valid date
    And I select two adult two child one infant
    And I click on more preference's
    And I select first class
    And I select preferred Airline Air India
    When I click on search flights button
    Then I should land on booking page



    Examples:
      |From              |To                |
      |London            |Ahmedabad         |
