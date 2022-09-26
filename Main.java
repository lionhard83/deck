public class Main {
    public static void main(String[] args) {
        // SicilianDeck sd = new SicilianDeck();
        // sd.shuffle();
        // int i = 0;
        // while (sd.hasHead()) {
        // i++;
        // System.out.println(sd.getHead());
        // }
        // System.out.println(i);

        FrenchDeck fd = new FrenchDeck(2);
        fd.shuffle();
        int i = 0;
        while (fd.hasHead()) {
            i++;
            System.out.println(fd.getHead());
        }
        System.out.println(i);

    }
}
