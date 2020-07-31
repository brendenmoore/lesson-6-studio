import java.util.ArrayList;

public class MultipleChoice extends Question {

    public MultipleChoice(String questionText, ArrayList<String> options, ArrayList<String> answers) {
        super(questionText, options, answers, "Enter the corresponding letter (a, b, c, etc.) to record your response.");
    }
}
