# AI Chatbot – Gemini AI Integration Using Spring Boot

AI-powered chatbot built using Java, Spring Boot, Spring AI, Google Gemini API and MySQL with persistent chat memory and conversation management.

## 🚀 Features

- **AI Chat Integration:** Generate intelligent responses using Google Gemini API.
- **RESTful APIs:** Send messages and receive AI-generated responses.
- **Persistent Chat Memory:** Store user and assistant messages in MySQL.
- **Conversation Management:** Create and manage multiple conversations.
- **Chat History:** Retrieve previous messages using Conversation ID.
- **Rename Conversation:** Update conversation titles.
- **Delete Conversation:** Delete conversations along with their associated chat history.
- **Conversation Sorting:** Display recently updated conversations first.
- **Input Validation:** Validate incoming API requests using Jakarta Validation.
- **Global Exception Handling:** Handle validation errors centrally.

## 🛠️ Technology Stack

| Technology | Purpose |
|---|---|
| Java 17 | Programming Language |
| Spring Boot 4.1.2 | Backend Framework |
| Spring AI 2.0.2 | AI Integration |
| Google Gemini API | Large Language Model |
| MySQL 8.0 | Database |
| Spring Data JPA | ORM / Database Operations |
| Spring AI JDBC Chat Memory | Persistent Chat Memory |
| Spring WebMVC | REST API Development |
| Jakarta Validation | Request Validation |
| Apache Maven | Build and Dependency Management |

## 🧰 Development Tools

| Tool | Purpose |
|---|---|
| Spring Tool Suite (STS 4) | IDE for Java and Spring Boot Development |
| Spring Initializr | Spring Boot Project Initialization |
| Postman | REST API Testing |
| MySQL Command Line / MySQL Workbench | Database Management |
| Git | Version Control |
| GitHub | Source Code Hosting |


## ⚙️ Setup & Installation

### Prerequisites

- Java 17
- Spring Tool Suite (STS 4)
- Maven
- MySQL 8.0
- Google Gemini API Key
- Postman


## 🗄️ Database Design

The application uses two persistence mechanisms:

1. **conversations:** Stores conversation metadata such as ID, title, creation time and update time.
2. **SPRING_AI_CHAT_MEMORY:** Stores user and assistant messages for persistent chat history.

Spring AI JDBC Chat Memory manages message persistence.

## 🔮 Future Enhancements

- Angular-based chatbot frontend.
- User authentication and authorization.
- Streaming AI responses.
- Automatic conversation title generation.
- Docker containerization.
- AWS cloud deployment.

## 👨‍💻 Author

**Rishabh Shrivastava**

Java Full Stack Developer |
