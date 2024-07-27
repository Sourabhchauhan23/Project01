
Feature: Preparing for Interview in Global Logic.

  Background:
    Given Open "Google" on browser.

  @VerifyCricStats
  Scenario: Verify stats for Lucknow Super Gaints.
    Given ESPNCricInfo is open on web browser.
    When Lucknow Super Gaints score card is present.
    Then Verify Nicholas Pooran has scored 3 sixe's.
    And Verify Marcus Stoinis has scored 4 four's.
    And Verify total score is 163.
    And Verify total wickets are 5.

  @SearchingGoogle
  Scenario: Search yatra on Google and verify in new tab.
    Given User search for "flight delhi to" on google.
    When All the search results appears, select flight for "goa".
    Then Open "Yatra" website in new tab.
#    And Verify "Yatra" is appearing on webpage.
