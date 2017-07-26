package entity;

/**
 * Created by dorianns on 15/5/4.
 */
public class Employee implements Comparable {

    private int age;
    private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int compareTo(Object o) {
        Employee inEmp = (Employee) o;
        if (this.age < inEmp.getAge()) {
            return -1;
        } else if (this.age == inEmp.getAge()) {
            return 0;
        } else {
            return 1;
        }
    }
}
