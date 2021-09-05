Feature: Login Authentication As New User functionality
  I want to check that user can login successfully with registered credentials
@NotRun
  @HappyTest
  Scenario Outline: Login Authentication
  
   Given user press on signin icon and be on Authentication Page
    When user fill required registeration data "<email>"and click on create account
    And  enter "<firstName>" , "<lastName>" , "<password>" ,"<address>" , "<city>" ,"<state>" ,"<postalCode>" ,"<mobilePhone>" ,"<addressAlias>"
    Then  user login with his registerd credentials "<email>","<password>" 
    And  user account page is displayed succesfully

    Examples: 
      | firstName | lastName  | email               | password  | address          | city  | state   | postalCode     | mobilePhone | addressAlias       |
      | Esso    | Yehia       | test998@gmail.com    |   123456 | third 9th Street | Miami | Florida |      33129     |  3057248667 | Ocean street |
  
   @Run
  @SadTest
  Scenario Outline: Login Authentication with wrong password
  
   Given user press on signin icon and be on Authentication Page 
   When  user login with his registerd credentials "<email>","<password>" 
   Then  appear "<errormessage>" as password wrong  

    Examples: 
      | email               | password  |  errormessage     |
      | tes123@gmail.com    |   12345   |Authentication failed.|
  
   @Run
  @SadTest
  Scenario Outline: Login Authentication with missing password
  
   Given user press on signin icon and be on Authentication Page
   When  user login with his registerd credentials "<email>" only
    Then   appear "<errormessage>" as missing password field

    Examples: 
       | email               |errormessage |
       |tes123@gmail.com     |Password is required. |
  
     @Run
  @SadTest
  Scenario Outline: Login Authentication with missing Email address
  
   Given user press on signin icon and be on Authentication Page
   When  user login with his registerd  "<password>" and forget to enter email
   Then  appear "<errormessage>" as missing email field
   

    Examples: 
       | password  | errormessage      |
       |   123456  | An email address required. |
  
   