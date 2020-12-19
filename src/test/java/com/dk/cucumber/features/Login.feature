Feature: Twitter Login test be one
  here you will put feature description

  # Common steps
  # Sequence maintain
  # It should be in the first line of the Scenario:
   Background:
    # It will execute before Each Scenario:
    Given User open a browser
    And User navigate to website
     | chrome | firefox |

  @SanityTest
  Scenario: A user facebook account login test
    And User enter "facebook@gmail.com" email address
    And User enter "facebookPasssword" password
    And User click on login button
    Then User close the browser

  @SmokeTest
  Scenario: A user twitter account login test
    And User enter "twitter@gmail.com" email address
    And User enter "twitterPassword" password
    And User click on login button
    Then User close the browser