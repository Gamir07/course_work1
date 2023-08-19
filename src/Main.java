public class Main {
    Employee[] employees = new Employee[10];

    public static void showAllEmployees(Employee[] employees) {
        for (Employee emp : employees) {
            System.out.println(emp);
        }
        System.out.println();
    }

    public static double totalSalaryPerMonth(Employee[] employees) {
        double totalSalary = 0.0;
        for(Employee emp: employees){
            totalSalary += emp.getSalary();

        }
        return totalSalary;
    }

    public static void minSalary(Employee[] employees) {
        double minSalary = employees[0].getSalary();
        Employee emp = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (minSalary > employees[i].getSalary()) {
                minSalary = employees[i].getSalary();
                emp = employees[i];
            }
        }
        System.out.println("Employee with a min salary is " + emp.getName() + " " + emp.getSurName() + " " + emp.getMiddleName());
        System.out.println();
    }

    public static void maxSalary(Employee[] employees) {
        double maxSalary = employees[0].getSalary();
        Employee emp = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (maxSalary < employees[i].getSalary()) {
                maxSalary = employees[i].getSalary();
                emp = employees[i];
            }
        }
        System.out.println("Employee with a max salary is " + emp.getName() + " " + emp.getSurName() + " " + emp.getMiddleName());
        System.out.println();
    }

    public static void averageSalary(Employee[] employees) {
        double averageSalary = totalSalaryPerMonth(employees) / employees.length;
        System.out.println("Average salary for all employees is " + averageSalary);
        System.out.println();
    }

    public static void employeesName(Employee[] employees) {
        for (Employee emp : employees) {
            System.out.println(emp.getName() + " " + emp.getSurName() + " " + emp.getMiddleName());
        }
        System.out.println();
    }
    public static void main(String[] args) {

    }
}