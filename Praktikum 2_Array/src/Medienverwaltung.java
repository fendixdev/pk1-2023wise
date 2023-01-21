public class Medienverwaltung {

    final private int listeSize = 5;
    private int counter = 0;
    final private Medium[] liste = new Medium[listeSize];

    public void aufnehmen(Medium m) {
        if (counter < listeSize) {
            liste[counter] = m;
            counter++;
        } else {
            System.out.println("Die Liste ist voll.");
        }
    }

    public void zeigeMedien() {
        for (int i = 0; i < counter; i++) {
            liste[i].druckeDaten();
        }
    }

    public Medium sucheNeuesMedium() {
        Medium temp = null;
        if (counter != 0) {
            temp = liste[0];
            for (int i = 0; i < counter; i++) {
                if (temp.getJahr() < liste[i].getJahr()) {
                    temp = liste[i];
                }
            }
            System.out.printf("Das neuste Medium ist %s aus dem Jahr %d.\n", temp.getTitel(), temp.getJahr());
            return temp;
        } else {
            System.out.println("Liste leer.");
        }
        return temp;
    }

    public double berechneErscheinungsjahr() {
        double result = 0.0;
        if (counter != 0) {
            for (int i = 0; i < counter; i++) {
                result += liste[i].getJahr();
            }
            return result / counter;
        }
        return result;
    }
}
