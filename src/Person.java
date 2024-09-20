public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

   
    public static void main(String[] args) {
        Person p1 = new Person("Safeeka", 30);
        System.out.println("The Name of the person is --- " +p1.getName());  
        System.out.println("The Age of the person is --- " +p1.getAge()); 
        Person p2 = new Person("Hamdan" , 6);
        System.out.println("The Name of the Person is == " +p2.getName());
        System.out.println("The Age of the Person is == " +p2.getAge());
    }
}