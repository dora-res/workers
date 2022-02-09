package com.company;

public class Employee implements Comparable<Employee>{

    //TODO поля по заданию
    String surname, name, tel;
    int dayBD, mounthBD, yearBD;

    public Employee(String name, String surname, String tel, int dayBD, int mounthBD, int yearBD) {
        this.name = name;
        this.surname = surname;
        this.tel = tel;
        this.dayBD = dayBD;
        this.mounthBD = mounthBD;
        this.yearBD = yearBD;
    }
    //TODO конструктор

    public boolean equals(Employee em) {
        //TODO сравнение да/нет
        return false;
    }

    public void print(Employee i) {
        //TODO для печати
        System.out.println(i.name+" "+i.surname+" "+i.tel+" "+i.dayBD+" "+i.mounthBD+" "+i.yearBD);
    }

    @Override
    public int compareTo(Employee o) {
        return 0;
    }
}