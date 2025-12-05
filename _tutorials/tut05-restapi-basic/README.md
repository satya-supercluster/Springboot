# REST API Basics: Controllers, @RestController, and Mappings

## Table of Contents
1. [Introduction to REST APIs](#introduction)
2. [Understanding Controllers](#controllers)
3. [The @RestController Annotation](#restcontroller)
4. [HTTP Request Mappings](#mappings)
5. [Complete Examples](#examples)

---

## 1. Introduction to REST APIs {#introduction}

REST (Representational State Transfer) is an architectural style for designing networked applications. RESTful APIs use HTTP methods to perform CRUD operations:

- **GET**: Retrieve resources
- **POST**: Create new resources
- **PUT**: Update existing resources
- **DELETE**: Remove resources
- **PATCH**: Partially update resources

---

## 2. Understanding Controllers {#controllers}

Controllers are the entry points for HTTP requests in Spring Boot. They handle incoming requests, process them, and return responses.

### Traditional @Controller vs @RestController

**@Controller**: Used for MVC applications, returns views (HTML pages)
```java
@Controller
public class WebController {
    @GetMapping("/home")
    public String home(Model model) {
        return "home"; // Returns view name
    }
}
```

**@RestController**: Combines @Controller + @ResponseBody, returns data (JSON/XML)
```java
@RestController
public class ApiController {
    @GetMapping("/api/data")
    public String getData() {
        return "Data"; // Returns actual data
    }
}
```

---

## 3. The @RestController Annotation {#restcontroller}

`@RestController` is a specialized version of `@Controller` that automatically serializes return values to JSON/XML.

### Basic Structure

```java
package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api") // Base path for all endpoints
public class ProductController {
    
    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}
```

**Result when accessing** `http://localhost:8080/api/hello`:
```
Hello, World!
```

### Returning Objects (Auto JSON Conversion)

```java
@RestController
@RequestMapping("/api/users")
public class UserController {
    
    @GetMapping("/user")
    public User getUser() {
        return new User(1L, "John Doe", "john@example.com");
    }
}

// User class
class User {
    private Long id;
    private String name;
    private String email;
    
    // Constructor, getters, setters
    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    
    // Getters and setters...
}
```

**Result when accessing** `http://localhost:8080/api/users/user`:
```json
{
    "id": 1,
    "name": "John Doe",
    "email": "john@example.com"
}
```

---

## 4. HTTP Request Mappings {#mappings}

Spring Boot provides specific annotations for each HTTP method.

### 4.1 @GetMapping (Retrieve Data)

Used to handle GET requests for retrieving resources.

```java
@RestController
@RequestMapping("/api/products")
public class ProductController {
    
    // Single GET endpoint
    @GetMapping("/list")
    public List<String> getProducts() {
        return Arrays.asList("Laptop", "Phone", "Tablet");
    }
    
    // Multiple paths
    @GetMapping({"/info", "/details"})
    public String getInfo() {
        return "Product information";
    }
}
```

**Results:**
- `GET http://localhost:8080/api/products/list`
```json
["Laptop", "Phone", "Tablet"]
```

- `GET http://localhost:8080/api/products/info` or `/details`
```
Product information
```

### 4.2 @PostMapping (Create Data)

Used to handle POST requests for creating new resources.

```java
@RestController
@RequestMapping("/api/products")
public class ProductController {
    
    @PostMapping("/create")
    public String createProduct() {
        // Logic to create product
        return "Product created successfully";
    }
}
```

**Request:** `POST http://localhost:8080/api/products/create`

**Result:**
```
Product created successfully
```

### 4.3 @PutMapping (Update Data)

Used to handle PUT requests for updating existing resources completely.

```java
@RestController
@RequestMapping("/api/products")
public class ProductController {
    
    @PutMapping("/update")
    public String updateProduct() {
        // Logic to update entire product
        return "Product updated successfully";
    }
}
```

**Request:** `PUT http://localhost:8080/api/products/update`

**Result:**
```
Product updated successfully
```

### 4.4 @DeleteMapping (Delete Data)

Used to handle DELETE requests for removing resources.

```java
@RestController
@RequestMapping("/api/products")
public class ProductController {
    
    @DeleteMapping("/remove")
    public String deleteProduct() {
        // Logic to delete product
        return "Product deleted successfully";
    }
}
```

**Request:** `DELETE http://localhost:8080/api/products/remove`

**Result:**
```
Product deleted successfully
```

### 4.5 @PatchMapping (Partial Update)

Used to handle PATCH requests for partial updates.

```java
@RestController
@RequestMapping("/api/products")
public class ProductController {
    
    @PatchMapping("/modify")
    public String patchProduct() {
        // Logic to partially update product
        return "Product modified successfully";
    }
}
```

**Request:** `PATCH http://localhost:8080/api/products/modify`

**Result:**
```
Product modified successfully
```

### 4.6 @RequestMapping (Generic Mapping)

Can handle multiple HTTP methods.

```java
@RestController
public class GenericController {
    
    // Handle specific method
    @RequestMapping(value = "/data", method = RequestMethod.GET)
    public String getData() {
        return "Data retrieved";
    }
    
    // Handle multiple methods
    @RequestMapping(value = "/multi", method = {RequestMethod.GET, RequestMethod.POST})
    public String multiMethod() {
        return "Handles both GET and POST";
    }
}
```

---

## 5. Complete Examples {#examples}

### Example 1: Simple Product API

```java
package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    
    private List<Product> products = new ArrayList<>();
    
    // Constructor - initialize with sample data
    public ProductController() {
        products.add(new Product(1L, "Laptop", 999.99));
        products.add(new Product(2L, "Phone", 699.99));
    }
    
    @GetMapping
    public List<Product> getAllProducts() {
        return products;
    }
    
    @GetMapping("/count")
    public Map<String, Integer> getProductCount() {
        Map<String, Integer> response = new HashMap<>();
        response.put("count", products.size());
        return response;
    }
    
    @PostMapping
    public String addProduct() {
        products.add(new Product(3L, "Tablet", 499.99));
        return "Product added successfully";
    }
    
    @DeleteMapping
    public String clearProducts() {
        int size = products.size();
        products.clear();
        return "Deleted " + size + " products";
    }
}

class Product {
    private Long id;
    private String name;
    private Double price;
    
    public Product(Long id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }
}
```

**API Results:**

1. `GET http://localhost:8080/api/products`
```json
[
    {
        "id": 1,
        "name": "Laptop",
        "price": 999.99
    },
    {
        "id": 2,
        "name": "Phone",
        "price": 699.99
    }
]
```

2. `GET http://localhost:8080/api/products/count`
```json
{
    "count": 2
}
```

3. `POST http://localhost:8080/api/products`
```
Product added successfully
```

4. `DELETE http://localhost:8080/api/products`
```
Deleted 3 products
```

### Example 2: Status and Message Response

```java
@RestController
@RequestMapping("/api/status")
public class StatusController {
    
    @GetMapping("/health")
    public Map<String, Object> healthCheck() {
        Map<String, Object> status = new HashMap<>();
        status.put("status", "UP");
        status.put("timestamp", System.currentTimeMillis());
        status.put("service", "Product API");
        return status;
    }
    
    @GetMapping("/version")
    public ApiVersion getVersion() {
        return new ApiVersion("1.0.0", "2024-01-01");
    }
}

class ApiVersion {
    private String version;
    private String releaseDate;
    
    public ApiVersion(String version, String releaseDate) {
        this.version = version;
        this.releaseDate = releaseDate;
    }
    
    // Getters and setters
    public String getVersion() { return version; }
    public void setVersion(String version) { this.version = version; }
    public String getReleaseDate() { return releaseDate; }
    public void setReleaseDate(String releaseDate) { this.releaseDate = releaseDate; }
}
```

**Results:**

1. `GET http://localhost:8080/api/status/health`
```json
{
    "status": "UP",
    "timestamp": 1704067200000,
    "service": "Product API"
}
```

2. `GET http://localhost:8080/api/status/version`
```json
{
    "version": "1.0.0",
    "releaseDate": "2024-01-01"
}
```

---

## Key Takeaways

1. **@RestController** combines @Controller and @ResponseBody for REST APIs
2. **@RequestMapping** defines base paths and can handle any HTTP method
3. **Specific mappings** (@GetMapping, @PostMapping, etc.) make code clearer
4. Spring Boot **automatically converts** objects to JSON
5. Controllers should be **focused and organized** by resource type

---

## Testing Your API

Use tools like:
- **Postman**: GUI-based API testing
- **cURL**: Command-line tool
- **Browser**: For GET requests only

Example cURL command:
```bash
curl -X GET http://localhost:8080/api/products
```

---

This covers the fundamentals of REST API controllers in Spring Boot. Practice building simple APIs to solidify these concepts before moving to advanced topics!