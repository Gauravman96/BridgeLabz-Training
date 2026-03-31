import java.util.*;
class Proctor {

    Stack<Integer> navigationStack =new Stack<>();
    HashMap<Integer, String> answersMap = new HashMap<>();

    HashMap<Integer, String> correctAnswers = new HashMap<>();

    
    Proctor() {
        correctAnswers.put(1, "A");
        correctAnswers.put(2, "C");
        correctAnswers.put(3, "B");
        correctAnswers.put(4, "D");
    }
    
    //Track navigation with stack.
    public void visitQuestion(int questionID) {
        navigationStack.push(questionID);
        System.out.println("Visited question is- " +questionID);
    }

    public void submitAnswer(int questionID, String answer) {
        answersMap.put(questionID, answer);
        System.out.println("Answer submitted for Q" + questionID + "- " + answer);
    }
    

    public int calculateScore() {
        int score = 0;
        for (Map.Entry<Integer, String> entry :answersMap.entrySet()) {
            int qID = entry.getKey();
            String givenAnswer = entry.getValue();
            String correctAnswer = correctAnswers.get(qID);

            if (givenAnswer.equals(correctAnswer)) {
                score++;
            }
        }
        return score;
    }
}


