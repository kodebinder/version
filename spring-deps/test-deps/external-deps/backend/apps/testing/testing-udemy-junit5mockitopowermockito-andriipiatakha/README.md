# Testing

Goals of Testing
What is Testing?
What is quality?
Why we need to write tests?
Functions of Testing
Types of testing
Testing pyramid
Defect Cost Increase
Functional vs Non-functional Testing
What kind of tests developers usually write

## Goals of Testing
Verify that the application works as expected
New code should not break existing functionality
Product Owner - Does not understands Technology but understands quality

Quality : Degree of compliance with requirement

## Testing Functions
Increase Team Productivity
Limit need for debugging
Confidence during refactoring
Clean Code and Good Architecture Design
Enabling Test Code Coverage metric
Documentation

## Testing Levels and Testing Pyramid
Acceptance Testing
System Testing
Integration Testing
Unit Testing

## Functional vs Non-Functional
Function : What System does? Smoke, Sanity, Unit, Integration, UAT, Regression
Non-Functional : Characteristics which affect System Performance, quality, stability of software.
Availability, Load, Stress, Reliability, Penetration, Disaster Recovery

## Unit Testing
What is Unit Testing?
Test each specific unit of software.
Code Coverage should be met.

Rule 1:
One assertion per test or single concept by a test
Rule 2:
Test one single object at a time
Rule 3:
Choose meaningful test method names

## FIRST Principle
F = Fast
I = Independent
R = Repeatable
S = Self Validating
T = Thoroughly or Timely

## Structure of Unit Test
Build / Operate / Check Pattern
Arrange / Act / Assert
Given / When / Then

## JUnit 5 Structure
JUnit Platform
JUnit Jupiter
JUnit Vintage

## JUnit 5 vs JUnit 4
Equivalance Class Partitioning
JUnit 4: @Before @After @BeforeClass @AfterClass @Test public
JUNit 5: @BeforeEach @AfterEach @BeforeAll @AfterAll @Test no-access-modifier
Proper test method name : should..()
0 should be declared as constant ZERO_MONEY_AMOUNT

@DisplayName
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
group assertions using assertAll()
nested assertions
Eclemma Code Coverage
@ParameterizedTest
@ValueSource
@Ignored
@Disabled

Test Suite
@SelectPackages
@IncludePackages
@ExcludePackages

@IncludeTags("dev")
@ExcludeTags("prod")

@TestMethodOrder
@Order(1)
@EnabledOnOs

## Hamcrest Library
assertThat(actual,equalTo(expected))
assertThat(list,hasItem(anyOf(equalTo("a"),equalTo("b"),equalTo("c"))))

## Integration Testing
Test Doubles :
Dummy Object
Test Stub
Fake Object
Mock Object
Test Spy

## Mockito
@ExtendWith(MockitoExtension.class) // JUnit 5
or
@RunWith(MockitoJUnitRunner.class) // JUnit 4

@Mock
private Engine engineMock;
@Mock
private Mail mailMock;
@InjectMock
private Messenger messenger; (engineMock and mailMock will be injected)

Mockito uses Reflection

given()
when()
then()
verify()
any(), anyString(), anyDouble()

times(1)
atLeastOnce()
atLeast(1)
atMost(2)
never()

# PowerMockito
Mock private methods, static methods, final methods, final class, constructor
PowerMockito uses Reflection

## PowerMock works with JUnit 4 not JUnit 5
@RunWith(PowerMockRunner.class)
@PrepareForTest({String.class,ClassWithStaticMethod.class})

mockStatic(ClassWithStaticMethod.class)
given()
when()
then()
assertThat()
verifyStatic()

String s = mock(String.class)
mock(Object.class)

whenNew()
verifyNew()

# TDD or Test Driven Development
Write failing test
Make test pass
Refactor

# BDD or Behaviour Driven Development


# ATDD or Acceptance Test Driven Development








