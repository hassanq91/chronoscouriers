# Chronos Couriers - Dispatch System CLI

Chronos Couriers is a courier dispatch system built in Java. It manages real-time delivery orders, riders, and smart package assignment based on priority, deadlines, and rider capabilities.

> This is a **self-contained CLI application** 
---

## Features

- Add packages with EXPRESS or STANDARD priority
- Assign packages based on:
  - Priority
  - Delivery deadline
  - Fragile status
- Manage rider availability and capabilities
- Track package and rider status
- Complete deliveries and audit logs
- CLI interface to simulate real-time events

---

## 🛠 Requirements

- Java 17 or higher
- Maven (optional, only for dependency mgmt/tests)

---



---

## 🚀 How to Run

### Option 1: From Terminal (No Maven)
```bash
javac -d out src/com/chronos/couriers/**/*.java
java -cp out com.chronos.couriers.Main
Option 2: Using an IDE (IntelliJ, VS Code)
Open the project folder.
Mark src as source root.
Run Main.java from IDE.
💬 CLI Commands

# Add a new package
add-package <id> <EXPRESS|STANDARD> <deadlineMillis> <orderTimeMillis> <fragile>

# Add a new rider
add-rider <id> <available:true|false> <rating:0.0-5.0> <NORMAL|FRAGILE_CAPABLE>

# Update rider availability
update-rider <id> <true|false>

# Mark a package as delivered
complete <packageId>

# View package status
status-package <packageId>

# View rider status
status-rider <riderId>

# View package-rider assignment
assignment <packageId>

# View delivery history for a rider
history <riderId>

# Print help
help

# Exit the app
exit
