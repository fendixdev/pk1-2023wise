import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Medienverwaltung {

    LinkedList<Medium> liste = new LinkedList<>();

    public void aufnehmen(Medium m) {
        liste.add(m);
        Collections.sort(liste);
    }

    public void aufnehmen(String interpret, String titel, int jahr, int dauer){
        liste.add(new Audio(interpret, titel, jahr, dauer));
        Collections.sort(liste);
    }

    public void aufnehmen(String titel, String ort, int jahr){
        liste.add(new Bild(titel, ort, jahr));
        Collections.sort(liste);
    }

    public void zeigeMedien() { //Mit Iterator
        Iterator<Medium> it = liste.iterator();
        while (it.hasNext()) {
            it.next().druckeDaten();
        }
    }

    public void sucheNeuesMedium() { //Erweiterte For-Loop
        if (!liste.isEmpty()) {
            Collections.sort(liste);
            System.out.printf("Das neuste Medium ist %s aus dem Jahr %d.\n", liste.getLast().getTitel(), liste.getLast().getJahr());
        }
    }

    public double berechneErscheinungsjahr() { //Erweiterte For-Loop
        double result = 0.0;
        for (Medium m : liste) {
            result += m.getJahr();
        }
        result /= liste.size();
        System.out.printf("Das durchschnittliche Erscheinungsjahr beträgt %.0f\n", result);
        return result;
    }
}
