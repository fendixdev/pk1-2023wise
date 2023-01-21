import java.util.Iterator;
import java.util.LinkedList;

public class Medienverwaltung {

    LinkedList<Medium> liste = new LinkedList<>();

    public void aufnehmen(Medium m) {
        liste.add(m);
    }

    public void zeigeMedien() { //Mit Iterator
        Iterator<Medium> it = liste.iterator();
        while (it.hasNext()) {
            it.next().druckeDaten();
        }
    }

    public void sucheNeuesMedium() { //Erweiterte For-Loop
        if (!liste.isEmpty()) {
            Medium temp = liste.getFirst();
            for (Medium m : liste) {
                if (temp.getJahr() < m.getJahr()) temp = m;
            }
            System.out.printf("Das neuste Medium ist %s aus dem Jahr %d.\n", temp.getTitel(), temp.getJahr());
        }
    }

    public double berechneErscheinungsjahr() { //Erweiterte For-Loop
        double result = 0.0;
        for (Medium m : liste) {
            result += m.getJahr();
        }
        return result / liste.size();
    }
}
