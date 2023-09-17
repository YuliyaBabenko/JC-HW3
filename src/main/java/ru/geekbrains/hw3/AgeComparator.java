package ru.geekbrains.hw3;

import java.util.Comparator;

/**
 * Компаратор для сравнения сотрудников по возрасту.
 */
public class AgeComparator implements Comparator<Employee>{

    /**
     * Сравнивает двух сотрудников по их возрасту.
     *
     * @param employee1 первый сотрудник для сравнения
     * @param employee2 второй сотрудник для сравнения
     * @return отрицательное число, если у первого сотрудника возраст меньше,
     * положительное число, если больше, и ноль, если возрасты равны
     */
    @Override
    public int compare(Employee employee1, Employee employee2) {
        return Integer.compare(employee1.getAge(), employee2.getAge());
    }
}
