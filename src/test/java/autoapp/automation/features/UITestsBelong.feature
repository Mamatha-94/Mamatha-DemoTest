Feature: UITests Belong scenarios
 

  @invalidEmailValidation
  Scenario: Email Address validation for Registration Page
    Given User launch the "automation practice" application url
    When User clicks on "sign in" link
    And User enters the "abc" text
 		Then User clicks on create an account button
    And User validates the "Invalid email address." message

  
 @megaMenuValidation
  Scenario: Mega menu validation for Home Page
    Given User launch the "automation practice" application url
    When User mouseHover on "Dresses" link
 		And User validates the Summer Dresses page
  
  @summerDressItemValidation
  Scenario: User validates the cart summary
    Given User launch the "automation practice" application url
    When User clicks on "Summer Dresses" link
 		Then User select a dress
 		And User will change the color of dress 
 		And User will add the item to cart
 		Then User validates the cart summary
 		
 #Due to time constraint the "User validates the cart summary" is not implemented
 #We can get the text from UI and add them into Hash Map 
 #and add the blue dress to cart
 #In cart summary page again we can get text from UI and add to another hash map
 #we can compare maps to see if the data is same/not		
 		
 		