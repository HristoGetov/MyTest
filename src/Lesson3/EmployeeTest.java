package Lesson3;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee susan = new Employee();
        Employee mark = new Employee();
        Employee joy = new Employee();

        susan.setName("Susan Meyers");
        susan.setIdNumber(47899);
        susan.setDepartment("Accounting");
        susan.setPosition("Vice President");

        mark.setName("Mark Jones");
        mark.setIdNumber(39119);
        mark.setDepartment("IT");
        mark.setPosition("Programmer");

        joy.setName("Joy Rogers");
        joy.setIdNumber(81774);
        joy.setDepartment("Manufacturing");
        joy.setPosition("Engineer");

        System.out.println("Name        ID Number       Department      Position");
        System.out.println("----------------------------------------------------");
        System.out.println(susan.getName()+"\t" + susan.getIdNumber() + "\t" + susan.getDepartment() + "\t\t" + susan.getPosition());
        System.out.println(mark.getName()+"\t\t" + mark.getIdNumber() + "\t\t" + mark.getDepartment() + "\t\t\t" + mark.getPosition());
        System.out.println(joy.getName()+"\t\t" + joy.getIdNumber() + "\t" + joy.getDepartment() + "\t" + joy.getPosition());
    }
}
