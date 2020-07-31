import java.util.*;

public class Checkbox extends Question {

    public Checkbox(String questionText, ArrayList<String> options, ArrayList<String> answers) {
        super(questionText, options, answers,
                "Select multiple answers by typing multiple letters in a row." +
                "\nFor example: \"ac\" to select A and C");
    }

    @Override
    public boolean isCorrect() {
        // remove any duplicates by converting answers to set
        Set<String> responses = new HashSet<>(Arrays.asList(this.getResponse().split("")));
        // check that there are enough answers
        if (responses.size() != this.getAnswers().size()) {
            return false;
        }
        // check that all answers are correct
        for (String response : responses) {
            if (!this.getAnswers().contains(response)) {
                return false;
            }
        }
        // If all tests pass, then it is correct
        return true;
    }
}
