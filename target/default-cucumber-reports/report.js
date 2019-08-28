$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Activity_stream_page_feature.feature");
formatter.feature({
  "name": "Activity stream page options",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User can create a new task by clicking on tasks",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "I login as a user",
  "keyword": "Given "
});
formatter.match({
  "location": "ActivityStreamStepDefs.i_login_as_a_user()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat com.Bitrix24.step_definitions.ActivityStreamStepDefs.i_login_as_a_user(ActivityStreamStepDefs.java:23)\r\n\tat ✽.I login as a user(file:Activity_stream_page_feature.feature:4)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I am on the \"Activity Stream\"",
  "keyword": "When "
});
formatter.match({
  "location": "ActivityStreamStepDefs.i_am_on_the(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I should be able to create a  new task",
  "keyword": "Then "
});
formatter.match({
  "location": "ActivityStreamStepDefs.i_should_be_able_to_create_a_new_task()"
});
formatter.result({
  "status": "skipped"
});
});