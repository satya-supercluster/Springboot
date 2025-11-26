# Spring Boot Basics: Complete Beginner's Guide

## 1. Introduction to Spring Boot

**What is Spring Boot?**

Spring Boot is a framework that makes it easy to create Java applications. Think of it as a "ready-to-use kitchen" where all the tools and ingredients are already set up for you to start cooking immediately.

**Why use Spring Boot?**

- **No complex configuration**: Traditional Spring requires lots of XML files and setup. Spring Boot does this automatically.
- **Built-in server**: You don't need to install Tomcat or other servers separately.
- **Quick development**: You can create a working application in minutes.
- **Production-ready**: Comes with monitoring, health checks, and other features built-in.

**Real-world analogy**:

- **Traditional Spring** = Building a house from scratch (you need to lay foundation, build walls, install plumbing, etc.)
- **Spring Boot** = Moving into a furnished apartment (everything is ready, just bring your stuff and start living)

---

## 2. Project Setup

### Creating a Spring Boot Project

**Method 1: Using Spring Initializr (Recommended for beginners)**  

1. Go to [https://start.spring.io](https://start.spring.io)
2. Configure your project:
   - **Project**: Maven or Gradle
   - **Language**: Java
   - **Spring Boot**: Latest stable version (e.g., 3.2.0)
   - **Group**: com.example (your company/organization)
   - **Artifact**: demo (your project name)
   - **Packaging**: Jar
   - **Java**: 17 or later

3. Add dependencies (for beginners, start with):
   - Spring Web (for creating REST APIs)
   - Spring Boot DevTools (for automatic reload)

4. Click "Generate" to download a zip file
5. Extract and open in your IDE (IntelliJ IDEA, Eclipse, or VS Code)

**Method 2: Using IDE**  

- IntelliJ IDEA Ultimate has built-in Spring Initializr
- Eclipse with Spring Tools Suite (STS) plugin

---

## 3. Maven vs Gradle

Both Maven and Gradle are **build tools** that manage your project dependencies (libraries) and build process.

### Maven

**What it is**: Maven uses XML configuration and follows a standard project structure.

**pom.xml** (Project Object Model - Maven's configuration file):

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 
         https://maven.apache.org/xsd/maven-4.0.0.xsd">
    
    <modelVersion>4.0.0</modelVersion>
    
    <!-- Parent Spring Boot project - provides default configurations -->
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.2.0</version>
        <relativePath/>
    </parent>
    
    <!-- Your project details -->
    <groupId>com.example</groupId>
    <artifactId>demo</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>demo</name>
    <description>Demo project for Spring Boot</description>
    
    <!-- Java version -->
    <properties>
        <java.version>17</java.version>
    </properties>
    
    <!-- Dependencies (libraries your project needs) -->
    <dependencies>
        <!-- Spring Web - for creating REST APIs -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        
        <!-- DevTools - auto-reload during development -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <scope>runtime</scope>
            <optional>true</optional>
        </dependency>
        
        <!-- Testing library -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>
    
    <!-- Plugin to package your application -->
    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
</project>
```

**Key Maven Commands**:

```bash
mvn clean          # Cleans previous builds
mvn compile        # Compiles your code
mvn test           # Runs tests
mvn package        # Creates a JAR file
mvn spring-boot:run # Runs your application
```

### Gradle

**What it is**: Gradle uses Groovy or Kotlin DSL (more concise than XML).

**build.gradle** (Gradle's configuration file):

```groovy
plugins {
    id 'java'
    id 'org.springframework.boot' version '3.2.0'
    id 'io.spring.dependency-management' version '1.1.0'
}

group = 'com.example'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '17'

repositories {
    mavenCentral()  // Where to download libraries from
}

dependencies {
    // Spring Web starter
    implementation 'org.springframework.boot:spring-boot-starter-web'
    
    // DevTools for development
    developmentOnly 'org.springframework.boot:spring-boot-devtools'
    
    // Testing
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
}

tasks.named('test') {
    useJUnitPlatform()
}
```

**Key Gradle Commands**:

```bash
./gradlew clean          # Cleans previous builds
./gradlew build          # Builds your project
./gradlew test           # Runs tests
./gradlew bootRun        # Runs your application
```

### Maven vs Gradle Comparison

| Feature | Maven | Gradle |
|---------|-------|--------|
| Configuration | XML (verbose) | Groovy/Kotlin (concise) |
| Performance | Slower | Faster (incremental builds) |
| Learning Curve | Easier for beginners | Steeper but more powerful |
| Industry Usage | More common | Growing rapidly |

**My recommendation for beginners**: Start with **Maven** - it's more straightforward and has more tutorials available.

---

## 4. Folder Structure

Here's the complete folder structure of a Spring Boot project:

```
demo/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── demo/
│   │   │               ├── DemoApplication.java
│   │   │               ├── controller/
│   │   │               ├── service/
│   │   │               ├── repository/
│   │   │               ├── model/
│   │   │               └── config/
│   │   │
│   │   └── resources/
│   │       ├── application.properties
│   │       ├── static/
│   │       └── templates/
│   │
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   └── demo/
│                       └── DemoApplicationTests.java
│
├── target/  (or build/ for Gradle)
├── pom.xml  (or build.gradle)
└── mvnw, mvnw.cmd  (Maven wrapper scripts)
```

### Detailed Explanation of Each Folder

#### **1. src/main/java/** - Your Application Code

This is where all your Java code lives.

**com/example/demo/** - Base package (follows your groupId + artifactId)

##### **DemoApplication.java** - The Main Entry Point

```java
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// This annotation does 3 things:
// 1. @Configuration - Marks this as a configuration class
// 2. @EnableAutoConfiguration - Tells Spring Boot to auto-configure based on dependencies
// 3. @ComponentScan - Tells Spring to scan this package for components
@SpringBootApplication
public class DemoApplication {

    // The main method - where your application starts
    public static void main(String[] args) {
        // This starts the Spring Boot application
        SpringApplication.run(DemoApplication.class, args);
    }
}
```

**What happens when you run this?**

1. Spring Boot starts an embedded Tomcat server (usually on port 8080)
2. It scans for components (Controllers, Services, etc.)
3. Sets up all configurations automatically
4. Your application is ready to receive requests!

---

##### **controller/** - Handles HTTP Requests

Controllers receive requests from users and return responses.

```java
package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

// @RestController means this class handles HTTP requests and returns JSON
@RestController
@RequestMapping("/api")  // Base URL for all endpoints in this controller
public class UserController {

    // GET request: http://localhost:8080/api/hello
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
    
    // GET request with parameter: http://localhost:8080/api/greet?name=John
    @GetMapping("/greet")
    public String greet(@RequestParam String name) {
        return "Hello, " + name + "!";
    }
    
    // POST request: Send data to create something
    @PostMapping("/user")
    public String createUser(@RequestBody User user) {
        return "User created: " + user.getName();
    }
    
    // GET request with path variable: http://localhost:8080/api/user/123
    @GetMapping("/user/{id}")
    public String getUser(@PathVariable Long id) {
        return "Getting user with ID: " + id;
    }
}
```

**Annotations explained**:

- `@RestController`: Combines `@Controller` + `@ResponseBody` (returns data, not views)
- `@RequestMapping`: Base path for all methods in this controller
- `@GetMapping`: Handles GET requests (retrieve data)
- `@PostMapping`: Handles POST requests (create data)
- `@PutMapping`: Handles PUT requests (update data)
- `@DeleteMapping`: Handles DELETE requests (delete data)
- `@RequestParam`: Extracts query parameters (?name=value)
- `@PathVariable`: Extracts values from URL path (/user/{id})
- `@RequestBody`: Converts JSON from request into Java object

---

##### **model/** - Data Classes (Entities/DTOs)

Models represent your data structure.

```java
package com.example.demo.model;

// This is a simple Java class (POJO - Plain Old Java Object)
public class User {
    
    private Long id;
    private String name;
    private String email;
    private int age;
    
    // Default constructor (required for JSON conversion)
    public User() {
    }
    
    // Constructor with parameters
    public User(Long id, String name, String email, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }
    
    // Getters and Setters (required for JSON conversion)
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
}
```

**When working with databases, you'd add JPA annotations**:

```java
package com.example.demo.model;

import jakarta.persistence.*;

@Entity  // Marks this as a database table
@Table(name = "users")  // Table name in database
public class User {
    
    @Id  // Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-increment
    private Long id;
    
    @Column(nullable = false, length = 100)  // Column constraints
    private String name;
    
    @Column(unique = true)  // Email must be unique
    private String email;
    
    private int age;
    
    // Constructors, getters, setters...
}
```

---

##### **service/** - Business Logic

Services contain your business logic and rules.

```java
package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

// @Service marks this as a service component
// Spring will automatically create and manage an instance of this class
@Service
public class UserService {
    
    // In-memory storage (in real apps, this would be a database)
    private List<User> users = new ArrayList<>();
    private Long nextId = 1L;
    
    // Business logic: Create a new user
    public User createUser(String name, String email, int age) {
        // Validation
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Invalid age");
        }
        
        // Create user
        User user = new User(nextId++, name, email, age);
        users.add(user);
        return user;
    }
    
    // Get all users
    public List<User> getAllUsers() {
        return new ArrayList<>(users);  // Return a copy
    }
    
    // Find user by ID
    public User getUserById(Long id) {
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
    
    // Delete user
    public boolean deleteUser(Long id) {
        return users.removeIf(user -> user.getId().equals(id));
    }
}
```

**Why separate Service from Controller?**

- **Separation of concerns**: Controller handles HTTP, Service handles logic
- **Reusability**: Multiple controllers can use the same service
- **Testability**: Easier to test business logic independently

---

##### **repository/** - Database Access

Repositories handle database operations.

```java
package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

// JpaRepository provides built-in methods: save(), findAll(), findById(), delete(), etc.
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
    // Spring automatically implements these methods based on the method name!
    
    // Find user by email
    User findByEmail(String email);
    
    // Find users by age greater than
    List<User> findByAgeGreaterThan(int age);
    
    // Find users by name containing (like %name%)
    List<User> findByNameContaining(String name);
    
    // Custom query using @Query annotation
    // @Query("SELECT u FROM User u WHERE u.age BETWEEN ?1 AND ?2")
    // List<User> findUsersByAgeRange(int minAge, int maxAge);
}
```

**Built-in methods from JpaRepository**:

- `save(user)` - Create or update
- `findAll()` - Get all records
- `findById(id)` - Get by ID
- `deleteById(id)` - Delete by ID
- `count()` - Count records
- `existsById(id)` - Check if exists

---

##### **config/** - Configuration Classes

Configuration classes customize Spring Boot behavior.

```java
package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// @Configuration marks this as a configuration class
@Configuration
public class WebConfig implements WebMvcConfigurer {
    
    // Configure CORS (Cross-Origin Resource Sharing)
    // This allows frontend apps on different domains to access your API
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")  // Apply to all /api endpoints
                .allowedOrigins("http://localhost:3000")  // Allow React app
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowedHeaders("*");
    }
}
```

---

#### **2. src/main/resources/** - Non-Java Files

##### **application.properties** - Application Configuration

```properties
# Server configuration
server.port=8080
server.servlet.context-path=/myapp

