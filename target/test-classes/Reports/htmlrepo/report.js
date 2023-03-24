$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/login.feature");
formatter.feature({
  "name": "To Validate the login functionality of FB Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To validate the login with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The user should be in fb page",
  "keyword": "Given "
});
formatter.step({
  "name": "The user should enter the \"\u003cusnam\u003e\" and \"\u003cpase\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "The user should click the login button",
  "keyword": "And "
});
formatter.step({
  "name": "The user in invalid page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "usnam",
        "pase"
      ]
    },
    {
      "cells": [
        "vinith",
        "ngfre"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To validate the login with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user should be in fb page",
  "keyword": "Given "
});
formatter.match({
  "location": "Adactin.the_user_should_be_in_fb_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should enter the \"vinith\" and \"ngfre\"",
  "keyword": "When "
});
formatter.match({
  "location": "Adactin.the_user_should_enter_the_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Adactin.the_user_should_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user in invalid page",
  "keyword": "Then "
});
formatter.match({
  "location": "Adactin.the_user_in_invalid_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the registration",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user should be in fb page",
  "keyword": "Given "
});
formatter.match({
  "location": "Adactin.the_user_should_be_in_fb_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should click the register button",
  "keyword": "And "
});
formatter.match({
  "location": "Adactin.the_user_should_click_the_register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should enter the frstnam and lstnam",
  "keyword": "When "
});
formatter.match({
  "location": "Adactin.the_user_should_enter_the_frstnam_and_lstnam()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should click the signup button",
  "keyword": "And "
});
formatter.match({
  "location": "Adactin.the_user_should_click_the_signup_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user in valid page",
  "keyword": "Then "
});
formatter.match({
  "location": "Adactin.the_user_in_valid_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});