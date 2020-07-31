import com.sun.jdi.ArrayReference;

import java.util.ArrayList;
import java.util.Arrays;

public class TrueOrFalse extends Question {
    private static final ArrayList<String> TRUE_OPTIONS = new ArrayList<>(Arrays.asList("true", "t"));
    private static final ArrayList<String> FALSE_OPTIONS = new ArrayList<>(Arrays.asList("false", "f"));

    public TrueOrFalse(String questionText, boolean correctAnswer) {
        super(questionText, "Type t for true or f for false");
        ArrayList<String> options = new ArrayList<>(Arrays.asList("True", "False"));
        if (correctAnswer) {
            this.setAnswers(TRUE_OPTIONS);
        } else {
            this.setAnswers(FALSE_OPTIONS);
        }
    }
}

//    public void getUserInput() {}

//        Scanner input = new Scanner(System.in);
//        String userResponse = "";
//        while (!userResponse.equals("t") && !userResponse.equals("f")) {
//            System.out.println("Type t for true or f for false");
//            this.setResponse(input.nextLine());
//        }
//        response = userResponse.equals("t");
//        System.out.println("\nResponse recorded\n");


