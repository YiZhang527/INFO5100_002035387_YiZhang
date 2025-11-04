# Exercise-1: Student Management System

## Program Structure

### Class Hierarchy
- **Student (Base Class)**: Has name and 15 quiz scores array
- **PartTimeStudent**: Extends Student, no additional fields
- **FullTimeStudent**: Extends Student, adds 2 exam scores (exam1Score, exam2Score)

### Session Class
- Holds array of 20 students (mix of part-time and full-time)
- Methods:
    - `calculateAverageQuizScores()`: Calculate and print average quiz score for each student
    - `printQuizScoresAscending()`: Sort and print all 300 quiz scores
    - `printPartTimeStudentNames()`: Print names of part-time students
    - `printFullTimeStudentExamScores()`: Print exam scores of full-time students

### Main Program
- Creates 20 students (10 part-time, 10 full-time)
- Assigns random scores:
    - Quiz scores: 60-100 for all students (15 quizzes each)
    - Exam scores: 60-100 for full-time students only (2 exams)
- Calls all Session methods to display results

### Key Techniques Used
- `instanceof` to identify student types
- Type casting to access FullTimeStudent-specific methods
- `Arrays.sort()` for sorting quiz scores
- Random score generation: `60 + rand.nextDouble() * 40`