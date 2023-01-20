public class Main {
    public static void main(String[] args) {
        System.out.println("Starting...");
        Audio a1 = new Audio("The Beatles", "Yesterday", 1965, 180);
        Bild b1 = new Bild("Mona Lisa", "Paris", 1503);

        a1.druckeDaten();
        b1.druckeDaten();
    }
}