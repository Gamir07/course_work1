import java.util.Arrays;

public class EmployeeBook {
    private Employee[] employees = new Employee[10];

    public void showAllEmployees() {
        for (Employee emp : employees) {
            if (emp != null) {
                System.out.println(emp);
            }
        }
        System.out.println();
    }

    public double totalSalaryPerMonth() {
        double totalSalary = 0.0;
        for (Employee emp : employees) {
            if (emp != null) {
                totalSalary += emp.getSalary();
            }
        }
        return totalSalary;
    }

    public void minSalary() {
        Employee emp = null;

        for (Employee employee : employees) {
            if (employee != null) {
                emp = employee;
                break;
            }
        }
        for (Employee employee : employees) {
            if (emp == null) {
                System.out.println("В массиве employees нет работников");
                break;
            } else if (employee != null && emp.getSalary() > employee.getSalary()) {
                emp = employee;
            }
        }
        if (emp != null) {
            System.out.println("Employee with a min salary is " + emp.getName() + " " + emp.getSurName() + " " + emp.getMiddleName());
            System.out.println();
        }
    }

    public void maxSalary() {
        Employee emp = null;

        for (Employee employee : employees) {
            if (employee != null) {
                emp = employee;
                break;
            }
        }
        for (Employee employee : employees) {
            if (emp == null) {
                System.out.println("В массиве employees нет работников");
                break;
            } else if (employee != null && emp.getSalary() < employee.getSalary()) {
                emp = employee;
            }
        }
        if (emp != null) {
            System.out.println("Employee with a max salary is " + emp.getName() + " " + emp.getSurName() + " " + emp.getMiddleName());
            System.out.println();
        }
    }

    public void averageSalary() {
        int personCounter = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                personCounter++;
            }
        }
        double averageSalary = totalSalaryPerMonth() / personCounter;
        System.out.println("Average salary for all employees is " + averageSalary);
        System.out.println();
    }

    public void employeesName() {
        for (Employee emp : employees) {
            if (emp != null) {
                System.out.println(emp.getName() + " " + emp.getSurName() + " " + emp.getMiddleName());
            }
        }
        System.out.println();
    }

    public void salaryIncrease(double percent) {
        for (Employee employee : employees) {
            if (employee != null) {
                employee.setSalary(employee.getSalary() * (percent / 100) + employee.getSalary());
            }
        }
    }

    public void employeeWithMinSalary(int department) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Такого департамента не существует");
        }
        Employee employee = null;

        for (Employee emp : employees) {
            if (emp != null && emp.getDepartment() == department) {
                if (employee == null) {
                    employee = emp;
                } else if (employee.getSalary() > emp.getSalary()) {
                    employee = emp;
                }
            }
        }
        if (employee == null) {
            System.out.println("В департаменте № " + department + " никто не работает");
            return;
        }
        System.out.println(employee + " from department " + department + " has a min salary");
    }

    public void employeeWithMaxSalary(int department) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Такого департамента не существует");
        }
        Employee employee = null;

        for (Employee emp : employees) {
            if (emp != null && emp.getDepartment() == department) {
                if (employee == null) {
                    employee = emp;
                }
                if (employee.getSalary() < emp.getSalary()) {
                    employee = emp;
                }
            }
        }
        if (employee == null) {
            System.out.println("В департаменте № " + department + " никто не работает");
            return;
        }
        System.out.println(employee + " from department " + department + " has a max salary");
    }

    public void totalSalaryForDepartment(int department) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Такого департамента не существует");
        }
        double totalSalary = 0;
        for (Employee emp : employees) {
            if (emp != null && emp.getDepartment() == department) {
                totalSalary += emp.getSalary();
            }
        }
        System.out.println("Сумма затрат по отделу №" + department + " равна " + totalSalary);
    }

    public void averageSalaryForDepartment(int department) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Такого департамента не существует");
        }
        double totalSalary = 0.0;
        int personsInDepartment = 0;

        for (Employee emp : employees) {
            if (emp != null && emp.getDepartment() == department) {
                personsInDepartment++;
                totalSalary += emp.getSalary();
            }
        }
        double averageSalary = totalSalary / personsInDepartment;
        System.out.println("Средняя зарплата по отделу №" + department + " равна " + averageSalary);
    }

    public void salaryIncreaseForDepartment(int department, double percent) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Такого департамента не существует");
        }
        for (Employee emp : employees) {
            if (emp != null && emp.getDepartment() == department) {
                emp.setSalary(emp.getSalary() * (percent / 100) + emp.getSalary());
            }
        }
    }

    public void printAllEmployeesForDepartment(int department) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Такого департамента не существует");
        }
        for (Employee emp : employees) {
            if (emp != null && emp.getDepartment() == department) {
                System.out.println("First name is " + emp.getName() + ", surname is " + emp.getSurName() + ", middle name is " + emp.getMiddleName() + ", salary = " + emp.getSalary() + ", id = " + emp.getId());
            }
        }
    }

    public void employeesWithLessSalaryThan(int sum) {
        for (Employee emp : employees) {
            if (emp != null && emp.getSalary() < sum) {
                System.out.println("id = " + emp.getId() + " first name is " + emp.getName() + ", surname is " + emp.getSurName() + ", middle name is " + emp.getMiddleName() + ", salary = " + emp.getSalary());
            }
        }
    }

    public void employeesWithMoreSalaryThan(int sum) {
        for (Employee emp : employees) {
            if (emp != null && emp.getSalary() >= sum) {
                System.out.println("id = " + emp.getId() + " first name is " + emp.getName() + ", surname is " + emp.getSurName() + ", middle name is " + emp.getMiddleName() + ", salary = " + emp.getSalary());
            }
        }
    }

    public void addNewEmployee(Employee employee) {
        boolean isFull = true;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                isFull = false;
                break;
            }
        }
        if (isFull) {
            employees = Arrays.copyOf(employees, employees.length + 1);
            employees[employees.length - 1] = employee;
        }
    }

    public void removeEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
            }
        }
    }

    public void changeSalary(String name, String surName, String middleName, double amount) {
        for (Employee employee : employees) {
            if (employee != null && employee.getName().equals(name) && employee.getSurName().equals(surName)
                    && employee.getMiddleName().equals(middleName)) {
                employee.setSalary(amount);
            }
        }
    }

    public void changeDepartment(String name, String surName, String middleName, int id, int newDepartment) {
        for (Employee employee : employees) {
            if (employee != null && employee.getName().equals(name) && employee.getSurName().equals(surName)
                    && employee.getMiddleName().equals(middleName) && employee.getId() == id) {
                employee.setDepartment(newDepartment);
            }
        }

    }

    public void printEmployeesInDepartments() {
        int[] departments = {1, 2, 3, 4, 5};
        for (int department : departments) {
            System.out.println("Department № " + department + " has following employees:");
            printAllEmployeesForDepartment(department);
            System.out.println();
        }


    }



}
