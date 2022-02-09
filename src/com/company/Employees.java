package com.company;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.GregorianCalendar;

public class Employees {
    ArrayList<Employee> employees = new ArrayList<>();

    public void add(String surname, String name, String tel, int dayBD, int mounthBD, int yearBD){
        //TODO добавление по алфавиту
        employees.add(new Employee(name, surname, tel, dayBD, mounthBD, yearBD));
        employees.sort(new CompSurname());
    }

    public void print(){//TODO печать списка
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i).surname+" "+employees.get(i).name+" "+employees.get(i).tel+" "+employees.get(i).dayBD+"."
                    +employees.get(i).mounthBD+"."+employees.get(i).yearBD);
        }
    }

    public void delete(String tel){
        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i).tel.equals(tel)) {
                employees.remove(i);
                break;
            }
        }
    }
    public void sortDate(){
        employees.sort(new CompDate());
    }

    //TODO при необходимости написать еще один метод сортировки
    class CompSurname implements Comparator<Employee>{
        @Override
        public int compare(Employee employee, Employee t1) {return employee.surname.compareTo(t1.surname);}
    }

    class CompDate implements Comparator<Employee>{

        @Override
        public int compare(Employee o1, Employee o2) {
            Calendar calendar1 = new GregorianCalendar(o1.yearBD+0, o1.mounthBD+0, o1.dayBD+0);
            Calendar calendar2 = new GregorianCalendar(o2.yearBD+0, o2.mounthBD+0, o2.dayBD+0);
            return calendar1.compareTo(calendar2);
        }
    }
}