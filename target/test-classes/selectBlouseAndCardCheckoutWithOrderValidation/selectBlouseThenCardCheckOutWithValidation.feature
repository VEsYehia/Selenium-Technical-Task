Feature: Cart checkout functionality

  I want to check that registered user can checkout orders successfully with select payment option
    @Run
    @HappyTest
  Scenario Outline: Order Checkout after login with registerd credentials
  
    Given  user press on signin icon and be on Authentication Page 
    And user login with his registerd credentials "<email>","<password>"
    When user select "<item>" to buy with specific criteria "<size>" and "<colour>"
    And user proceed to checkout with specific "<paymentMethod>"
    Then order placed successfully and shown in order history Tab

    Examples: 
      | email                | password  |   item   | size | colour | paymentMethod    |
      | tes123@gmail.com    |   1234567 |  Blouse  | L    | white  | Pay by bank wire |

      @Run
      @HappyTest
      
      Scenario Outline: open site to make Order Checkout then ask you to login
    Given  after user open site to buy clothes
    When user select "<item>" to buy with specific criteria "<size>" and "<colour>"
     And user proceed to checkout and login with his registerd credentials "<email>","<password>"
     And user proceed to checkout after sign in  with specific "<paymentMethod>"
    Then order placed successfully and shown in order history Tab

    Examples: 
      | email                | password  |   item    | size | colour | paymentMethod    |
      | test998@gmail.com    |   123456  |   Blouse  | L    | white   | Pay by bank wire |
      