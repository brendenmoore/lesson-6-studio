import java.util.ArrayList;
import java.util.Arrays;

public class Quiz {
    public static ArrayList<Question> questions = new ArrayList<>(Arrays.asList(
            new TrueOrFalse("Chickens are fish", false),
            new TrueOrFalse("Sheep are wooly", true),
            new MultipleChoice(
                    "What is the best food?",
                    new ArrayList(Arrays.asList("A. Cat", "B. Pizza", "C. Cheese", "D. Carrots")),
                    new ArrayList(Arrays.asList("b"))),
            new MultipleChoice(
                    "What is the best animal?",
                    new ArrayList(Arrays.asList("A. Cat", "B. Pizza", "C. Cheese", "D. Carrots")),
                    new ArrayList(Arrays.asList("a"))),
            new Checkbox(
                    "Select all numbers",
                    new ArrayList<String>(Arrays.asList("A. 1", "B. green beans", "C. Twelve", "D. Acorns", "E. 19.532")),
                    new ArrayList<String>(Arrays.asList("a", "c", "e"))
            )
    ));




    public static void runQuiz() {
        System.out.println("\n" +
                "--------------------\n" +
                "Welcome to the amazing quiz-o-matic!\n" +
                "Prepare to be amazed!\n" +
                "--------------------\n");
        int questionNumber = 0;
        int correctAnswers = 0;

        for (Question q : questions) {

            questionNumber++;
            System.out.println("Question " + questionNumber + ":");

            q.printQuestion();
            q.printOptions();
            q.getUserInput();
            if (q.isCorrect()) {correctAnswers++;}

            System.out.println();
        }
        Quiz.printResults(correctAnswers);
    }

    private static void printResults(int numberCorrect) {
        System.out.println("-----------------\n" +
                "Here are your results!\n" +
                "----------------------\n");
        System.out.println("You got " + numberCorrect + "/" + questions.size() + " questions correct. Good job.\n" );

        int n = 0;
        for (Question q : questions) {
            n++;
            if (!q.isCorrect()) {
                System.out.println(":(");
            }
            System.out.println("Question #" + n + ":" +
                    "\nYou said " + q.getResponse() + ". The correct answer was " + q.getAnswers() + ".\n");


        }
    }
}
