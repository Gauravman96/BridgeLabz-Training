import java.util.*;

class ObjectiveEvaluation implements EvaluationStrategy {

    @Override
    public int evaluate(Map<Question, String> answers) {
        int score = 0;

        for (Map.Entry<Question, String> entry : answers.entrySet()) {
            if (entry.getKey().correctAnswer.equalsIgnoreCase(entry.getValue())) {
                score += 1;
            }
        }
        return score;
    }
}
