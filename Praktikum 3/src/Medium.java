import java.time.LocalDate;
import java.util.Objects;

public abstract class Medium implements Comparable<Medium> {

    //ID
    private static int counter;
    private int id;
    private String titel;
    private int jahr;

    public Medium(String titel, int jahr) {
        this.id = counter++;
        this.titel = titel;
        this.jahr = jahr;

    }

    public String getTitel() {
        return this.titel;
    }

    public int getJahr() {
        return this.jahr;
    }

    public int getId() {
        return this.id;
    }

    public int alter() {
        return LocalDate.now().getYear() - this.jahr;
    }

    public abstract void druckeDaten();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medium medium = (Medium) o;
        return getId() == medium.getId() && getJahr() == medium.getJahr() && Objects.equals(getTitel(), medium.getTitel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitel(), getJahr());
    }

    @Override
    public int compareTo(Medium m) {
        //Aufsteigend laut Vorgabe
        if (this.getJahr() < m.getJahr()) return -1;
        if (this.getJahr() > m.getJahr()) return 1;
        return 0;
    }
}
