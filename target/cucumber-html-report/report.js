$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/CreateNewAccountUser/UserRegisteration.feature");
formatter.feature({
  "line": 1,
  "name": "User Registration functionality",
  "description": "I want to check create new account successfully and if email regester before",
  "id": "user-registration-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "user can create new account successfully",
  "description": "",
  "id": "user-registration-functionality;user-can-create-new-account-successfully",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Run"
    },
    {
      "line": 5,
      "name": "@HappyTest"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user press on signin icon and be on Authentication Page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user fill required registeration data \"\u003cemail\u003e\"and click on create account",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "enter \"\u003cfirstName\u003e\" , \"\u003clastName\u003e\" , \"\u003cpassword\u003e\" ,\"\u003caddress\u003e\" , \"\u003ccity\u003e\" ,\"\u003cstate\u003e\" ,\"\u003cpostalCode\u003e\" ,\"\u003cmobilePhone\u003e\" ,\"\u003caddressAlias\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user account page is displayed succesfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "user-registration-functionality;user-can-create-new-account-successfully;",
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName",
        "email",
        "password",
        "address",
        "city",
        "state",
        "postalCode",
        "mobilePhone",
        "addressAlias"
      ],
      "line": 14,
      "id": "user-registration-functionality;user-can-create-new-account-successfully;;1"
    },
    {
      "cells": [
        "Esraa",
        "Yehia",
        "tes1234@gmail.com",
        "1234567",
        "first 6th Street",
        "Miami",
        "Florida",
        "33129",
        "3057248697",
        "Ocean Drive street"
      ],
      "line": 15,
      "id": "user-registration-functionality;user-can-create-new-account-successfully;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 12728180899,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "user can create new account successfully",
  "description": "",
  "id": "user-registration-functionality;user-can-create-new-account-successfully;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Run"
    },
    {
      "line": 5,
      "name": "@HappyTest"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user press on signin icon and be on Authentication Page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user fill required registeration data \"tes1234@gmail.com\"and click on create account",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "enter \"Esraa\" , \"Yehia\" , \"1234567\" ,\"first 6th Street\" , \"Miami\" ,\"Florida\" ,\"33129\" ,\"3057248697\" ,\"Ocean Drive street\"",
  "matchedColumns": [
    0,
    1,
    3,
    4,
    5,
    6,
    7,
    8,
    9
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user account page is displayed succesfully",
  "keyword": "Then "
});
formatter.match({
  "location": "UserRegestration.user_press_on_signin_icon_and_be_on_Authentication_Page()"
});
formatter.result({
  "duration": 3131134800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tes1234@gmail.com",
      "offset": 39
    }
  ],
  "location": "UserRegestration.user_fill_required_registeration_data_and_click_on_create_account(String)"
});
formatter.result({
  "duration": 462401700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Esraa",
      "offset": 7
    },
    {
      "val": "Yehia",
      "offset": 17
    },
    {
      "val": "1234567",
      "offset": 27
    },
    {
      "val": "first 6th Street",
      "offset": 38
    },
    {
      "val": "Miami",
      "offset": 59
    },
    {
      "val": "Florida",
      "offset": 68
    },
    {
      "val": "33129",
      "offset": 79
    },
    {
      "val": "3057248697",
      "offset": 88
    },
    {
      "val": "Ocean Drive street",
      "offset": 102
    }
  ],
  "location": "UserRegestration.enter(String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 4909975100,
  "status": "passed"
});
formatter.match({
  "location": "UserRegestration.user_account_page_is_displayed_succesfully()"
});
formatter.result({
  "duration": 2588752399,
  "status": "passed"
});
formatter.after({
  "duration": 763675700,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 19,
  "name": "User create new account with email already registered",
  "description": "",
  "id": "user-registration-functionality;user-create-new-account-with-email-already-registered",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 17,
      "name": "@Run"
    },
    {
      "line": 18,
      "name": "@SadTest"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "user press on signin icon and be on Authentication Page",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "user fill required registeration data \"\u003cemail\u003e\"and click on create account",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "this email address has already been registered so appear \"\u003cErrorMessage\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 25,
  "name": "",
  "description": "",
  "id": "user-registration-functionality;user-create-new-account-with-email-already-registered;",
  "rows": [
    {
      "cells": [
        "email",
        "ErrorMessage"
      ],
      "line": 26,
      "id": "user-registration-functionality;user-create-new-account-with-email-already-registered;;1"
    },
    {
      "cells": [
        "tes1234@gmail.com",
        "An account using this email address has already been registered"
      ],
      "line": 27,
      "id": "user-registration-functionality;user-create-new-account-with-email-already-registered;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 10877361800,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "User create new account with email already registered",
  "description": "",
  "id": "user-registration-functionality;user-create-new-account-with-email-already-registered;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 17,
      "name": "@Run"
    },
    {
      "line": 18,
      "name": "@SadTest"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "user press on signin icon and be on Authentication Page",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "user fill required registeration data \"tes1234@gmail.com\"and click on create account",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "this email address has already been registered so appear \"An account using this email address has already been registered\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "UserRegestration.user_press_on_signin_icon_and_be_on_Authentication_Page()"
});
formatter.result({
  "duration": 1902467900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tes1234@gmail.com",
      "offset": 39
    }
  ],
  "location": "UserRegestration.user_fill_required_registeration_data_and_click_on_create_account(String)"
});
formatter.result({
  "duration": 332552000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "An account using this email address has already been registered",
      "offset": 58
    }
  ],
  "location": "UserRegestration.this_email_address_has_already_been_registered_so_appear(String)"
});
formatter.result({
  "duration": 798964300,
  "status": "passed"
});
formatter.after({
  "duration": 812154899,
  "status": "passed"
});
});