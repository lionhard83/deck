public final class Util {

    // public double value = 0.4;

    public static String path = "/path/example/pippo";
    public static final double sValue = 0.5;
    // finale -> costante -> non modificabile.

    public static boolean randomBoolean() {
        // il concetto di this non esiste (il this è l'istanza)
        return Math.random() > Util.sValue;
    }

    private Util() {

    }

    // public Util() {
    // System.out.println("Ciao sono un costruttore");
    // }

    // public void doSomething() {
    // System.out.println(Util.path);
    // }

    // public Util(double value) {
    // System.out.println("Ciao sono un costruttore");
    // this.value = value;
    // }

}
