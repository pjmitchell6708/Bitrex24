Feature: Activity stream page options
@login
  Scenario: User can create a new task by clicking on tasks
    Given I login as a user
    When I am on the "Activity Stream"
    Then I should be able to create a  new task


  Scenario: User can upload a file, image, link or add checklist to new task
    Given I login as a user
    When I am on the "Activity Stream"
    Then User should be able to upload a file, image, link or add checklist to new task

  Scenario: User should be able to set up a deadline for new task
    Given I login as a user
    When I am on the "Activity Stream"
    Then User should be able to setup a deadline for new task