# Application name
spring.application.name=demo

# Database configuration (H2 in-memory database example)
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

# JPA/Hibernate configuration
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

# Logging configuration
logging.level.root=INFO
logging.level.com.example.demo=DEBUG
logging.file.name=logs/app.log

# DevTools configuration
spring.devtools.restart.enabled=true
```

**Alternative: application.yml** (YAML format, more readable)

```yaml
server:
  port: 8080
  servlet:
    context-path: /myapp

spring:
  application:
    name: demo
  datasource:
    url: jdbc:h2:mem:testdb
    username: sa
    password: 
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true

logging:
  level:
    root: INFO
    com.example.demo: DEBUG
```

---

##### **static/** - Static Files

Put your CSS, JavaScript, images here. They're served directly without processing.

```
static/
├── css/
│   └── style.css
├── js/
│   └── app.js
└── images/
    └── logo.png
```

Access at: `http://localhost:8080/css/style.css`

---

##### **templates/** - HTML Templates

If you're using template engines (Thymeleaf, FreeMarker), put HTML templates here.

```html
<!-- templates/welcome.html -->
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Welcome</title>
</head>
<body>
    <h1 th:text="'Hello, ' + ${name}">Hello, User</h1>
</body>
</html>
```

---

#### **3. src/test/java/** - Test Code

