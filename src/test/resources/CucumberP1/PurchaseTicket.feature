Feature: Ticket Purchase Functionality

  Scenario Outline: Verify user able to purchase ticket
    Given User navigate to "https://blazedemo.com/purchase.php"
    When User enter Full name"<name>"
    And User enter address"<address>"
    And User enter city "<city>"
    And User enter state "<state>"
    And User enter zipCode "<zipCode>"
    And User chooses cardType "<cardType>"
    And User enter cardNum	 "<cardNum>"
    And User enter cardMonth  "<cardMonth>"
    And User enter cardYear  "<CardYear>"
    And User enter nameOnCard "<nameOnCard>"
    And User click  rememberMe
    And User clicks Purchase button
    Then User verifies success message "<message>"

    Examples: 
      | name    | address     | city   | state      | zipCode | cardType         | cardNum | cardMonth | CardYear | nameOnCard | message                            |
      | Jack A  | 123 A drive | NY     | NY         |   12345 | Visa             |    2341 |        01 |     2024 | Jack A     | Thank you for your purchase today! |
      | Ethan B | 456 B Ave   | LA     | CA         |   56789 | Visa             |    1234 |        11 |     2023 | Ethan B    | Thanks                             |
      | Noah C  | 789 C St    | SF     | CA         |   92345 | American Express |    2341 |        07 |     2025 | Noah C     | Thank for for Your purchase        |
      | Luke D  | 2233 D Lane | Seatle | Washington |   27823 | American Express |    3942 |        09 |     2026 | Luke D     | Thank you for your purchase today! |
      | Liam E  | 3344 E Way  | SD     | CA         |   34531 | Visa             |    2342 |        03 |     2025 | Liam E     | Thank you for your purchase today! |
