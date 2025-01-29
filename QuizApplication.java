// public class QuizApplication {
    import java.util.Scanner;

class Question {
    String question;
    String[] options;
    int correctAnswer;

    public Question(String question, String[] options, int correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }
}

public class QuizApplication {
    private static Question[] questions = {
        new Question("What is the capital of France?", new String[] {"Paris", "London", "Berlin", "Rome"}, 0),
        new Question("Who painted the Mona Lisa?", new String[] {"Leonardo da Vinci", "Michelangelo", "Raphael", "Caravaggio"}, 0),
        new Question("What is the largest planet in our solar system?", new String[] {"Jupiter", "Saturn", "Uranus", "Neptune"}, 0)
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (Question question : questions) {
            System.out.println(question.question);
            for (int i = 0; i < question.options.length; i++) {
                System.out.println((i + 1) + ". " + question.options[i]);
            }

            System.out.print("Enter your answer (1-" + question.options.length + "): ");
            int answer = scanner.nextInt() - 1;

            if (answer == question.correctAnswer) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is " + (question.correctAnswer + 1) + ". " + question.options[question.correctAnswer]);
            }
        }

        System.out.println("Quiz complete! Your final score is " + score + " out of " + questions.length);
    }
}


// }
