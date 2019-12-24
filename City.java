package HW27;

public class City extends Locality {
    private String city;
    private Raion [] raion;

    public City(String chief) {
        super(chief);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Raion[] getRaion() {
        return raion;
    }

    public void setRaion(Raion[] raion) {
        this.raion = raion;
    }

    public Raion getRaion(int index) {
        return raion[index];
    }
}