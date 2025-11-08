# Exercise 3b - Serialization

## Assignment Requirements
- Make Exercise 2 classes serializable
- Test serialization and deserialization

## What I Did

### Step 1: Copied Exercise-2 folder to Exercise-3b

### Step 2: Modified classes for serialization
- Added `implements Serializable` to Shape.java
- Added `import java.io.Serializable;` to Shape.java
- Added `package Exercise3b;` to all Java files

### Step 3: Created TestSerialization.java
- Created 4 shape objects (Circle, Rectangle, Square, Triangle)
- Saved objects to shapes.ser file using ObjectOutputStream
- Read objects back from file using ObjectInputStream
- Printed each object's info to verify data integrity

## Results
Successfully serialized and deserialized all 4 shapes. All properties (radius, width, height) and methods (calculateArea, calculatePerimeter) work correctly after deserialization.

## What I Learned
- Serializable interface allows Java objects to be saved to files
- Only parent class needs to implement Serializable, subclasses inherit it
- Serialization is useful for data persistence and network transfer