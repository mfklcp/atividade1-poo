public class Main {
    Student kesia = new Student("Ellen", "kessia@gmail.com");

    public void main() {
        IO.println(kesia.getName());

        kesia.setName("Bruno");

        IO.println(kesia.getName());
    }
}
