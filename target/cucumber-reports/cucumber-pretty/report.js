$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomeTest.feature");
formatter.feature({
  "line": 2,
  "name": "Automated Home Page ORCHESTRATOR PORTAL",
  "description": "",
  "id": "automated-home-page-orchestrator-portal",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "User verfies the Home Page",
  "description": "",
  "id": "automated-home-page-orchestrator-portal;user-verfies-the-home-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "Login form in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Submit email using \"\u003cemail\u003e\" and password using \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User is able to see all the Logos, Buttons in toolBar menu",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User able to click all the buttons in toolBar menu",
  "keyword": "And "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "automated-home-page-orchestrator-portal;user-verfies-the-home-page;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 12,
      "id": "automated-home-page-orchestrator-portal;user-verfies-the-home-page;;1"
    },
    {
      "cells": [
        "mobius@gaiansolutions.com",
        "Gaian@123"
      ],
      "line": 13,
      "id": "automated-home-page-orchestrator-portal;user-verfies-the-home-page;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 9464213587,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "User verfies the Home Page",
  "description": "",
  "id": "automated-home-page-orchestrator-portal;user-verfies-the-home-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "Login form in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Submit email using \"mobius@gaiansolutions.com\" and password using \"Gaian@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User is able to see all the Logos, Buttons in toolBar menu",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User able to click all the buttons in toolBar menu",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.loginPageIsDisplayed()"
});
formatter.result({
  "duration": 317501074,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mobius@gaiansolutions.com",
      "offset": 20
    },
    {
      "val": "Gaian@123",
      "offset": 67
    }
  ],
  "location": "LoginSteps.submitEmailPassword(String,String)"
});
formatter.result({
  "duration": 535486145,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_is_able_to_see_all_the_Logos_Buttons_in_toolBar_menu()"
});
formatter.result({
  "duration": 3936983649,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_able_to_click_all_the_buttons_in_toolBar_menu()"
});
formatter.result({
  "duration": 1374832653,
  "status": "passed"
});
formatter.after({
  "duration": 127620,
  "status": "passed"
});
formatter.uri("LoginTest.feature");
formatter.feature({
  "line": 1,
  "name": "As a user, I want to Login ORCHESTRATOR PORTAL",
  "description": "",
  "id": "as-a-user,-i-want-to-login-orchestrator-portal",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": ": Successful login using valid account",
  "description": "",
  "id": "as-a-user,-i-want-to-login-orchestrator-portal;:-successful-login-using-valid-account",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@ValidCase"
    },
    {
      "line": 3,
      "name": "@SomeTags"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Login form in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Submit email using \"\u003cemail\u003e\" and password using \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Then User verfiy the Page title",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "as-a-user,-i-want-to-login-orchestrator-portal;:-successful-login-using-valid-account;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 9,
      "id": "as-a-user,-i-want-to-login-orchestrator-portal;:-successful-login-using-valid-account;;1"
    },
    {
      "cells": [
        "mobius@gaiansolutions.com",
        "Gaian@123"
      ],
      "line": 10,
      "id": "as-a-user,-i-want-to-login-orchestrator-portal;:-successful-login-using-valid-account;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 11898031697,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": ": Successful login using valid account",
  "description": "",
  "id": "as-a-user,-i-want-to-login-orchestrator-portal;:-successful-login-using-valid-account;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SomeTags"
    },
    {
      "line": 3,
      "name": "@ValidCase"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Login form in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Submit email using \"mobius@gaiansolutions.com\" and password using \"Gaian@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Then User verfiy the Page title",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.loginPageIsDisplayed()"
});
formatter.result({
  "duration": 110434948,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mobius@gaiansolutions.com",
      "offset": 20
    },
    {
      "val": "Gaian@123",
      "offset": 67
    }
  ],
  "location": "LoginSteps.submitEmailPassword(String,String)"
});
formatter.result({
  "duration": 544179611,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.then_User_verfiy_the_Page_title()"
});
formatter.result({
  "duration": 14726470,
  "status": "passed"
});
formatter.after({
  "duration": 32726,
  "status": "passed"
});
});