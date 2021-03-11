$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/AnotherLogin.feature");
formatter.feature({
  "line": 1,
  "name": "Validate Login Functionality",
  "description": "",
  "id": "validate-login-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "",
  "description": "",
  "id": "validate-login-functionality;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@BankAccountlogin"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User enters the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User clicks on login button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User should be able to see the dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User clicks on bank and cash",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User clicks on new account",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User fill up the form entering \"\u003caccountTitle\u003e\"and \"\u003cdescription\u003e\"and \"\u003cinitialBalance\u003e\"and \"\u003caccountNumber\u003e\"and \"\u003ccontactPerson\u003e\"and \"\u003cphone\u003e\"and \"\u003cinternetBankingUrl\u003e\" and clicks on submit",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User should be able to see validate",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "validate-login-functionality;;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "accountTitle",
        "description",
        "initialBalance",
        "accountNumber",
        "contactPerson",
        "phone",
        "internetBankingUrl"
      ],
      "line": 17,
      "id": "validate-login-functionality;;;1"
    },
    {
      "cells": [
        "demo@techfios.com",
        "abc123",
        "Testing",
        "Saving",
        "500",
        "23232322",
        "rewwrde",
        "345333",
        "WWW.BOFA.COM"
      ],
      "line": 18,
      "id": "validate-login-functionality;;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4797319200,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is on the Techfios LoginPage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.User_is_on_the_Techfios_LoginPage()"
});
formatter.result({
  "duration": 1476522000,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "",
  "description": "",
  "id": "validate-login-functionality;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@BankAccountlogin"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User enters the \"demo@techfios.com\" and \"abc123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User clicks on login button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User should be able to see the dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User clicks on bank and cash",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User clicks on new account",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User fill up the form entering \"Testing\"and \"Saving\"and \"500\"and \"23232322\"and \"rewwrde\"and \"345333\"and \"WWW.BOFA.COM\" and clicks on submit",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6,
    7,
    8
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User should be able to see validate",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 17
    },
    {
      "val": "abc123",
      "offset": 41
    }
  ],
  "location": "StepDefination.user_enters_the_and(String,String)"
});
formatter.result({
  "duration": 429721800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 1021606900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_should_be_able_to_see_the_dashboard()"
});
formatter.result({
  "duration": 73601500,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003c[Dashboard]- iBilling\u003e but was:\u003c[Login ]- iBilling\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat steps.StepDefination.user_should_be_able_to_see_the_dashboard(StepDefination.java:47)\r\n\tat ✽.Then User should be able to see the dashboard(features/AnotherLogin.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefination.user_clicks_on_bank_and_cash()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefination.user_clicks_on_new_account()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Testing",
      "offset": 32
    },
    {
      "val": "Saving",
      "offset": 45
    },
    {
      "val": "500",
      "offset": 57
    },
    {
      "val": "23232322",
      "offset": 66
    },
    {
      "val": "rewwrde",
      "offset": 80
    },
    {
      "val": "345333",
      "offset": 93
    },
    {
      "val": "WWW.BOFA.COM",
      "offset": 105
    }
  ],
  "location": "StepDefination.user_fill_up_the_form_entering_and_and_and_and_and_and_and_clicks_on_submit(String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefination.user_should_be_able_to_see_validate()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1932612500,
  "status": "passed"
});
});