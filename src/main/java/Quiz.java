import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class Quiz {


    private List<Category> categories;
    private Category categoryCurrent;
    private int points;


    public Quiz(String categoriesPath){

        points=0;
        categories = new ArrayList<>();
        categoryCurrent =null;
        loadCategories(categoriesPath);
    }


    private void loadCategories(String categoriesPath){

        String[] files = new File(categoriesPath).list();

        if(files!=null) {

            for (int i = 0; i < files.length; i++) {

                files[i] = categoriesPath + files[i];

                categories.add(new Category(files[i]));
            }
        }
    }


    public void printCategories(){

        for (int i = 0; i < categories.size(); i++) {

            System.out.println(i+". "+categories.get(i).getName());
        }
    }


    public int getCategoriesAmount(){

        return categories.size();
    }


    public void addNewCategory(int categoryNumber){

        categoryCurrent = categories.get(categoryNumber);
    }


    public Category getCategoryCurrent(){

        return categoryCurrent;
    }


    public boolean isQuestionAnswerCorrect(int answerIndex){

        boolean questionAnswerCorrect = categoryCurrent.isQuestionAnswerCorrect(answerIndex);

        if(questionAnswerCorrect){

            points++;
        }

        return questionAnswerCorrect;
    }

    public void printPoints() {

        System.out.println("Congratulations! You've got "+points+ " points!");
    }
}
