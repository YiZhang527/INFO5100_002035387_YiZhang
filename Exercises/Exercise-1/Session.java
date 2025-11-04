import java.util.Arrays;

public class Session {
    private Student[] students;

    public Session() {
        students = new Student[20];
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void calculateAverageQuizScores() {
        for (int i = 0; i < 20; i++) {
            double[]scores = students[i].getQuizScores();
            double sum = 0;
            for (int j = 0; j < 15; j++) {
                sum += scores[j];
            }
            double average = sum / 15;
            System.out.println(students[i].getName() + "'s average score is: " + average);
        }
    }

    public void printQuizScoresAscending() {
        double[] allScores = new double[20 * 15];
        int index = 0;

        for (int i =0; i < 20; i++) {
            double[] scores = students[i].getQuizScores();
            for (int j = 0; j < 15; j++) {
                allScores[index] = scores[j];
                index++;
            }
        }

        Arrays.sort(allScores);

        System.out.print("All the scores are (by ascending order): ");
        for (int i = 0; i < 300; i++) {
            System.out.print(allScores[i] + " ");
        }
        System.out.println();
    }

    public void printPartTimeStudentNames() {
        System.out.println("Part-time Student names: ");
        for (int i = 0; i < 20; i++) {
            if (students[i] instanceof PartTimeStudent) {
                System.out.print(students[i].getName() + " ");
            }
        }
        System.out.println();
    }

    public void printFullTimeStudentExamScores() {
        System.out.println("Full time Student exam scores: ");
        for (int i = 0; i < 20; i++) {
            if (students[i] instanceof FullTimeStudent) {
                FullTimeStudent ft = (FullTimeStudent) students[i];
                System.out.println(students[i].getName() +
                        ": Exam 1 = " + ft.getExam1Score() +
                        ", Exam 2 = " + ft.getExam2Score());
            }
        }
    }

}