```java
package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest  // Loads full Spring context for testing
class DemoApplicationTests {

    @Test
    void contextLoads() {
        // Tests that Spring context loads successfully
    }
    
    @Test
    void testUserCreation() {
        User user = new User(1L, "John", "john@example.com", 25);
        assertEquals("John", user.getName());
        assertEquals(25, user.getAge());
    }
}
```

---

#### **4. target/ or build/** - Compiled Output

- **target/** (Maven) or **build/** (Gradle)
- Contains compiled `.class` files
- Contains the final JAR file
- **Don't commit this to Git** (add to `.gitignore`)

---

## Complete Example: Simple REST API

Let's build a complete working example:

### 1. Model (User.java)

```java
package com.example.demo.model;

public class User {
    private Long id;
    private String name;
    private String email;
    
    public User() {}
    
    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    
    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
```

### 2. Service (UserService.java)

```java
package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class UserService {
    private Map<Long, User> users = new HashMap<>();
    private Long nextId = 1L;
    
    public List<User> getAllUsers() {
        return new ArrayList<>(users.values());
    }
    
    public User createUser(User user) {
        user.setId(nextId++);
        users.put(user.getId(), user);
        return user;
    }
    
    public User getUserById(Long id) {
        return users.get(id);
    }
}
```

### 3. Controller (UserController.java)

```java
package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    
    // Dependency Injection - Spring automatically provides UserService instance
    @Autowired
    private UserService userService;
    
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
    
    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUserById(id);
    }
}
```

### 4. Main Application (DemoApplication.java)

```java
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
```

---

## Running Your Application

### Using Maven

```bash
./mvnw spring-boot:run
```

### Using Gradle

```bash
./gradlew bootRun
```

### From IDE

Right-click `DemoApplication.java` → Run

---

## Testing Your API

Once running, test with:

**1. Browser** (for GET requests):

```
http://localhost:8080/api/users
```

**2. cURL**:

```bash
# Get all users
curl http://localhost:8080/api/users

# Create a user
curl -X POST http://localhost:8080/api/users \
  -H "Content-Type: application/json" \
  -d '{"name":"John Doe","email":"john@example.com"}'

# Get specific user
curl http://localhost:8080/api/users/1
```

**3. Postman** (GUI tool for API testing)

---

## Summary

**Key Folders:**

- `src/main/java` → Your Java code
  - `controller/` → Handles HTTP requests
  - `service/` → Business logic
  - `repository/` → Database access
  - `model/` → Data classes
  - `config/` → Configuration
- `src/main/resources` → Configuration and static files
  - `application.properties` → App settings
  - `static/` → CSS, JS, images
  - `templates/` → HTML templates
- `src/test/java` → Test code
- `pom.xml` or `build.gradle` → Project configuration and dependencies

**Flow of a Request:**

1. User sends HTTP request
2. **Controller** receives it
3. Controller calls **Service**
4. Service uses **Repository** to access database
5. Repository returns data from **Model**
6. Response goes back through Service → Controller → User

This separation keeps your code organized, testable, and maintainable!
