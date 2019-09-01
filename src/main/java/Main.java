public class Main {

    public static void main(String[] args) {

        String filesPath = "src/main/resources/";

        Categories categories = new Categories(filesPath);

        categories.print();
    }
}
