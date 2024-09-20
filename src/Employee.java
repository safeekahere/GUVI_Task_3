public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    // Constructor
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Getter for ID
    public int getID() {
        return id;
    }

    // Getter for first name
    public String getFirstName() {
        return firstName;
    }

    // Getter for last name
    public String getLastName() {
        return lastName;
    }

    // Method to get full name
    public String getName() {
        return firstName +" "+lastName;
    }

    // Getter for salary
    public int getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Method to get annual salary
    public int getAnnualSalary() {
        return salary * 12;
    }

    // Method to raise salary by a percentage
    public int raiseSalary(int percent) {
        salary += salary * percent / 100;
        return salary;
    }

    // toString method for representation
    @Override
    public String toString() {
        return "Employee[id=" + id + ", name=" + getName() + ", salary=" + salary + "]";
    }

   
    public static void main(String[] args) {
        Employee emp = new Employee(1, "Hameeda", "Safeeka", 10000);
        System.out.println(emp);
        System.out.println("Annual Salary: " + emp.getAnnualSalary());
        emp.raiseSalary(10);//Salary raise by 10 percent
        System.out.println("After raise in Salary ---- " + emp);
        Employee emp1 = new Employee(2, "Deepika" , "Sinha" , 15000);
        System.out.println(emp1);
        System.out.println("Annual salary: " + emp1.getAnnualSalary());
        emp1.raiseSalary(5);
        System.out.println("After the raise in Salary ----"+ emp1);
    }
}
