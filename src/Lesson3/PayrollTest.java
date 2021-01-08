package Lesson3;

import java.util.Scanner;

public class PayrollTest {
    public static void main(String[] args) {
        Payroll payroll = new Payroll();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the employee's name... ");
        payroll.setEmployeeName(keyboard.nextLine());

        System.out.println("Please enter the employee's hourly pay rate....");
        payroll.setHourlyPayRate(keyboard.nextDouble());

        System.out.println("Please enter the employee's number of hours worked... ");
        payroll.setNumberOfHoursWorked(keyboard.nextDouble());


        System.out.println("Employee: " + payroll.getEmployeeName() + "\nPay rate per hour: "  + payroll.getHourlyPayRate()+
                "\nWorked hours: " + payroll.getNumberOfHoursWorked() + "\nGross pay: " + payroll.grossPay());


    }
}
