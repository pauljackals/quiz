import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        String categoriesPath = "src/main/resources/";
        Quiz quiz = new Quiz(categoriesPath);
        Scanner userInput = new Scanner(System.in);

        quiz.printCategories();

        int categoryNumber;
        while(true) {

            try {

                System.out.print("\nPick category: ");
                categoryNumber = Integer.parseInt(userInput.nextLine());

                if( (categoryNumber>=0) && (categoryNumber<quiz.getCategoriesAmount()) ) {

                    break;
                }

                System.out.println("Invalid number!");

            } catch (Exception e) {
                System.out.println("Invalid character!");
            }
        }


    }
}
