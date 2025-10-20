# BMI Calculator App

A simple and intuitive Android app that calculates **Body Mass Index (BMI)** and displays health categories using a modern CardView design.

---

## Table of Contents
- [Project Objective](#project-objective)
- [Features & Flow](#features--flow)
- [Validation Rules](#validation-rules)
- [BMI Categories](#bmi-categories)
- [Tech Stack](#tech-stack)
- [Screenshots](#screenshots)
- [Usage](#usage)
- [Author](#author)
- [License](#license)
- [Contact](#contact)

---

## Project Objective
Create a BMI Calculator App using **CardView** to display results with BMI value and category.

---

## Features & Flow

### 1. Splash Screen
- Displays app title and developer name for 2 seconds.
- Automatically opens Main Screen (`BMIActivity`) after the delay.

### 2. Main Screen (`BMIActivity`)
- Uses `TextInputLayout` + `TextInputEditText` for inputs:
  - Height (cm)
  - Weight (kg)
- **Calculate BMI Button**
  - Calculates BMI using:  
    ```kotlin
    heightInMeters = height / 100
    BMI = weight / (heightInMeters * heightInMeters)
    ```
- **CardView** to display results:
  - BMI Value: e.g., "Your BMI: 22.5"
  - Category: e.g., "Normal Weight"
  - Developer name/ID

---

## Validation Rules
- Inputs cannot be empty or zero.
- Non-numeric inputs → show Toast: `"Invalid input!"`

---

## BMI Categories
- `< 18.5` → Underweight
- `18.5 – 24.9` → Normal Weight
- `25 – 29.9` → Overweight
- `≥ 30` → Obese

---

## Tech Stack
- **Language:** Kotlin  
- **Platform:** Android Studio  
- **UI Components:** ConstraintLayout, TextInputLayout, Button, CardView, TextViews  
- **Navigation:** Intent (Splash → BMIActivity)

---

## Screenshots

<table>
  <tr>
    <td><img src="https://github.com/koraish3438/BMI-Calculator-App/raw/master/Screenshot_2025-10-20-10-41-40-23_6c27edca5aea85800a905136657d75fd.jpg" width="200"></td>
    <td><img src="https://github.com/koraish3438/BMI-Calculator-App/raw/master/Screenshot_2025-10-20-10-42-06-23_6c27edca5aea85800a905136657d75fd.jpg" width="200"></td>
  </tr>
  <tr>
    <td><img src="https://github.com/koraish3438/BMI-Calculator-App/raw/master/Screenshot_2025-10-20-10-42-54-97_6c27edca5aea85800a905136657d75fd.jpg" width="200"></td>
    <td><img src="https://github.com/koraish3438/BMI-Calculator-App/raw/master/Screenshot_2025-10-20-10-41-56-40_6c27edca5aea85800a905136657d75fd.jpg" width="200"></td>
  </tr>
</table>

---

## Usage
1. Launch the app.  
2. Input height and weight.  
3. Tap **Calculate BMI**.  
4. View the BMI value and health category.

---

## Author
**MD Kajam-all Koraish**

---

## License
This project is licensed under the **MIT License**. See [LICENSE](LICENSE) for details.

---

## Contact
**Developer:** MD Kajam-all Koraish  
**GitHub:** [https://github.com/koraish3438](https://github.com/koraish3438)  

Feel free to reach out with questions or suggestions.
