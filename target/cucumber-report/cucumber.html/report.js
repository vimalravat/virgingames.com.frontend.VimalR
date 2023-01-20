$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("homepage.feature");
formatter.feature({
  "line": 2,
  "name": "Login Test",
  "description": "As user I want to go to homepage of Virgin Games website",
  "id": "login-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9326004300,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User should navigate to login page successfully",
  "description": "",
  "id": "login-test;user-should-navigate-to-login-page-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I accept cookies",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "verify company logo displayed on home page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "click on all games tab on the homepage",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "verify online slots text displayed",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomepage()"
});
formatter.result({
  "duration": 197817000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iAcceptCookies()"
});
formatter.result({
  "duration": 119773200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.verifyCompanyLogoDisplayedOnHomePage()"
});
formatter.result({
  "duration": 72483300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.clickOnAllGamesTabOnTheHomepage()"
});
formatter.result({
  "duration": 147474000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.verifyOnlineSlotsTextDisplayed()"
});
formatter.result({
  "duration": 1627533500,
  "status": "passed"
});
formatter.after({
  "duration": 772398900,
  "status": "passed"
});
});