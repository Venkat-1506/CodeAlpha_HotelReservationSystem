# Hotel Reservation System

## Overview

The Hotel Reservation System is a console-based Java application developed as part of the CodeAlpha Java Programming Internship.
This project is designed to simulate the core functionalities of a real-world hotel booking system using Object-Oriented Programming concepts in Java.

The system allows users to:

* View available hotel rooms
* Book rooms
* Cancel reservations
* Manage customer booking details
* Track room availability
* Display hotel statistics

The application is completely menu-driven and demonstrates the practical implementation of Java classes, objects, collections, constructors, methods, encapsulation, and user interaction through the console.

---

## Features

### Room Management

* Display all hotel rooms
* Display only available rooms
* Room categorization:

  * Standard Rooms
  * Deluxe Rooms
  * Suite Rooms

### Reservation Management

* Book hotel rooms
* Generate reservation details
* Cancel reservations
* Store customer information

### Payment Simulation

* Simulated payment process
* Total amount calculation based on room price and number of days

### Hotel Statistics

* Total rooms available
* Booked rooms count
* Reservation tracking

---

## Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Java Collections Framework
* ArrayList
* LocalDate API
* Scanner Class
* Console-Based User Interface

---

## OOP Concepts Implemented

This project demonstrates multiple Object-Oriented Programming concepts including:

* Encapsulation
* Classes and Objects
* Constructors
* Method Overloading
* Composition
* Data Abstraction

---

## Project Structure

```text
HotelReservationSystem/
│
├── Main.java
├── Hotel.java
├── Room.java
├── Reservation.java
└── .gitignore
```

---

## Classes Description

### Main.java

Handles the menu-driven user interface and user interaction.

### Hotel.java

Manages rooms, reservations, booking operations, and hotel statistics.

### Room.java

Stores room details such as:

* Room number
* Category
* Price
* Availability
* Facilities

### Reservation.java

Stores customer booking details including:

* Reservation ID
* Customer name
* Phone number
* Check-in/check-out dates
* Payment status

---

## How to Run the Project

### Step 1

Compile all Java files:

```bash
javac *.java
```

### Step 2

Run the application:

```bash
java Main
```

---

## Sample Functionalities

* Room Booking
* Reservation Cancellation
* Payment Processing
* Availability Tracking
* Reservation Display
* Hotel Statistics

---

## Future Enhancements

The project can be further enhanced with:

* File Handling
* Database Integration
* GUI Interface using Java Swing
* Online Payment Gateway
* Admin Login System
* Customer Authentication
* Room Search Filters

---

## Internship Information

This project was developed for the CodeAlpha Java Programming Internship.

---

## Author

Venkatasaarathy.R

---

## GitHub Repository

CodeAlpha_HotelReservationSystem
