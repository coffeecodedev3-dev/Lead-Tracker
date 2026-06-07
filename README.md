\# Lead Tracker Application



A robust, console-based Lead Management System built using Java. This project follows a clean 3-tier architecture to ensure separation of concerns between data, business logic, and user interaction.



\## Features

\- \*\*Lead Management:\*\* Create and track leads with status transitions (New, Contacted, Won, Lost).

\- \*\*Data Integrity:\*\* Implements custom exception handling for robust input validation.

\- \*\*Analytics:\*\* Uses Java Stream API for efficient revenue tracking and reporting.

\- \*\*Modular Design:\*\* Clear separation between Model, Service, and Runner layers.



\## Tech Stack

\- \*\*Language:\*\* Java 17+

\- \*\*Build Tool:\*\* Maven

\- \*\*Testing:\*\* JUnit 5



\## Project Structure

```text

src/main/java/com/aryapanda/LeadTracker/

├── model/          # Lead data structure

├── service/        # Business logic and status management

└── runner/         # Console-based user interface

