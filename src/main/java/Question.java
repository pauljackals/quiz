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


    public void print(){

        System.out.println(text);

        for (int i = 0; i < answersNumber; i++) {

            System.out.println("* "+i+". "+answers.get(i));
        }
    }


    public int getAnswersNumber(){

        return answersNumber;
    }


    public boolean isAnswerCorrect(int answerIndex){

        if( answerIndex==answerCorrectIndex ){

            System.out.println("Correct!\n");

            return true;
        }

        System.out.println("Wrong... It's <"+answerCorrectIndex+". "+ answers.get(answerCorrectIndex)+">\n");

        return false;
    }
}