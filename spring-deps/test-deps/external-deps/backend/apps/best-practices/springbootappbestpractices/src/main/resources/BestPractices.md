Do

@Retryable annotation in Spring
@RecordStats in Caffeine Cache
Add exclusion and inclusion in Maven
Always check for Parameter Preconditions
Avoid Deadlocks
Avoid Empty Catch Blocks
Avoid Object Mutability
Avoid Printing complete object in info mode you can print objet in debug mode to save log space and size
Avoid Redundant Initialisation (0-false-null)
Avoid String Concatenation in a Large Loop
Avoid Transitive Dependency in Maven
Avoid asserting unnecessarily
Avoid code duplication
Avoid comments for self explanatory methods
Avoid comparing String using “==”
Avoid creating unnecessary objects
Avoid creating unnecessary objects, reuse objects, and avoid unnecessary GC clean up
Avoid hardcoding of data
Avoid memory leaks
Caching in Java
Check Maven Dependency Tree
Check for NPE
Class Members should be private
Code coverage should be above 80%
Declare Constructor Parameters as final
Declare constructor as public
Declare final variable first, then static then general
Declare private method and use public if accessible from outside
Do Indicate javadoc comments for each public class. This helps intended readers to track all changes easily.
Do Leverage Enum over Defining Constants
Do Order of Preference : Anonymous Class < Lambda < Method References
Do Order of Preference : Boxed Primitives or Wrapper Types < primitive types
Do Ordering Class Members by Scopes : static < private < default < protected < public
Do add @ResponseStatus(HttpStatus.NOT_FOUND)
Do add a README file
Do add custom Spring Boot Banner : https://devops.datenkollektiv.de/banner.txt/index.html
Do add prefix Test for JUnit eg : OrderServiceTest
Do check code coverage in IntelliJ
Do clarify your parameters.
Do code for interfaces
Do declare class : noun, method : verb and attributes : adjectives
Do declare class as final
Do extend RuntimeException and not Exception
Do extract value to variables in methods and not return directly
Do fix code smells, vulnerabilities, error, warning.
Do follow set of naming conventions for class : noun, first letter uppercase
Do follow set of naming conventions for constant : uppercase where words separated by underscore
Do follow set of naming conventions for interface : noun, first letter uppercase
Do follow set of naming conventions for method : verbs
Do follow set of naming conventions for packages : lowercase
Do follow set of naming conventions for variable : noun, lowercase
Do format code and queries
Do frequent Code reviews
Do frequent commits to your code
Do handle validation in method or enforce in Model
Do make sure code coverage is met
Do make sure your test cases pass
Do not add public keyword for JUnit 5 methods
Do not add unnecessary space wastage
Do not return object while POST in REST API
Do not test entities in JUnit
Do not use == or != with Integer
Do not use float and double if exact answers are required, use BigDecimal instead of double for money, ex Money
Do not use for loops with indexes
Do not use index based loop
Do not use java.util.* but rather use FQDN of classes eg : java.util.Collection
Do not use magic numbers in the code instead do use constants
Do not use nested for loop. Prefer binary search way.
Do not use printStackTrace()
Do not write comments for self-explanatory chunks of code.
Do prefer @Value(“${page_size:10}”) over Environment to read data from Properties file
Do prefer constructor injection
Do prefer int over Integer to avoid boxing and unboxing.https://stackoverflow.com/questions/10623682/using-int-vs-integer
Do provide appropriate annotation on top of method
Do provide java docs for you methods
Do reuse variables, class, method, interface, object
Do set aside adequate memory for Java
Do setClientName(“DEV”) in proto
Do take advantage of Java Collections Classes
Do try to clean up memory from JVM
Do try to put user Story Number on every commit  “AFA-123456 initial commit”
Do try to use Optional and return something from every method and not void
Do understand difference between Association, Aggregation, Composition and Inheritance
Do use  CollectionUtils.isEmpty() and CollectionUtils.isNotEmpty() boundary checks or edge cases
Do use  StringUtils.isBlank() and StringUtils.isNotBlank() boundary checks or edge cases
Do use && instead of two nested if statements
Do use @Query annotation in interface for JPQL
Do use @Slf4j
Do use @author to identify yourself as the code developer.
Do use Appropriate log level and print method arguments
Do use BigDecimal if using Money over double
Do use Constants
Do use Control + Shift + F
Do use Date and Time API provided
Do use Enums or Constant Class instead of Constant Interface
Do use Generics to enforce compile-time type checking
Do use Guava, Object, StringUtil libraries
Do use Higher Order Function (receive function as parameter or return function as a result)
Do use Internal Iteration over External Iteration
Do use Jacoco Code Coverage
Do use LOGGER.info(“GUID : {}, Asset : {}”, guid, assetName);
Do use Leverage Utility and Helper Methods
Do use List<String> over Collection<String>
Do use Logger implementation in Source Code and Unit
Do use Loggers instead of SOP
Do use Lombok annotations (@Data, @Builder, @AllArgsConstructor, @NoArgsConstructor) on top of entity class
Do use Method Reference over Lambda Expression
Do use Naming Conventions for class, interface, variables, methods etc.
Do use OpenFeign over RestTemplate
Do use Optional.ofNullable()
Do use Profiling
Do use README.md file
Do use Real work object as Class Name and then define attributes for them.
Do use Reflection for private methods
Do use Remove unnecessary imports
Do use SOLID Principles
Do use Sequence Portfolio, Asset and then other Entities
Do use SonarLint Plugin
Do use Spring Annotations : @Service, @Configuration, @Bean
Do use StringBuilder or StringBuffer append method instead of String Concatenation (+)
Do use StringUtils.isEmpty() and StringUtils.isNotEmpty() boundary checks or edge cases
Do use Ternary Operator
Do use Thread Safe Code and libraries
Do use Underscores in Numeric Literals
Do use Utility Classes properly
Do use all capital letters separated by Underscore for constants
Do use appropriate class, variables, methods, packages name, nomenclature
Do use banner in resources folder
Do use builder pattern to create object if more attributes are associated with an Object
Do use camelcase notation
Do use command line args
Do use constructor based injection over setter based injection
Do use enum
Do use enums instead of int constants.
Do use hash code and equals in Model / Entity
Do use interface References to Collections
Do use lombok.config
Do use objects to call your methods and not static methods or static blocks
Do use optimised logic for problem solving
Do use precise terms to help your readers understand your code.
Do use private final variables
Do use private methods
Do use proper Exception Handling use super constructor
Do use proper indentation of code
Do use public class
Do use separate lines if you have long constructors
Do use separate method to get input, process and print. This make just easy.
Do use serialVersionUID
Do use single Logger statement to print as in Multi threaded environment sequence might change
Do use singular of object and plural for collection
Do use static and final for your constants
Do use stream
Do use try and catch instead of throws
Do use try-with-resources
Do use wrapper to encapsulate code inside a function
Do use “api/v1/“
Don’t return Null. Communicate with your method client with `Optional`. Same for Collections : Return empty arrays or collections, not nulls
Explain all valid input parameter values.
Explain class behaviour and its respective purpose.
First validate incoming data if invalid do not process same.Then do map.get() to avoid NPE.
If constructor or method arguments are more wrap them up inside an object and pass that object as an argument to constructor or method
Private Data Members and Public Function
Reduce complexity of method
Rolling logs in unix

