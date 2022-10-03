import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.xml.transform.Source;

public class Main {
    public static void main(String[] args) {

        // BlackJack b = new BlackJack();
        // b.start();
        // Scanner s = new Scanner(System.in);
        // System.out.println(b);
        // System.out.println("Chiami (1) o Stai (0)");
        // int call = s.nextInt();
        // while (call == 1) {
        // b.call();
        // System.out.println(b);
        // if (b.current.isStone() ||
        // b.current.getScore().get(b.current.getScore().size() - 1) == 21) {
        // break;
        // }
        // System.out.println("Chiami (1) o Stai (0)");
        // call = s.nextInt();
        // }
        // System.out.println(b);
        // b.playDealer();
        // System.out.println(b);
        // System.out.println("The winner is :" + b.getWinner());

        // UtilSave.setPath("paths.csv");
        // UtilSave.readFile();
        // System.out.println(UtilSave.getPeople().size());
        // Scanner s = new Scanner(System.in);
        // Person p = new Person(s.nextLine(), s.nextLine(), s.nextLine());
        // UtilSave.savePerson(p);
        // System.out.println(UtilSave.getPeople().size());
        // s.close();

        try {
            // File f = new File("pippo");
            // Scanner scanner = new Scanner(f);

            Scanner s = new Scanner(System.in);
            int x = s.nextInt();
            int y = s.nextInt();
            if (y < 0) {
                throw new NegativeNumberException("Y è minore di 0");
            }
            double z = x / y;
            s.close();
            System.out.println(z);
        } catch (ArithmeticException e) {
            System.out.println("e1" + e);

            // catch (FileNotFoundException e) { // Exception e = new Exception();
            // System.out.println("e2" + e);
            // }
        } catch (NegativeNumberException e) {
            System.out.println("negative number exception:" + e);

        } catch (Exception e) {
            System.out.println("e3:" + e);
        } finally {
            System.out.println("Verrà sempre eseguito");
        }
        System.out.println("Sto per chiudere il codice");

    }
}
