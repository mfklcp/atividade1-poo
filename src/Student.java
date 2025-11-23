public class Student {
    private String name;
    private String email;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String nome) {
        name = nome;
    }

    public String getEmail() {
        return email;
    }

    Student(String nameProperty, String emailProperty) {
        name = nameProperty;
        email = emailProperty;
    }
}

void main() {
    Student bruno = new Student("Bruno", "ahsda@gmail.com");
}
