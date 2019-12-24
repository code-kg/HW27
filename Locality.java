package HW27;

public abstract class Locality {
    private String chief;

    public Locality(String chief) {
        this.chief = chief;
    }

    public String getChief() {
        return chief;
    }

    public void setChief(String chief) {
        this.chief = chief;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
