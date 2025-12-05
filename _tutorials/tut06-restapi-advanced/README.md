# REST API Advanced: Path Variables, Request Body, Query Params, Response Entities

## Table of Contents
1. [Path Variables](#path-variables)
2. [Request Body](#request-body)
3. [Query Parameters](#query-params)
4. [Response Entities](#response-entities)
5. [Combining All Concepts](#combining)
6. [Complete Real-World Examples](#real-world)

---

## 1. Path Variables {#path-variables}

Path variables are dynamic values embedded in the URL path. They're used to identify specific resources.

### Basic Path Variable

```java
@RestController
@RequestMapping("/api/users")
public class UserController {
    
    @GetMapping("/{id}")
    public String getUserById(@PathVariable Long id) {
        return "User ID: " + id;
    }
}
```

**Request:** `GET http://localhost:8080/api/users/123`

**Result:**
```
User ID: 123
```

### Multiple Path Variables

```java
@RestController
@RequestMapping("/api")
public class OrderController {
    
    @GetMapping("/users/{userId}/orders/{orderId}")
    public String getOrderDetails(
            @PathVariable Long userId,
            @PathVariable Long orderId) {
        return "User: " + userId + ", Order: " + orderId;
    }
}
```

**Request:** `GET http://localhost:8080/api/users/5/orders/101`

**Result:**
```
User: 5, Order: 101
```

### Custom Path Variable Names

```java
@RestController
@RequestMapping("/api/products")
public class ProductController {
    
    @GetMapping("/{product-id}")
    public String getProduct(@PathVariable("product-id") Long productId) {
        return "Product ID: " + productId;
    }
}
```

**Request:** `GET http://localhost:8080/api/products/42`

**Result:**
```
Product ID: 42
```

### Path Variable with Object Return

```java
@RestController
@RequestMapping("/api/books")
public class BookController {
    
    private Map<Long, Book> books = new HashMap<>();
    
    public BookController() {
        books.put(1L, new Book(1L, "Spring Boot Guide", "John Doe"));
        books.put(2L, new Book(2L, "Java Basics", "Jane Smith"));
    }
    
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        return books.getOrDefault(id, 
            new Book(0L, "Not Found", "Unknown"));
    }
}

class Book {
    private Long id;
    private String title;
    private String author;
    
    public Book(Long id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }
    
    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
}
```

**Request:** `GET http://localhost:8080/api/books/1`

**Result:**
```json
{
    "id": 1,
    "title": "Spring Boot Guide",
    "author": "John Doe"
}
```

### Optional Path Variables

```java
@RestController
@RequestMapping("/api/search")
public class SearchController {
    
    @GetMapping({"/category/{category}", "/category"})
    public String searchByCategory(
            @PathVariable(required = false) String category) {
        if (category == null) {
            return "Showing all categories";
        }
        return "Searching in category: " + category;
    }
}
```

**Requests:**
- `GET http://localhost:8080/api/search/category/electronics` → `Searching in category: electronics`
- `GET http://localhost:8080/api/search/category` → `Showing all categories`

---

## 2. Request Body {#request-body}

Request body contains data sent by the client, typically in JSON format. Used with POST, PUT, and PATCH requests.

### Simple Request Body

```java
@RestController
@RequestMapping("/api/users")
public class UserController {
    
    @PostMapping
    public String createUser(@RequestBody User user) {
        return "User created: " + user.getName() + " (" + user.getEmail() + ")";
    }
}

class User {
    private String name;
    private String email;
    
    // Constructors
    public User() {}
    
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
    
    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
```

**Request:** `POST http://localhost:8080/api/users`

**Request Body:**
```json
{
    "name": "Alice Johnson",
    "email": "alice@example.com"
}
```

**Result:**
```
User created: Alice Johnson (alice@example.com)
```

### Complex Request Body with Nested Objects

```java
@RestController
@RequestMapping("/api/orders")
public class OrderController {
    
    @PostMapping
    public OrderResponse createOrder(@RequestBody Order order) {
        double total = order.getItems().stream()
            .mapToDouble(item -> item.getPrice() * item.getQuantity())
            .sum();
        
        return new OrderResponse(
            "ORD" + System.currentTimeMillis(),
            order.getCustomerName(),
            total,
            "CONFIRMED"
        );
    }
}

class Order {
    private String customerName;
    private List<OrderItem> items;
    
    // Constructors, getters, setters
    public Order() {}
    
    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public List<OrderItem> getItems() { return items; }
    public void setItems(List<OrderItem> items) { this.items = items; }
}

class OrderItem {
    private String productName;
    private int quantity;
    private double price;
    
    // Constructors, getters, setters
    public OrderItem() {}
    
    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}

class OrderResponse {
    private String orderId;
    private String customerName;
    private double totalAmount;
    private String status;
    
    public OrderResponse(String orderId, String customerName, 
                        double totalAmount, String status) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
        this.status = status;
    }
    
    // Getters and setters
    public String getOrderId() { return orderId; }
    public void setOrderId(String orderId) { this.orderId = orderId; }
    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
```

**Request:** `POST http://localhost:8080/api/orders`

**Request Body:**
```json
{
    "customerName": "Bob Smith",
    "items": [
        {
            "productName": "Laptop",
            "quantity": 1,
            "price": 999.99
        },
        {
            "productName": "Mouse",
            "quantity": 2,
            "price": 25.50
        }
    ]
}
```

**Result:**
```json
{
    "orderId": "ORD1704067200000",
    "customerName": "Bob Smith",
    "totalAmount": 1050.99,
    "status": "CONFIRMED"
}
```

### Request Body with Path Variable (Update Operation)

```java
@RestController
@RequestMapping("/api/products")
public class ProductController {
    
    @PutMapping("/{id}")
    public String updateProduct(
            @PathVariable Long id,
            @RequestBody Product product) {
        return "Updated product " + id + ": " + product.getName() + 
               " - $" + product.getPrice();
    }
}

class Product {
    private String name;
    private double price;
    
    public Product() {}
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}
```

**Request:** `PUT http://localhost:8080/api/products/42`

**Request Body:**
```json
{
    "name": "Updated Laptop",
    "price": 899.99
}
```

**Result:**
```
Updated product 42: Updated Laptop - $899.99
```

---

## 3. Query Parameters {#query-params}

Query parameters are key-value pairs appended to the URL after `?`. Used for filtering, sorting, and pagination.

### Single Query Parameter

```java
@RestController
@RequestMapping("/api/products")
public class ProductController {
    
    @GetMapping("/search")
    public String searchProducts(@RequestParam String name) {
        return "Searching for: " + name;
    }
}
```

**Request:** `GET http://localhost:8080/api/products/search?name=laptop`

**Result:**
```
Searching for: laptop
```

### Multiple Query Parameters

```java
@RestController
@RequestMapping("/api/products")
public class ProductController {
    
    @GetMapping("/filter")
    public String filterProducts(
            @RequestParam String category,
            @RequestParam Double minPrice,
            @RequestParam Double maxPrice) {
        return String.format("Category: %s, Price: $%.2f - $%.2f", 
                           category, minPrice, maxPrice);
    }
}
```

**Request:** `GET http://localhost:8080/api/products/filter?category=electronics&minPrice=100&maxPrice=500`

**Result:**
```
Category: electronics, Price: $100.00 - $500.00
```

### Optional Query Parameters with Default Values

```java
@RestController
@RequestMapping("/api/products")
public class ProductController {
    
    @GetMapping
    public String getProducts(
            @RequestParam(required = false, defaultValue = "1") int page,
            @RequestParam(required = false, defaultValue = "10") int size,
            @RequestParam(required = false, defaultValue = "name") String sortBy) {
        return String.format("Page: %d, Size: %d, Sort by: %s", 
                           page, size, sortBy);
    }
}
```

**Requests:**
- `GET http://localhost:8080/api/products` → `Page: 1, Size: 10, Sort by: name`
- `GET http://localhost:8080/api/products?page=2&size=20` → `Page: 2, Size: 20, Sort by: name`
- `GET http://localhost:8080/api/products?sortBy=price` → `Page: 1, Size: 10, Sort by: price`

### Query Parameters with Objects

```java
@RestController
@RequestMapping("/api/users")
public class UserController {
    
    private List<User> users = Arrays.asList(
        new User(1L, "Alice", 25, "alice@example.com"),
        new User(2L, "Bob", 30, "bob@example.com"),
        new User(3L, "Charlie", 35, "charlie@example.com")
    );
    
    @GetMapping("/search")
    public List<User> searchUsers(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) Integer minAge) {
        
        return users.stream()
            .filter(user -> name == null || user.getName().toLowerCase()
                .contains(name.toLowerCase()))
            .filter(user -> minAge == null || user.getAge() >= minAge)
            .collect(Collectors.toList());
    }
}

class User {
    private Long id;
    private String name;
    private int age;
    private String email;
    
    public User(Long id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }
    
    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
```

**Request:** `GET http://localhost:8080/api/users/search?minAge=30`

**Result:**
```json
[
    {
        "id": 2,
        "name": "Bob",
        "age": 30,
        "email": "bob@example.com"
    },
    {
        "id": 3,
        "name": "Charlie",
        "age": 35,
        "email": "charlie@example.com"
    }
]
```

### Query Parameters with Map

```java
@RestController
@RequestMapping("/api/analytics")
public class AnalyticsController {
    
    @GetMapping("/report")
    public Map<String, Object> generateReport(@RequestParam Map<String, String> filters) {
        Map<String, Object> response = new HashMap<>();
        response.put("filters", filters);
        response.put("recordCount", 42);
        response.put("timestamp", System.currentTimeMillis());
        return response;
    }
}
```

**Request:** `GET http://localhost:8080/api/analytics/report?startDate=2024-01-01&endDate=2024-12-31&type=sales`

**Result:**
```json
{
    "filters": {
        "startDate": "2024-01-01",
        "endDate": "2024-12-31",
        "type": "sales"
    },
    "recordCount": 42,
    "timestamp": 1704067200000
}
```

---

## 4. Response Entities {#response-entities}

ResponseEntity provides full control over HTTP response including status codes, headers, and body.

### Basic ResponseEntity with Status

```java
@RestController
@RequestMapping("/api/products")
public class ProductController {
    
    @GetMapping("/{id}")
    public ResponseEntity<String> getProduct(@PathVariable Long id) {
        if (id > 100) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok("Product found with ID: " + id);
    }
}
```

**Requests:**
- `GET http://localhost:8080/api/products/50`
  - **Status:** 200 OK
  - **Body:** `Product found with ID: 50`

- `GET http://localhost:8080/api/products/150`
  - **Status:** 404 Not Found
  - **Body:** (empty)

### ResponseEntity with Custom Status Codes

```java
@RestController
@RequestMapping("/api/users")
public class UserController {
    
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User createdUser = new User(1L, user.getName(), user.getEmail());
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        // Delete logic
        return ResponseEntity.noContent().build();
    }
}
```

**Requests:**
1. `POST http://localhost:8080/api/users`
   - **Status:** 201 Created
   - **Body:**
   ```json
   {
       "id": 1,
       "name": "John Doe",
       "email": "john@example.com"
   }
   ```

2. `DELETE http://localhost:8080/api/users/1`
   - **Status:** 204 No Content
   - **Body:** (empty)

### ResponseEntity with Custom Headers

```java
@RestController
@RequestMapping("/api/files")
public class FileController {
    
    @GetMapping("/{filename}")
    public ResponseEntity<String> downloadFile(@PathVariable String filename) {
        String content = "File content here...";
        
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "attachment; filename=" + filename);
        headers.add("Custom-Header", "CustomValue");
        
        return ResponseEntity.ok()
            .headers(headers)
            .body(content);
    }
}
```

**Request:** `GET http://localhost:8080/api/files/document.txt`

**Response:**
- **Status:** 200 OK
- **Headers:**
  ```
  Content-Disposition: attachment; filename=document.txt
  Custom-Header: CustomValue
  ```
- **Body:** `File content here...`

### ResponseEntity with Error Handling

```java
@RestController
@RequestMapping("/api/products")
public class ProductController {
    
    private Map<Long, Product> products = new HashMap<>();
    
    public ProductController() {
        products.put(1L, new Product(1L, "Laptop", 999.99));
        products.put(2L, new Product(2L, "Phone", 699.99));
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<?> getProduct(@PathVariable Long id) {
        Product product = products.get(id);
        
        if (product == null) {
            ErrorResponse error = new ErrorResponse(
                "Product not found",
                "No product exists with ID: " + id,
                System.currentTimeMillis()
            );
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
        }
        
        return ResponseEntity.ok(product);
    }
}

class ErrorResponse {
    private String error;
    private String message;
    private long timestamp;
    
    public ErrorResponse(String error, String message, long timestamp) {
        this.error = error;
        this.message = message;
        this.timestamp = timestamp;
    }
    
    // Getters and setters
    public String getError() { return error; }
    public void setError(String error) { this.error = error; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
    public long getTimestamp() { return timestamp; }
    public void setTimestamp(long timestamp) { this.timestamp = timestamp; }
}
```

**Requests:**
1. `GET http://localhost:8080/api/products/1`
   - **Status:** 200 OK
   - **Body:**
   ```json
   {
       "id": 1,
       "name": "Laptop",
       "price": 999.99
   }
   ```

2. `GET http://localhost:8080/api/products/999`
   - **Status:** 404 Not Found
   - **Body:**
   ```json
   {
       "error": "Product not found",
       "message": "No product exists with ID: 999",
       "timestamp": 1704067200000
   }
   ```

### ResponseEntity with Conditional Logic

```java
@RestController
@RequestMapping("/api/auth")
public class AuthController {
    
    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest request) {
        if ("admin".equals(request.getUsername()) && 
            "password123".equals(request.getPassword())) {
            
            LoginResponse response = new LoginResponse(
                "token-xyz-123",
                "Login successful",
                true
            );
            return ResponseEntity.ok(response);
        }
        
        LoginResponse response = new LoginResponse(
            null,
            "Invalid credentials",
            false
        );
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response);
    }
}

class LoginRequest {
    private String username;
    private String password;
    
    public LoginRequest() {}
    
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}

class LoginResponse {
    private String token;
    private String message;
    private boolean success;
    
    public LoginResponse(String token, String message, boolean success) {
        this.token = token;
        this.message = message;
        this.success = success;
    }
    
    // Getters and setters
    public String getToken() { return token; }
    public void setToken(String token) { this.token = token; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
    public boolean isSuccess() { return success; }
    public void setSuccess(boolean success) { this.success = success; }
}
```

**Valid Login - Request:** `POST http://localhost:8080/api/auth/login`
```json
{
    "username": "admin",
    "password": "password123"
}
```

**Result:**
- **Status:** 200 OK
- **Body:**
```json
{
    "token": "token-xyz-123",
    "message": "Login successful",
    "success": true
}
```

**Invalid Login - Request:** `POST http://localhost:8080/api/auth/login`
```json
{
    "username": "admin",
    "password": "wrongpassword"
}
```

**Result:**
- **Status:** 401 Unauthorized
- **Body:**
```json
{
    "token": null,
    "message": "Invalid credentials",
    "success": false
}
```

---

## 5. Combining All Concepts {#combining}

Combining path variables, query params, request body, and response entities.

```java
@RestController
@RequestMapping("/api/orders")
public class OrderController {
    
    private Map<Long, Order> orders = new HashMap<>();
    private AtomicLong idCounter = new AtomicLong(1);
    
    // Create order (Request Body + ResponseEntity)
    @PostMapping
    public ResponseEntity<OrderResponse> createOrder(@RequestBody OrderRequest request) {
        Long orderId = idCounter.getAndIncrement();
        Order order = new Order(
            orderId,
            request.getCustomerName(),
            request.getItems(),
            "PENDING"
        );
        orders.put(orderId, order);
        
        OrderResponse response = new OrderResponse(
            orderId,
            "Order created successfully",
            order
        );
        
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    
    // Get order by ID (Path Variable + ResponseEntity)
    @GetMapping("/{orderId}")
    public ResponseEntity<?> getOrder(@PathVariable Long orderId) {
        Order order = orders.get(orderId);
        
        if (order == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(Map.of("error", "Order not found"));
        }
        
        return ResponseEntity.ok(order);
    }
    
    // Search orders (Query Params + ResponseEntity)
    @GetMapping("/search")
    public ResponseEntity<List<Order>> searchOrders(
            @RequestParam(required = false) String customerName,
            @RequestParam(required = false) String status) {
        
        List<Order> filtered = orders.values().stream()
            .filter(o -> customerName == null || 
                   o.getCustomerName().toLowerCase()
                   .contains(customerName.toLowerCase()))
            .filter(o -> status == null || o.getStatus().equals(status))
            .collect(Collectors.toList());
        
        return ResponseEntity.ok(filtered);
    }
    
    // Update order (Path Variable + Request Body + ResponseEntity)
    @PutMapping("/{orderId}")
    public ResponseEntity<?> updateOrder(
            @PathVariable Long orderId,
            @RequestBody OrderUpdateRequest request) {
        
        Order order = orders.get(orderId);
        
        if (order == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(Map.of("error", "Order not found"));
        }
        
        order.setStatus(request.getStatus());
        
        return ResponseEntity.ok(Map.of(
            "message", "Order updated successfully",
            "order", order
        ));
    }
    
    // Delete order (Path Variable + ResponseEntity)
    @DeleteMapping("/{orderId}")
    public ResponseEntity<?> deleteOrder(@PathVariable Long orderId) {
        Order removed = orders.remove(orderId);
        
        if (removed == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(Map.of("error", "Order not found"));
        }
        
        return ResponseEntity.ok(Map.of(
            "message", "Order deleted successfully",
            "orderId", orderId
        ));
    }
}

// Supporting classes
class OrderRequest {
    private String customerName;
    private List<String> items;
    
    public OrderRequest() {}
    
    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public List<String> getItems() { return items; }
    public void setItems(List<String> items) { this.items = items; }
}

class Order {
    private Long id;
    private String customerName;
    private List<String> items;
    private String status;
    
    public Order(Long id, String customerName, List<String> items, String status) {
        this.id = id;
        this.customerName = customerName;
        this.items = items;
        this.status = status;
    }
    
    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public List<String> getItems() { return items; }
    public void setItems(List<String> items) { this.items = items; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}

class OrderResponse {
    private Long orderId;
    private String message;
    private Order order;
    
    public OrderResponse(Long orderId, String message, Order order) {
        this.orderId = orderId;
        this.message = message;
        this.order = order;
    }
    
    // Getters and setters
    public Long getOrderId() { return orderId; }
    public void setOrderId(Long orderId) { this.orderId = orderId; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
    public Order getOrder() { return order; }
    public void setOrder(Order order) { this.order = order; }
}

class OrderUpdateRequest {
    private String status;
    
    public OrderUpdateRequest() {}
    
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
```

**Example API Calls:**

1. **Create Order:**
```
POST http://localhost:8080/api/orders
Body:
{
    "customerName": "John Doe",
    "items": ["Laptop", "Mouse", "Keyboard"]
}

Response (201 Created):
{
    "orderId": 1,
    "message": "Order created successfully",
    "order": {
        "id": 1,
        "customerName": "John Doe",
        "items": ["Laptop", "Mouse", "Keyboard"],
        "status": "PENDING"
    }
}
```

2. **Get Order:**
```
GET http://localhost:8080/api/orders/1

Response (200 OK):
{
    "id": 1,
    "customerName": "John Doe",
    "items": ["Laptop", "Mouse", "Keyboard"],
    "status": "PENDING"
}
```

3. **Search Orders:**
```
GET http://localhost:8080/api/orders/search?status=PENDING

Response (200 OK):
[
    {
        "id": 1,
        "customerName": "John Doe",
        "items": ["Laptop", "Mouse", "Keyboard"],
        "status": "PENDING"
    }
]
```

4. **Update Order:**
```
PUT http://localhost:8080/api/orders/1
Body:
{
    "status": "SHIPPED"
}

Response (200 OK):
{
    "message": "Order updated successfully",
    "order": {
        "id": 1,
        "customerName": "John Doe",
        "items": ["Laptop", "Mouse", "Keyboard"],
        "status": "SHIPPED"
    }
}
```

5. **Delete Order:**
```
DELETE http://localhost:8080/api/orders/1

Response (200 OK):
{
    "message": "Order deleted successfully",
    "orderId": 1
}
```

---

## 6. Complete Real-World Examples {#real-world}

### Example 1: E-commerce Product API

```java
@RestController
@RequestMapping("/api/v1/products")
public class ProductApiController {
    
    private Map<Long, Product> productDb = new HashMap<>();
    private AtomicLong idGen = new AtomicLong(1);
    
    public ProductApiController() {
        // Initialize with sample data
        productDb.put(1L, new Product(1L, "Laptop", "Electronics", 999.99, 50));
        productDb.put(2L, new Product(2L, "Phone", "Electronics", 699.99, 100));
        productDb.put(3L, new Product(3L, "Desk", "Furniture", 299.99, 25));
    }
    
    // GET all products with filtering and pagination
    @GetMapping
    public ResponseEntity<Map<String, Object>> getAllProducts(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(required = false) String category,
            @RequestParam(required = false) Double minPrice,
            @RequestParam(required = false) Double maxPrice) {
        
        List<Product> filtered = productDb.values().stream()
            .filter(p -> category == null || p.getCategory().equalsIgnoreCase(category))
            .filter(p -> minPrice == null || p.getPrice() >= minPrice)
            .filter(p -> maxPrice == null || p.getPrice() <= maxPrice)
            .collect(Collectors.toList());
        
        int start = page * size;
        int end = Math.min(start + size, filtered.size());
        List<Product> paginated = filtered.subList(start, end);
        
        Map<String, Object> response = new HashMap<>();
        response.put("products", paginated);
        response.put("currentPage", page);
        response.put("totalItems", filtered.size());
        response.put("totalPages", (int) Math.ceil((double) filtered.size() / size));
        
        return ResponseEntity.ok(response);
    }
    
    // GET single product by ID
    @GetMapping("/{id}")
    public ResponseEntity<?> getProductById(@PathVariable Long id) {
        Product product = productDb.get(id);
        
        if (product == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(new ApiError("Product not found", "No product with ID: " + id));
        }
        
        return ResponseEntity.ok(product);
    }
    
    // POST create new product
    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody ProductRequest request) {
        Long id = idGen.getAndIncrement();
        Product product = new Product(
            id,
            request.getName(),
            request.getCategory(),
            request.getPrice(),
            request.getStock()
        );
        productDb.put(id, product);
        
        return ResponseEntity.status(HttpStatus.CREATED).body(product);
    }
    
    // PUT update product
    @PutMapping("/{id}")
    public ResponseEntity<?> updateProduct(
            @PathVariable Long id,
            @RequestBody ProductRequest request) {
        
        Product product = productDb.get(id);
        
        if (product == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(new ApiError("Product not found", "Cannot update non-existent product"));
        }
        
        product.setName(request.getName());
        product.setCategory(request.getCategory());
        product.setPrice(request.getPrice());
        product.setStock(request.getStock());
        
        return ResponseEntity.ok(product);
    }
    
    // PATCH partial update
    @PatchMapping("/{id}/stock")
    public ResponseEntity<?> updateStock(
            @PathVariable Long id,
            @RequestParam int quantity) {
        
        Product product = productDb.get(id);
        
        if (product == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(new ApiError("Product not found", "Cannot update stock"));
        }
        
        product.setStock(product.getStock() + quantity);
        
        return ResponseEntity.ok(Map.of(
            "message", "Stock updated successfully",
            "productId", id,
            "newStock", product.getStock()
        ));
    }
    
    // DELETE product
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable Long id) {
        Product removed = productDb.remove(id);
        
        if (removed == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(new ApiError("Product not found", "Cannot delete non-existent product"));
        }
        
        return ResponseEntity.ok(Map.of(
            "message", "Product deleted successfully",
            "deletedProduct", removed
        ));
    }
}

// Supporting classes
class Product {
    private Long id;
    private String name;
    private String category;
    private double price;
    private int stock;
    
    public Product(Long id, String name, String category, double price, int stock) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }
    
    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }
}

class ProductRequest {
    private String name;
    private String category;
    private double price;
    private int stock;
    
    public ProductRequest() {}
    
    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }
}

class ApiError {
    private String error;
    private String message;
    private long timestamp;
    
    public ApiError(String error, String message) {
        this.error = error;
        this.message = message;
        this.timestamp = System.currentTimeMillis();
    }
    
    // Getters and setters
    public String getError() { return error; }
    public void setError(String error) { this.error = error; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
    public long getTimestamp() { return timestamp; }
    public void setTimestamp(long timestamp) { this.timestamp = timestamp; }
}
```

**Example API Calls:**

1. **Get All Products (with filters):**
```
GET http://localhost:8080/api/v1/products?category=Electronics&minPrice=500

Response (200 OK):
{
    "products": [
        {
            "id": 1,
            "name": "Laptop",
            "category": "Electronics",
            "price": 999.99,
            "stock": 50
        },
        {
            "id": 2,
            "name": "Phone",
            "category": "Electronics",
            "price": 699.99,
            "stock": 100
        }
    ],
    "currentPage": 0,
    "totalItems": 2,
    "totalPages": 1
}
```

2. **Create Product:**
```
POST http://localhost:8080/api/v1/products
Body:
{
    "name": "Tablet",
    "category": "Electronics",
    "price": 499.99,
    "stock": 75
}

Response (201 Created):
{
    "id": 4,
    "name": "Tablet",
    "category": "Electronics",
    "price": 499.99,
    "stock": 75
}
```

3. **Update Stock:**
```
PATCH http://localhost:8080/api/v1/products/1/stock?quantity=10

Response (200 OK):
{
    "message": "Stock updated successfully",
    "productId": 1,
    "newStock": 60
}
```

---

### Example 2: User Management System

```java
@RestController
@RequestMapping("/api/v1/users")
public class UserManagementController {
    
    private Map<Long, User> userDb = new HashMap<>();
    private AtomicLong idCounter = new AtomicLong(1);
    
    public UserManagementController() {
        userDb.put(1L, new User(1L, "john.doe", "john@example.com", 
            "John Doe", "ACTIVE", Arrays.asList("USER")));
        userDb.put(2L, new User(2L, "jane.smith", "jane@example.com", 
            "Jane Smith", "ACTIVE", Arrays.asList("USER", "ADMIN")));
    }
    
    // Register new user
    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody UserRegistrationRequest request) {
        // Check if username already exists
        boolean usernameExists = userDb.values().stream()
            .anyMatch(u -> u.getUsername().equals(request.getUsername()));
        
        if (usernameExists) {
            return ResponseEntity.status(HttpStatus.CONFLICT)
                .body(new ApiError("Username exists", "Username already taken"));
        }
        
        Long id = idCounter.getAndIncrement();
        User user = new User(
            id,
            request.getUsername(),
            request.getEmail(),
            request.getFullName(),
            "ACTIVE",
            Arrays.asList("USER")
        );
        userDb.put(id, user);
        
        return ResponseEntity.status(HttpStatus.CREATED)
            .body(Map.of(
                "message", "User registered successfully",
                "userId", id,
                "user", user
            ));
    }
    
    // Get user profile
    @GetMapping("/{userId}")
    public ResponseEntity<?> getUserProfile(@PathVariable Long userId) {
        User user = userDb.get(userId);
        
        if (user == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(new ApiError("User not found", "No user with ID: " + userId));
        }
        
        return ResponseEntity.ok(user);
    }
    
    // Search users
    @GetMapping("/search")
    public ResponseEntity<List<User>> searchUsers(
            @RequestParam(required = false) String username,
            @RequestParam(required = false) String email,
            @RequestParam(required = false) String status) {
        
        List<User> results = userDb.values().stream()
            .filter(u -> username == null || u.getUsername().contains(username))
            .filter(u -> email == null || u.getEmail().contains(email))
            .filter(u -> status == null || u.getStatus().equals(status))
            .collect(Collectors.toList());
        
        return ResponseEntity.ok(results);
    }
    
    // Update user profile
    @PutMapping("/{userId}")
    public ResponseEntity<?> updateUserProfile(
            @PathVariable Long userId,
            @RequestBody UserUpdateRequest request) {
        
        User user = userDb.get(userId);
        
        if (user == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(new ApiError("User not found", "Cannot update non-existent user"));
        }
        
        user.setEmail(request.getEmail());
        user.setFullName(request.getFullName());
        
        return ResponseEntity.ok(Map.of(
            "message", "Profile updated successfully",
            "user", user
        ));
    }
    
    // Update user status
    @PatchMapping("/{userId}/status")
    public ResponseEntity<?> updateUserStatus(
            @PathVariable Long userId,
            @RequestParam String status) {
        
        User user = userDb.get(userId);
        
        if (user == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(new ApiError("User not found", "Cannot update status"));
        }
        
        if (!Arrays.asList("ACTIVE", "INACTIVE", "SUSPENDED").contains(status)) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(new ApiError("Invalid status", "Status must be ACTIVE, INACTIVE, or SUSPENDED"));
        }
        
        user.setStatus(status);
        
        return ResponseEntity.ok(Map.of(
            "message", "Status updated successfully",
            "userId", userId,
            "newStatus", status
        ));
    }
    
    // Assign roles to user
    @PostMapping("/{userId}/roles")
    public ResponseEntity<?> assignRoles(
            @PathVariable Long userId,
            @RequestBody RoleAssignmentRequest request) {
        
        User user = userDb.get(userId);
        
        if (user == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(new ApiError("User not found", "Cannot assign roles"));
        }
        
        user.setRoles(request.getRoles());
        
        return ResponseEntity.ok(Map.of(
            "message", "Roles assigned successfully",
            "userId", userId,
            "roles", user.getRoles()
        ));
    }
    
    // Delete user
    @DeleteMapping("/{userId}")
    public ResponseEntity<?> deleteUser(@PathVariable Long userId) {
        User removed = userDb.remove(userId);
        
        if (removed == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(new ApiError("User not found", "Cannot delete non-existent user"));
        }
        
        return ResponseEntity.ok(Map.of(
            "message", "User deleted successfully",
            "deletedUserId", userId
        ));
    }
}

// Supporting classes
class User {
    private Long id;
    private String username;
    private String email;
    private String fullName;
    private String status;
    private List<String> roles;
    
    public User(Long id, String username, String email, String fullName, 
                String status, List<String> roles) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.fullName = fullName;
        this.status = status;
        this.roles = roles;
    }
    
    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public List<String> getRoles() { return roles; }
    public void setRoles(List<String> roles) { this.roles = roles; }
}

class UserRegistrationRequest {
    private String username;
    private String email;
    private String fullName;
    
    public UserRegistrationRequest() {}
    
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
}

class UserUpdateRequest {
    private String email;
    private String fullName;
    
    public UserUpdateRequest() {}
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
}

class RoleAssignmentRequest {
    private List<String> roles;
    
    public RoleAssignmentRequest() {}
    
    public List<String> getRoles() { return roles; }
    public void setRoles(List<String> roles) { this.roles = roles; }
}
```

**Example API Calls:**

1. **Register User:**
```
POST http://localhost:8080/api/v1/users/register
Body:
{
    "username": "alice.wonder",
    "email": "alice@example.com",
    "fullName": "Alice Wonder"
}

Response (201 Created):
{
    "message": "User registered successfully",
    "userId": 3,
    "user": {
        "id": 3,
        "username": "alice.wonder",
        "email": "alice@example.com",
        "fullName": "Alice Wonder",
        "status": "ACTIVE",
        "roles": ["USER"]
    }
}
```

2. **Search Users:**
```
GET http://localhost:8080/api/v1/users/search?status=ACTIVE

Response (200 OK):
[
    {
        "id": 1,
        "username": "john.doe",
        "email": "john@example.com",
        "fullName": "John Doe",
        "status": "ACTIVE",
        "roles": ["USER"]
    },
    {
        "id": 2,
        "username": "jane.smith",
        "email": "jane@example.com",
        "fullName": "Jane Smith",
        "status": "ACTIVE",
        "roles": ["USER", "ADMIN"]
    }
]
```

3. **Update User Status:**
```
PATCH http://localhost:8080/api/v1/users/1/status?status=SUSPENDED

Response (200 OK):
{
    "message": "Status updated successfully",
    "userId": 1,
    "newStatus": "SUSPENDED"
}
```

---

## Key Takeaways

### When to Use Each Feature

| Feature | Use Case | Example |
|---------|----------|---------|
| **Path Variables** | Identifying specific resources | `/users/{userId}`, `/orders/{orderId}` |
| **Query Parameters** | Filtering, sorting, pagination | `/products?category=electronics&page=1` |
| **Request Body** | Sending complex data (CREATE/UPDATE) | POST/PUT with JSON payload |
| **Response Entity** | Custom status codes, headers, error handling | 201 Created, 404 Not Found, custom headers |

### Best Practices

1. **Path Variables:**
   - Use for required identifiers
   - Keep URLs clean and RESTful
   - Use meaningful names

2. **Query Parameters:**
   - Use for optional filters
   - Provide sensible defaults
   - Make parameters optional with `required = false`

3. **Request Body:**
   - Use for complex data structures
   - Always validate input
   - Create separate request/response DTOs

4. **Response Entity:**
   - Return appropriate HTTP status codes
   - Include error details in error responses
   - Use consistent response structure

### Common HTTP Status Codes

- **200 OK** - Successful GET, PUT, PATCH
- **201 Created** - Successful POST (resource created)
- **204 No Content** - Successful DELETE
- **400 Bad Request** - Invalid input
- **401 Unauthorized** - Authentication required
- **403 Forbidden** - Insufficient permissions
- **404 Not Found** - Resource doesn't exist
- **409 Conflict** - Duplicate resource
- **500 Internal Server Error** - Server error

---

## Complete CRUD REST API Pattern

```java
@RestController
@RequestMapping("/api/v1/resource")
public class ResourceController {
    
    // CREATE - POST /api/v1/resource
    @PostMapping
    public ResponseEntity<Resource> create(@RequestBody ResourceRequest request) {
        // Create logic
        return ResponseEntity.status(HttpStatus.CREATED).body(resource);
    }
    
    // READ ALL - GET /api/v1/resource?filters
    @GetMapping
    public ResponseEntity<List<Resource>> getAll(
            @RequestParam(required = false) String filter) {
        // Get all with filters
        return ResponseEntity.ok(resources);
    }
    
    // READ ONE - GET /api/v1/resource/{id}
    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id) {
        // Get by ID with error handling
        return ResponseEntity.ok(resource);
    }
    
    // UPDATE - PUT /api/v1/resource/{id}
    @PutMapping("/{id}")
    public ResponseEntity<?> update(
            @PathVariable Long id,
            @RequestBody ResourceRequest request) {
        // Update logic
        return ResponseEntity.ok(updatedResource);
    }
    
    // PARTIAL UPDATE - PATCH /api/v1/resource/{id}
    @PatchMapping("/{id}")
    public ResponseEntity<?> partialUpdate(
            @PathVariable Long id,
            @RequestBody Map<String, Object> updates) {
        // Partial update logic
        return ResponseEntity.ok(resource);
    }
    
    // DELETE - DELETE /api/v1/resource/{id}
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        // Delete logic
        return ResponseEntity.ok(successMessage);
    }
}
```

This completes the comprehensive guide to REST API development with Spring Boot!