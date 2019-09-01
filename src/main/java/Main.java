import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        String categoriesPath = "src/main/resources/";

        Quiz quiz = new Quiz(categoriesPath);

        quiz.printCategories();

        Scanner userInput = new Scanner(System.in);
    }
}
