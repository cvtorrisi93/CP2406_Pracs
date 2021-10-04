// CP2406 Prac 3 - Christian Torrisi
//Exercise 5.6 - Addition Questionnaire

public class AdditionQuestion {

    private int a, b;

    public AdditionQuestion() { // constructor
        a = (int)(Math.random() * 50 + 1);
        b = (int)(Math.random() * 50);
    }

    public String getQuestion() {
        return "What is " + a + " + " + b + " ?";
    }

    public int getCorrectAnswer() {
        return a + b;
    }

}
