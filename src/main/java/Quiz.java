import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class Quiz {


    private List<Category> categories = new ArrayList<>();


    public Quiz(String categoriesPath){

        loadCategories(categoriesPath);
    }


    public void loadCategories(String categoriesPath){

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
}
