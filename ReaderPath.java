import java.io.File;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ReaderPath {
    private String[] paths = {};
    private ArrayList<Person> people = new ArrayList<>();

    public ReaderPath() {
    }

    public ReaderPath(String[] paths) {
        this.paths = paths;
    }

    public void readFile() {
        for (String path : paths) {
            try {
                File f = new File(path);
                Scanner s = new Scanner(f);
                while (s.hasNextLine()) {
                    String line = s.nextLine();
                    String[] items = line.split(";");
                    Person p = new Person(items[0], items[1], items[2]);
                    people.add(p);
                }
                s.close();
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }

    public ArrayList<Person> getPeople() {
        return people;
    }

}
