#Autor: María Camila Forero Sánchez
@stories
Feature: uTestcom registration
  As a user, I want to automate the registering process at uTestcom filling the form
  @scenario1
  Scenario: Register as a new user
    Given that Hugo wants to create a new user at uTest
    When he selects the Join Today button on the uTest webpage
    Then he fills the new user creation form
      | strFirstName | strLastName | strEmail | strBirthMonth | intBirthDay | intYear | strLanguage|
      | Camila | Forero | cforerosmaria@gmail.com | January | 15 | 1996 | English |