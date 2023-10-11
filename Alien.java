import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Alien {
    private final String NAME;
    private static Random r = new Random();

    public String getNAME() {
        return NAME;
    }

    public static Random getR() {
        return r;
    }

    public Alien(String type){
        this.NAME = type + r.nextInt(100);
    }

    @Override
    public String toString() {
        return this.NAME;
    }

    public static void main(String[] args) {

    }
}