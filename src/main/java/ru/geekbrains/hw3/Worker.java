package ru.geekbrains.hw3;

/**
 * Класс Worker представляет постоянного сотрудника, который является подклассом класса Employee.
 */
public class Worker extends Employee {

    /**
     * Конструктор для создания объекта Worker.
     *
     * @param name   Имя сотрудника
     * @param age    Возраст сотрудника
     * @param salary Зарплата сотрудника
     */
    public Worker(String name, int age, double salary) {
        super(name, age, salary);
        this.setType("Worker");
    }

    /**
     * Метод для расчета зарплаты постоянного сотрудника.
     *
     * @return Зарплата постоянного сотрудника
     */
    @Override
    public double calculateSalary() {
        return this.getSalary();
    }
}
