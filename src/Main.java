import java.util.Arrays;

public class Main {
    static Employee[] employees = new Employee[10];

    public static void showAllEmployees() {
        for (Employee emp : employees) {
            System.out.println(emp);
        }
        System.out.println();
    }

    public static double totalSalaryPerMonth() {
        double totalSalary = 0.0;
        for (Employee emp : employees) {
            totalSalary += emp.getSalary();

        }
        return totalSalary;
    }

    public static void minSalary() {
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

    public static void maxSalary() {
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

    public static void averageSalary() {
        double averageSalary = totalSalaryPerMonth() / employees.length;
        System.out.println("Average salary for all employees is " + averageSalary);
        System.out.println();
    }

    public static void employeesName() {
        for (Employee emp : employees) {
            System.out.println(emp.getName() + " " + emp.getSurName() + " " + emp.getMiddleName());
        }
        System.out.println();
    }

    public static void salaryIncrease(double percent) {
        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary() * (percent / 100) + employee.getSalary());
        }
    }

    public static void employeeWithMinSalary(int department) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Такого департамента не существует");
        }
        Employee employee = null;

        for (Employee emp : employees) {
            if (emp.getDepartment() == department && employee == null) {
                employee = emp;
            }
            //почему если убрать проверку ниже на employee != null idea подсказывает о том что при вызове метода employee.getSalary() может быть выброшено NullPointerException?
            //у меня ведь проверку выше он пропустить не может, соответственно employee будет инициализирован.
            if (emp.getDepartment() == department && employee != null && employee.getSalary() > emp.getSalary()) {
                employee = emp;
            }
        }
        if (employee == null) {
            System.out.println("В департаменте № " + department + " никто не работает");
            return;
        }
        System.out.println(employee + " from department " + department + " has a min salary");
    }

    public static void employeeWithMaxSalary(int department) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Такого департамента не существует");
        }
        Employee employee = null;

        for (Employee emp : employees) {
            if (emp.getDepartment() == department && employee == null) {
                employee = emp;
            }
            if (emp.getDepartment() == department && employee != null && employee.getSalary() < emp.getSalary()) {
                employee = emp;
            }
        }
        if (employee == null) {
            System.out.println("В департаменте № " + department + " никто не работает");
            return;
        }
        System.out.println(employee + " from department " + department + " has a max salary");
    }

    public static void totalSalaryForDepartment(int department) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Такого департамента не существует");
        }
        double totalSalary = 0;
        for (Employee emp : employees) {
            if (emp.getDepartment() == department) {
                totalSalary += emp.getSalary();
            }
        }
        System.out.println("Сумма затрат по отделу №" + department + " равна " + totalSalary);
    }

    public static void averageSalaryForDepartment(int department) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Такого департамента не существует");
        }
        double totalSalary = 0.0;
        int personsInDepartment = 0;

        for (Employee emp : employees) {
            if (emp.getDepartment() == department) {
                personsInDepartment++;
                totalSalary += emp.getSalary();
            }
        }
        double averageSalary = totalSalary / personsInDepartment;
        System.out.println("Средняя зарплата по отделу №" + department + " равна " + averageSalary);
    }

    public static void salaryIncreaseForDepartment(int department, double percent) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Такого департамента не существует");
        }
        for (Employee emp : employees) {
            if (emp.getDepartment() == department) {
                emp.setSalary(emp.getSalary() * (percent / 100) + emp.getSalary());
            }
        }
    }

    public static void printAllEmployeesForDepartment(int department) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Такого департамента не существует");
        }
        for (Employee emp : employees) {
            if (emp.getDepartment() == department) {
                System.out.println("First name is " + emp.getName() + ", surname is " + emp.getSurName() + ", middle name is " + emp.getMiddleName() + ", salary = " + emp.getSalary() + ", id = " + emp.getId());
            }
        }
    }

    public static void employeesWithLessSalary(int sum) {
        for (Employee emp : employees) {
            if (emp.getSalary() < sum) {
                System.out.println("id = " + emp.getId() + " first name is " + emp.getName() + ", surname is " + emp.getSurName() + ", middle name is " + emp.getMiddleName() + ", salary = " + emp.getSalary());
            }
        }
    }

    public static void employeesWithMoreSalary(int sum) {
        for (Employee emp : employees) {
            if (emp.getSalary() >= sum) {
                System.out.println("id = " + emp.getId() + " first name is " + emp.getName() + ", surname is " + emp.getSurName() + ", middle name is " + emp.getMiddleName() + ", salary = " + emp.getSalary());
            }
        }
    }

    public static void main(String[] args) {

    }
}