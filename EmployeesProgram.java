package Aplications;

import Entities.Employee;

import java.util.*;

public class EmployeesProgram {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int id;
        String name;
        double salary;

        List<Employee> employeeList = new ArrayList<>();

        System.out.print("How many employees will be registered ? ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {

            System.out.println();
            System.out.printf("\nEmployee #%s: \n", (i+1));

            System.out.print("Id: ");
            id = sc.nextInt();
            while (hasId(employeeList, id)) {
                System.out.print("Id already taken! Try again: ");
                id = sc.nextInt();
            }
            sc.nextLine();

            System.out.print("Name: ");
            name = sc.nextLine();

            System.out.print("Salary: U$ ");
            salary = sc.nextDouble();

           Employee emp = new Employee(id, name, salary);

           employeeList.add(emp);
        }

        System.out.println();
        System.out.println("=== Information about the employees ===");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int idSalary = sc.nextInt();

        Employee emp = employeeList.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);

        //Integer pos = position(employeeList, idSalary);

        if (emp == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            emp.increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (Employee e : employeeList) {
            System.out.println(e);
        }

        sc.close();
    }

    public static Integer position(List<Employee> employeeList, int id) {
        for (int i = 0; i< employeeList.size(); i++) {
            if (employeeList.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Employee> employeeList, int id) {
        Employee emp = employeeList.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
