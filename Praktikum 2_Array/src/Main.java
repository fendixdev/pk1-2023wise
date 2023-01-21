public class Main {
    public static void main(String[] args) {
        System.out.println("Starting...");
        Medienverwaltung mv = new Medienverwaltung();
        mv.aufnehmen(new Audio("The Beatles", "Yesterday", 1965, 180));
        mv.aufnehmen(new Bild("Mona Lisa", "Paris", 1503));
        mv.aufnehmen(new Audio("Drake", "Loco", 2022, 312));

        mv.zeigeMedien();
        mv.sucheNeuesMedium();
        System.out.println(mv.berechneErscheinungsjahr());
    }
}