public class Employee {
    private final String name;
    private final String surName;
    private final String middleName;
    private int department;
    private double salary;
    private static int counter;
    private int id;

    public Employee(String name, String surName, String middleName, int department, double salary) {
        this.name = name;
        this.surName = surName;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
        id = ++counter;
    }
    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}
