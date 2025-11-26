# Java Essentials for Spring Boot Development - Complete Guide

## Table of Contents

- [Chapter 1: Object-Oriented Programming (OOP) Fundamentals](#chapter-1-object-oriented-programming-oop-fundamentals)
  - [1.1 Classes and Objects](#11-classes-and-objects)
    - Basic Class Definition
    - Real-world Spring Boot Scenario
  - [1.2 Encapsulation](#12-encapsulation)
    - Data Hiding with Private Variables
    - Spring Boot Example
  - [1.3 Inheritance](#13-inheritance)
    - Parent-Child Relationships
    - Method Overriding
    - Spring Boot Real-world Example
  - [1.4 Polymorphism](#14-polymorphism)
    - Method Overloading (Compile-time)
    - Method Overriding (Runtime)
    - Spring Boot Example with Multiple Implementations
  - [1.5 Abstraction](#15-abstraction)
    - Abstract Classes
    - Spring Boot Base Service Example

---

- [Chapter 2: Interfaces](#chapter-2-interfaces)
  - [2.1 Basic Interface](#21-basic-interface)
  - [2.2 Multiple Interface Implementation](#22-multiple-interface-implementation)
  - [2.3 Interface with Constants](#23-interface-with-constants)
  - [2.4 Functional Interfaces](#24-functional-interfaces)
  - [2.5 Spring Boot Interface Examples](#25-spring-boot-interface-examples)
    - Repository Interface
    - Service Interface Implementation

---

- [Chapter 3: Exception Handling](#chapter-3-exception-handling)
  - [3.1 Basic Exception Handling](#31-basic-exception-handling)
  - [3.2 Multiple Catch Blocks](#32-multiple-catch-blocks)
  - [3.3 Custom Exceptions](#33-custom-exceptions)
  - [3.4 Try-with-Resources](#34-try-with-resources)
  - [3.5 Spring Boot Exception Handling](#35-spring-boot-exception-handling)
    - @ControllerAdvice
    - Global Exception Handler

---

- [Chapter 4: Streams API](#chapter-4-streams-api)
  - [4.1 Creating Streams](#41-creating-streams)
  - [4.2 Stream Operations](#42-stream-operations)
    - Intermediate Operations (filter, map, sorted)
    - Terminal Operations (collect, forEach, reduce)
  - [4.3 Terminal Operations](#43-terminal-operations)
  - [4.4 Complex Stream Examples](#44-complex-stream-examples)
    - Group By Category
    - Aggregations and Partitioning
  - [4.5 Spring Boot Stream Examples](#45-spring-boot-stream-examples)

---

- [Chapter 5: Collections Framework](#chapter-5-collections-framework)
  - [5.1 List Interface](#51-list-interface)
    - ArrayList vs LinkedList
  - [5.2 Set Interface](#52-set-interface)
    - HashSet, LinkedHashSet, TreeSet
    - Set Operations (Union, Intersection, Difference)
  - [5.3 Map Interface](#53-map-interface)
    - HashMap, LinkedHashMap, TreeMap
    - Iteration and Compute Methods
  - [5.4 Queue and Deque](#54-queue-and-deque)
  - [5.5 Spring Boot Collections Usage](#55-spring-boot-collections-usage)

---

- [Chapter 6: Generics](#chapter-6-generics)
  - [6.1 Generic Classes](#61-generic-classes)
  - [6.2 Generic Methods](#62-generic-methods)
  - [6.3 Bounded Type Parameters](#63-bounded-type-parameters)
    - Upper Bounded Wildcards
    - Lower Bounded Wildcards
  - [6.4 Generic Interfaces](#64-generic-interfaces)
  - [6.5 Spring Boot Generic Examples](#65-spring-boot-generic-examples)
    - Generic Base Entity
    - Generic API Response Wrapper

---

- [Chapter 7: Functional Programming](#chapter-7-functional-programming)
  - [7.1 Lambda Expressions](#71-lambda-expressions)
  - [7.2 Built-in Functional Interfaces](#72-built-in-functional-interfaces)
    - Predicate, Function, Consumer, Supplier
    - BiFunction, UnaryOperator, BinaryOperator
  - [7.3 Method References](#73-method-references)
    - Static Method Reference
    - Instance Method Reference
    - Constructor Reference
  - [7.4 Optional Class](#74-optional-class)
    - Creating Optional
    - Optional Operations (map, filter, orElse)
  - [7.5 Spring Boot Functional Programming Examples](#75-spring-boot-functional-programming-examples)

---

- [Chapter 8: Annotations](#chapter-8-annotations)
  - [8.1 Built-in Java Annotations](#81-built-in-java-annotations)
  - [8.2 Custom Annotations](#82-custom-annotations)
  - [8.3 Processing Custom Annotations](#83-processing-custom-annotations)
  - [8.4 Spring Boot Annotations](#84-spring-boot-annotations)
    - **Core Annotations**: @Component, @Service, @Repository, @Controller, @RestController
    - **Configuration Annotations**: @Configuration, @Bean, @Value, @ConfigurationProperties
    - **JPA Annotations**: @Entity, @Table, @Id, @GeneratedValue, @OneToMany, @ManyToOne
    - **Validation Annotations**: @NotNull, @NotBlank, @Email, @Size, @Min, @Max
    - **Transaction Annotations**: @Transactional
    - **Scheduling Annotations**: @Scheduled, @EnableScheduling
    - **Async Annotations**: @Async, @EnableAsync
    - **Caching Annotations**: @Cacheable, @CachePut, @CacheEvict
    - **Security Annotations**: @PreAuthorize, @PostAuthorize
    - **Conditional Annotations**: @ConditionalOnProperty, @ConditionalOnMissingBean

---

- [Chapter 9: Multi-threading and Concurrency](#chapter-9-multi-threading-and-concurrency)
  - [9.1 Creating Threads](#91-creating-threads)
    - Extending Thread Class
    - Implementing Runnable Interface
  - [9.2 Thread Synchronization](#92-thread-synchronization)
    - Synchronized Methods
    - Synchronized Blocks
  - [9.3 ExecutorService](#93-executorservice)
    - Fixed Thread Pool
    - Scheduled Executor
  - [9.4 CompletableFuture](#94-completablefuture)
    - Async Computations
    - Chaining Operations
    - Exception Handling
  - [9.5 Spring Boot Async Examples](#95-spring-boot-async-examples)

---

- [Chapter 10: File I/O and NIO](#chapter-10-file-io-and-nio)
  - [10.1 Basic File Operations](#101-basic-file-operations)
    - Reading Files
    - Writing Files
    - Copy, Delete, File Info
  - [10.2 Directory Operations](#102-directory-operations)
    - Create, List, Delete Directories
    - Recursive Operations
  - [10.3 Working with CSV Files](#103-working-with-csv-files)
  - [10.4 Working with JSON Files](#104-working-with-json-files)
    - Using Jackson Library
  - [10.5 Spring Boot File Upload/Download](#105-spring-boot-file-uploaddownload)

---

- [Chapter 11: Design Patterns for Spring Boot](#chapter-11-design-patterns-for-spring-boot)
  - [11.1 Singleton Pattern](#111-singleton-pattern)
  - [11.2 Factory Pattern](#112-factory-pattern)
  - [11.3 Builder Pattern](#113-builder-pattern)
    - Traditional Builder
    - Lombok @Builder
  - [11.4 Strategy Pattern](#114-strategy-pattern)
  - [11.5 Observer Pattern](#115-observer-pattern)
    - Spring Events
    - Event Listeners
  - [11.6 Repository Pattern](#116-repository-pattern)

---

- [Chapter 12: Dependency Injection and IoC](#chapter-12-dependency-injection-and-ioc)
  - [12.1 Types of Dependency Injection](#121-types-of-dependency-injection)
    - Constructor Injection (Recommended)
    - Setter Injection
    - Field Injection
  - [12.2 Qualifiers and Primary](#122-qualifiers-and-primary)
  - [12.3 Bean Scopes](#123-bean-scopes)
    - Singleton, Prototype, Request, Session, Application
  - [12.4 Lifecycle Callbacks](#124-lifecycle-callbacks)
    - @PostConstruct, @PreDestroy
    - InitializingBean, DisposableBean
  - [12.5 Conditional Beans](#125-conditional-beans)

---

- [Chapter 13: Logging and Monitoring](#chapter-13-logging-and-monitoring)
  - [13.1 SLF4J with Logback](#131-slf4j-with-logback)
    - Logger Creation
    - Log Levels (TRACE, DEBUG, INFO, WARN, ERROR)
  - [13.2 Logback Configuration](#132-logback-configuration)
    - Console and File Appenders
    - Rolling Policy
  - [13.3 Custom Log Aspects](#133-custom-log-aspects)
    - @LogExecutionTime Annotation
    - AOP Logging
  - [13.4 MDC for Request Tracking](#134-mdc-for-request-tracking)
  - [13.5 Application Health Monitoring](#135-application-health-monitoring)
    - Custom Health Indicators
    - Actuator Endpoints

---

- [Final Real-World Spring Boot Example](#final-real-world-spring-boot-example)
  - Complete CRUD Application
  - Entity, DTO, Repository, Service, Controller
  - All Concepts Combined

---

## Quick Reference Guide

### **OOP Principles**
- **Encapsulation**: Data hiding with private fields
- **Inheritance**: Code reuse through parent-child relationships
- **Polymorphism**: One interface, multiple implementations
- **Abstraction**: Hide implementation details

### **Key Functional Interfaces**
- `Predicate<T>` - Boolean test
- `Function<T, R>` - Transformation
- `Consumer<T>` - Accept input, no return
- `Supplier<T>` - Supply value, no input
- `BiFunction<T, U, R>` - Two inputs, one output

### **Common Stream Operations**
- **Intermediate**: filter(), map(), sorted(), distinct(), limit(), skip()
- **Terminal**: collect(), forEach(), reduce(), count(), anyMatch(), findFirst()

### **Spring Boot Core Annotations**
- `@SpringBootApplication` - Main application class
- `@RestController` - REST API controller
- `@Service` - Business logic layer
- `@Repository` - Data access layer
- `@Autowired` - Dependency injection
- `@Transactional` - Transaction management

### **Exception Handling**
- `@ControllerAdvice` - Global exception handler
- `@ExceptionHandler` - Handle specific exceptions
- Custom exceptions extending RuntimeException

### **Validation Annotations**
- `@NotNull`, `@NotBlank`, `@NotEmpty`
- `@Size`, `@Min`, `@Max`
- `@Email`, `@Pattern`
- `@Valid` - Trigger validation

---

## Best Practices Checklist

- [ ] Use Constructor Injection over Field Injection
- [ ] Prefer Interfaces over Concrete Classes
- [ ] Use Optional to avoid NullPointerException
- [ ] Apply proper Exception Handling with @ControllerAdvice
- [ ] Use Lombok to reduce boilerplate code
- [ ] Implement proper logging with SLF4J
- [ ] Use Streams API for collection operations
- [ ] Apply appropriate Bean Scopes
- [ ] Use @Transactional for database operations
- [ ] Implement pagination for large datasets
- [ ] Use DTOs for API requests/responses
- [ ] Apply validation on API inputs
- [ ] Use Async processing for long-running tasks
- [ ] Implement proper security with Spring Security

---

## Learning Path

### **Beginner Level** (Weeks 1-2)
1. Master OOP concepts
2. Understand Collections Framework
3. Learn basic Exception Handling
4. Practice with simple Spring Boot CRUD apps

### **Intermediate Level** (Weeks 3-4)
1. Deep dive into Streams API
2. Learn Functional Programming concepts
3. Understand Spring Boot Annotations
4. Practice Dependency Injection patterns

### **Advanced Level** (Weeks 5-6)
1. Master Design Patterns
2. Implement Multi-threading
3. Learn Logging and Monitoring
4. Build production-ready applications

---

*Happy Coding! Master these concepts and you'll be building robust Spring Boot applications in no time!* 🚀💻✨

## Chapter 1: Object-Oriented Programming (OOP) Fundamentals

### 1.1 Classes and Objects

**Dekh bhai, class ek blueprint hai aur object uska real instance hai. Jaise ghar ka naksha (class) aur asli ghar (object).**

```java
// Basic Class Definition
public class Student {
    // Instance variables (properties)
    private String name;
    private int rollNumber;
    private double marks;
    
    // Constructor - object create karne ke liye
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    
    // Methods (behaviors)
    public void displayInfo() {
        System.out.println("Name: " + name + ", Roll: " + rollNumber);
    }
    
    // Getters and Setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Rahul", 101, 85.5);
        student1.displayInfo();
    }
}
```

**Real-world Spring Boot Scenario:**

```java
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String username;
    private String email;
    private String password;
    
    // Constructor, getters, setters
}
```

### 1.2 Encapsulation

**Encapsulation matlab data hiding - apna data private rakho aur controlled access do getters/setters se.**

```java
public class BankAccount {
    // Private variables - direct access nahi mil sakta
    private String accountNumber;
    private double balance;
    
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    
    // Controlled access through public methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }
    
    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
    
    public double getBalance() {
        return balance;
    }
    
    // No setter for balance - only through deposit/withdraw
}
```

**Spring Boot Example:**

```java
@Service
public class UserService {
    // Encapsulated dependency
    private final UserRepository userRepository;
    
    // Constructor injection - better than field injection
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    public User createUser(UserDTO userDTO) {
        // Business logic encapsulated
        User user = new User();
        user.setUsername(userDTO.getUsername());
        user.setEmail(userDTO.getEmail());
        return userRepository.save(user);
    }
}
```

### 1.3 Inheritance

**Inheritance matlab ek class dusri class ki properties aur methods inherit kar sakti hai. Parent-child relationship.**

```java
// Parent class (Base class)
public class Vehicle {
    protected String brand;
    protected int year;
    
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    
    public void start() {
        System.out.println(brand + " is starting...");
    }
    
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

// Child class (Derived class)
public class Car extends Vehicle {
    private int numberOfDoors;
    
    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year); // Parent constructor call
        this.numberOfDoors = numberOfDoors;
    }
    
    // Method overriding
    @Override
    public void start() {
        System.out.println("Car engine starting with key...");
    }
    
    // Additional method
    public void openTrunk() {
        System.out.println("Trunk opened");
    }
}

// Another child class
public class Motorcycle extends Vehicle {
    private boolean hasCarrier;
    
    public Motorcycle(String brand, int year, boolean hasCarrier) {
        super(brand, year);
        this.hasCarrier = hasCarrier;
    }
    
    @Override
    public void start() {
        System.out.println("Motorcycle kick-starting...");
    }
}
```

**Spring Boot Real-world Example:**

```java
// Base exception class
public class BaseException extends RuntimeException {
    private String errorCode;
    private LocalDateTime timestamp;
    
    public BaseException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
        this.timestamp = LocalDateTime.now();
    }
    
    // Getters
}

// Specific exceptions inheriting from base
@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends BaseException {
    public ResourceNotFoundException(String message) {
        super(message, "RESOURCE_NOT_FOUND");
    }
}

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ValidationException extends BaseException {
    public ValidationException(String message) {
        super(message, "VALIDATION_ERROR");
    }
}
```

### 1.4 Polymorphism

**Polymorphism ka matlab hai ek hi interface, multiple implementations. Do types: Compile-time (Method Overloading) aur Runtime (Method Overriding).**

#### Method Overloading (Compile-time Polymorphism)

```java
public class Calculator {
    // Same method name, different parameters
    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public String add(String a, String b) {
        return a + b;
    }
}
```

#### Method Overriding (Runtime Polymorphism)

```java
public class PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing payment: " + amount);
    }
}

public class CreditCardPayment extends PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment: " + amount);
        // Credit card specific logic
    }
}

public class UPIPayment extends PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment: " + amount);
        // UPI specific logic
    }
}

// Usage - Runtime polymorphism
public class PaymentDemo {
    public static void main(String[] args) {
        PaymentProcessor payment;
        
        payment = new CreditCardPayment();
        payment.processPayment(1000); // Calls CreditCardPayment method
        
        payment = new UPIPayment();
        payment.processPayment(500); // Calls UPIPayment method
    }
}
```

**Spring Boot Example:**

```java
// Interface
public interface NotificationService {
    void sendNotification(String message, String recipient);
}

// Email implementation
@Service("emailNotification")
public class EmailNotificationService implements NotificationService {
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Sending email to: " + recipient);
        // Email sending logic
    }
}

// SMS implementation
@Service("smsNotification")
public class SmsNotificationService implements NotificationService {
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Sending SMS to: " + recipient);
        // SMS sending logic
    }
}

// Using in controller
@RestController
public class NotificationController {
    private final Map<String, NotificationService> notificationServices;
    
    // Spring injects all implementations
    public NotificationController(Map<String, NotificationService> services) {
        this.notificationServices = services;
    }
    
    @PostMapping("/notify")
    public void notify(@RequestParam String type, @RequestBody NotificationRequest request) {
        NotificationService service = notificationServices.get(type + "Notification");
        service.sendNotification(request.getMessage(), request.getRecipient());
    }
}
```

### 1.5 Abstraction

**Abstraction ka matlab implementation details hide karna aur sirf necessary features dikhana. Abstract classes aur interfaces use karte hain.**

```java
// Abstract class
public abstract class Shape {
    protected String color;
    
    public Shape(String color) {
        this.color = color;
    }
    
    // Abstract method - no implementation
    public abstract double calculateArea();
    
    // Concrete method
    public void displayColor() {
        System.out.println("Color: " + color);
    }
}

// Concrete class
public class Circle extends Shape {
    private double radius;
    
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double calculateArea() {
        return length * width;
    }
}
```

**Spring Boot Example:**

```java
// Abstract base service
public abstract class BaseService<T, ID> {
    
    public abstract T save(T entity);
    public abstract T findById(ID id);
    public abstract List<T> findAll();
    public abstract void deleteById(ID id);
    
    // Common method for all services
    protected void logOperation(String operation) {
        System.out.println("Performing: " + operation + " at " + LocalDateTime.now());
    }
}

// Concrete implementation
@Service
public class ProductService extends BaseService<Product, Long> {
    
    @Autowired
    private ProductRepository productRepository;
    
    @Override
    public Product save(Product product) {
        logOperation("Saving product");
        return productRepository.save(product);
    }
    
    @Override
    public Product findById(Long id) {
        logOperation("Finding product by ID");
        return productRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Product not found"));
    }
    
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }
    
    @Override
    public void deleteById(Long id) {
        logOperation("Deleting product");
        productRepository.deleteById(id);
    }
}
```

---

## Chapter 2: Interfaces

**Interface ek contract hai jo class ko implement karna padta hai. Ye batata hai KYA karna hai, KAISE nahi.**

### 2.1 Basic Interface

```java
public interface Drawable {
    // All methods are public and abstract by default
    void draw();
    
    // Java 8+: Default methods
    default void display() {
        System.out.println("Displaying drawable object");
    }
    
    // Java 8+: Static methods
    static void info() {
        System.out.println("This is a drawable interface");
    }
}

public class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
```

### 2.2 Multiple Interface Implementation

**Java mein multiple inheritance interfaces se ho sakti hai. Ek class multiple interfaces implement kar sakti hai.**

```java
public interface Flyable {
    void fly();
}

public interface Swimmable {
    void swim();
}

// Duck can both fly and swim
public class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }
    
    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }
}
```

### 2.3 Interface with Constants

```java
public interface DatabaseConstants {
    // Variables are public, static, and final by default
    String DB_URL = "jdbc:mysql://localhost:3306/mydb";
    String DB_USER = "root";
    int MAX_CONNECTIONS = 10;
    int TIMEOUT = 30;
}

public class DatabaseConfig implements DatabaseConstants {
    public void connect() {
        System.out.println("Connecting to: " + DB_URL);
        System.out.println("Max connections: " + MAX_CONNECTIONS);
    }
}
```

### 2.4 Functional Interfaces

**Functional interface mein sirf ek abstract method hota hai. Lambda expressions ke liye use hota hai.**

```java
@FunctionalInterface
public interface Calculator {
    int calculate(int a, int b);
    
    // Can have default and static methods
    default void showResult(int result) {
        System.out.println("Result: " + result);
    }
}

// Usage with lambda
public class FunctionalDemo {
    public static void main(String[] args) {
        // Lambda expression
        Calculator addition = (a, b) -> a + b;
        Calculator multiplication = (a, b) -> a * b;
        
        System.out.println(addition.calculate(5, 3));      // 8
        System.out.println(multiplication.calculate(5, 3)); // 15
    }
}
```

### 2.5 Spring Boot Interface Examples

```java
// Repository Interface
public interface UserRepository extends JpaRepository<User, Long> {
    // Spring Data JPA automatically implements these
    Optional<User> findByUsername(String username);
    List<User> findByEmailContaining(String email);
    boolean existsByEmail(String email);
    
    @Query("SELECT u FROM User u WHERE u.active = true")
    List<User> findAllActiveUsers();
}

// Service Interface
public interface UserService {
    User createUser(UserDTO userDTO);
    User getUserById(Long id);
    List<User> getAllUsers();
    User updateUser(Long id, UserDTO userDTO);
    void deleteUser(Long id);
}

// Service Implementation
@Service
public class UserServiceImpl implements UserService {
    
    private final UserRepository userRepository;
    
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    @Override
    public User createUser(UserDTO userDTO) {
        User user = new User();
        user.setUsername(userDTO.getUsername());
        user.setEmail(userDTO.getEmail());
        return userRepository.save(user);
    }
    
    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));
    }
    
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    
    @Override
    public User updateUser(Long id, UserDTO userDTO) {
        User user = getUserById(id);
        user.setUsername(userDTO.getUsername());
        user.setEmail(userDTO.getEmail());
        return userRepository.save(user);
    }
    
    @Override
    public void deleteUser(Long id) {
        User user = getUserById(id);
        userRepository.delete(user);
    }
}
```

---

## Chapter 3: Exception Handling

**Exception handling se program crashes nahi hote. Try-catch blocks se errors ko gracefully handle karte hain.**

### 3.1 Basic Exception Handling

```java
public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // ArithmeticException
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e.getMessage());
        } finally {
            System.out.println("This always executes");
        }
    }
}
```

### 3.2 Multiple Catch Blocks

```java
public class MultipleCatchDemo {
    public static void readFile(String filename) {
        try {
            int[] arr = new int[5];
            arr[10] = 50; // ArrayIndexOutOfBoundsException
            
            int result = 10 / 0; // ArithmeticException
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General error: " + e.getMessage());
        } finally {
            System.out.println("Cleanup code here");
        }
    }
}
```

### 3.3 Custom Exceptions

**Apni custom exceptions bana sakte ho specific business logic ke liye.**

```java
// Custom checked exception
public class InsufficientBalanceException extends Exception {
    private double balance;
    private double withdrawAmount;
    
    public InsufficientBalanceException(String message, double balance, double withdrawAmount) {
        super(message);
        this.balance = balance;
        this.withdrawAmount = withdrawAmount;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public double getWithdrawAmount() {
        return withdrawAmount;
    }
}

// Custom unchecked exception
public class InvalidAccountException extends RuntimeException {
    public InvalidAccountException(String message) {
        super(message);
    }
}

// Usage
public class BankAccount {
    private double balance;
    
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient balance for withdrawal", 
                balance, 
                amount
            );
        }
        balance -= amount;
    }
    
    public void validateAccount(String accountNumber) {
        if (accountNumber == null || accountNumber.length() != 10) {
            throw new InvalidAccountException("Invalid account number format");
        }
    }
}
```

### 3.4 Try-with-Resources

**Automatically resources ko close kar deta hai. File, DB connections ke liye best hai.**

```java
public class TryWithResourcesDemo {
    
    // Old way - manual closing
    public void readFileOldWay(String filename) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filename));
            String line = reader.readLine();
            System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    // New way - automatic closing
    public void readFileNewWay(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line = reader.readLine();
            System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Reader automatically closed
    }
}
```

### 3.5 Spring Boot Exception Handling

**Spring Boot mein global exception handling @ControllerAdvice se hota hai.**

```java
// Custom exception classes
@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequestException extends RuntimeException {
    public BadRequestException(String message) {
        super(message);
    }
}

// Error response DTO
public class ErrorResponse {
    private LocalDateTime timestamp;
    private int status;
    private String error;
    private String message;
    private String path;
    
    // Constructor, getters, setters
    public ErrorResponse(int status, String error, String message, String path) {
        this.timestamp = LocalDateTime.now();
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }
    
    // Getters and setters
}

// Global exception handler
@ControllerAdvice
public class GlobalExceptionHandler {
    
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleResourceNotFound(
            ResourceNotFoundException ex,
            WebRequest request) {
        
        ErrorResponse errorResponse = new ErrorResponse(
            HttpStatus.NOT_FOUND.value(),
            "Not Found",
            ex.getMessage(),
            request.getDescription(false).replace("uri=", "")
        );
        
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }
    
    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<ErrorResponse> handleBadRequest(
            BadRequestException ex,
            WebRequest request) {
        
        ErrorResponse errorResponse = new ErrorResponse(
            HttpStatus.BAD_REQUEST.value(),
            "Bad Request",
            ex.getMessage(),
            request.getDescription(false).replace("uri=", "")
        );
        
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }
    
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleValidationExceptions(
            MethodArgumentNotValidException ex) {
        
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        
        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }
    
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleGlobalException(
            Exception ex,
            WebRequest request) {
        
        ErrorResponse errorResponse = new ErrorResponse(
            HttpStatus.INTERNAL_SERVER_ERROR.value(),
            "Internal Server Error",
            ex.getMessage(),
            request.getDescription(false).replace("uri=", "")
        );
        
        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

// Using exceptions in service
@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;
    
    public Product getProductById(Long id) {
        return productRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException(
                "Product not found with id: " + id));
    }
    
    public Product createProduct(ProductDTO productDTO) {
        if (productDTO.getPrice() < 0) {
            throw new BadRequestException("Price cannot be negative");
        }
        
        Product product = new Product();
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        
        return productRepository.save(product);
    }
}
```

---

## Chapter 4: Streams API

**Streams API se collections ko functional style mein process kar sakte ho. Java 8 se available hai.**

### 4.1 Creating Streams

```java
public class StreamCreation {
    public static void main(String[] args) {
        // From collection
        List<String> names = Arrays.asList("Rahul", "Priya", "Amit", "Sneha");
        Stream<String> stream1 = names.stream();
        
        // From array
        String[] array = {"Java", "Python", "JavaScript"};
        Stream<String> stream2 = Arrays.stream(array);
        
        // Using Stream.of()
        Stream<Integer> stream3 = Stream.of(1, 2, 3, 4, 5);
        
        // Infinite stream
        Stream<Integer> stream4 = Stream.iterate(0, n -> n + 2).limit(10);
        
        // From file
        try (Stream<String> lines = Files.lines(Paths.get("file.txt"))) {
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

### 4.2 Stream Operations

**Stream operations do types ke hote hain: Intermediate (filter, map, sorted) aur Terminal (collect, forEach, reduce).**

```java
public class StreamOperations {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // Filter - conditional filtering
        List<Integer> evenNumbers = numbers.stream()
            .filter(n -> n % 2 == 0)
            .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);
        
        // Map - transformation
        List<Integer> squares = numbers.stream()
            .map(n -> n * n)
            .collect(Collectors.toList());
        System.out.println("Squares: " + squares);
        
        // Sorted
        List<Integer> sortedDesc = numbers.stream()
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList());
        System.out.println("Sorted descending: " + sortedDesc);
        
        // Distinct
        List<Integer> duplicates = Arrays.asList(1, 2, 2, 3, 3, 4, 5, 5);
        List<Integer> unique = duplicates.stream()
            .distinct()
            .collect(Collectors.toList());
        System.out.println("Unique: " + unique);
        
        // Limit and Skip
        List<Integer> limited = numbers.stream()
            .skip(2)
            .limit(5)
            .collect(Collectors.toList());
        System.out.println("Skip 2, take 5: " + limited);
    }
}
```

### 4.3 Terminal Operations

```java
public class TerminalOperations {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        
        // forEach
        numbers.stream().forEach(System.out::println);
        
        // collect
        List<Integer> collected = numbers.stream()
            .filter(n -> n > 2)
            .collect(Collectors.toList());
        
        // reduce
        int sum = numbers.stream()
            .reduce(0, (a, b) -> a + b);
        System.out.println("Sum: " + sum);
        
        // count
        long count = numbers.stream()
            .filter(n -> n > 3)
            .count();
        System.out.println("Count > 3: " + count);
        
        // anyMatch, allMatch, noneMatch
        boolean anyEven = numbers.stream().anyMatch(n -> n % 2 == 0);
        boolean allPositive = numbers.stream().allMatch(n -> n > 0);
        boolean noneNegative = numbers.stream().noneMatch(n -> n < 0);
        
        // findFirst, findAny
        Optional<Integer> first = numbers.stream().findFirst();
        Optional<Integer> any = numbers.stream().findAny();
        
        // min, max
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
    }
}
```

### 4.4 Complex Stream Examples

```java
public class Product {
    private String name;
    private String category;
    private double price;
    private int quantity;
    
    // Constructor, getters, setters
    public Product(String name, String category, double price, int quantity) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }
    
    // Getters
    public String getName() { return name; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
}

public class StreamComplexExamples {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", "Electronics", 50000, 10),
            new Product("Phone", "Electronics", 30000, 20),
            new Product("Shirt", "Clothing", 1000, 50),
            new Product("Jeans", "Clothing", 2000, 30),
            new Product("Watch", "Accessories", 5000, 15)
        );
        
        // Group by category
        Map<String, List<Product>> byCategory = products.stream()
            .collect(Collectors.groupingBy(Product::getCategory));
        System.out.println("Grouped by category: " + byCategory);
        
        // Count by category
        Map<String, Long> countByCategory = products.stream()
            .collect(Collectors.groupingBy(
                Product::getCategory, 
                Collectors.counting()
            ));
        
        // Average price by category
        Map<String, Double> avgPriceByCategory = products.stream()
            .collect(Collectors.groupingBy(
                Product::getCategory,
                Collectors.averagingDouble(Product::getPrice)
            ));
        
        // Total inventory value
        double totalValue = products.stream()
            .mapToDouble(p -> p.getPrice() * p.getQuantity())
            .sum();
        
        // Most expensive product
        Optional<Product> mostExpensive = products.stream()
            .max(Comparator.comparing(Product::getPrice));
        
        // Products above 10000
        List<String> expensiveProducts = products.stream()
            .filter(p -> p.getPrice() > 10000)
            .map(Product::getName)
            .collect(Collectors.toList());
        
        // Partition by price
        Map<Boolean, List<Product>> partitioned = products.stream()
            .collect(Collectors.partitioningBy(p -> p.getPrice() > 5000));
        
        System.out.println("Expensive: " + partitioned.get(true));
        System.out.println("Cheap: " + partitioned.get(false));
    }
}
```

### 4.5 Spring Boot Stream Examples

```java
@Service
public class OrderService {
    
    @Autowired
    private OrderRepository orderRepository;
    
    // Calculate total revenue
    public double calculateTotalRevenue() {
        return orderRepository.findAll().stream()
            .mapToDouble(Order::getTotalAmount)
            .sum();
    }
    
    // Get orders by status
    public Map<OrderStatus, List<Order>> groupOrdersByStatus() {
        return orderRepository.findAll().stream()
            .collect(Collectors.groupingBy(Order::getStatus));
    }
    
    // Find high-value customers
    public List<CustomerReport> getHighValueCustomers(double threshold) {
        return orderRepository.findAll().stream()
            .collect(Collectors.groupingBy(
                Order::getCustomerId,
                Collectors.summingDouble(Order::getTotalAmount)
            ))
            .entrySet().stream()
            .filter(entry -> entry.getValue() > threshold)
            .map(entry -> new CustomerReport(entry.getKey(), entry.getValue()))
            ```java
            .sorted(Comparator.comparing(CustomerReport::getTotalSpent).reversed())
            .collect(Collectors.toList());
    }
    
    // Get monthly sales report
    public Map<YearMonth, Double> getMonthlySalesReport() {
        return orderRepository.findAll().stream()
            .collect(Collectors.groupingBy(
                order -> YearMonth.from(order.getOrderDate()),
                Collectors.summingDouble(Order::getTotalAmount)
            ));
    }
    
    // Get top selling products
    public List<ProductSalesDTO> getTopSellingProducts(int limit) {
        return orderRepository.findAll().stream()
            .flatMap(order -> order.getOrderItems().stream())
            .collect(Collectors.groupingBy(
                OrderItem::getProductId,
                Collectors.summingInt(OrderItem::getQuantity)
            ))
            .entrySet().stream()
            .sorted(Map.Entry.<Long, Integer>comparingByValue().reversed())
            .limit(limit)
            .map(entry -> new ProductSalesDTO(entry.getKey(), entry.getValue()))
            .collect(Collectors.toList());
    }
    
    // Filter and convert to DTOs
    public List<OrderDTO> getRecentOrders(int days) {
        LocalDateTime cutoffDate = LocalDateTime.now().minusDays(days);
        
        return orderRepository.findAll().stream()
            .filter(order -> order.getOrderDate().isAfter(cutoffDate))
            .map(this::convertToDTO)
            .sorted(Comparator.comparing(OrderDTO::getOrderDate).reversed())
            .collect(Collectors.toList());
    }
    
    private OrderDTO convertToDTO(Order order) {
        OrderDTO dto = new OrderDTO();
        dto.setId(order.getId());
        dto.setOrderDate(order.getOrderDate());
        dto.setTotalAmount(order.getTotalAmount());
        dto.setStatus(order.getStatus().name());
        return dto;
    }
}
```

---

## Chapter 5: Collections Framework

**Collections framework se data structures use kar sakte ho. List, Set, Map - ye sab collections hain.**

### 5.1 List Interface

**List ordered collection hai jisme duplicates allowed hain. ArrayList aur LinkedList main implementations hain.**

```java
public class ListExamples {
    public static void main(String[] args) {
        // ArrayList - fast random access
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("JavaScript");
        arrayList.add("Java"); // Duplicates allowed
        
        System.out.println("ArrayList: " + arrayList);
        System.out.println("Element at index 1: " + arrayList.get(1));
        
        // LinkedList - fast insertion/deletion
        List<String> linkedList = new LinkedList<>();
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");
        
        // LinkedList specific methods
        ((LinkedList<String>) linkedList).addFirst("New First");
        ((LinkedList<String>) linkedList).addLast("New Last");
        
        // Iterating
        for (String item : arrayList) {
            System.out.println(item);
        }
        
        // Using streams
        arrayList.stream()
            .filter(lang -> lang.startsWith("J"))
            .forEach(System.out::println);
    }
}
```

### 5.2 Set Interface

**Set mein duplicates nahi hote. HashSet, LinkedHashSet, aur TreeSet main implementations hain.**

```java
public class SetExamples {
    public static void main(String[] args) {
        // HashSet - no order, fastest
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Apple"); // Duplicate - won't be added
        hashSet.add("Cherry");
        
        System.out.println("HashSet: " + hashSet); // Order not guaranteed
        
        // LinkedHashSet - insertion order maintained
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("One");
        linkedHashSet.add("Two");
        linkedHashSet.add("Three");
        
        System.out.println("LinkedHashSet: " + linkedHashSet); // Order maintained
        
        // TreeSet - sorted order
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(1);
        
        System.out.println("TreeSet: " + treeSet); // [1, 2, 5, 8]
        
        // Set operations
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));
        
        // Union
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union: " + union);
        
        // Intersection
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);
        
        // Difference
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Difference: " + difference);
    }
}
```

### 5.3 Map Interface

**Map key-value pairs store karta hai. HashMap, LinkedHashMap, aur TreeMap main implementations hain.**

```java
public class MapExamples {
    public static void main(String[] args) {
        // HashMap - no order
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Rahul", 25);
        hashMap.put("Priya", 23);
        hashMap.put("Amit", 27);
        
        System.out.println("Age of Rahul: " + hashMap.get("Rahul"));
        System.out.println("Contains Priya? " + hashMap.containsKey("Priya"));
        
        // LinkedHashMap - insertion order
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("IN", "India");
        linkedHashMap.put("US", "United States");
        linkedHashMap.put("UK", "United Kingdom");
        
        // TreeMap - sorted by keys
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        
        System.out.println("TreeMap: " + treeMap); // {1=One, 2=Two, 3=Three}
        
        // Iterating over map
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        
        // Java 8 forEach
        hashMap.forEach((key, value) -> 
            System.out.println(key + " is " + value + " years old")
        );
        
        // Compute methods
        hashMap.computeIfAbsent("Sneha", k -> 22);
        hashMap.computeIfPresent("Rahul", (k, v) -> v + 1);
        hashMap.merge("Amit", 1, (oldVal, newVal) -> oldVal + newVal);
        
        // Get or default
        int age = hashMap.getOrDefault("Unknown", 0);
    }
}
```

### 5.4 Queue and Deque

```java
public class QueueExamples {
    public static void main(String[] args) {
        // Queue - FIFO
        Queue<String> queue = new LinkedList<>();
        queue.offer("First");
        queue.offer("Second");
        queue.offer("Third");
        
        System.out.println("Queue: " + queue);
        System.out.println("Poll: " + queue.poll()); // Removes first
        System.out.println("Peek: " + queue.peek()); // Views first
        
        // PriorityQueue - natural ordering
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(5);
        priorityQueue.offer(2);
        priorityQueue.offer(8);
        priorityQueue.offer(1);
        
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll()); // 1, 2, 5, 8
        }
        
        // Deque - Double ended queue
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("First");
        deque.addLast("Last");
        deque.addFirst("New First");
        
        System.out.println("Deque: " + deque);
        System.out.println("Remove first: " + deque.removeFirst());
        System.out.println("Remove last: " + deque.removeLast());
    }
}
```

### 5.5 Spring Boot Collections Usage

```java
@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;
    
    // Using List
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    
    // Using Set to remove duplicates
    public Set<String> getAllCategories() {
        return productRepository.findAll().stream()
            .map(Product::getCategory)
            .collect(Collectors.toSet());
    }
    
    // Using Map for quick lookup
    public Map<Long, Product> getProductMap() {
        return productRepository.findAll().stream()
            .collect(Collectors.toMap(Product::getId, p -> p));
    }
    
    // Group products by category
    public Map<String, List<Product>> groupByCategory() {
        return productRepository.findAll().stream()
            .collect(Collectors.groupingBy(Product::getCategory));
    }
    
    // Count products per category
    public Map<String, Long> countByCategory() {
        return productRepository.findAll().stream()
            .collect(Collectors.groupingBy(
                Product::getCategory,
                Collectors.counting()
            ));
    }
}

@RestController
@RequestMapping("/api/products")
public class ProductController {
    
    @Autowired
    private ProductService productService;
    
    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }
    
    @GetMapping("/categories")
    public ResponseEntity<Set<String>> getCategories() {
        return ResponseEntity.ok(productService.getAllCategories());
    }
    
    @GetMapping("/grouped")
    public ResponseEntity<Map<String, List<Product>>> getGrouped() {
        return ResponseEntity.ok(productService.groupByCategory());
    }
}
```

---

## Chapter 6: Generics

**Generics se type-safe code likh sakte ho. Compile time pe type checking hoti hai.**

### 6.1 Generic Classes

```java
// Generic class
public class Box<T> {
    private T content;
    
    public void set(T content) {
        this.content = content;
    }
    
    public T get() {
        return content;
    }
    
    public void displayType() {
        System.out.println("Type: " + content.getClass().getName());
    }
}

// Usage
public class GenericDemo {
    public static void main(String[] args) {
        // Integer box
        Box<Integer> intBox = new Box<>();
        intBox.set(100);
        System.out.println("Integer: " + intBox.get());
        
        // String box
        Box<String> strBox = new Box<>();
        strBox.set("Hello");
        System.out.println("String: " + strBox.get());
        
        // Custom object box
        Box<Product> productBox = new Box<>();
        productBox.set(new Product("Laptop", "Electronics", 50000, 10));
    }
}
```

### 6.2 Generic Methods

```java
public class GenericMethods {
    
    // Generic method
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    
    // Multiple type parameters
    public static <K, V> void printKeyValue(K key, V value) {
        System.out.println(key + " -> " + value);
    }
    
    // Bounded type parameter
    public static <T extends Number> double sum(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }
    
    // Generic method with return type
    public static <T> List<T> arrayToList(T[] array) {
        return Arrays.asList(array);
    }
    
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Java", "Python", "JavaScript"};
        
        printArray(intArray);
        printArray(strArray);
        
        printKeyValue("Name", "Rahul");
        printKeyValue(1, "First");
        
        double result = sum(10, 20.5);
        System.out.println("Sum: " + result);
        
        List<Integer> list = arrayToList(intArray);
    }
}
```

### 6.3 Bounded Type Parameters

```java
// Upper bounded wildcard
public class BoundedTypeDemo {
    
    // Accepts Number and its subclasses
    public static double sumOfList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }
    
    // Lower bounded wildcard
    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
    }
    
    // Multiple bounds
    public static <T extends Comparable<T> & Serializable> T findMax(T a, T b) {
        return a.compareTo(b) > 0 ? a : b;
    }
    
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3);
        
        System.out.println("Sum of integers: " + sumOfList(intList));
        System.out.println("Sum of doubles: " + sumOfList(doubleList));
        
        List<Number> numbers = new ArrayList<>();
        addNumbers(numbers);
        System.out.println("Numbers: " + numbers);
        
        String max = findMax("apple", "banana");
        System.out.println("Max: " + max);
    }
}
```

### 6.4 Generic Interfaces

```java
// Generic interface
public interface Repository<T, ID> {
    T save(T entity);
    T findById(ID id);
    List<T> findAll();
    void delete(T entity);
    void deleteById(ID id);
}

// Implementation
public class UserRepository implements Repository<User, Long> {
    private Map<Long, User> database = new HashMap<>();
    
    @Override
    public User save(User user) {
        database.put(user.getId(), user);
        return user;
    }
    
    @Override
    public User findById(Long id) {
        return database.get(id);
    }
    
    @Override
    public List<User> findAll() {
        return new ArrayList<>(database.values());
    }
    
    @Override
    public void delete(User user) {
        database.remove(user.getId());
    }
    
    @Override
    public void deleteById(Long id) {
        database.remove(id);
    }
}
```

### 6.5 Spring Boot Generic Examples

```java
// Generic base entity
@MappedSuperclass
public abstract class BaseEntity<ID> {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ID id;
    
    @CreatedDate
    private LocalDateTime createdAt;
    
    @LastModifiedDate
    private LocalDateTime updatedAt;
    
    // Getters and setters
    public ID getId() { return id; }
    public void setId(ID id) { this.id = id; }
}

// Generic base repository
public interface BaseRepository<T extends BaseEntity<ID>, ID> 
        extends JpaRepository<T, ID> {
    
    List<T> findByCreatedAtAfter(LocalDateTime date);
    List<T> findByUpdatedAtBefore(LocalDateTime date);
}

// Generic base service
public abstract class BaseService<T extends BaseEntity<ID>, ID> {
    
    protected abstract BaseRepository<T, ID> getRepository();
    
    public T save(T entity) {
        return getRepository().save(entity);
    }
    
    public T findById(ID id) {
        return getRepository().findById(id)
            .orElseThrow(() -> new ResourceNotFoundException(
                "Entity not found with id: " + id));
    }
    
    public List<T> findAll() {
        return getRepository().findAll();
    }
    
    public void deleteById(ID id) {
        getRepository().deleteById(id);
    }
    
    public Page<T> findAll(Pageable pageable) {
        return getRepository().findAll(pageable);
    }
}

// Concrete implementation
@Service
public class ProductService extends BaseService<Product, Long> {
    
    @Autowired
    private ProductRepository productRepository;
    
    @Override
    protected BaseRepository<Product, Long> getRepository() {
        return productRepository;
    }
    
    // Additional product-specific methods
    public List<Product> findByCategory(String category) {
        return productRepository.findByCategory(category);
    }
}

// Generic REST response wrapper
public class ApiResponse<T> {
    private boolean success;
    private String message;
    private T data;
    private LocalDateTime timestamp;
    
    public ApiResponse(boolean success, String message, T data) {
        this.success = success;
        this.message = message;
        this.data = data;
        this.timestamp = LocalDateTime.now();
    }
    
    // Static factory methods
    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse<>(true, "Success", data);
    }
    
    public static <T> ApiResponse<T> error(String message) {
        return new ApiResponse<>(false, message, null);
    }
    
    // Getters and setters
}

// Using in controller
@RestController
@RequestMapping("/api/products")
public class ProductController {
    
    @Autowired
    private ProductService productService;
    
    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<Product>> getProduct(@PathVariable Long id) {
        Product product = productService.findById(id);
        return ResponseEntity.ok(ApiResponse.success(product));
    }
    
    @GetMapping
    public ResponseEntity<ApiResponse<List<Product>>> getAllProducts() {
        List<Product> products = productService.findAll();
        return ResponseEntity.ok(ApiResponse.success(products));
    }
}
```

---

## Chapter 7: Functional Programming

**Functional programming mein functions first-class citizens hain. Lambda expressions aur method references use karte hain.**

### 7.1 Lambda Expressions

**Lambda expressions concise way hai anonymous functions likhne ka.**

```java
public class LambdaExamples {
    public static void main(String[] args) {
        // Traditional way
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running in traditional way");
            }
        };
        
        // Lambda way
        Runnable runnable2 = () -> System.out.println("Running with lambda");
        
        // Comparator - traditional
        Comparator<String> comp1 = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        };
        
        // Comparator - lambda
        Comparator<String> comp2 = (s1, s2) -> s1.length() - s2.length();
        
        // Multiple lines lambda
        Comparator<String> comp3 = (s1, s2) -> {
            System.out.println("Comparing: " + s1 + " and " + s2);
            return s1.length() - s2.length();
        };
        
        // List operations with lambda
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        
        // forEach with lambda
        numbers.forEach(n -> System.out.println(n));
        
        // filter with lambda
        numbers.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
    }
}
```

### 7.2 Built-in Functional Interfaces

```java
public class FunctionalInterfacesDemo {
    public static void main(String[] args) {
        // Predicate - boolean test
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<String> startsWithJ = s -> s.startsWith("J");
        
        System.out.println(isEven.test(4)); // true
        System.out.println(startsWithJ.test("Java")); // true
        
        // Function - transformation
        Function<String, Integer> stringLength = s -> s.length();
        Function<Integer, Integer> square = n -> n * n;
        
        System.out.println(stringLength.apply("Hello")); // 5
        System.out.println(square.apply(5)); // 25
        
        // Function chaining
        Function<Integer, Integer> addTen = n -> n + 10;
        Function<Integer, Integer> multiplyByTwo = n -> n * 2;
        Function<Integer, Integer> combined = addTen.andThen(multiplyByTwo);
        
        System.out.println(combined.apply(5)); // (5 + 10) * 2 = 30
        
        // Consumer - accepts input, returns nothing
        Consumer<String> printer = s -> System.out.println(s);
        Consumer<List<Integer>> listPrinter = list -> list.forEach(System.out::println);
        
        printer.accept("Hello World");
        
        // Supplier - supplies value, no input
        Supplier<Double> randomSupplier = () -> Math.random();
        Supplier<LocalDateTime> dateSupplier = () -> LocalDateTime.now();
        
        System.out.println(randomSupplier.get());
        System.out.println(dateSupplier.get());
        
        // BiFunction - two inputs, one output
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        BiFunction<String, String, String> concat = (s1, s2) -> s1 + s2;
        
        System.out.println(add.apply(5, 3)); // 8
        System.out.println(concat.apply("Hello", " World"));
        
        // BiPredicate - two inputs, boolean output
        BiPredicate<String, Integer> lengthCheck = (s, len) -> s.length() > len;
        System.out.println(lengthCheck.test("Hello", 3)); // true
        
        // UnaryOperator - same type input and output
        UnaryOperator<Integer> doubleIt = n -> n * 2;
        System.out.println(doubleIt.apply(5)); // 10
        
        // BinaryOperator - two same type inputs, same type output
        BinaryOperator<Integer> multiply = (a, b) -> a * b;
        System.out.println(multiply.apply(5, 3)); // 15
    }
}
```

### 7.3 Method References

**Method references lambda expressions ka shorthand notation hai.**

```java
public class MethodReferenceDemo {
    
    public static void printMessage(String message) {
        System.out.println(message);
    }
    
    public void instanceMethod(String str) {
        System.out.println("Instance: " + str);
    }
    
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Rahul", "Priya", "Amit", "Sneha");
        
        // Static method reference
        names.forEach(MethodReferenceDemo::printMessage);
        
        // Instance method reference
        MethodReferenceDemo demo = new MethodReferenceDemo();
        names.forEach(demo::instanceMethod);
        
        // Method reference on arbitrary object
        names.stream()
            .map(String::toUpperCase)
            .forEach(System.out::println);
        
        // Constructor reference
        Supplier<ArrayList<String>> listSupplier = ArrayList::new;
        ArrayList<String> list = listSupplier.get();
        
        Function<String, Integer> parser = Integer::parseInt;
        System.out.println(parser.apply("123"));
        
        // Array constructor reference
        Function<Integer, String[]> arrayCreator = String[]::new;
        String[] array = arrayCreator.apply(5);
        
        // Comparator method reference
        List<String> words = Arrays.asList("apple", "pie", "banana", "cat");
        words.sort(String::compareToIgnoreCase);
        System.out.println(words);
    }
}
```

### 7.4 Optional Class

**Optional se null pointer exceptions avoid kar sakte ho. Ye ek container hai jo value hold kar sakta hai ya nahi bhi.**

```java
public class OptionalDemo {
    
    public static Optional<String> findUserById(Long id) {
        // Simulate database lookup
        if (id == 1L) {
            return Optional.of("Rahul");
        }
        return Optional.empty();
    }
    
    public static void main(String[] args) {
        // Creating Optional
        Optional<String> optional1 = Optional.of("Hello");
        Optional<String> optional2 = Optional.ofNullable(null);
        Optional<String> optional3 = Optional.empty();
        
        // isPresent and get
        if (optional1.isPresent()) {
            System.out.println(optional1.get());
        }
        
        // ifPresent - better way
        optional1.ifPresent(value -> System.out.println("Value: " + value));
        
        // orElse - default value
        String name1 = optional2.orElse("Default Name");
        System.out.println(name1);
        
        // orElseGet - lazy evaluation
        String name2 = optional2.orElseGet(() -> "Generated Default");
        
        // orElseThrow
        try {
            String name3 = optional2.orElseThrow(() -> 
                new RuntimeException("Value not present"));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        
        // map and flatMap
        Optional<String> user = findUserById(1L);
        Optional<Integer> nameLength = user.map(String::length);
        nameLength.ifPresent(len -> System.out.println("Name length: " + len));
        
        // filter
        user.filter(name -> name.startsWith("R"))
            .ifPresent(name -> System.out.println("Starts with R: " + name));
        
        // Chaining
        String result = findUserById(1L)
            .map(String::toUpperCase)
            .filter(name -> name.length() > 3)
            .orElse("Unknown");
        
        System.out.println("Result: " + result);
    }
}
```

### 7.5 Spring Boot Functional Programming Examples

```java
@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;
    
    // Using Optional
    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
    
    public User getUserOrThrow(Long id) {
        return userRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException(
                "User not found with id: " + id));
    }
    
    // Functional approach to validation
    public User createUser(UserDTO userDTO) {
        return Optional.of(userDTO)
            .filter(dto -> dto.getEmail() != null)
            .filter(dto -> !userRepository.existsByEmail(dto.getEmail()))
            .map(this::convertToEntity)
            .map(userRepository::save)
            .orElseThrow(() -> new ValidationException("Invalid user data"));
    }
    
    // Using predicates
    public List<User> filterUsers(Predicate<User> predicate) {
        return userRepository.findAll().stream()
            .filter(predicate)
            .collect(Collectors.toList());
    }
    
    // Method reference usage
    public List<String> getAllUsernames() {
        return userRepository.findAll().stream()
            .map(User::getUsername)
            .collect(Collectors.toList());
    }
    
    // Combining predicates
    public List<User> getActiveVerifiedUsers() {
        Predicate<User> isActive = User::isActive;
        Predicate<User> isVerified = User::isEmailVerified;
        
        return userRepository.findAll().stream()
            .filter(isActive.and(isVerified))
            .collect(Collectors.toList());
    }
    
    private User convertToEntity(UserDTO dto) {
        User user = new User();
        user.setUsername(dto.getUsername());
        user.setEmail(dto.getEmail());
        return user;
    }
}

// Functional validation
@Component
public class UserValidator {
    
    private final List<Predicate<User>> validations = Arrays.asList(
        user -> user.getUsername() != null && !user.getUsername().isEmpty(),
        user -> user.getEmail() != null && user.getEmail().contains("@"),
        user -> user.getPassword() != null && user.getPassword().length() >= 8
    );
    
    public boolean validate(User user) {
        return validations.stream()
            .allMatch(validation -> validation.test(user));
    }
    
    public List<String> getValidationErrors(User user) {
        List<String> errors = new ArrayList<>();
        
        if (!validations.get(0).test(user)) {
            errors.add("Username is required");
        }
        if (!validations.get(1).test(user)) {
            errors.add("Valid email is required");
        }
        if (!validations.get(2).test(user)) {
            errors.add("Password must be at least 8 characters");
        }
        
        return errors;
    }
}
```

---

## Chapter 8: Annotations

**Annotations metadata provide karte hain jo compiler aur runtime pe use hote hain. Spring Boot heavily annotations use karta hai.**

### 8.1 Built-in Java Annotations

```java
public class BuiltInAnnotations {
    
    // @Override - method override check karta hai
    @Override
    public String toString() {
        return "BuiltInAnnotations instance";
    }
    
    // @Deprecated - indicates method is outdated
    @Deprecated
    public void oldMethod() {
        ```java
        System.out.println("This method is deprecated");
    }
    
    // @SuppressWarnings - suppress compiler warnings
    @SuppressWarnings("unchecked")
    public void methodWithWarnings() {
        List list = new ArrayList(); // Raw type warning suppressed
        list.add("String");
    }
    
    // @FunctionalInterface - ensures single abstract method
    @FunctionalInterface
    interface Calculator {
        int calculate(int a, int b);
    }
    
    // @SafeVarargs - suppress varargs warnings
    @SafeVarargs
    public final <T> void printItems(T... items) {
        for (T item : items) {
            System.out.println(item);
        }
    }
}
```

### 8.2 Custom Annotations

**Apne custom annotations bana sakte ho specific needs ke liye.**

```java
// Simple marker annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface LogExecutionTime {
}

// Annotation with parameters
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Author {
    String name();
    String date();
    int version() default 1;
}

// Annotation with multiple targets
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface Validate {
    String message() default "Validation failed";
    int min() default 0;
    int max() default Integer.MAX_VALUE;
}

// Field validation annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface NotEmpty {
    String message() default "Field cannot be empty";
}

// Using custom annotations
@Author(name = "Rahul", date = "2024-01-15", version = 2)
public class CustomAnnotationDemo {
    
    @NotEmpty(message = "Username is required")
    private String username;
    
    @Validate(min = 18, max = 100, message = "Age must be between 18 and 100")
    private int age;
    
    @LogExecutionTime
    public void processData() {
        System.out.println("Processing data...");
        // Simulation
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
```

### 8.3 Processing Custom Annotations

**Reflection se annotations ko process kar sakte ho.**

```java
public class AnnotationProcessor {
    
    // Process @LogExecutionTime annotation
    public static void processLogExecutionTime(Object obj) throws Exception {
        Method[] methods = obj.getClass().getDeclaredMethods();
        
        for (Method method : methods) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                long startTime = System.currentTimeMillis();
                
                method.invoke(obj);
                
                long endTime = System.currentTimeMillis();
                System.out.println(method.getName() + " executed in " + 
                    (endTime - startTime) + "ms");
            }
        }
    }
    
    // Process @Author annotation
    public static void processAuthor(Class<?> clazz) {
        if (clazz.isAnnotationPresent(Author.class)) {
            Author author = clazz.getAnnotation(Author.class);
            System.out.println("Author: " + author.name());
            System.out.println("Date: " + author.date());
            System.out.println("Version: " + author.version());
        }
    }
    
    // Validate fields
    public static boolean validateObject(Object obj) throws IllegalAccessException {
        Field[] fields = obj.getClass().getDeclaredFields();
        boolean isValid = true;
        
        for (Field field : fields) {
            field.setAccessible(true);
            
            // Check @NotEmpty
            if (field.isAnnotationPresent(NotEmpty.class)) {
                Object value = field.get(obj);
                if (value == null || value.toString().isEmpty()) {
                    NotEmpty annotation = field.getAnnotation(NotEmpty.class);
                    System.out.println(annotation.message());
                    isValid = false;
                }
            }
            
            // Check @Validate
            if (field.isAnnotationPresent(Validate.class)) {
                Validate annotation = field.getAnnotation(Validate.class);
                if (field.getType() == int.class) {
                    int value = field.getInt(obj);
                    if (value < annotation.min() || value > annotation.max()) {
                        System.out.println(annotation.message());
                        isValid = false;
                    }
                }
            }
        }
        
        return isValid;
    }
    
    public static void main(String[] args) throws Exception {
        CustomAnnotationDemo demo = new CustomAnnotationDemo();
        
        // Process @Author
        processAuthor(CustomAnnotationDemo.class);
        
        // Process @LogExecutionTime
        processLogExecutionTime(demo);
    }
}
```

### 8.4 Spring Boot Annotations

**Spring Boot mein bahut important annotations hain. Yaha sab commonly used annotations hain.**

```java
// ===== CORE SPRING ANNOTATIONS =====

// @Component - Generic Spring component
@Component
public class EmailService {
    public void sendEmail(String to, String message) {
        System.out.println("Sending email to: " + to);
    }
}

// @Service - Business logic layer
@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private EmailService emailService;
    
    public User createUser(User user) {
        User savedUser = userRepository.save(user);
        emailService.sendEmail(user.getEmail(), "Welcome!");
        return savedUser;
    }
}

// @Repository - Data access layer
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}

// @Controller - Web controller (returns views)
@Controller
public class HomeController {
    
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Welcome");
        return "home"; // Returns view name
    }
}

// @RestController - REST API controller (returns JSON/XML)
@RestController
@RequestMapping("/api/users")
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.findAll());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        User user = userService.getUserById(id);
        return ResponseEntity.ok(user);
    }
    
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody @Valid UserDTO userDTO) {
        User user = userService.createUser(userDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(
            @PathVariable Long id,
            @RequestBody @Valid UserDTO userDTO) {
        User user = userService.updateUser(id, userDTO);
        return ResponseEntity.ok(user);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
    
    @GetMapping("/search")
    public ResponseEntity<List<User>> searchUsers(
            @RequestParam String keyword,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return ResponseEntity.ok(userService.searchUsers(keyword, page, size));
    }
}

// ===== CONFIGURATION ANNOTATIONS =====

@Configuration
public class AppConfig {
    
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    
    @Bean
    @Primary // When multiple beans of same type exist
    public DataSource primaryDataSource() {
        // Configuration
        return new HikariDataSource();
    }
    
    @Bean
    @Qualifier("secondaryDataSource")
    public DataSource secondaryDataSource() {
        return new HikariDataSource();
    }
}

// @ConfigurationProperties - bind properties from application.properties
@Component
@ConfigurationProperties(prefix = "app")
public class AppProperties {
    private String name;
    private String version;
    private Security security;
    
    // Getters and setters
    
    public static class Security {
        private String jwtSecret;
        private long jwtExpiration;
        
        // Getters and setters
    }
}

// application.properties:
// app.name=MyApp
// app.version=1.0.0
// app.security.jwt-secret=mysecret
// app.security.jwt-expiration=86400000

// @Value - inject property values
@Component
public class ConfigService {
    
    @Value("${app.name}")
    private String appName;
    
    @Value("${server.port:8080}") // Default value
    private int serverPort;
    
    @Value("#{systemProperties['user.name']}")
    private String systemUser;
}

// ===== JPA/HIBERNATE ANNOTATIONS =====

@Entity
@Table(name = "users", indexes = {
    @Index(name = "idx_username", columnList = "username"),
    @Index(name = "idx_email", columnList = "email")
})
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(unique = true, nullable = false, length = 50)
    private String username;
    
    @Column(unique = true, nullable = false)
    private String email;
    
    @Column(nullable = false)
    private String password;
    
    @Enumerated(EnumType.STRING)
    private UserRole role;
    
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;
    
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt;
    
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Order> orders = new ArrayList<>();
    
    @ManyToMany
    @JoinTable(
        name = "user_roles",
        joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<Role> roles = new HashSet<>();
    
    @Transient // Not persisted in database
    private String tempData;
    
    // Getters and setters
}

@Entity
@Table(name = "orders")
public class Order {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItem> orderItems = new ArrayList<>();
    
    @Column(nullable = false)
    private BigDecimal totalAmount;
    
    @Enumerated(EnumType.STRING)
    private OrderStatus status;
    
    // Getters and setters
}

// ===== VALIDATION ANNOTATIONS =====

public class UserDTO {
    
    @NotNull(message = "Username cannot be null")
    @NotBlank(message = "Username cannot be blank")
    @Size(min = 3, max = 50, message = "Username must be between 3 and 50 characters")
    private String username;
    
    @NotBlank(message = "Email is required")
    @Email(message = "Email should be valid")
    private String email;
    
    @NotBlank(message = "Password is required")
    @Size(min = 8, message = "Password must be at least 8 characters")
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$",
             message = "Password must contain uppercase, lowercase, digit and special character")
    private String password;
    
    @Min(value = 18, message = "Age must be at least 18")
    @Max(value = 100, message = "Age must be less than 100")
    private Integer age;
    
    @Past(message = "Birth date must be in the past")
    private LocalDate birthDate;
    
    @Future(message = "Expiry date must be in the future")
    private LocalDate expiryDate;
    
    @DecimalMin(value = "0.0", message = "Salary must be positive")
    @DecimalMax(value = "1000000.0", message = "Salary too high")
    private BigDecimal salary;
    
    @Positive(message = "Quantity must be positive")
    private Integer quantity;
    
    @URL(message = "Must be a valid URL")
    private String website;
    
    @AssertTrue(message = "Must accept terms and conditions")
    private Boolean termsAccepted;
    
    // Getters and setters
}

// ===== TRANSACTION ANNOTATIONS =====

@Service
public class OrderService {
    
    @Autowired
    private OrderRepository orderRepository;
    
    @Autowired
    private PaymentService paymentService;
    
    // Default transaction - rolls back on RuntimeException
    @Transactional
    public Order createOrder(OrderDTO orderDTO) {
        Order order = new Order();
        // Set order details
        return orderRepository.save(order);
    }
    
    // Read-only transaction - optimization
    @Transactional(readOnly = true)
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
    
    // Custom transaction configuration
    @Transactional(
        propagation = Propagation.REQUIRED,
        isolation = Isolation.READ_COMMITTED,
        timeout = 30,
        rollbackFor = Exception.class
    )
    public Order processOrder(Long orderId) throws Exception {
        Order order = orderRepository.findById(orderId)
            .orElseThrow(() -> new ResourceNotFoundException("Order not found"));
        
        // Process payment
        paymentService.processPayment(order);
        
        // Update order status
        order.setStatus(OrderStatus.COMPLETED);
        return orderRepository.save(order);
    }
    
    // Requires new transaction
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void logOrderActivity(Long orderId, String activity) {
        // This runs in separate transaction
        // Won't rollback even if parent transaction fails
    }
}

// ===== SCHEDULING ANNOTATIONS =====

@Component
@EnableScheduling
public class ScheduledTasks {
    
    // Fixed rate - runs every 5 seconds
    @Scheduled(fixedRate = 5000)
    public void taskWithFixedRate() {
        System.out.println("Task executed at fixed rate: " + LocalDateTime.now());
    }
    
    // Fixed delay - waits 5 seconds after completion
    @Scheduled(fixedDelay = 5000)
    public void taskWithFixedDelay() {
        System.out.println("Task with fixed delay: " + LocalDateTime.now());
    }
    
    // Cron expression - runs every day at 2 AM
    @Scheduled(cron = "0 0 2 * * ?")
    public void taskWithCronExpression() {
        System.out.println("Scheduled task at 2 AM: " + LocalDateTime.now());
    }
    
    // Run on startup and then every hour
    @Scheduled(initialDelay = 1000, fixedRate = 3600000)
    public void taskWithInitialDelay() {
        System.out.println("Task with initial delay: " + LocalDateTime.now());
    }
}

// ===== ASYNC ANNOTATIONS =====

@Service
@EnableAsync
public class AsyncService {
    
    @Async
    public CompletableFuture<String> asyncMethod() {
        System.out.println("Executing async method in thread: " + 
            Thread.currentThread().getName());
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        return CompletableFuture.completedFuture("Async Result");
    }
    
    @Async
    public void sendEmailAsync(String to, String message) {
        // Send email asynchronously
        System.out.println("Sending email async to: " + to);
    }
}

// ===== CACHING ANNOTATIONS =====

@Service
@CacheConfig(cacheNames = "users")
public class CachedUserService {
    
    @Autowired
    private UserRepository userRepository;
    
    @Cacheable(key = "#id")
    public User getUserById(Long id) {
        System.out.println("Fetching from database: " + id);
        return userRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("User not found"));
    }
    
    @Cacheable(key = "#username")
    public Optional<User> getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
    
    @CachePut(key = "#user.id")
    public User updateUser(User user) {
        return userRepository.save(user);
    }
    
    @CacheEvict(key = "#id")
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
    
    @CacheEvict(allEntries = true)
    public void clearCache() {
        System.out.println("Cache cleared");
    }
}

// ===== SECURITY ANNOTATIONS =====

@RestController
@RequestMapping("/api/admin")
public class AdminController {
    
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/users")
    public List<User> getAllUsers() {
        // Only accessible by ADMIN role
        return userService.findAll();
    }
    
    @PreAuthorize("hasAnyRole('ADMIN', 'MANAGER')")
    @GetMapping("/reports")
    public Report getReport() {
        return reportService.generateReport();
    }
    
    @PreAuthorize("#username == authentication.principal.username or hasRole('ADMIN')")
    @GetMapping("/users/{username}")
    public User getUser(@PathVariable String username) {
        // User can access own data or admin can access any
        return userService.findByUsername(username);
    }
    
    @PostAuthorize("returnObject.username == authentication.principal.username")
    @GetMapping("/profile/{id}")
    public User getProfile(@PathVariable Long id) {
        return userService.getUserById(id);
    }
}

// ===== CONDITIONAL ANNOTATIONS =====

@Configuration
public class ConditionalConfig {
    
    @Bean
    @ConditionalOnProperty(name = "feature.email.enabled", havingValue = "true")
    public EmailService emailService() {
        return new EmailServiceImpl();
    }
    
    @Bean
    @ConditionalOnMissingBean
    public DefaultService defaultService() {
        return new DefaultService();
    }
    
    @Bean
    @ConditionalOnClass(name = "com.mysql.cj.jdbc.Driver")
    public DataSource mysqlDataSource() {
        return new HikariDataSource();
    }
    
    @Bean
    @Profile("dev")
    public DataSource devDataSource() {
        return new H2DataSource();
    }
    
    @Bean
    @Profile("prod")
    public DataSource prodDataSource() {
        return new MySQLDataSource();
    }
}
```

---

## Chapter 9: Multi-threading and Concurrency

**Multi-threading se multiple tasks simultaneously execute kar sakte ho. Performance improve hoti hai.**

### 9.1 Creating Threads

```java
// Method 1: Extending Thread class
class MyThread extends Thread {
    private String threadName;
    
    public MyThread(String name) {
        this.threadName = name;
    }
    
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + ": " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Method 2: Implementing Runnable interface
class MyRunnable implements Runnable {
    private String taskName;
    
    public MyRunnable(String name) {
        this.taskName = name;
    }
    
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskName + ": " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        // Using Thread class
        MyThread thread1 = new MyThread("Thread-1");
        MyThread thread2 = new MyThread("Thread-2");
        
        thread1.start();
        thread2.start();
        
        // Using Runnable interface
        Thread thread3 = new Thread(new MyRunnable("Task-1"));
        Thread thread4 = new Thread(new MyRunnable("Task-2"));
        
        thread3.start();
        thread4.start();
        
        // Using lambda (Java 8+)
        Thread thread5 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Lambda Thread: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        
        thread5.start();
    }
}
```

### 9.2 Thread Synchronization

**Synchronization se race conditions avoid hote hain. Ek time pe ek hi thread access kar sakta hai.**

```java
class BankAccount {
    private double balance;
    
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    
    // Synchronized method
    public synchronized void deposit(double amount) {
        System.out.println(Thread.currentThread().getName() + 
            " depositing: " + amount);
        balance += amount;
        System.out.println("New balance after deposit: " + balance);
    }
    
    // Synchronized method
    public synchronized void withdraw(double amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + 
                " withdrawing: " + amount);
            balance -= amount;
            System.out.println("New balance after withdrawal: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
    
    public synchronized double getBalance() {
        return balance;
    }
}

// Synchronized block example
class Counter {
    private int count = 0;
    private final Object lock = new Object();
    
    public void increment() {
        synchronized (lock) {
            count++;
        }
    }
    
    public void decrement() {
        synchronized (lock) {
            count--;
        }
    }
    
    public int getCount() {
        synchronized (lock) {
            return count;
        }
    }
}

public class SynchronizationDemo {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount(1000);
        
        // Multiple threads accessing same account
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                account.deposit(100);
            }
        }, "Thread-1");
        
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                account.withdraw(50);
            }
        }, "Thread-2");
        
        t1.start();
        t2.start();
        
        t1.join(); // Wait for thread to complete
        t2.join();
        
        System.out.println("Final balance: " + account.getBalance());
    }
}
```

### 9.3 ExecutorService

**ExecutorService se thread pool manage kar sakte ho. Better than manual thread creation.**

```java
public class ExecutorServiceDemo {
    public static void main(String[] args) {
        // Fixed thread pool
        ExecutorService executor = Executors.newFixedThreadPool(3);
        
        // Submit tasks
        for (int i = 1; i <= 10; i++) {
            int taskNumber = i;
            executor.submit(() -> {
                System.out.println("Task " + taskNumber + 
                    " executed by " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        
        // Shutdown executor
        executor.shutdown();
        
        // Single thread executor
        ExecutorService singleExecutor = Executors.newSingleThreadExecutor();
        singleExecutor.submit(() -> System.out.println("Single thread task"));
        singleExecutor.shutdown();
        
        // Cached thread pool - creates threads as needed
        ExecutorService cachedExecutor = Executors.newCachedThreadPool();
        cachedExecutor.submit(() -> System.out.println("Cached pool task"));
        cachedExecutor.shutdown();
        
        // Scheduled executor
        ScheduledExecutorService scheduledExecutor = 
            Executors.newScheduledThreadPool(2);
        
        // Execute after 2 seconds delay
        scheduledExecutor.schedule(() -> 
            System.out.println("Delayed task"), 2, TimeUnit.SECONDS);
        
        // Execute repeatedly every 3 seconds
        scheduledExecutor.scheduleAtFixedRate(() -> 
            System.out.println("Periodic task"), 
            0, 3, TimeUnit.SECONDS);
        
        // Shutdown after 15 seconds
        scheduledExecutor.schedule(() -> scheduledExecutor.shutdown(), 
            15, TimeUnit.SECONDS);
    }
}
```

### 9.4 CompletableFuture

**CompletableFuture se asynchronous programming easy ho jati hai.**

```java
public class CompletableFutureDemo {
    
    public static void main(String[] args) throws Exception {
        // Simple async computation
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Running in: " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hello";
        });
        
        // Chain operations
        CompletableFuture<String> future2 = future1
            .thenApply(result -> result + " World")
            .thenApply(String::toUpperCase);
        
        System.out.println(future2.get()); // Blocks until complete
        
        // thenAccept - consume result
        CompletableFuture.supplyAsync(() -> "Processing")
            .thenAccept(result -> System.out.println("Result: " + result));
        
        // thenRun - run after completion
        CompletableFuture.supplyAsync(() -> "Task Complete")
            .thenRun(() -> System.out.println("Cleanup done"));
        
        // Combining multiple futures
        CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> "Hello");
        CompletableFuture<String> future4 = CompletableFuture.supplyAsync(() -> "World");
        
        CompletableFuture<String> combined = future3.thenCombine(future4, 
            (s1, s2) -> s1 + " " + s2);
        
        System.out.println(combined.get());
        
        // Exception handling
        CompletableFuture<String> futureWithError = CompletableFuture.supplyAsync(() -> {
            if (true) throw new RuntimeException("Error occurred");
            return "Success";
        }).exceptionally(ex -> {
            System.out.println("Exception: " + ex.getMessage());
            return "Default Value";
        });
        
        System.out.println(futureWithError.get());
        
        // Multiple async tasks
        CompletableFuture<String> task1 = CompletableFuture.supplyAsync(() -> {
            sleep(1000);
            return "Task 1";
        });
        
        CompletableFuture<String> task2 = CompletableFuture.supplyAsync(() -> {
            sleep(1500);
            return "Task 2";
        });
        
        CompletableFuture<String> task3 = CompletableFuture.supplyAsync(() -> {
            sleep(800);
            return "Task 3";
        });
        
        // Wait for all to complete
        CompletableFuture<Void> allTasks = CompletableFuture.allOf(task1, task2, task3);
        allTasks.thenRun(() -> {
            try {
                System.out.println(task1.get());
                System.out.println(task2.get());
                System.out.println(task3.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        
        // Wait for any to complete
        CompletableFuture<Object> anyTask = CompletableFuture.anyOf(task1, task2, task3);
        System.out.println("First completed: " + anyTask.get());
        
        Thread.sleep(3000); // Wait for all async tasks
    }
    
    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
```

### 9.5 Spring Boot Async Examples

```java
@Configuration
@EnableAsync
public class AsyncConfig {
    
    @Bean(name = "taskExecutor")
    public Executor taskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(5);
        executor.setMaxPoolSize(10);
        executor.setQueueCapacity(100);
        executor.setThreadNamePrefix("async-");
        executor.initialize();
        return executor;
    }
}

@Service
public class AsyncService {
    
    private static final Logger logger = LoggerFactory.getLogger(AsyncService.class);
    
    @Async("taskExecutor")
    public CompletableFuture<User> findUserAsync(Long id) {
        logger.info("Finding user in thread: " + Thread.currentThread().getName());
        
        // Simulate delay
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        User user = userRepository.findById(id).orElse(null);
        return CompletableFuture.completedFuture(user);
    }
    
    @Async
    public void sendWelcomeEmail(String email) {
        ```java
        logger.info("Sending email in thread: " + Thread.currentThread().getName());
        
        try {
            Thread.sleep(1000); // Simulate email sending
            System.out.println("Email sent to: " + email);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    @Async
    public CompletableFuture<List<Product>> getProductsAsync() {
        logger.info("Fetching products in thread: " + Thread.currentThread().getName());
        
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        List<Product> products = productRepository.findAll();
        return CompletableFuture.completedFuture(products);
    }
    
    @Async
    public CompletableFuture<OrderReport> generateOrderReport(Long orderId) {
        logger.info("Generating report in thread: " + Thread.currentThread().getName());
        
        try {
            Thread.sleep(3000); // Simulate complex report generation
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        OrderReport report = new OrderReport();
        // Generate report logic
        return CompletableFuture.completedFuture(report);
    }
}

@RestController
@RequestMapping("/api/async")
public class AsyncController {
    
    @Autowired
    private AsyncService asyncService;
    
    @GetMapping("/user/{id}")
    public CompletableFuture<ResponseEntity<User>> getUserAsync(@PathVariable Long id) {
        return asyncService.findUserAsync(id)
            .thenApply(user -> ResponseEntity.ok(user))
            .exceptionally(ex -> ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build());
    }
    
    @PostMapping("/user")
    public ResponseEntity<String> createUser(@RequestBody UserDTO userDTO) {
        // Create user synchronously
        User user = userService.createUser(userDTO);
        
        // Send email asynchronously (fire and forget)
        asyncService.sendWelcomeEmail(user.getEmail());
        
        return ResponseEntity.ok("User created successfully");
    }
    
    @GetMapping("/dashboard")
    public CompletableFuture<ResponseEntity<DashboardData>> getDashboard() {
        // Execute multiple async tasks in parallel
        CompletableFuture<List<User>> usersFuture = asyncService.getUsersAsync();
        CompletableFuture<List<Product>> productsFuture = asyncService.getProductsAsync();
        CompletableFuture<OrderReport> reportFuture = asyncService.getOrderReportAsync();
        
        // Combine all results
        return CompletableFuture.allOf(usersFuture, productsFuture, reportFuture)
            .thenApply(v -> {
                try {
                    DashboardData dashboard = new DashboardData();
                    dashboard.setUsers(usersFuture.get());
                    dashboard.setProducts(productsFuture.get());
                    dashboard.setReport(reportFuture.get());
                    return ResponseEntity.ok(dashboard);
                } catch (Exception e) {
                    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
                }
            });
    }
}
```

---

## Chapter 10: File I/O and NIO

**File operations ke liye Java IO aur NIO packages use hote hain. Files read, write, aur process kar sakte ho.**

### 10.1 Basic File Operations

```java
public class FileOperations {
    
    // Reading file - traditional way
    public static String readFileTraditional(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        StringBuilder content = new StringBuilder();
        String line;
        
        while ((line = reader.readLine()) != null) {
            content.append(line).append("\n");
        }
        
        reader.close();
        return content.toString();
    }
    
    // Reading file - NIO way
    public static String readFileNIO(String filename) throws IOException {
        Path path = Paths.get(filename);
        return new String(Files.readAllBytes(path));
    }
    
    // Reading file - Java 8 streams
    public static List<String> readFileLines(String filename) throws IOException {
        return Files.readAllLines(Paths.get(filename));
    }
    
    // Reading file - with Stream API
    public static void readFileWithStream(String filename) throws IOException {
        try (Stream<String> lines = Files.lines(Paths.get(filename))) {
            lines.filter(line -> !line.isEmpty())
                 .map(String::toUpperCase)
                 .forEach(System.out::println);
        }
    }
    
    // Writing to file
    public static void writeToFile(String filename, String content) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        writer.write(content);
        writer.close();
    }
    
    // Writing to file - NIO way
    public static void writeFileNIO(String filename, String content) throws IOException {
        Files.write(Paths.get(filename), content.getBytes());
    }
    
    // Appending to file
    public static void appendToFile(String filename, String content) throws IOException {
        Files.write(
            Paths.get(filename),
            content.getBytes(),
            StandardOpenOption.APPEND,
            StandardOpenOption.CREATE
        );
    }
    
    // Copy file
    public static void copyFile(String source, String destination) throws IOException {
        Files.copy(
            Paths.get(source),
            Paths.get(destination),
            StandardCopyOption.REPLACE_EXISTING
        );
    }
    
    // Delete file
    public static void deleteFile(String filename) throws IOException {
        Files.deleteIfExists(Paths.get(filename));
    }
    
    // Check if file exists
    public static boolean fileExists(String filename) {
        return Files.exists(Paths.get(filename));
    }
    
    // Get file info
    public static void getFileInfo(String filename) throws IOException {
        Path path = Paths.get(filename);
        
        System.out.println("File name: " + path.getFileName());
        System.out.println("Absolute path: " + path.toAbsolutePath());
        System.out.println("Size: " + Files.size(path) + " bytes");
        System.out.println("Is directory: " + Files.isDirectory(path));
        System.out.println("Is readable: " + Files.isReadable(path));
        System.out.println("Is writable: " + Files.isWritable(path));
        System.out.println("Last modified: " + Files.getLastModifiedTime(path));
    }
}
```

### 10.2 Directory Operations

```java
public class DirectoryOperations {
    
    // Create directory
    public static void createDirectory(String path) throws IOException {
        Files.createDirectories(Paths.get(path));
    }
    
    // List files in directory
    public static void listFiles(String directoryPath) throws IOException {
        try (Stream<Path> paths = Files.list(Paths.get(directoryPath))) {
            paths.filter(Files::isRegularFile)
                 .forEach(System.out::println);
        }
    }
    
    // List all files recursively
    public static void listFilesRecursively(String directoryPath) throws IOException {
        try (Stream<Path> paths = Files.walk(Paths.get(directoryPath))) {
            paths.filter(Files::isRegularFile)
                 .forEach(System.out::println);
        }
    }
    
    // Find files by extension
    public static List<Path> findFilesByExtension(String directoryPath, String extension) 
            throws IOException {
        try (Stream<Path> paths = Files.walk(Paths.get(directoryPath))) {
            return paths.filter(Files::isRegularFile)
                        .filter(path -> path.toString().endsWith(extension))
                        .collect(Collectors.toList());
        }
    }
    
    // Delete directory recursively
    public static void deleteDirectory(String directoryPath) throws IOException {
        Path path = Paths.get(directoryPath);
        
        if (Files.exists(path)) {
            Files.walk(path)
                 .sorted(Comparator.reverseOrder())
                 .forEach(p -> {
                     try {
                         Files.delete(p);
                     } catch (IOException e) {
                         e.printStackTrace();
                     }
                 });
        }
    }
    
    // Copy directory
    public static void copyDirectory(String source, String destination) throws IOException {
        Path sourcePath = Paths.get(source);
        Path destPath = Paths.get(destination);
        
        Files.walk(sourcePath)
             .forEach(src -> {
                 try {
                     Path dest = destPath.resolve(sourcePath.relativize(src));
                     if (Files.isDirectory(src)) {
                         Files.createDirectories(dest);
                     } else {
                         Files.copy(src, dest, StandardCopyOption.REPLACE_EXISTING);
                     }
                 } catch (IOException e) {
                     e.printStackTrace();
                 }
             });
    }
    
    // Get directory size
    public static long getDirectorySize(String directoryPath) throws IOException {
        return Files.walk(Paths.get(directoryPath))
                    .filter(Files::isRegularFile)
                    .mapToLong(path -> {
                        try {
                            return Files.size(path);
                        } catch (IOException e) {
                            return 0L;
                        }
                    })
                    .sum();
    }
}
```

### 10.3 Working with CSV Files

```java
public class CSVHandler {
    
    // Read CSV file
    public static List<String[]> readCSV(String filename) throws IOException {
        List<String[]> data = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                data.add(values);
            }
        }
        
        return data;
    }
    
    // Write CSV file
    public static void writeCSV(String filename, List<String[]> data) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (String[] row : data) {
                bw.write(String.join(",", row));
                bw.newLine();
            }
        }
    }
    
    // Read CSV to objects
    public static List<User> readUsersFromCSV(String filename) throws IOException {
        List<User> users = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            boolean firstLine = true;
            
            while ((line = br.readLine()) != null) {
                if (firstLine) {
                    firstLine = false; // Skip header
                    continue;
                }
                
                String[] values = line.split(",");
                User user = new User();
                user.setId(Long.parseLong(values[0]));
                user.setUsername(values[1]);
                user.setEmail(values[2]);
                users.add(user);
            }
        }
        
        return users;
    }
    
    // Write objects to CSV
    public static void writeUsersToCSV(String filename, List<User> users) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            // Write header
            bw.write("ID,Username,Email");
            bw.newLine();
            
            // Write data
            for (User user : users) {
                bw.write(user.getId() + "," + 
                        user.getUsername() + "," + 
                        user.getEmail());
                bw.newLine();
            }
        }
    }
}
```

### 10.4 Working with JSON Files

```java
// Using Jackson library
public class JSONHandler {
    
    private static final ObjectMapper objectMapper = new ObjectMapper();
    
    // Read JSON from file
    public static <T> T readJSON(String filename, Class<T> clazz) throws IOException {
        File file = new File(filename);
        return objectMapper.readValue(file, clazz);
    }
    
    // Read JSON array from file
    public static <T> List<T> readJSONArray(String filename, Class<T> clazz) throws IOException {
        File file = new File(filename);
        return objectMapper.readValue(
            file,
            objectMapper.getTypeFactory().constructCollectionType(List.class, clazz)
        );
    }
    
    // Write object to JSON file
    public static void writeJSON(String filename, Object object) throws IOException {
        objectMapper.writerWithDefaultPrettyPrinter()
                   .writeValue(new File(filename), object);
    }
    
    // Convert object to JSON string
    public static String toJSONString(Object object) throws JsonProcessingException {
        return objectMapper.writerWithDefaultPrettyPrinter()
                          .writeValueAsString(object);
    }
    
    // Convert JSON string to object
    public static <T> T fromJSONString(String json, Class<T> clazz) throws JsonProcessingException {
        return objectMapper.readValue(json, clazz);
    }
}

// Example usage
public class JSONExample {
    public static void main(String[] args) throws IOException {
        // Write user to JSON
        User user = new User(1L, "rahul", "rahul@example.com");
        JSONHandler.writeJSON("user.json", user);
        
        // Read user from JSON
        User readUser = JSONHandler.readJSON("user.json", User.class);
        System.out.println(readUser);
        
        // Write list to JSON
        List<User> users = Arrays.asList(
            new User(1L, "rahul", "rahul@example.com"),
            new User(2L, "priya", "priya@example.com")
        );
        JSONHandler.writeJSON("users.json", users);
        
        // Read list from JSON
        List<User> readUsers = JSONHandler.readJSONArray("users.json", User.class);
        readUsers.forEach(System.out::println);
    }
}
```

### 10.5 Spring Boot File Upload/Download

```java
@RestController
@RequestMapping("/api/files")
public class FileController {
    
    private static final String UPLOAD_DIR = "uploads/";
    
    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        try {
            // Validate file
            if (file.isEmpty()) {
                return ResponseEntity.badRequest().body("File is empty");
            }
            
            // Create upload directory if not exists
            Path uploadPath = Paths.get(UPLOAD_DIR);
            if (!Files.exists(uploadPath)) {
                Files.createDirectories(uploadPath);
            }
            
            // Save file
            String filename = System.currentTimeMillis() + "_" + file.getOriginalFilename();
            Path filePath = uploadPath.resolve(filename);
            Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);
            
            return ResponseEntity.ok("File uploaded successfully: " + filename);
            
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                                .body("Failed to upload file: " + e.getMessage());
        }
    }
    
    @PostMapping("/upload-multiple")
    public ResponseEntity<List<String>> uploadMultipleFiles(
            @RequestParam("files") MultipartFile[] files) {
        
        List<String> uploadedFiles = new ArrayList<>();
        
        for (MultipartFile file : files) {
            try {
                if (!file.isEmpty()) {
                    String filename = System.currentTimeMillis() + "_" + 
                                    file.getOriginalFilename();
                    Path filePath = Paths.get(UPLOAD_DIR).resolve(filename);
                    Files.copy(file.getInputStream(), filePath, 
                             StandardCopyOption.REPLACE_EXISTING);
                    uploadedFiles.add(filename);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        return ResponseEntity.ok(uploadedFiles);
    }
    
    @GetMapping("/download/{filename}")
    public ResponseEntity<Resource> downloadFile(@PathVariable String filename) {
        try {
            Path filePath = Paths.get(UPLOAD_DIR).resolve(filename);
            Resource resource = new UrlResource(filePath.toUri());
            
            if (resource.exists() && resource.isReadable()) {
                return ResponseEntity.ok()
                    .header(HttpHeaders.CONTENT_DISPOSITION, 
                           "attachment; filename=\"" + resource.getFilename() + "\"")
                    .body(resource);
            } else {
                return ResponseEntity.notFound().build();
            }
            
        } catch (MalformedURLException e) {
            return ResponseEntity.badRequest().build();
        }
    }
    
    @GetMapping("/list")
    public ResponseEntity<List<String>> listFiles() {
        try {
            List<String> files = Files.list(Paths.get(UPLOAD_DIR))
                .map(Path::getFileName)
                .map(Path::toString)
                .collect(Collectors.toList());
            
            return ResponseEntity.ok(files);
            
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    @DeleteMapping("/{filename}")
    public ResponseEntity<String> deleteFile(@PathVariable String filename) {
        try {
            Path filePath = Paths.get(UPLOAD_DIR).resolve(filename);
            Files.deleteIfExists(filePath);
            return ResponseEntity.ok("File deleted successfully");
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                                .body("Failed to delete file");
        }
    }
}

// File upload configuration
@Configuration
public class FileUploadConfig {
    
    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        factory.setMaxFileSize(DataSize.ofMegabytes(10));
        factory.setMaxRequestSize(DataSize.ofMegabytes(50));
        return factory.createMultipartConfig();
    }
}

// application.properties
// spring.servlet.multipart.max-file-size=10MB
// spring.servlet.multipart.max-request-size=50MB
```

---

## Chapter 11: Design Patterns for Spring Boot

**Design patterns reusable solutions hain common problems ke liye. Spring Boot mein kafi patterns use hote hain.**

### 11.1 Singleton Pattern

**Singleton pattern ensure karta hai ki class ka sirf ek instance ho. Spring beans by default singleton hote hain.**

```java
// Traditional Singleton
public class DatabaseConnection {
    private static DatabaseConnection instance;
    private Connection connection;
    
    private DatabaseConnection() {
        // Private constructor
        // Initialize connection
    }
    
    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
    
    public Connection getConnection() {
        return connection;
    }
}

// Enum Singleton (Best way)
public enum DatabaseConnectionEnum {
    INSTANCE;
    
    private Connection connection;
    
    DatabaseConnectionEnum() {
        // Initialize connection
    }
    
    public Connection getConnection() {
        return connection;
    }
}

// Spring way - Automatic singleton
@Component
public class ConfigurationService {
    private Map<String, String> config = new HashMap<>();
    
    // Spring ensures this is singleton by default
    public String getConfig(String key) {
        return config.get(key);
    }
}
```

### 11.2 Factory Pattern

**Factory pattern objects create karne ka centralized way provide karta hai.**

```java
// Payment interface
public interface Payment {
    void processPayment(double amount);
}

// Concrete implementations
public class CreditCardPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment: " + amount);
    }
}

public class DebitCardPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing debit card payment: " + amount);
    }
}

public class UPIPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment: " + amount);
    }
}

// Factory
public class PaymentFactory {
    public static Payment createPayment(String type) {
        switch (type.toUpperCase()) {
            case "CREDIT_CARD":
                return new CreditCardPayment();
            case "DEBIT_CARD":
                return new DebitCardPayment();
            case "UPI":
                return new UPIPayment();
            default:
                throw new IllegalArgumentException("Invalid payment type: " + type);
        }
    }
}

// Spring way - using @Component and Map injection
@Component
public class PaymentFactorySpring {
    
    private final Map<String, Payment> paymentMethods;
    
    public PaymentFactorySpring(List<Payment> payments) {
        this.paymentMethods = payments.stream()
            .collect(Collectors.toMap(
                payment -> payment.getClass().getSimpleName(),
                payment -> payment
            ));
    }
    
    public Payment getPaymentMethod(String type) {
        Payment payment = paymentMethods.get(type);
        if (payment == null) {
            throw new IllegalArgumentException("Invalid payment type: " + type);
        }
        return payment;
    }
}
```

### 11.3 Builder Pattern

**Builder pattern complex objects ko step-by-step construct karne ke liye use hota hai.**

```java
// Traditional Builder
public class User {
    private final String username;
    private final String email;
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String phone;
    
    private User(UserBuilder builder) {
        this.username = builder.username;
        this.email = builder.email;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
    }
    
    // Builder class
    public static class UserBuilder {
        private final String username; // Required
        private final String email;    // Required
        private String firstName;
        private String lastName;
        private int age;
        private String phone;
        
        public UserBuilder(String username, String email) {
            this.username = username;
            this.email = email;
        }
        
        public UserBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        
        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        
        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }
        
        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }
        
        public User build() {
            return new User(this);
        }
    }
    
    // Getters
}

// Usage
User user = new User.UserBuilder("rahul", "rahul@example.com")
                .firstName("Rahul")
                .lastName("Kumar")
                .age(25)
                .phone("9876543210")
                .build();

// Lombok way
@Builder
@Data
public class Product {
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private String category;
    private int stock;
}

// Usage with Lombok
Product product = Product.builder()
    .name("Laptop")
    .description("Gaming Laptop")
    .price(new BigDecimal("75000"))
    .category("Electronics")
    .stock(10)
    .build();
```

### 11.4 Strategy Pattern

**Strategy pattern runtime pe algorithm change karne deta hai.**

```java
// Strategy interface
public interface DiscountStrategy {
    double applyDiscount(double price);
}

// Concrete strategies
@Component("noDiscount")
public class NoDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price;
    }
}

@Component("percentageDiscount")
public class PercentageDiscountStrategy implements DiscountStrategy {
    private double percentage = 10.0;
    
    @Override
    public double applyDiscount(double price) {
        return price - (price * percentage / 100);
    }
}

@Component("fixedDiscount")
public class FixedDiscountStrategy implements DiscountStrategy {
    private double discountAmount = 100.0;
    
    @Override
    public double applyDiscount(double price) {
        return price - discountAmount;
    }
}

// Context class
@Service
public class PricingService {
    
    private final Map<String, DiscountStrategy> strategies;
    
    public PricingService(Map<String, DiscountStrategy> strategies) {
        this.strategies = strategies;
    }
    
    public double calculatePrice(double basePrice, String strategyType) {
        DiscountStrategy strategy = strategies.get(strategyType);
        if (strategy == null) {
            strategy = strategies.get("noDiscount");
        }
        return strategy.applyDiscount(basePrice);
    }
}
```

### 11.5 Observer Pattern

**Observer pattern mein ek object (subject) apne dependents (observers) ko state changes notify karta hai.**

```java
// Spring Events - Observer pattern implementation

// Custom event
public class UserRegisteredEvent extends ApplicationEvent {
    private final User user;
    
    public UserRegisteredEvent(Object source, User user) {
        super(source);
        this.user = user;
    }
    
    public User getUser() {
        return user;
    }
}

// Event publisher
@Service
public class UserService {
    
    @Autowired
    private ApplicationEventPublisher eventPublisher;
    
    @Autowired
    private UserRepository userRepository;
    
    public User registerUser(UserDTO userDTO) {
        User user = new User();
        user.setUsername(userDTO.getUsername());
        user.setEmail(userDTO.getEmail());
        
        User savedUser = userRepository.save(user);
        
        // Publish event
        eventPublisher.publishEvent(new UserRegisteredEvent(this, savedUser));
        
        return savedUser;
    }
}

// Event listeners - Observers
@Component
public class EmailNotificationListener {
    
    @EventListener
    public void handleUserRegistered(UserRegisteredEvent event) {
        User user = event.getUser();
        System.out.println("Sending welcome email to: " + user.getEmail());
        // Send email logic
    }
}

@Component
public class UserActivityLogger {
    
    @EventListener
    @Async
    public void logUserRegistration(UserRegisteredEvent event) {
        User user = event.getUser();
        System.out.println("Logging user registration: " + user.getUsername());
        // Log to database or file
    }
}

@Component
public class RewardsService {
    
    @EventListener
    public void grantWelcomeBonus(UserRegisteredEvent event) {
        User user = event.getUser();
        System.out.println("Granting welcome bonus to: " + user.getUsername());
        // Grant rewards
    }
}
```

### 11.6 Repository Pattern

**Repository pattern data access logic ko encapsulate karta hai.**

```java
// Already implemented by Spring Data JPA
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    List<User> findByEmailContaining(String email);
    
    @Query("SELECT u FROM User u WHERE u.active = true")
    List<User> findAllActiveUsers();
}

// Custom repository implementation
public interface CustomUserRepository {
    List<User> findUsersByComplexCriteria(UserSearchCriteria criteria);
}

@Repository
public class CustomUserRepositoryImpl implements CustomUserRepository {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    @Override
    public List<User> findUsersByComplexCriteria(UserSearchCriteria criteria) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<User> query = cb.createQuery(User.class);
        Root<User> user = query.from(User.class);
        
        List<Predicate> predicates = new ArrayList<>();
        
        if (criteria.getUsername() != null) {
            predicates.add(cb.like(user.get("username"), "%" + criteria.getUsername() + "%"));
        }
        
        if (criteria.getEmail() != null) {
            predicates.add(cb.like(user.get("email"), "%" + criteria.getEmail() + "%"));
        }
        
        if (criteria.getMinAge() != null) {
            predicates.add(cb.greaterThanOrEqualTo(user.get("age"), criteria.getMinAge()));
        }
        
        query.where(predicates.toArray(new Predicate[0]));
        
        return entityManager.createQuery(query).getResultList();
    }
}
```

---

## Chapter 12: Dependency Injection and IoC

**Dependency Injection Spring ka core concept hai. Objects apni dependencies khud create nahi karte, Spring inject karta hai.**

### 12.1 Types of Dependency Injection

```java
// 1. Constructor Injection (Recommended)
@Service
public class UserService {
    
    private final UserRepository userRepository;
    private final EmailService emailService;
    
    // Single constructor - @Autowired optional
    public UserService(UserRepository userRepository, EmailService emailService) {
        this.userRepository = userRepository;
        this.emailService = emailService;
    }
    
    public User createUser(UserDTO userDTO) {
        User user = new User();
        // Set properties
        User savedUser = userRepository.save(user);
        emailService.sendWelcomeEmail(savedUser.getEmail());
        return savedUser;
    }
}

// 2. Setter Injection
@Service
public class ProductService {
    
    private ProductRepository productRepository;
    private CategoryService categoryService;
    
    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    
    @Autowired
    public void setCategoryService(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
}

// 3. Field Injection (Not recommended)
@Service
public class OrderService {
    
    @Autowired
    private OrderRepository orderRepository;
    
    @Autowired
    private PaymentService paymentService;
    
    // Problems: 
    // - Can't make fields final
    // - Harder to test
    // - Hidden dependencies
}
```

### 12.2 Qualifiers and Primary

```java
// Multiple implementations
public interface NotificationService {
    void send(String message);
}

@Component
@Primary // Default choice
public class EmailNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Email: " + message);
    }
}

@Component
@Qualifier("sms")
public class SmsNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        ```java
        System.out.println("SMS: " + message);
    }
}

@Component
@Qualifier("push")
public class PushNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Push: " + message);
    }
}

// Using qualifiers
@Service
public class NotificationManager {
    
    private final NotificationService emailService;
    private final NotificationService smsService;
    private final NotificationService pushService;
    
    public NotificationManager(
            @Qualifier("emailNotificationService") NotificationService emailService,
            @Qualifier("sms") NotificationService smsService,
            @Qualifier("push") NotificationService pushService) {
        this.emailService = emailService;
        this.smsService = smsService;
        this.pushService = pushService;
    }
    
    public void sendNotification(String message, String type) {
        switch (type) {
            case "email":
                emailService.send(message);
                break;
            case "sms":
                smsService.send(message);
                break;
            case "push":
                pushService.send(message);
                break;
        }
    }
}

// Injecting all implementations
@Service
public class MultiChannelNotificationService {
    
    private final List<NotificationService> notificationServices;
    
    public MultiChannelNotificationService(List<NotificationService> notificationServices) {
        this.notificationServices = notificationServices;
    }
    
    public void sendToAllChannels(String message) {
        notificationServices.forEach(service -> service.send(message));
    }
}
```

### 12.3 Bean Scopes

```java
@Configuration
public class BeanScopeConfig {
    
    // Singleton - One instance per Spring container (default)
    @Bean
    @Scope("singleton")
    public ConfigurationService configurationService() {
        return new ConfigurationService();
    }
    
    // Prototype - New instance every time
    @Bean
    @Scope("prototype")
    public OrderProcessor orderProcessor() {
        return new OrderProcessor();
    }
    
    // Request - One instance per HTTP request (Web applications)
    @Bean
    @Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
    public UserContext userContext() {
        return new UserContext();
    }
    
    // Session - One instance per HTTP session
    @Bean
    @Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
    public ShoppingCart shoppingCart() {
        return new ShoppingCart();
    }
    
    // Application - One instance per ServletContext
    @Bean
    @Scope(value = WebApplicationContext.SCOPE_APPLICATION, proxyMode = ScopedProxyMode.TARGET_CLASS)
    public AppCache appCache() {
        return new AppCache();
    }
}

// Component with scope
@Component
@Scope("prototype")
public class ReportGenerator {
    private String reportId;
    
    public ReportGenerator() {
        this.reportId = UUID.randomUUID().toString();
    }
    
    public void generateReport() {
        System.out.println("Generating report: " + reportId);
    }
}

// Using prototype bean
@Service
public class ReportService {
    
    @Autowired
    private ApplicationContext context;
    
    public void createMultipleReports() {
        // Each call creates new instance
        ReportGenerator report1 = context.getBean(ReportGenerator.class);
        ReportGenerator report2 = context.getBean(ReportGenerator.class);
        
        report1.generateReport(); // Different reportId
        report2.generateReport(); // Different reportId
    }
}
```

### 12.4 Lifecycle Callbacks

```java
@Component
public class DatabaseConnectionManager {
    
    private Connection connection;
    
    // Constructor
    public DatabaseConnectionManager() {
        System.out.println("Constructor called");
    }
    
    // PostConstruct - called after dependency injection
    @PostConstruct
    public void init() {
        System.out.println("PostConstruct: Initializing connection");
        // Initialize database connection
        this.connection = createConnection();
    }
    
    // PreDestroy - called before bean destruction
    @PreDestroy
    public void cleanup() {
        System.out.println("PreDestroy: Closing connection");
        // Close database connection
        closeConnection();
    }
    
    private Connection createConnection() {
        // Create connection logic
        return null;
    }
    
    private void closeConnection() {
        // Close connection logic
    }
}

// Implementing InitializingBean and DisposableBean
@Component
public class CacheManager implements InitializingBean, DisposableBean {
    
    private Map<String, Object> cache;
    
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean: Initializing cache");
        this.cache = new ConcurrentHashMap<>();
        loadInitialData();
    }
    
    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean: Clearing cache");
        cache.clear();
    }
    
    private void loadInitialData() {
        // Load initial cache data
    }
}

// Custom init and destroy methods
@Configuration
public class CustomLifecycleConfig {
    
    @Bean(initMethod = "startup", destroyMethod = "shutdown")
    public CustomService customService() {
        return new CustomService();
    }
}

class CustomService {
    public void startup() {
        System.out.println("Custom init method called");
    }
    
    public void shutdown() {
        System.out.println("Custom destroy method called");
    }
}
```

### 12.5 Conditional Beans

```java
// Conditional on property
@Configuration
public class ConditionalBeansConfig {
    
    @Bean
    @ConditionalOnProperty(name = "feature.cache.enabled", havingValue = "true")
    public CacheService cacheService() {
        return new RedisCacheService();
    }
    
    @Bean
    @ConditionalOnProperty(name = "feature.cache.enabled", havingValue = "false", matchIfMissing = true)
    public CacheService noCacheService() {
        return new NoOpCacheService();
    }
    
    // Conditional on missing bean
    @Bean
    @ConditionalOnMissingBean
    public TemplateEngine defaultTemplateEngine() {
        return new ThymeleafTemplateEngine();
    }
    
    // Conditional on class presence
    @Bean
    @ConditionalOnClass(name = "org.springframework.data.redis.core.RedisTemplate")
    public RedisService redisService() {
        return new RedisService();
    }
    
    // Conditional on expression
    @Bean
    @ConditionalOnExpression("${feature.advanced.enabled:false} and ${feature.premium.enabled:false}")
    public PremiumFeatureService premiumFeatureService() {
        return new PremiumFeatureService();
    }
}

// Custom conditional annotation
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Conditional(OnDatabaseTypeCondition.class)
public @interface ConditionalOnDatabaseType {
    String value();
}

class OnDatabaseTypeCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String databaseType = context.getEnvironment().getProperty("spring.datasource.type");
        Map<String, Object> attributes = metadata.getAnnotationAttributes(
            ConditionalOnDatabaseType.class.getName());
        String expectedType = (String) attributes.get("value");
        return expectedType.equals(databaseType);
    }
}

// Usage
@Configuration
public class DatabaseConfig {
    
    @Bean
    @ConditionalOnDatabaseType("mysql")
    public DataSource mysqlDataSource() {
        return new MysqlDataSource();
    }
    
    @Bean
    @ConditionalOnDatabaseType("postgresql")
    public DataSource postgresqlDataSource() {
        return new PostgresqlDataSource();
    }
}
```

---

## Chapter 13: Logging and Monitoring

**Logging application ka important part hai debugging aur monitoring ke liye.**

### 13.1 SLF4J with Logback

```java
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class UserService {
    
    // Create logger
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);
    
    @Autowired
    private UserRepository userRepository;
    
    public User createUser(UserDTO userDTO) {
        logger.info("Creating user with username: {}", userDTO.getUsername());
        
        try {
            User user = new User();
            user.setUsername(userDTO.getUsername());
            user.setEmail(userDTO.getEmail());
            
            User savedUser = userRepository.save(user);
            
            logger.info("User created successfully with ID: {}", savedUser.getId());
            logger.debug("User details: {}", savedUser);
            
            return savedUser;
            
        } catch (Exception e) {
            logger.error("Error creating user: {}", userDTO.getUsername(), e);
            throw new RuntimeException("Failed to create user", e);
        }
    }
    
    public User getUserById(Long id) {
        logger.trace("Entering getUserById method with id: {}", id);
        
        return userRepository.findById(id)
            .orElseThrow(() -> {
                logger.warn("User not found with id: {}", id);
                return new ResourceNotFoundException("User not found");
            });
    }
    
    public void processUsers() {
        logger.info("Starting user processing");
        
        List<User> users = userRepository.findAll();
        logger.info("Found {} users to process", users.size());
        
        users.forEach(user -> {
            logger.debug("Processing user: {}", user.getUsername());
            // Process user
        });
        
        logger.info("User processing completed");
    }
}

// Using Lombok @Slf4j
@Slf4j
@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;
    
    public Product createProduct(ProductDTO productDTO) {
        log.info("Creating product: {}", productDTO.getName());
        
        // Lombok automatically creates 'log' field
        Product product = new Product();
        product.setName(productDTO.getName());
        
        Product saved = productRepository.save(product);
        log.info("Product created with ID: {}", saved.getId());
        
        return saved;
    }
}
```

### 13.2 Logback Configuration

```xml
<!-- logback-spring.xml -->
<?xml version="1.0" encoding="UTF-8"?>
<configuration>
    
    <!-- Console Appender -->
    <appender name="CONSOLE" class="ch.qos.logback.core.ConsoleAppender">
        <encoder>
            <pattern>%d{yyyy-MM-dd HH:mm:ss} [%thread] %-5level %logger{36} - %msg%n</pattern>
        </encoder>
    </appender>
    
    <!-- File Appender -->
    <appender name="FILE" class="ch.qos.logback.core.rolling.RollingFileAppender">
        <file>logs/application.log</file>
        <encoder>
            <pattern>%d{yyyy-MM-dd HH:mm:ss} [%thread] %-5level %logger{36} - %msg%n</pattern>
        </encoder>
        <rollingPolicy class="ch.qos.logback.core.rolling.TimeBasedRollingPolicy">
            <fileNamePattern>logs/application-%d{yyyy-MM-dd}.%i.log</fileNamePattern>
            <timeBasedFileNamingAndTriggeringPolicy class="ch.qos.logback.core.rolling.SizeAndTimeBasedFNATP">
                <maxFileSize>10MB</maxFileSize>
            </timeBasedFileNamingAndTriggeringPolicy>
            <maxHistory>30</maxHistory>
        </rollingPolicy>
    </appender>
    
    <!-- Error File Appender -->
    <appender name="ERROR_FILE" class="ch.qos.logback.core.rolling.RollingFileAppender">
        <file>logs/error.log</file>
        <filter class="ch.qos.logback.classic.filter.ThresholdFilter">
            <level>ERROR</level>
        </filter>
        <encoder>
            <pattern>%d{yyyy-MM-dd HH:mm:ss} [%thread] %-5level %logger{36} - %msg%n</pattern>
        </encoder>
        <rollingPolicy class="ch.qos.logback.core.rolling.TimeBasedRollingPolicy">
            <fileNamePattern>logs/error-%d{yyyy-MM-dd}.log</fileNamePattern>
            <maxHistory>30</maxHistory>
        </rollingPolicy>
    </appender>
    
    <!-- Logger levels -->
    <logger name="com.myapp" level="DEBUG"/>
    <logger name="org.springframework" level="INFO"/>
    <logger name="org.hibernate" level="INFO"/>
    
    <!-- Root logger -->
    <root level="INFO">
        <appender-ref ref="CONSOLE"/>
        <appender-ref ref="FILE"/>
        <appender-ref ref="ERROR_FILE"/>
    </root>
    
    <!-- Profile specific configuration -->
    <springProfile name="dev">
        <root level="DEBUG">
            <appender-ref ref="CONSOLE"/>
        </root>
    </springProfile>
    
    <springProfile name="prod">
        <root level="WARN">
            <appender-ref ref="FILE"/>
            <appender-ref ref="ERROR_FILE"/>
        </root>
    </springProfile>
    
</configuration>
```

### 13.3 Custom Log Aspects

```java
// Custom annotation for method logging
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface LogExecutionTime {
    String value() default "";
}

// Aspect for logging
@Aspect
@Component
@Slf4j
public class LoggingAspect {
    
    // Log all service methods
    @Around("execution(* com.myapp.service.*.*(..))")
    public Object logServiceMethods(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        String className = joinPoint.getTarget().getClass().getSimpleName();
        
        log.info("Entering method: {}.{}", className, methodName);
        
        long startTime = System.currentTimeMillis();
        
        try {
            Object result = joinPoint.proceed();
            long executionTime = System.currentTimeMillis() - startTime;
            
            log.info("Exiting method: {}.{} - Execution time: {}ms", 
                    className, methodName, executionTime);
            
            return result;
            
        } catch (Exception e) {
            log.error("Exception in method: {}.{} - Error: {}", 
                    className, methodName, e.getMessage(), e);
            throw e;
        }
    }
    
    // Log execution time for custom annotation
    @Around("@annotation(logExecutionTime)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint, 
                                   LogExecutionTime logExecutionTime) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        
        log.info("Starting: {} - {}", methodName, logExecutionTime.value());
        
        long startTime = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long executionTime = System.currentTimeMillis() - startTime;
        
        log.info("Completed: {} - Execution time: {}ms", methodName, executionTime);
        
        return result;
    }
    
    // Log all controller requests
    @Around("@annotation(org.springframework.web.bind.annotation.RequestMapping) || " +
            "@annotation(org.springframework.web.bind.annotation.GetMapping) || " +
            "@annotation(org.springframework.web.bind.annotation.PostMapping)")
    public Object logControllerMethods(ProceedingJoinPoint joinPoint) throws Throwable {
        HttpServletRequest request = 
            ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes())
                .getRequest();
        
        log.info("Request: {} {} from IP: {}", 
                request.getMethod(), 
                request.getRequestURI(), 
                request.getRemoteAddr());
        
        Object result = joinPoint.proceed();
        
        log.info("Response: {} - Status: OK", request.getRequestURI());
        
        return result;
    }
}

// Usage of custom annotation
@Service
public class ReportService {
    
    @LogExecutionTime("Generate monthly sales report")
    public Report generateMonthlySalesReport(int month, int year) {
        // Complex report generation logic
        return new Report();
    }
}
```

### 13.4 MDC for Request Tracking

```java
// Request interceptor to add tracking ID
@Component
public class RequestTrackingInterceptor implements HandlerInterceptor {
    
    private static final String REQUEST_ID = "requestId";
    
    @Override
    public boolean preHandle(HttpServletRequest request, 
                           HttpServletResponse response, 
                           Object handler) {
        String requestId = UUID.randomUUID().toString();
        MDC.put(REQUEST_ID, requestId);
        response.setHeader("X-Request-ID", requestId);
        return true;
    }
    
    @Override
    public void afterCompletion(HttpServletRequest request, 
                               HttpServletResponse response, 
                               Object handler, 
                               Exception ex) {
        MDC.clear();
    }
}

// Register interceptor
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    
    @Autowired
    private RequestTrackingInterceptor requestTrackingInterceptor;
    
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(requestTrackingInterceptor);
    }
}

// Logback pattern with MDC
// <pattern>%d{yyyy-MM-dd HH:mm:ss} [%thread] [%X{requestId}] %-5level %logger{36} - %msg%n</pattern>

// Usage in service
@Service
@Slf4j
public class OrderService {
    
    public Order createOrder(OrderDTO orderDTO) {
        // RequestId automatically included in logs
        log.info("Creating order for customer: {}", orderDTO.getCustomerId());
        
        // All subsequent logs will have the same requestId
        Order order = processOrder(orderDTO);
        
        log.info("Order created successfully: {}", order.getId());
        
        return order;
    }
}
```

### 13.5 Application Health Monitoring

```java
// Custom health indicator
@Component
public class DatabaseHealthIndicator implements HealthIndicator {
    
    @Autowired
    private DataSource dataSource;
    
    @Override
    public Health health() {
        try (Connection connection = dataSource.getConnection()) {
            if (connection.isValid(1000)) {
                return Health.up()
                    .withDetail("database", "Available")
                    .withDetail("validationTime", "1000ms")
                    .build();
            } else {
                return Health.down()
                    .withDetail("database", "Connection invalid")
                    .build();
            }
        } catch (Exception e) {
            return Health.down()
                .withDetail("database", "Connection failed")
                .withDetail("error", e.getMessage())
                .build();
        }
    }
}

// Custom metrics
@Component
public class CustomMetrics {
    
    private final Counter orderCounter;
    private final Timer orderProcessingTimer;
    private final Gauge activeUsersGauge;
    
    public CustomMetrics(MeterRegistry meterRegistry) {
        this.orderCounter = Counter.builder("orders.created")
            .description("Total orders created")
            .tag("type", "counter")
            .register(meterRegistry);
        
        this.orderProcessingTimer = Timer.builder("order.processing.time")
            .description("Order processing time")
            .register(meterRegistry);
        
        this.activeUsersGauge = Gauge.builder("users.active", this, 
            CustomMetrics::getActiveUserCount)
            .description("Active users count")
            .register(meterRegistry);
    }
    
    public void incrementOrderCount() {
        orderCounter.increment();
    }
    
    public void recordOrderProcessingTime(Runnable task) {
        orderProcessingTimer.record(task);
    }
    
    private double getActiveUserCount() {
        // Logic to get active user count
        return 0.0;
    }
}

// Actuator endpoints configuration
// application.properties
/*
management.endpoints.web.exposure.include=health,info,metrics,prometheus
management.endpoint.health.show-details=always
management.metrics.export.prometheus.enabled=true

# Custom info
info.app.name=My Application
info.app.version=1.0.0
info.app.description=Spring Boot Application
*/
```

---

## Final Real-World Spring Boot Example

**Yaha ek complete example hai jo sab concepts ko combine karta hai.**

```java
// ============= ENTITY =============
@Entity
@Table(name = "products")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product extends BaseEntity<Long> {
    
    @Column(nullable = false)
    private String name;
    
    @Column(length = 1000)
    private String description;
    
    @Column(nullable = false)
    private BigDecimal price;
    
    @Column(nullable = false)
    private String category;
    
    @Column(nullable = false)
    private Integer stock;
    
    @Column(nullable = false)
    private Boolean active = true;
    
    @CreatedDate
    private LocalDateTime createdAt;
    
    @LastModifiedDate
    private LocalDateTime updatedAt;
}

// ============= DTO =============
@Data
@Builder
public class ProductDTO {
    
    @NotBlank(message = "Product name is required")
    @Size(min = 3, max = 100, message = "Name must be between 3 and 100 characters")
    private String name;
    
    @Size(max = 1000, message = "Description cannot exceed 1000 characters")
    private String description;
    
    @NotNull(message = "Price is required")
    @DecimalMin(value = "0.0", inclusive = false, message = "Price must be greater than 0")
    private BigDecimal price;
    
    @NotBlank(message = "Category is required")
    private String category;
    
    @NotNull(message = "Stock is required")
    @Min(value = 0, message = "Stock cannot be negative")
    private Integer stock;
}

// ============= REPOSITORY =============
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    
    List<Product> findByCategory(String category);
    
    List<Product> findByActiveTrue();
    
    @Query("SELECT p FROM Product p WHERE p.price BETWEEN :minPrice AND :maxPrice")
    List<Product> findByPriceRange(@Param("minPrice") BigDecimal minPrice, 
                                   @Param("maxPrice") BigDecimal maxPrice);
    
    @Query("SELECT p FROM Product p WHERE p.name LIKE %:keyword% OR p.description LIKE %:keyword%")
    List<Product> searchProducts(@Param("keyword") String keyword);
    
    Page<Product> findByCategory(String category, Pageable pageable);
}

// ============= SERVICE =============
@Service
@Slf4j
@Transactional
public class ProductService {
    
    private final ProductRepository productRepository;
    private final ApplicationEventPublisher eventPublisher;
    
    public ProductService(ProductRepository productRepository,
                         ApplicationEventPublisher eventPublisher) {
        this.productRepository = productRepository;
        this.eventPublisher = eventPublisher;
    }
    
    public Product createProduct(ProductDTO productDTO) {
        log.info("Creating product: {}", productDTO.getName());
        
        Product product = Product.builder()
            .name(productDTO.getName())
            .description(productDTO.getDescription())
            .price(productDTO.getPrice())
            .category(productDTO.getCategory())
            .stock(productDTO.getStock())
            .active(true)
            .build();
        
        Product savedProduct = productRepository.save(product);
        
        // Publish event
        eventPublisher.publishEvent(new ProductCreatedEvent(this, savedProduct));
        
        log.info("Product created successfully with ID: {}", savedProduct.getId());
        
        return savedProduct;
    }
    
    @Transactional(readOnly = true)
    public Product getProductById(Long id) {
        return productRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException(
                "Product not found with id: " + id));
    }
    
    @Transactional(readOnly = true)
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    
    @Transactional(readOnly = true)
    public Page<Product> getProductsPaginated(int page, int size, String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return productRepository.findAll(pageable);
    }
    
    public Product updateProduct(Long id, ProductDTO productDTO) {
        log.info("Updating product with ID: {}", id);
        
        Product product = getProductById(id);
        
        product.setName(productDTO.getName());
        product.setDescription(productDTO.getDescription());
        product.setPrice(productDTO.getPrice());
        product.setCategory(productDTO.getCategory());
        product.setStock(productDTO.getStock());
        
        return productRepository.save(product);
    }
    
    public void deleteProduct(Long id) {
        log.info("Deleting product with ID: {}", id);
        
        Product product = getProductById(id);
        product.setActive(false);
        productRepository.save(product);
    }
    
    @Transactional(readOnly = true)
    @Cacheable(value = "products", key = "#category")
    public List<Product> getProductsByCategory(String category) {
        log.info("Fetching products by category: {}", category);
        return productRepository.findByCategory(category);
    }
}

// ============= CONTROLLER =============
@RestController
@RequestMapping("/api/products")
@Slf4j
@Validated
public class ProductController {
    
    private final ProductService productService;
    
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    
    @PostMapping
    public ResponseEntity<ApiResponse<Product>> createProduct(
            @Valid @RequestBody ProductDTO productDTO) {
        
        log.info("Received request to create product: {}", productDTO.getName());
        
        Product product = productService.createProduct(productDTO);
        
        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(ApiResponse.success(product));
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<Product>> getProduct(@PathVariable Long id) {
        Product product = productService.getProductById(id);
        return ResponseEntity.ok(ApiResponse.success(product));
    }
    
    @GetMapping
    public ResponseEntity<ApiResponse<List<Product>>> getAllProducts() {
        List<Product> products = productService.getAllProducts();
        return ResponseEntity.ok(ApiResponse.success(products));
    }
    
    @GetMapping("/paginated")
    public ResponseEntity<Page<Product>> getProductsPaginated(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy) {
        
        Page<Product> products = productService.getProductsPaginated(page, size, sortBy);
        return ResponseEntity.ok(products);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<Product>> updateProduct(
            @PathVariable Long id,
            @Valid @RequestBody ProductDTO productDTO) {
        
        Product product = productService.updateProduct(id, productDTO);
        return ResponseEntity.ok(ApiResponse.success(product));
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<Void>> deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return ResponseEntity.ok(ApiResponse.success(null));
    }
    
    @GetMapping("/category/{category}")
    public ResponseEntity<ApiResponse<List<Product>>> getProductsByCategory(
            @PathVariable String category) {
        
        List<Product> products = productService.getProductsByCategory(category);
        return ResponseEntity.ok(ApiResponse.success(products));
    }
}
```

---

**Bas bhai! Ye complete guide hai Java Essentials for Spring Boot Development ka. Sab important concepts cover ho gaye hain with real-world examples. Practice karo aur Spring Boot projects banao!** 🚀

**Key Takeaways:**

1. **OOP concepts** - Foundation hai, achhe se samjho
2. **Interfaces** - Contracts define karte hain
3. **Exception Handling** - Graceful error handling ke liye
4. **Streams API** - Functional programming aur data processing
5. **Collections** - Data structures efficiently use karo
6. **Generics** - Type-safe code likho
7. **Annotations** - Spring Boot ka heart hai
8. **Multi-threading** - Performance improve karo
9. **File I/O** - Files handle karna seekho
10. **Design Patterns** - Best practices follow karo
11. **Dependency Injection** - Loose coupling achieve karo
12. **Logging** - Debugging aur monitoring essential hai

Happy Coding! 💻✨
