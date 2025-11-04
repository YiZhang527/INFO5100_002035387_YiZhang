import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Session session = new Session();
        Student[] students = new Student[20];

        for (int i = 0; i < 20; i++) {
            if (i < 10) {
                students[i] = new PartTimeStudent("PT_Student_" + (i + 1));
            } else {
                students[i] = new FullTimeStudent("FT_Student_" + (i - 9));
            }
        }

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 15; j++) {
                students[i].setQuizScore(j, 60 + rand.nextDouble() * 40);
            }

            if (students[i] instanceof FullTimeStudent) {
                FullTimeStudent ft = (FullTimeStudent) students[i];
                ft.setExam1Score(60 + rand.nextDouble() * 40);
                ft.setExam2Score(60 + rand.nextDouble() * 40);
            }
        }

        session.setStudents(students);

        System.out.println("===== Calculate Average Quiz Scores =====");
        session.calculateAverageQuizScores();

        System.out.println("\n===== Quiz Scores in Ascending Order =====");
        session.printQuizScoresAscending();

        System.out.println("\n===== Part-Time Student Names =====");
        session.printPartTimeStudentNames();

        System.out.println("\n===== Full-Time Student Exam Scores =====");
        session.printFullTimeStudentExamScores();
    }
}
