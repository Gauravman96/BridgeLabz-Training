import java.util.*;
class InvalidQuizSubmissionException extends Exception {
    public InvalidQuizSubmissionException(String message) {
        super(message);
    }
}

class QuizProcessor {

    // Compare answers & calculate score
    static int calculateScore(String[] correct, String[] user)
            throws InvalidQuizSubmissionException {

        if (correct.length != user.length) {
            throw new InvalidQuizSubmissionException("Answer count mismatch!");
        }

        int score = 0;
        for (int i = 0; i < correct.length; i++) {
            if (correct[i].equalsIgnoreCase(user[i])) {
                score++;
            }
        }
        return score;
    }

    // Assign grade
    static char assignGrade(int score, int total) {
        double percentage = (double) score / total * 100;

        if (percentage >= 80) return 'A';
        else if (percentage >= 60) return 'B';
        else if (percentage >= 40) return 'C';
        else return 'F';
    }
}

public class OnlineQuizPlatform {
    public static void main(String[] args) {

        String[] correctAnswers = {"A", "C", "B", "D"};
        List<Integer> scores = new ArrayList<>();

        try {
            String[] user1 = {"A", "C", "B", "D"};
            String[] user2 = {"A", "B", "B", "C"};

            int score1 = QuizProcessor.calculateScore(correctAnswers, user1);
            int score2 = QuizProcessor.calculateScore(correctAnswers, user2);

            scores.add(score1);
            scores.add(score2);

            System.out.println("User1 Score: " + score1 +
                    " Grade: " + QuizProcessor.assignGrade(score1, correctAnswers.length));

            System.out.println("User2 Score: " + score2 +
                    " Grade: " + QuizProcessor.assignGrade(score2, correctAnswers.length));

        } catch (InvalidQuizSubmissionException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("All Scores: " + scores);
    }
}
