package HW27;

public class Villages extends Locality {
    private String village;


    public Villages(String chief, String village) {
        super(chief);
        this.village = village;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    @Override
    public String getChief() {
        return super.getChief();
    }
}
