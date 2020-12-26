$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Featurefile.feature");
formatter.feature({
  "name": "E-commerce Project Web Site Health Check",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@healthcheck"
    }
  ]
});
formatter.scenario({
  "name": "User is able to Open the browser, navigate to the URL and Search for Product",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@healthcheck"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User opened browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefs.user_opened_browser()"
});
formatter.write("user opened browser and maximize the window");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigated to the home application url",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefs.user_navigated_to_the_home_application_url()"
});
formatter.write("user navigated to home page");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Search for product \"Laptop\"",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefs.user_Search_for_product(String)"
});
formatter.write("user search for productLaptop");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search Result page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefs.search_Result_page_is_displayed()"
});
formatter.write("result displayed");
formatter.result({
  "status": "passed"
});
formatter.write("driver close");
formatter.after({
  "status": "passed"
});
});