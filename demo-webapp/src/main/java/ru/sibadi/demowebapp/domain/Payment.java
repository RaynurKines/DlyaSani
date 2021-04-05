package ru.sibadi.demowebapp.domain;

import java.util.ArrayList;
import java.util.Date;

public class Payment{

    private Person person;
    private int id;
    private Date date;
    private int ins_salary;

    public Payment(Person person, int id, Date date, int ins_salary) {
        this.person = person;
        this.id = id;
        this.date = date;
        this.ins_salary = ins_salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getInsSalary() {
        return ins_salary;
    }

    public void setInsSalary(int ins_salary) {
        this.ins_salary = ins_salary;
    }
}
