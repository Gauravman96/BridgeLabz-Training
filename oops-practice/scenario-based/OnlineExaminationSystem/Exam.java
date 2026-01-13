import java.util.*;

class Exam {
    int examId;
    String examName;
    int duration; // minutes
    List<Question> questions = new ArrayList<>();

    public Exam(int examId, String examName, int duration) {
        this.examId = examId;
        this.examName = examName;
        this.duration = duration;
    }

    public void addQuestion(Question q) {
        questions.add(q);
    }
}
