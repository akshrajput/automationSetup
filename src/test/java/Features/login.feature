#Author: Ashish Singh
#Keywords Summary : Login Practice

@Login
Feature: Login
  Prerequisite: User have access

  @tag1
  Scenario Outline: Log in to Verizon site
    Given User  open the browser <browser>
    When I enters the URL <url>
    And Enter MDN as " " and password as""
    And click on login button
    Then IHompage should display welcome sign
    And close the browser


Examples:
|browser|url| 
|Chrome |vzw.com|
  
  
  

