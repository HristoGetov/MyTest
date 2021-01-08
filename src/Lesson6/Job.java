package Lesson6;

import Lesson3.Person;

public class Job {
    private String title;
    private double salary;
    private Person employee;

    public Job(String title, double salary, Person employee) {
        this.title = title;
        this.salary = salary;
        this.employee = employee;
    }

    public Job(String title, double salary) {
        this.title = title;
        this.salary = salary;
        employee = null;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Person getEmployee() {
        return employee;
    }

    public void setEmployee(Person employee) {
        this.employee = employee;
    }

    public double givePrecentageRice(double percentage){
        return salary*percentage;
    }

}
