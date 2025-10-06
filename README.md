# Workshop Spring Boot 3 with JPA

![Java](https://img.shields.io/badge/Java-17-blue) 
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen) 
![Maven](https://img.shields.io/badge/Maven-4-red) 
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

This project was developed during the **"Java COMPLETO - Object-Oriented Programming + Projects"** course by **Nélio Alves** on Udemy.  
The goal is to practice **RESTful API** development concepts using **Spring Boot 3** and **JPA/Hibernate**.  

---

## 📖 Overview

This application is a simple system for managing orders, users, categories, and products.  
It explores fundamental concepts such as:

- Object-relational mapping with **JPA/Hibernate**  
- Relationships between entities  
- Custom exception handling  
- Environment-specific profiles (test/dev)  
- Layered architecture in a Spring Boot application  

---

## 🛠️ Technologies Used

- **Java 17**  
- **Spring Boot 3**  
- **Spring Data JPA / Hibernate**  
- **Maven**  
- **H2 Database** (in-memory database for testing)  

---

## ⚙️ Implemented Features

- Create and list users, orders, and products  
- Relationships between orders, categories, and order items  
- Date handling with `Instant` and `ISO 8601`  
- Centralized exception handling  

---

## ▶️ How to Run the Project Locally

1. Clone this repository:

```
git clone https://github.com/rdramos1/workshop-springboot3-jpa.git
```

2. Navigate into the project folder:

```
cd workshop-springboot3-jpa
```

3. Run the project using Maven:

```
mvn spring-boot:run
```

4. Access via browser or Postman:

```
http://localhost:8080
```

---

## 🌐 Main REST Endpoints

Below is a summary of the main API endpoints available in the project.  
All requests return data in **JSON** format.

| HTTP Method | Endpoint | Description |
|--------------|-----------|-------------|
| **GET** | `/users` | Retrieve all users |
| **GET** | `/users/{id}` | Retrieve a user by ID |
| **POST** | `/users` | Create a new user |
| **DELETE** | `/users/{id}` | Delete a user by ID |
| **GET** | `/orders` | Retrieve all orders |
| **GET** | `/orders/{id}` | Retrieve an order by ID |
| **GET** | `/products` | Retrieve all products |
| **GET** | `/products/{id}` | Retrieve a product by ID |
| **GET** | `/categories` | Retrieve all categories |
| **GET** | `/categories/{id}` | Retrieve a category by ID |

---
## 📌 Notes

- This project was created for **educational purposes**.  
- Make sure you have **Java 17+** and **Maven** installed.  

---

## 👤 Author

**Ricardo Davi Ramos Figueiredo** (professionally **Ricardo Ramos**)  

- LinkedIn: [Ricardo Ramos](https://www.linkedin.com/in/rdramos1)  
- Email: dev.ricardoramos@gmail.com  
