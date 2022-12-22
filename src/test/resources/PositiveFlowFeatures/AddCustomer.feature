Feature: Add Customer

  Scenario Outline: Scenario to Add Customer
    Given Click On UserMgmt
    When Click On CustomerModule
    And Click On Add Customer Button
    And Enter Details Into Customer Form <customerName> <customerEmailId> <primaryContactNumber> <secondaryContactNumber> <communicationAddress> <billingAddress>
    And Click On Submit Button
    Then Verify the Customer Created or Not <expectedMessage> <Status>

    Examples: 
      | customerName | customerEmailId          | primaryContactNumber | secondaryContactNumber | communicationAddress | billingAddress | expectedMessage               | Status    |
      | "Customer"   | "customer@customer.com"  | "9956555546"         | "7895458789"           | "Hyderabad"          | "Madhapur"     | "Added customer successfully" | "Created" |
      | "Customer 1" | "customer@customer1.com" | "7694656446"         | ""                     | "Hyderabad"          | "Madhapur"     | "Added customer successfully" | "Created" |
      | "Customer 2" | "customer@customer2.com" | "7894524546"         | "6465464464"           | "Hyderabad"          | ""             | "Added customer successfully" | "Created" |
      | "Customer 3" | "customer@customer3.com" | "8889966454"         | ""                     | "Hyderabad"          | ""             | "Added customer successfully" | "Created" |
      | "Customer 4" | "customer@customer4.com" | "9956656842"         | "7234646789"           | "Hyderabad"          | "Madhapur"     | "Added customer successfully" | "Created" |
      | "Customer 6" | "customer@customer6.com" | "7845554547"         | "7266874579"           | "Hyderabad"          | ""             | "Added customer successfully" | "Created" |
      | "Customer 7" | "customer@customer7.com" | "8897213552"         | ""                     | "Hyderabad"          | ""             | "Added customer successfully" | "Created" |
      | "Customer 8" | "customer@customer8.com" | "9454554547"         | "9854488545"           | "Hyderabad"          | "HitechCity"   | "Added customer successfully" | "Created" |
      | "Customer 9" | "customer@customer9.com" | "8454545447"         | ""                     | "Hyderabad"          | ""             | "Added customer successfully" | "Created" |
