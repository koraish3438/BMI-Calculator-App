# ⚖️ Project 2: BMI Calculator App

## Objective
Create a **BMI Calculator App** using **CardView** to display results with BMI value and category.

---

## Features & Flow

### 1. Splash Screen
- Displays **app title** and **developer name** for 2 seconds.  
- Automatically opens **Main Screen (BMI Activity)** after the delay.

### 2. Main Screen (`BMIActivity`)
- Uses `TextInputLayout` + `TextInputEditText` for user inputs:  
  - **Height (cm)**  
  - **Weight (kg)**  

- **Calculate BMI Button:**  
  - On click, calculates BMI using the formula:  
    ```
    heightInMeters = height / 100
    BMI = weight / (heightInMeters * heightInMeters)
    ```

- **CardView** to display results:  
  - **BMI Value:** e.g., "Your BMI: 22.5"  
  - **Category:** e.g., "Normal Weight"  
  - Developer name/ID

---

## Validation Rules
- Inputs **cannot be empty** or zero.  
- Non-numeric inputs → show **Toast:** `"Invalid input!"`  

---

## BMI Categories
- **< 18.5** → Underweight  
- **18.5 – 24.9** → Normal Weight  
- **25 – 29.9** → Overweight  
- **≥ 30** → Obese  

---

## Example Output


---

## Tech Stack
- **Language:** Kotlin  
- **Platform:** Android Studio  
- **UI Components:** ConstraintLayout, TextInputLayout, TextInputEditText, Button, CardView, TextViews  
- **Navigation:** Intents (if needed)

---

## Screenshots
  

---

## Author
**MD Kajam-all Koraish**
