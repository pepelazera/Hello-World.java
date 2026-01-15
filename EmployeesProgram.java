package Aplications;

import Entities.Employee;

import java.util.*;

public class EmployeesProgram {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int id;
        String name;
        double salary = 0;

        List<Employee> employeeList = new ArrayList<>();

        System.out.print("How many employees will be registered ? ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            System.out.printf("\nEmployee #%s: \n", (i+1));

            System.out.print("Id: ");
            id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            name = sc.nextLine();

            System.out.print("Salary: U$ ");
            salary = sc.nextDouble();

            employeeList.add(new Employee(id, name, salary));
        }

        System.out.println();
        System.out.println("Information about the employees: ");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        double salaryIncrease = sc.nextDouble();

        System.out.print("Enter the percentage: ");
        double percentage = sc.nextDouble();

        percentage = salary / percentage;
        double increasedSalary = salary + percentage;
        System.out.println(increasedSalary);

        sc.close();
    }

}
