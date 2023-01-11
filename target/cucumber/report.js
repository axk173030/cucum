$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/TechfiosLogin.feature");
formatter.feature({
  "line": 2,
  "name": "Techfios Login functionality validation",
  "description": "",
  "id": "techfios-login-functionality-validation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LoginFeature1"
    },
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "duration": 3399991400,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "user should be able to login with correct credentials",
  "description": "",
  "id": "techfios-login-functionality-validation;user-should-be-able-to-login-with-correct-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Scenario11"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "The user is on Techfios login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "The user enters the username as \"demo@techfios.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "The User enters the password as  \"abc123\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "The user presses the login button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "the user should land on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_Techfios_login_page()"
});
formatter.result({
  "duration": 1154507500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 33
    }
  ],
  "location": "LoginStepDefinition.the_user_enters_the_username_as(String)"
});
formatter.result({
  "duration": 2097582300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 34
    }
  ],
  "location": "LoginStepDefinition.the_User_enters_the_password_as(String)"
});
formatter.result({
  "duration": 2065975000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.the_user_presses_the_login_button()"
});
formatter.result({
  "duration": 2979910800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.the_user_should_land_on_dashboard_page()"
});
formatter.result({
  "duration": 255334800,
  "status": "passed"
});
formatter.after({
  "duration": 791835600,
  "status": "passed"
});
});