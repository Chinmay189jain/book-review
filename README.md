# 📚 Book Review Management System

A simple Spring Boot application to manage books and their ratings, built for learning purposes. This mini project showcases **Spring Boot best practices**, including DTOs, validation, exception handling, Swagger documentation, and more.

&nbsp;

## 🚀 Features

- RESTful API using Spring Boot
- CRUD operations for Book resource
- Data validation with JSR-303 annotations
- DTO-layer abstraction using MapStruct
- Centralized exception handling using `@ControllerAdvice`
- In-memory H2 DB (switchable to MySQL/PostgreSQL)
- Swagger/OpenAPI for API documentation
- Logging using Logback
- Profiles (dev, prod)
- Application lifecycle hook (startup logging)

&nbsp;

## 🛠️ Tech Stack

| Layer         | Technology                      |
|---------------|----------------------------------|
| Framework     | Spring Boot                     |
| Language      | Java 17+                         |
| Build Tool    | Maven                           |
| Database      | H2 / MySQL / PostgreSQL         |
| ORM           | Spring Data JPA + Hibernate     |
| Mapping       | MapStruct                       |
| Validation    | Hibernate Validator (JSR-303)   |
| Logging       | SLF4J + Logback                 |
| Documentation | SpringDoc (Swagger/OpenAPI 3)   |
| Testing       | Postman / Swagger UI            |

&nbsp;

## 📁 Project Structure

```
src/
└── main/
    ├── java/
    │   └── com.example.bookreview/
    │       ├── controller/
    │       ├── service/
    │       ├── repository/
    │       ├── entity/
    │       ├── dto/
    │       ├── mapper/
    │       ├── exception/
    │       └── config/
    └── resources/
        ├── application.properties
        ├── application-dev.properties
        ├── application-prod.properties
        └── logback-spring.xml
```

&nbsp;

## 📦 Setup Instructions

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/book-review-system.git
cd book-review-system
```

### 2. Build the Project

```bash
mvn clean install
```

### 3. Run the Application

```bash
# Using dev profile with H2 DB
mvn spring-boot:run -Dspring-boot.run.profiles=dev
```

### 4. Access API Documentation

- Swagger UI: http://localhost:8080/swagger-ui.html
- API Docs (JSON): http://localhost:8080/v3/api-docs

&nbsp;

## 📬 Sample API Request

### ➕ Add a New Book

**POST** `/api/books`

```json
{
  "title": "Spring Boot in Action",
  "author": "Craig Walls",
  "rating": 5
}
```
