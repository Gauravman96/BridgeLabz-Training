import java.util.*;

class DescriptiveEvaluation implements EvaluationStrategy {

    @Override
    public int evaluate(Map<Question, String> answers) {
        // Simulated manual evaluation
        return answers.size() * 2;
    }
}
