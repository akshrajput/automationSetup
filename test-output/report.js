$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Fetures/login.feature");
formatter.feature({
  "name": "Login",
  "description": "  Prerequisite: User have access",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Log in to Verizon site",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "User  open the browser \u003cbrowser\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "I enters the URL \u003curl\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "Enter MDN as \" \" and password as\"\"",
  "keyword": "And "
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "name": "IHompage should display welcome sign",
  "keyword": "Then "
});
formatter.step({
  "name": "close the browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "browser",
        "url"
      ]
    },
    {
      "cells": [
        "Chrome",
        "vzw.com"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Log in to Verizon site",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "User  open the browser Chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "login.user_open_the_browser_Chrome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enters the URL vzw.com",
  "keyword": "When "
});
formatter.match({
  "location": "login.i_enters_the_URL_vzw_com()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter MDN as \" \" and password as\"\"",
  "keyword": "And "
});
formatter.match({
  "location": "login.enter_MDN_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "login.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "IHompage should display welcome sign",
  "keyword": "Then "
});
formatter.match({
  "location": "login.ihompage_should_display_welcome_sign()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "login.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});