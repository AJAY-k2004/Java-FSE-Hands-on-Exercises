# Spring Boot Microservices Architecture

This project demonstrates a simple microservices architecture using Spring Boot and Spring Cloud. It includes:

## 🧩 Components

- **Eureka Discovery Server** (`8761`)  
  Service registry for dynamic service discovery.

- **Account Microservice** (`8082`)  
  Provides account information like number, type, and balance.

- **Loan Microservice** (`8083`)  
  Provides loan information like number, type, and amount.

- **API Gateway** (`8085`)  
  Routes incoming HTTP requests to appropriate microservices using Eureka service discovery.

---

## ⚙️ How to Run

1. **Start Eureka Discovery Server**
   - Run the Eureka main application class.
   - Open `http://localhost:8761` to see the service registry.

2. **Start Account Microservice**
   - Registers as `ACCOUNT-SERVICE`.
   - Accessible via API Gateway at:  
     `http://localhost:8085/account/{number}`

3. **Start Loan Microservice**
   - Registers as `LOAN-SERVICE`.
   - Accessible via API Gateway at:  
     `http://localhost:8085/loan/{number}`

4. **Start API Gateway**
   - Uses Spring Cloud Gateway.
   - Routes:
     - `/account/**` → Account Microservice
     - `/loan/**` → Loan Microservice

---

## 🧪 Example Requests

- `GET http://localhost:8085/account/123`  
  → Returns account info for number `123`

- `GET http://localhost:8085/loan/123`  
  → Returns loan info for number `123`

---

## 📝 Notes

- Use `spring-cloud-starter-gateway` instead of `spring-boot-starter-web` in API Gateway.
- Ensure all services are up before accessing through API Gateway.
- Configuration can be in `application.properties` or `application.yml`.

---

## 📦 Technologies Used

- Java 21
- Spring Boot 3.x
- Spring Cloud 2024.0.x / 2025.0.x
- Eureka Discovery Server
- Spring Cloud Gateway
