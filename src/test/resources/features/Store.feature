Feature: Validates the apple.com store functionality,

  Scenario Outline: Buy apple watch
    Given I open apple official website "<website>"

    Examples:
      | website                   |
      | https://www.apple.com/    |
      | https://www.google.com/   |
      | https://www.facebook.com/ |