Do Order of Preference : Setter based injection < Constructor based injection

private final OrderService orderService;

@Autowired
public OrderController(final OrderService orderService){
this.orderService=orderService;
}

# Sequence of Member Declaration in a class
static > public > protected > default or package > private then alphabetical ordering of variables
/*
Documentation of class
*/
public class StudentManager {
    // Link : https://web.archive.org/web/20130516014426/http://www.oracle.com/technetwork/java/codeconventions-141855.html#1852
    // static variables first in sequence : public protected default private
    // non-static variables second in sequence : public protected default private

    public int numberOfStudents;
    public String title;
    
    protected String[] columnNames;
    protected List<Student> listStudents;
    
    float columnWidth;
    float rowHeight;
    
    private String errorMessage;
    private int numberOfColumns;
    private int numberOfRows;

    public StudentManager(){}

    // static methods
    // sort non-static methods by functionality than scope
    // toString equals hashcode
    // getter setter
 

 
    

}

# Class Members should be private with boundary check
public class Student {

    private String name;
    private int age;
 
    public void setName(String name) {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("Name is invalid");
        }
 
        this.name = name;
    }
 
    public void setAge(int age) {
        if (age < 1 || age > 100) {
            throw new IllegalArgumentException("Age is invalid");
        }
 
        this.age = age;
    }
}

# Use underscore in case of numberic literals
int maxUploadSize = 20_971_520;
long accountBalance = 1_000_000_000_000L;
float pi = 3.141_592_653_589F;

Use StringBuffer or StringBuilder instead of String Concatenation

# Use enum over Constant Interface
public enum Color {

    BLACK(0x000000),
    WHITE(0xffffff),
    RED(0xff0000);
 
    private int code;
 
    Color(int code) {
        this.code = code;
    }
 
    public int getCode() {
        return this.code;
    }
}

# Use dedicated class for Constants
public class AppConstants {
public static final String TITLE = "Application Name";

    public static final int VERSION_MAJOR = 2;
    public static final int VERSION_MINOR = 4;
 
    public static final int THREAD_POOL_SIZE = 10;
 
    public static final int MAX_DB_CONNECTIONS = 50;
 
    public static final String ERROR_DIALOG_TITLE = "Error";
    public static final String WARNING_DIALOG_TITLE = "Warning";
    public static final String INFO_DIALOG_TITLE = "Information";
}

Use interface reference to collection over concrete implementation class

Don't
Dont have empty catch block

# Don't have redundant initialization
public class Person {
private String name = null;
private int age = 0;
private boolean isGenius = false;
}

OR

public class Person {
private String name;
private int age;
private boolean;

    public Person() {
        String name = null;
        int age = 0;
        boolean isGenius = false;
    }
}

Don't use for loop with indexes instead use enhanced for loop
for (String aName : names) {
doSomething(aName);
}