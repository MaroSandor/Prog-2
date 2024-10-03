package Labor4.Csaszar_folder;

public class Csaszar {
    private String name;
    private int birthOfYear;

    public Csaszar(String name, int birthOfYear) {
        this.name = name;
        this.birthOfYear = birthOfYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthOfYear() {
        return birthOfYear;
    }

    public void setBirthOfYear(int birthOfYear) {
        this.birthOfYear = birthOfYear;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.birthOfYear + ')';
    }
}
