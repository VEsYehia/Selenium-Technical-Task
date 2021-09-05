Feature: User Registration functionality
 I want to check create new account successfully and if email regester before
  
@Run
  @HappyTest
  Scenario Outline:  user can create new account successfully
  
    Given user press on signin icon and be on Authentication Page
    When user fill required registeration data "<email>"and click on create account
    And  enter "<firstName>" , "<lastName>" , "<password>" ,"<address>" , "<city>" ,"<state>" ,"<postalCode>" ,"<mobilePhone>" ,"<addressAlias>"
   Then  user account page is displayed succesfully

    Examples: 
      | firstName | lastName  | email                | password  | address          | city  | state   | postalCode     | mobilePhone | addressAlias       |
      | Esraa     | Yehia     | tes1234@gmail.com    |   1234567 | first 6th Street | Miami | Florida |      33129     |  3057248697 | Ocean Drive street |

@Run      
      @SadTest
  Scenario Outline: User create new account with email already registered
   
    Given user press on signin icon and be on Authentication Page
    When  user fill required registeration data "<email>"and click on create account
    Then  this email address has already been registered so appear "<ErrorMessage>"

    Examples: 
        | email               | ErrorMessage                                                       |
        | tes1234@gmail.com    |  An account using this email address has already been registered  |
       # | tes123@gmail.com    |  An account using this email address has already been registered  |
      