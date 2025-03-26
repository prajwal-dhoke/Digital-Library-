# Digital Library Book Management System

## Objective
The Digital Library Book Management System is designed to enable librarians to efficiently manage a collection of books. This system allows users to add, update, search, and remove books while maintaining their availability status.

## Features
- **Add a Book**: Enter book details including ID, title, author, genre, and availability status.
- **View All Books**: Display a list of all books with their details.
- **Search Book by ID or Title**: Find books using either their ID or title.
- **Update Book Details**: Modify book information such as title, author, genre, or availability status.
- **Delete a Book Record**: Remove a book from the catalog.
- **RESTful API Integration**: Supports API endpoints for managing books.

## Technologies Used
- **Backend**: Spring Boot (Java)
- **Database**: H2 (In-Memory Database)
- **Frontend**: HTML, CSS, Bootstrap
- **API Format**: RESTful API (Spring Boot REST Controller)

## Installation & Setup
### Prerequisites
Ensure you have the following installed:
- Java 17+
- Maven
- Git
- Any IDE (IntelliJ, VS Code, Eclipse, etc.)

### Steps to Run Locally
1. **Clone the Repository**
   ```sh
   git clone https://github.com/your-username/digital-library-management.git
   cd digital-library-management
   ```
2. **Build the Project**
   ```sh
   mvn clean install
   ```
3. **Run the Application**
   ```sh
   mvn spring-boot:run
   ```
4. **Access the Application**
   - **Frontend**: Open `http://localhost:8080` in a browser.
   - **API Endpoints**: Use Postman or a browser to test APIs.

### API Endpoints
| HTTP Method | Endpoint        | Description            |
|------------|----------------|------------------------|
| GET        | /books         | Fetch all books       |
| GET        | /books/{id}    | Fetch book by ID      |
| POST       | /books         | Add a new book        |
| PUT        | /books/{id}    | Update book details   |
| DELETE     | /books/{id}    | Delete a book         |

## Deployment
The project is deployed on **[Heroku/Render/Railway]** and can be accessed at:  
[Deployment Link](https://your-deployment-url.com)

## Challenges Faced
- Implementing efficient search functionality.
- Ensuring API responses are properly structured.
- Integrating H2 database with Spring Boot for seamless data handling.

## Future Improvements
- Implement role-based access control.
- Add authentication and authorization features.
- Improve UI/UX for better user experience.

## Contributing
Feel free to fork this repository and contribute to the project.



