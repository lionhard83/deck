public class Sample {

    public static void main(String[] args) {
        System.out.println(UtilSave.getPeople());
        UtilSave.getPaths().add("path1.csv");
        UtilSave.getPaths().add("path2.csv");
        UtilSave.getPaths().add("path3.csv");
        UtilSave.readFile();
        System.out.println(UtilSave.getPeople());
    }

}
