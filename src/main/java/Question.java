import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Question {


    private String text;
    private int answersNumber;
    private List<String> answers;
    private int answerCorrectIndex;


    public Question(String text, int answersNumber, List<String> answers){

        String answerCorrect = answers.get(0);

        this.text = text;
        this.answersNumber = answersNumber;
        this.answers = new ArrayList<>(answersNumber);
        this.answers.addAll(answers);

        Collections.shuffle(this.answers);

        answerCorrectIndex = this.answers.indexOf(answerCorrect);
    }
}