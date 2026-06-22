public class Volunteer {
    int id;
    String name;
    String email;
    String city;

    public Volunteer(int id, String name, String email, String city) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.city = city;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("City: " + city);
        System.out.println("------------------");
    }
}