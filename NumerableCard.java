public class NumerableCard extends Card {

    private int value;

    NumerableCard(String seem, int value) {
        super(seem);
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value + " " + super.toString();
    }

}
