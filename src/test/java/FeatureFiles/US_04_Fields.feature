Feature:  Adding New Fields

  Background:
    Given Navigate to Mersys
    When  Enter username and password and click login button
    Then User should login successfully


  Scenario: adding new fields
    Given Clicks on the element in LeftNav
      | setup |
      | setupParameters  |
      | fields   |
    And Click on the element in Dialog
      | addButton  |
    When  User fills the necessary data
      | name | ets3534  |
      | code | eto12367|
    And FieldType status

    And Click on the element in Dialog
      | saveButton |
    Then User gets success message


#  Scenario: editing fields
#    Given Clicks on the element in LeftNav
#      | setup |
#      | setupParameters  |
#      | fields   |
#    And User search the element
#      | ets3534 |  eto12367|
#    And Click on the element in Dialog
#      | editButton  |
#    When  User fills the necessary data
#      | name | etoo122 |
#      | code | etooooo|
#    And FieldType status
#    And Click on the element in Dialog
#      | saveButton |
#    Then User gets success message

  Scenario: editing Subject Categories
    Given Clicks on the element in LeftNav
      | setup |
      | setupParameters  |
      | fields   |
    And User edit two elements
      | ets3534 |  eto12367| etoo12 |  eto12345|
    And Click on the element in Dialog
      | saveButton |
    Then User gets success message


  Scenario: search function on the page
    Given Clicks on the element in LeftNav
      | setup |
      | setupParameters  |
      | fields   |
    And User search the element
      | etoo12 |  eto12345|


  Scenario: deleting fields
    Given Clicks on the element in LeftNav
      | setup |
      | setupParameters  |
      | fields   |
    And User delete the element
      | etoo1 |  eto1234|
    Then User gets success message



