import java.util.Scanner;


public class Main {


    private static Scanner userInput = new Scanner(System.in);


    public static void main(String[] args) {

        String categoriesPath = "src/main/resources/";
        Quiz quiz = new Quiz(categoriesPath);

        quiz.printCategories();

        quiz.addNewCategory(getCategoryFromUser(quiz));
        System.out.println("\n"+quiz.getCategoryCurrent().getName().toUpperCase()+"\n");

        for (int i = 0; i < 10; i++) {

            quiz.getCategoryCurrent().printQuestion();
            quiz.isQuestionAnswerCorrect(getAnswerFromUser(quiz));
        }

        quiz.printPoints();
    }


    private static int getAnswerFromUser(Quiz quiz){

        int answerNumber;

        System.out.println();
        while(true) {

            try {

                System.out.print("Pick answer: ");
                answerNumber = Integer.parseInt(userInput.nextLine());

                if( (answerNumber>=0) && (answerNumber<quiz.getCategoryCurrent().getQuestionAnswersAmount()) ) {

                    break;
                }

                System.out.println("Invalid number!");

            } catch (Exception e) {

                System.out.println("Invalid character!");
            }
        }

        return answerNumber;
    }


    private static int getCategoryFromUser(Quiz quiz){

        int categoryNumber;

        System.out.println();
        while(true) {

            try {

                System.out.print("Pick category: ");
                categoryNumber = Integer.parseInt(userInput.nextLine());

                if( (categoryNumber>=0) && (categoryNumber<quiz.getCategoriesAmount()) ) {

                    break;
                }

                System.out.println("Invalid number!");

            } catch (Exception e) {

                System.out.println("Invalid character!");
            }
        }

        return categoryNumber;
    }
}
