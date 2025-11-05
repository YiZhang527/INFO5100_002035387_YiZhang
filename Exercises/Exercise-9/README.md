# Four-Function Calculator

This project is a simple **JavaFX GUI calculator** that performs the four basic arithmetic operations — addition, subtraction, multiplication, and division.

## Overview
The goal of this project was to create a small desktop application using **JavaFX** that allows users to:
- Input two numbers
- Choose an operation (+, -, *, /)
- Display the result

The calculator also handles division by zero with a simple error message.

---

## Steps I Followed

### 1. Set up the JavaFX Application
I started by creating a new Java class called `FourFunctionCalculator` that **extends `Application`**.  
In JavaFX, every GUI program must extend this class and override the `start(Stage primaryStage)` method.

### 2. Built the Interface
Inside the `start()` method, I created:
- Two `TextField` components for number inputs
- Four `Button` components for +, -, *, /
- One `Label` to show the result

I used `HBox` and `VBox` layouts to arrange the components neatly:
- `HBox` for placing input boxes and buttons in rows
- `VBox` for stacking everything vertically

### 3. Added Button Actions
For each button, I used **lambda expressions** to define what happens when the button is clicked.  
Each event handler:
- Reads the input from both text fields
- Converts the text to numbers using `Double.parseDouble()`
- Performs the corresponding operation
- Updates the result label

For division, I added an `if` statement to check if the second number is zero to avoid an error.

### 4. Styled and Tested
I added some spacing and padding using `Insets` to make the layout look cleaner.  
Finally, I set up the scene and displayed it with `primaryStage.show()`.

---

## What I Learned
- How to create a JavaFX application from scratch
- How to use `HBox` and `VBox` for layout management
- How to attach event handlers to buttons
- How to handle input validation (like dividing by zero)

---