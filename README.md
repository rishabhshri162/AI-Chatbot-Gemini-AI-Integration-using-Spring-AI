# AI Chatbot – Gemini AI Integration Using Spring Boot & Angular

An AI-powered full-stack chatbot application built using Java, Spring Boot, Spring AI, Google Gemini API, Angular, and MySQL-compatible database technology.

The application provides secure user authentication, AI-powered conversations, persistent chat memory, conversation management, and chat history.

## 🚀 Features

### 🤖 AI Chat Functionality
- Integration with Google Gemini API using Spring AI.
- Generate intelligent AI-powered responses.
- Send messages and receive responses through REST APIs.
- Persistent storage of user and assistant messages.
- Conversation-based chat memory.

### 🔐 User Authentication & Security
- User Registration and Login.
- JWT-based authentication and authorization.
- Password encryption using BCrypt.
- Spring Security integration.
- Secure access to protected APIs.
- User-specific conversation management.

### 💬 Conversation Management
- Create multiple conversations.
- Retrieve all conversations.
- Retrieve chat history using Conversation ID.
- Rename existing conversations.
- Delete conversations along with associated chat history.
- Display recently updated conversations first.
- Regenerate AI responses.

### 🌐 Angular Frontend
- Interactive chatbot user interface.
- Login and registration screens.
- Chat interface for sending and receiving messages.
- Conversation sidebar and history management.
- Angular HttpClient for REST API communication.
- HTTP Interceptor for attaching JWT tokens.
- Route Guard for protecting authenticated routes.
- RxJS for asynchronous data handling.

### ⚙️ Backend & Validation
- RESTful API development.
- Input validation using Jakarta Validation.
- Centralized Global Exception Handling.
- Database operations using Spring Data JPA.
- Persistent chat memory using Spring AI JDBC Chat Memory.

## 🛠️ Technology Stack

### Backend

| Technology | Purpose |
|---|---|
| Java 17 | Programming Language |
| Spring Boot 4.1.2 | Backend Framework |
| Spring AI 2.0.2 | AI Integration |
| Google Gemini API | Large Language Model |
| Spring Security | Authentication & Authorization |
| JWT | Token-Based Authentication |
| BCrypt | Password Hashing |
| Spring Data JPA | Database Operations |
| Hibernate | ORM Framework |
| Spring JDBC | JDBC Operations |
| Spring AI JDBC Chat Memory | Persistent Chat Memory |
| Spring WebMVC | REST API Development |
| Jakarta Validation | Request Validation |
| Apache Maven | Build and Dependency Management |

### Frontend

| Technology | Purpose |
|---|---|
| Angular 22.2.6 | Frontend Framework |
| TypeScript | Programming Language |
| HTML5 | Application Structure |
| CSS3 | Styling |
| RxJS | Reactive Programming |
| Angular HttpClient | Backend API Communication |
| HTTP Interceptor | JWT Token Attachment |
| Angular Route Guard | Route Protection |

### Database

| Technology | Purpose |
|---|---|
| MySQL | Relational Database |
| TiDB Cloud | Cloud-Hosted MySQL-Compatible Database |
| Spring Data JPA | Entity Persistence |
| Spring AI JDBC Chat Memory | Chat Message Persistence |

## 🧰 Development Tools

| Tool | Purpose |
|---|---|
| Spring Tool Suite (STS 4) | Java and Spring Boot Development |
| Spring Initializr | Spring Boot Project Initialization |
| Postman | REST API Testing |
| MySQL Workbench | Database Management |
| Git | Version Control |
| GitHub | Source Code Hosting |
| Visual Studio Code | Angular Development |
| Docker | Backend Containerization |

## 🏗️ Application Architecture

The application follows a client-server architecture.

**Frontend Flow:**

Angular Components → Angular Services → HTTP Interceptor → REST APIs

**Backend Flow:**

Spring Security → Controller → Service Layer → Repository → Database

**AI Integration Flow:**

ChatController → ChatService → Spring AI ChatClient → Google Gemini API → AI Response

JWT authentication is used to secure communication between the Angular frontend and Spring Boot backend.

## 🗄️ Database Design

The application uses relational database persistence along with Spring AI JDBC Chat Memory.

## ☁️ Deployment

The application has been deployed using cloud services.

| Component | Platform |
|---|---|
| Angular Frontend | Vercel |
| Spring Boot Backend | Render |
| Database | TiDB Cloud |
| Backend Containerization | Docker |
| Source Code Management | GitHub |

**Note:** The backend currently uses the Render Free Plan, so the first request after inactivity may take additional time because of service startup.

## ⚙️ Setup & Installation

### Prerequisites

- Java 17
- Spring Tool Suite (STS 4)
- Node.js and npm
- Angular CLI
- Apache Maven
- MySQL or compatible database
- Google Gemini API Key

## 🔮 Future Enhancements

- Streaming AI responses.
- Automatic conversation title generation.
- Advanced chat search and filtering.
- Improved error handling and retry mechanisms.
- Enhanced user experience and UI improvements.

## 📌 Project Development Status

**Current Status:** Application Development Completed Locally – GitHub Source Code Upload In Progress.

- Complete backend and frontend application developed locally.
- Authentication and authorization implemented.
- AI chatbot integration completed.
- Conversation management implemented.
- Persistent chat memory configured.
- Cloud deployment completed.
- Initial backend project structure uploaded to GitHub.
- Remaining source code files are pending upload.

## 👨‍💻 Author

**Rishabh Shrivastava**

Java Full Stack Developer

Skills: Java, Spring Boot, Spring Security, REST APIs, Hibernate, MySQL, Angular, TypeScript, and Spring AI.
