package student_score;

public class Subject {
    private String subName;
    private int score;

    public Subject(String subName, int score) {
        this.subName = subName;
        this.score = score;
    }

    public String getSubName() {
        return subName;
    }
    public int getScore() {
        return score;
    }
}
