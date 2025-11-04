public class Student {
    private String name;
    private double[] quizScores;

    public Student(String name) {
        this.name = name;
        quizScores = new double[15];
    }

    public String getName(){
        return name;
    }
    public double[] getQuizScores(){
        return quizScores;
    }

    public void setQuizScore(int index, double score) {
        if (index >= 0 && index < 15) {
            this.quizScores[index] = score;
        }
    }
}
