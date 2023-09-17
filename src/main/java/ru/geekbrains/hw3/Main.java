package ru.geekbrains.hw3;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        EmployeeList employees = new EmployeeList();

        // Добавление сотрудников в список
        employees.addEmployee(new Worker("Иванов Иван", 34, 27000));
        employees.addEmployee(new Freelancer("Петров Петр", 27, 700));
        employees.addEmployee(new Freelancer("Фёдорова Таисия", 37, 1000));
        employees.addEmployee(new Worker("Скоробогатько Марфа", 41, 65000));
        employees.addEmployee(new Freelancer("Фёдоров Фёдор", 25, 400));


        printHeader("Сортировка по умолчанию");
        Collections.sort(employees.getEmployees());
        printEmployees(employees);

        printHeader("Сортировка по зарплате");
        employees.getEmployees().sort(new SalaryComparator());
        printEmployees(employees);

        printHeader("Сортировка по возрасту");
        employees.getEmployees().sort(new AgeComparator());
        printEmployees(employees);
    }

    /**
     * Печать списка сотрудников
     */
    private static void printEmployees(EmployeeList employeeList) {
        // Итерация по списку сотрудников с использованием цикла foreach
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }
    }

    private static void printHeader(String st) {
        System.out.println("\n");
        System.out.printf("%25s", "=== " + st + " ===\n");
    }
}
