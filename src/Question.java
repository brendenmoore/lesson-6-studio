import com.sun.jdi.ArrayReference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public abstract class Question {
    private String questionText;
    private boolean isCorrect;
    private ArrayList<String> options;
    private ArrayList<String> answers;
    private String response = "";
    private ArrayList<String> responses;
    private String instructions;

    // Constructor

    public Question(String questionText, String instructions) {
        this.questionText = questionText;
        this.instructions = instructions;
    }

    public Question(String questionText, ArrayList<String> options, ArrayList<String> answers, String instructions) {
        this(questionText, instructions);
        this.options = options;
        this.answers = answers;

    }
    // Methods
    public void printQuestion() {
        System.out.println(questionText);
    }

    public void printOptions() {
        if (options != null) {
            for (int i = 0; i < options.size(); i++) {
                System.out.println(options.get(i));
            }
        }

    }
    public void getUserInput() {
        Scanner input = new Scanner(System.in);
        System.out.println(instructions);
        response = input.nextLine();
        System.out.println("\nResponse recorded\n");
    }

    // Getters and Setters
    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public boolean isCorrect() {
        return answers.contains(response.strip().toLowerCase());
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<String> options) {
        this.options = options;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }
}
