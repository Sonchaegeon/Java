package student_score;

import java.util.ArrayList;

public class Student {
    private int num;
    private String name;
    private ArrayList<Subject> subjects;

    public Student(int num, String name) {
        this.num = num;
        this.name = name;
        subjects = new ArrayList<>();
    }

    public void addSubject(String subName, int score) {
        subjects.add(new Subject(subName, score));
    }

    public void showStudentInfo() {
        int sum = 0;
        for(int i = 0; i < subjects.size(); i++ ) {
            System.out.println("학생 " + this.name + "의 " + this.subjects.get(i).getSubName() + " 과목 " +
                    "성적은 " + subjects.get(i).getScore() + "입니다.");
            sum += subjects.get(i).getScore();
        }

        System.out.println("학생 " + this.name + "의 총점은 " + sum + "입니다.");
    }
}
