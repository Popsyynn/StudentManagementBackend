# Student Management System Backend

The backend component of the Student Management System is developed using Spring Boot. It provides the necessary APIs and data persistence to handle student-related operations and interact with the frontend application.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Apache Maven
- MySQL (or any other compatible relational database)

## Getting Started

1. Clone the repository:

```shell
git clone //https://github.com/Popsyynn/StudentManagementBackend.git

Configure the database connection:

Open the src/main/resources/application.properties file.
Update the database connection properties with your MySQL database credentials.

API Endpoints
The following are the available API endpoints provided by the backend:

POST http://localhost:8080/student/save - POST student to the database
GET http://localhost:8080/student/getAll - Retrieve all students.
Technologies Used
Spring Boot - Backend framework for Java applications.
MySQL - Relational database management system.
Maven - Dependency management and build tool.
RESTful APIs - For communication between the frontend and backend.
