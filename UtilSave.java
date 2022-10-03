import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class UtilSave {
    private static ArrayList<String> paths = new ArrayList<>();
    private static ArrayList<Person> people = new ArrayList<>();

    private UtilSave() {
    }

    public static void readFile() {
        for (String path : paths) {
            try {
                File f = new File(path);
                Scanner scanner = new Scanner(f);
                UtilSave.people.clear();
                while (scanner.hasNextLine()) {
                    String data = scanner.nextLine();
                    String[] rows = data.split(";");
                    Person p = new Person(rows[0], rows[1], rows[2]);
                    UtilSave.people.add(p);
                }
                scanner.close();
            } catch (Exception err) {
                // System.out.println("err:" + err);
            }
            // ->
        }

    }

    // public static void savePerson(Person p) throws Exception {
    // FileWriter f = new FileWriter(UtilSave.path, true);
    // f.append(p.toCsv());
    // f.close();
    // // this.people.add(p);
    // UtilSave.readFile();
    // }

    public static ArrayList<Person> getPeople() {
        return people;
    }

    public static ArrayList<String> getPaths() {
        return paths;
    }

    // public static void setPath(String path) {
    // UtilSave.path = path;
    // }

}
