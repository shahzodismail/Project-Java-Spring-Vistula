# Product Management System - REST API (Task 2)

## Description
This is a Spring Boot REST API application for managing products. [cite_start]It follows the MVC design pattern and uses a layered architecture: Controller, Service, Repository, Domain, and Support[cite: 358, 425].

## Technologies Used
* [cite_start]Java & Spring Boot [cite: 370]
* [cite_start]Spring Data JPA & Hibernate [cite: 1441]
* [cite_start]H2 In-Memory Database [cite: 1442]
* [cite_start]Swagger UI / OpenAPI [cite: 722]

## Use Cases (API Endpoints)
1. **POST /api/v1/products**: Creates a new product. [cite_start]Returns Status 201 Created[cite: 631, 714].
2. [cite_start]**GET /api/v1/products**: Returns a list of all products in the database[cite: 1327, 1378].
3. **DELETE /api/v1/products/{id}**: Deletes a product by its unique ID. [cite_start]Returns Status 204/200[cite: 1393, 1404].
## Functionality Proof

### 1. API Overview (Swagger UI)
![Swagger Overview](01.jpeg)

### 2. Creating a Product (POST Request)
![POST Request](02.jpeg)

### 3. Success Response (201 Created)
![Success Response](04.jpeg)

### 4. Database Verification (H2 Console)
![H2 Database](03.jpeg)
