Feature: sign in of user
  As a web user
  I want to into in the page TouristApp
  to uses some services

  #First Scenario
  @Successful_signin
    #Title of scenario
  Scenario: Successful sign in
    #Prepositions
    Given Alejo want to sign in his account
    #Actions
    When He fills in the form fields
    #Consequences
    Then He should sees in screen the text of successful sign in