Feature: Login

  Scenario Outline: Scenario to Login

    Given Enter the username and password <Username> <Password>
    When click on login
    Then verify the home page <message>
    Examples:
      | Username       | Password        | message       |
      | "superadmin"   | "Stanley@123"   | "Success"     |
      | "superadmin"   | ""              | "Not Success" |
      | ""             | "stanley@123"   | "Not Success" |
      | "superadminnn" | "stanley@123"   | "Not Success" |
      | "superadmin"   | "stanley@12345" | "Not Success" |
      | "superadminnn" | "stanley@12345" | "Not Success" |
      | ""             | ""              | "Not Success" |
