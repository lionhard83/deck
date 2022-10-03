public class ReaderPathMain {
    public static void main(String[] args) {
        String[] paths = { "path1.csv", "path2.csv", "path3.csv" };
        ReaderPath r = new ReaderPath(paths);
        r.readFile();
        System.out.println(r.getPeople().size());
    }
}
