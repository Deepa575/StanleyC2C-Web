Feature:Add User

  Scenario Outline:Scenario to Add User

    Given Click On User Management
    When Click On User Module
    And Click On Add User Button
    And Enter User Details <emailId> <firstName> <lastName> <phonenumber> <userName> <customerName>
    Then Click On Add Button
    Examples:
      | emailId            | firstName | lastName | phonenumber  | userName       | customerName |
      | "User@walmart.com" | "User"    | "Test"   | "9959963917" | "walmartuser"  | "Walmart"    |
      | "User@Walmart.com" | "User0"   | ""       | "9959963927" | "walmartuser1" | "Walmart"    |
      | "User1@amazon.com" | "User1"   | "Test1"  | "9959963937" | "walmartuser2" | "Amazon"     |
      | "User@walmart.com" | "User"    | "Test"   | "9959963917" | "walmartuser"  | "Amazon"     |
      | ""                 | "User"    | "Test"   | "9959963917" | "walmartuser"  | "AWG"        |
      | "User@walmart.com" | ""        | "Test"   | "9959963917" | "walmartuser"  | "Walmart"    |
      | "User@walmart.com" | "User"    | ""       | "9959963917" | "walmartuser"  | "Walmart"    |
      | "User@walmart.com" | "User"    | "Test"   | ""           | "walmartuser"  | "Walmart"    |
      | "User@walmart.com" | "User"    | "Test"   | "9959963917" | ""             | "Walmart"    |
      | "User@walmart.com" | "User"    | "Test"   | "9959963917" | "walmartuser"  | "AWG"        |

