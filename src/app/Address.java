package app;

public class Address {
    String city;
    String zipCode;
    public Address(String city, String zipCode) {
        this.city = city;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return city + ", " + zipCode;
    }
}
