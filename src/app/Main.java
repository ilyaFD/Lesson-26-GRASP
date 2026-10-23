package app;

public class Main {
    public static void main(String[] args) {
        Address adress = new Address("Las Vegas", "123");
        User user = new User();
        user.setAdress(adress);
        System.out.println(user.getAdress().toString());
    }
}
