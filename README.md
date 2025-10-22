# 🧩 Task Manager REST API

A simple **RESTful API** for managing tasks — built with **Spring Boot**, **PostgreSQL**, and **Docker Compose**.

> ✅ Completed as a technical assignment in **2 hours**, including **Flyway migration setup**.

---

## 🚀 Features

The API provides basic CRUD operations for task management:

| Method | Endpoint | Description |
|---------|-----------|-------------|
| `GET` | `/api/tasks` | Get all tasks |
| `GET` | `/api/tasks/{id}` | Get task by ID |
| `POST` | `/api/tasks` | Create a new task |
| `PUT` | `/api/tasks/{id}` | Update a task by ID |
| `DELETE` | `/api/tasks/{id}` | Delete a task by ID |

---

## Techincal Stack

- **Java 21**  
- **Spring Boot 3.5.4**
- **PostgreSQL**
- **Flyway** (for database migrations)
- **Docker Compose**
- **Gradle** (build tool)

---

## Setup & Run

### 1. Clone the repository
```bash
git clone https://github.com/Codemedy/TaskCrud.git
cd TaskCrud

docker compose up -d
And then run the Spring Boot Application
