public class FullTimeStudent extends Student {
    private double exam1Score;
    private double exam2Score;

    public FullTimeStudent(String name) {
        super(name);
    }

    public double getExam1Score() {
        return exam1Score;
    }

    public void setExam1Score(double score) {
        this.exam1Score = score;
    }

    public double getExam2Score() {
        return exam2Score;
    }

    public void setExam2Score(double score) {
        this.exam2Score = score;
    }
}
