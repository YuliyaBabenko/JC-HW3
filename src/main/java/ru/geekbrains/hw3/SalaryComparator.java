package ru.geekbrains.hw3;

import java.util.Comparator;

/**
 * Компаратор для сравнения сотрудников по зарплате.
 */
public class SalaryComparator implements Comparator<Employee> {

    /**
     * Сравнивает двух сотрудников по их зарплате.
     *
     * @param employee1 первый сотрудник для сравнения
     * @param employee2 второй сотрудник для сравнения
     * @return отрицательное число, если у первого сотрудника зарплата меньше,
     * положительное число, если больше, и ноль, если зарплаты равны
     */
    @Override
    public int compare(Employee employee1, Employee employee2) {
        return Double.compare(employee1.getSalary(), employee2.getSalary());
    }
}
