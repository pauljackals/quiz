import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Category {


    private String path;
    private List<Question> questions;


    public Category (String path) {

        questions = new ArrayList<>();
        this.path = path;

        try {

            loadQuestions();

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
    }


    public String getName() {

        String pathTemp = path;

        pathTemp = pathTemp.substring(pathTemp.lastIndexOf("/")+1);
        pathTemp = pathTemp.substring(0, pathTemp.lastIndexOf("."));
        pathTemp = pathTemp.replaceAll("_+", " ");

        return pathTemp;
    }


    private void loadQuestions() throws FileNotFoundException {

        Scanner inputFile = new Scanner(new File(path));

        String textTemp;
        int answersNumberTemp;
        List<String> answersTemp;

        while(inputFile.hasNextLine()){

            textTemp=inputFile.nextLine();
            answersNumberTemp = Integer.parseInt(inputFile.nextLine());
            answersTemp = new ArrayList<>(answersNumberTemp);

            for (int i = 0; i < answersNumberTemp; i++) {

                answersTemp.add(inputFile.nextLine());
            }

            questions.add(new Question(textTemp, answersNumberTemp, answersTemp));
        }

        Collections.shuffle(questions);
    }
}
