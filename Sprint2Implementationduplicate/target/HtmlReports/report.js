$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:///C:/Users/ADARSHJH/eclipse-workspace/Sprint2Implementation/src/test/resources/Features/tc01.feature");
formatter.feature({
  "name": "Test Login Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check login is successful with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "browser is open",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.tc01loginSteps.browser_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.tc01loginSteps.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters email and password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.tc01loginSteps.user_enters_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is navigated to the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.tc01loginSteps.user_is_navigated_to_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "check login is unsuccessful with taking email blank",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "page is loaded",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.tc02loginSteps.page_is_loaded()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.tc02loginSteps.user_enters_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on login",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.tc02loginSteps.clicks_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user  should be displayed a message error \"Login was unsuccessful\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.tc02loginSteps.user_should_be_displayed_a_message_error(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify Password field must not be same as that of e-mail.",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "page is here",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.tc03loginSteps.page_is_here()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter email and password same as email",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.tc03loginSteps.user_enter_email_and_password_same_as_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user  showing \u0027password is not same as e-mail\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.tc03loginSteps.user_showing(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify for valid e-mail and invalid password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "page is there",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.tc04loginSteps.page_is_there()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid email and invalid password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.tc04loginSteps.user_enters_valid_email_and_invalid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should displayed \" The credentials provided are incorrect\" on page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.tc04loginSteps.user_should_displayed_on_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});