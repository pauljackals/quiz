import java.io.File;

public class Categories {

    private String[] files;

    public Categories(String filesPath){

        files = new File(filesPath).list();

        for (int i = 0; i < files.length; i++) {

            files[i] = filesPath + files[i];
        }
    }

    public void print(){

        for (int i = 0; i < files.length; i++) {

            System.out.println(i+". "+getName(files[i]));
        }
    }

    private String getName(String file){

        file = file.substring(file.lastIndexOf("/")+1);
        file = file.substring(0, file.lastIndexOf("."));
        file = file.replaceAll("_+", " ");

        return file;
    }
}
