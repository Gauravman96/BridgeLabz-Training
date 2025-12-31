class Person{
    String name;
    int age;

    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    void display() {
        System.out.println(name + " - " + age);
    }
}
public class PersonMain {
    public static void main(String[] args) {
        Person p = new Person("gaurav",22);
        p.display();
    }
}
