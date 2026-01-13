public class OnlineExamSystem {

    public static void main(String[] args) {

        try {
            // Create Exam
            Exam exam = new Exam(1, "Java Test", 30);
            exam.addQuestion(new Question(1, "What is JVM?", "virtual machine"));
            exam.addQuestion(new Question(2, "What is OOP?", "object oriented"));

            // Enroll Student
            Student student = new Student(101, "Gaurav");

            // Submit Answers
            long startTime = System.currentTimeMillis();
            student.submitAnswer(exam.questions.get(0), "Virtual Machine");
            student.submitAnswer(exam.questions.get(1), "Object Oriented");

            long endTime = System.currentTimeMillis();

            if ((endTime - startTime) > exam.duration * 60 * 1000) {
                throw new ExamTimeExpiredException("Exam Time Over!");
            }

            // Evaluation 
            EvaluationStrategy evaluation = new ObjectiveEvaluation();
            int result = evaluation.evaluate(student.answers);

            // Result
            System.out.println("Student: " + student.name);
            System.out.println("Score: " + result);

        } catch (ExamTimeExpiredException e) {
            System.out.println(e.getMessage());
        }
    }
}
