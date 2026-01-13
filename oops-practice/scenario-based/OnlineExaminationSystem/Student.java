import java.util.*;

class Student {
    int studentId;
    String name;
    Map<Question, String> answers = new HashMap<>();

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public void submitAnswer(Question q, String answer) {
        answers.put(q, answer);
    }
}
