# Lead Tracker Application

A robust, console-based Lead Management System built using Java. This project follows a clean 3-tier architecture to ensure separation of concerns.

## Features
- **Lead Management:** Create and track leads with status transitions (New, Contacted, Won, Lost).
- **Data Integrity:** Implements custom exception handling for robust input validation.
- **Analytics:** Uses Java Stream API for efficient revenue tracking and reporting.

## Tech Stack
- **Language:** Java 17+
- **Build Tool:** Maven
- **Testing:** JUnit 5

## How to Run
1. **Clone the repository:**
   `git clone https://github.com/YOUR_USERNAME/LeadTracker.git`
2. **Build the project:**
   `./mvnw clean install`
3. **Run the application:**
   `./mvnw exec:java -Dexec.mainClass="com.aryapanda.LeadTracker.LeadTrackerRunner"`

## Running Tests
To verify the application logic, run:
`./mvnw test`