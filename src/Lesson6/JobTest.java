package Lesson6;


import Lesson3.Person;

public class JobTest {
    public static void main(String[] args) {
        Job job1=new Job("Software Engineer",4000.0);
        Job job2 = new Job("Teem leader",4500.0);

        job1.setEmployee(new Person("Hristo Getov","09/03/1988"));
        job2.setEmployee(new Person("Bob","22/03/1986"));
        job1.givePrecentageRice(0.02);
        job2.givePrecentageRice(0.02);

        System.out.println(job1.getTitle()+ ", " + job1.getSalary()+ ", " + job1.getEmployee().toString());
        System.out.println(job2.getTitle()+ ", " + job2.getSalary()+ ", " + job2.getEmployee().toString());

    }
}
