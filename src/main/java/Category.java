public class Category {


    private String path;


    public Category (String path) {

        this.path = path;
    }


    public String getPath() {

        return path;
    }


    public String getName() {

        String pathTemp = path;

        pathTemp = pathTemp.substring(pathTemp.lastIndexOf("/")+1);
        pathTemp = pathTemp.substring(0, pathTemp.lastIndexOf("."));
        pathTemp = pathTemp.replaceAll("_+", " ");

        return pathTemp;
    }
}
