/*
 * Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, and methods to calculate and update salary.
 */

public class Employee {

    private String name;
    private String title;
    private double salary;

    public Employee(String name, double salary, String title) {
        this.name = name;
        this.salary = salary;
        this.title = title;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", title=" + title + ", salary=" + salary + "]";
    }


    public void raiseSalary(double percentage ){
        salary= salary+salary*percentage/100;

    }    
    

    public static void main(String[] args) {
        Employee emp1= new Employee("akshay", 25000, "Manager");
        Employee emp2= new Employee("kumar", 85000, "Lead");

        System.out.println("\n Employee details : ");

        System.out.println(emp1);
        System.out.println(emp2);

        //raising the salary of the employees
        System.out.println(" raising the salary of the employees: ");
        emp1.raiseSalary(8);
        emp2.raiseSalary(12);

        System.out.println("\n Employee details : ");

        System.out.println(emp1);
        System.out.println(emp2);
      
        

    }

    
}
