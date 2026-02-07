# Movie API (Spring Boot)

This is a simple Java Spring Boot backend application that implements a RESTful API
for managing movies (similar to a basic Netflix-style service).

## Features
- Add a new movie
- Fetch a movie by ID
- In-memory storage using ArrayList
- Input validation

## Tech Stack
- Java 17
- Spring Boot
- Maven

## How to Run Locally
1. Open the project in IntelliJ IDEA
2. Run `MovieApiApplication.java`
3. Server starts on port `8080`

## API Endpoints

### Add Movie
**POST** `/api/movies`

Request Body:
```json
{
  "title": "Interstellar",
  "description": "Sci-fi space movie",
  "releaseYear": 2014,
  "rating": 8.6
}
