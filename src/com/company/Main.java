package com.company;

public class Main {

    public static void main(String[] args) {
        Employees employees = new Employees();
        employees.add("Тинькофф", "Олег", "+7968438249", 23, 9, 1976);
        employees.add("chto-eto", "lokalik", "+558932666", 2, 11, 1988);
        employees.add("korichneviy", "cheburashka", "+84392284", 7, 4, 1999);
        employees.print();
        employees.delete("+558932666");
        System.out.println();
        employees.print();
        employees.sortDate();
        System.out.println();
        employees.print();
    }
}
