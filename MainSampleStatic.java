import java.awt.Color;
import java.io.File;
import java.util.Scanner;

public class MainSampleStatic {
    public static void main(String[] args) {

        try {
            File f = new File("Pippo");
            Scanner scanner = new Scanner(f);

            Sample s1 = new Sample();
            // s1.doSomething1();
            // s1.doSomething2();
            // s1.doSomething3();
            // s1.doSomething4();

        } catch (Exception e) {

        }

    }
}
