Feature: Cucumber Hello World Example

 Scenario: Greet User Successfully
    Given user passes a name
    |name|Ram|
    When sayHello method of HelloWorld.java is called
    Then it should return greeting message