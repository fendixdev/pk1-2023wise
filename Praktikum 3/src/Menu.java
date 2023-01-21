import javax.swing.*;

public class Menu {
    public static void main(String[] args) {

        Medienverwaltung mv = new Medienverwaltung();

        //init
        mv.aufnehmen(new Audio("The Beatles", "Yesterday", 1965, 180));
        mv.aufnehmen(new Bild("Mona Lisa", "Paris", 1503));
        mv.aufnehmen(new Audio("Drake", "Loco", 2022, 312));
        //
        boolean beendet = false;

        while (!beendet) {
            System.out.println("------------------------");
            System.out.println("Medienverwaltung");
            System.out.println("------------------------");
            System.out.print("1. Audio aufnehmen\n2. Bild aufnehmen\n3. Zeige alle Medien\n4. Zeige neustes Medium\n5. Berechne durchschnittliches Erscheinungsjahr\n6. Beenden\n");

            String menuAuswahl = JOptionPane.showInputDialog(null, "Bitte wählen Sie einen Menüpunkt aus.");

            try {
                switch (Integer.parseInt(menuAuswahl)) {
                    case 1 -> {
                        String titel = JOptionPane.showInputDialog(null, "Bitte geben Sie einen Titel ein");
                        String interpret = JOptionPane.showInputDialog(null, "Bitte geben Sie den Interpreten ein");
                        int jahr = Integer.parseInt(JOptionPane.showInputDialog(null, "Bitte geben Sie das Erscheinungsjahr ein"));
                        int dauer = Integer.parseInt(JOptionPane.showInputDialog(null, "Bitte geben Sie die Dauer ein"));
                        mv.aufnehmen(interpret, titel, jahr, dauer);
                    }
                    case 2 -> {
                        String titel = JOptionPane.showInputDialog(null, "Bitte geben Sie einen Titel ein");
                        int jahr = Integer.parseInt(JOptionPane.showInputDialog(null, "Bitte geben Sie das Erscheinungsjahr ein"));
                        String ort = JOptionPane.showInputDialog(null, "Bitte geben Sie einen Ort ein");
                        mv.aufnehmen(titel, ort, jahr);

                    }
                    case 3 -> mv.zeigeMedien();
                    case 4 -> mv.sucheNeuesMedium();
                    case 5 -> mv.berechneErscheinungsjahr();
                    case 6 -> beendet = true;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Bitte korrigieren Sie Ihre Eingabe!");
            }
        }
    }

}

//New Java switch expression with lambda introduced in version 14.