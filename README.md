# 🚗 Vehicle Rental System

A console-based **Vehicle Rental System** implemented in **Core Java** leveraging **Object-Oriented Programming (OOP)** principles. This application enables managing vehicles (Cars, Bikes, Trucks), registering customers, renting & returning vehicles, and calculating total rental costs.

---

## 🌟 Features

- 🚘 **Vehicle Management**: Add and manage different vehicle types:
  - **Car**: Supports passenger seat capacity.
  - **Bike**: Supports engine CC specification.
  - **Truck**: Supports maximum load capacity (tons).
- 👤 **Customer Registration**: Capture customer profile including Name, Phone Number, and Driving License.
- 🔑 **Rent & Return Operations**: Interactively rent out available vehicles and mark them as returned.
- 💰 **Rent Calculation**: Automatically calculate total rental charges based on daily rates and rental duration.
- 📋 **Rental Summaries**: View complete rental transactions and vehicle availability status.
- 🧪 **Unit Tests**: Includes test cases for `Vehicle` and `Rental` logic using JUnit.

---

## 🏗️ OOP Concepts Applied

1. **Inheritance**: Base class `Vehicle` is extended by specialized child classes `Car`, `Bike`, and `Truck`.
2. **Polymorphism**: Method overriding for customized vehicle detail display and behavioral attributes.
3. **Encapsulation**: Private fields protected with public getter/setter methods.
4. **Abstraction & Modularization**: Java Module System (`module-info.java`) and clean domain separation.

---

## 📁 Project Structure

```
VehicleRentalSystem/
├── src/
│   ├── module-info.java
│   └── com/oops/vehiclerental/
│       ├── Vehicle.java           # Abstract / Base class for all vehicles
│       ├── Car.java               # Car subclass (Seats)
│       ├── Bike.java              # Bike subclass (Engine CC)
│       ├── Truck.java             # Truck subclass (Load Capacity)
│       ├── Customer.java          # Customer domain model
│       ├── Rental.java            # Rental transaction logic
│       ├── VehicleRentalApp.java  # Main interactive CLI application
│       ├── VehicleTest.java       # Unit tests for Vehicle models
│       └── RentalTest.java        # Unit tests for Rental logic
├── .gitignore                     # Git ignore rules
└── README.md                      # Project documentation
```

---

## 🛠️ Prerequisites

- **Java Development Kit (JDK)**: Version 11 or higher (JDK 17+ recommended)
- **IDE** (Optional): Eclipse, VS Code, or IntelliJ IDEA

---

## 🚀 How to Run

### Option 1: Via Terminal / Command Line

1. **Clone the repository**:
   ```bash
   git clone https://github.com/ManideepBogireddy/Vehicle_Rental_System.git
   cd Vehicle_Rental_System
   ```

2. **Compile the source files**:
   ```bash
   javac -d bin src/module-info.java src/com/oops/vehiclerental/*.java
   ```

3. **Run the Application**:
   ```bash
   java -cp bin com.oops.vehiclerental.VehicleRentalApp
   ```

---

## 📊 Application Menu Preview

```text
===== Vehicle Rental System =====
1. Add Vehicle
2. Register Customer
3. View Vehicles
4. Rent Vehicle
5. Return Vehicle
6. Calculate Rent
7. View Rental Details
8. Exit
```

---

## 👨‍💻 Author

**Manideep Bogireddy**  
- GitHub: [@ManideepBogireddy](https://github.com/ManideepBogireddy)
