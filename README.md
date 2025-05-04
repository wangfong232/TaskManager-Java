# 🗂️ Task Management Program (Java - MVC)

This is a simple Java console application for managing tasks using the MVC (Model - View - Controller) design pattern.
## 🏦 Background

This module is inspired by a simplified version of a task management component from the eBank system of Tiên Phong Bank (TPBank). 

The code has been recreated for **educational purposes only**, based on a feature used in internal task tracking.

It does **not** include any proprietary logic, database, or UI from the original system.
---

## 📌 Features

- ✅ Add a new task (requirement name, date, assignee, reviewer, etc.)
- ✅ Delete a task by ID
- ✅ Display all current tasks in table format
- 🚫 Data not persisted (no database or file I/O)

---

## 📁 Project Structure

<pre> <code> 
  src/
├── controller/
│   └── TaskController.java
├── bo/
│   └── TaskBO.java
├── model/
│   ├── Task.java
│   └── TaskType.java
├── utils/
│   └── Validation.java
└── view/
    └── MainView.java
</code> </pre>

---

## 📷 Demo
![image](https://github.com/user-attachments/assets/51635ade-2462-406c-a282-9cc6eb4e6431)

![image](https://github.com/user-attachments/assets/959a0133-453d-4f59-ae1c-b0dd52067fe5)


---

## ✅ Sample Test Cases

| Task Type | Name         | Date        | Time  | Assignee | Reviewer |
|-----------|--------------|-------------|-------|----------|----------|
| 1 (Code)  | Dev Program  | 12-12-2012  | 4.0   | Dev      | Load     |
| 3 (Design)| UI Sketching | 10-10-2023  | 2.0   | Anna     | Linh     |

---

## 🧠 Skills Demonstrated

- Java fundamentals (OOP, class design)
- Console-based input/output
- Data validation & error handling
- MVC architecture in small-scale applications

---

## 🚀 How to Run

- Open project in NetBeans / IntelliJ / VS Code
- Compile and run `MainView.java`
- Follow the menu prompts in the terminal

---

## 📄 License

This project is licensed for learning and educational purposes.



