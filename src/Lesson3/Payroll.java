package Lesson3;

public class Payroll {
    private String employeeName;
    private double hourlyPayRate,numberOfHoursWorked;

    public Payroll() {
    }

    public Payroll(String employeeName, double hourlyPayRate, double numberOfHoursWorked) {
        this.employeeName = employeeName;
        this.hourlyPayRate = hourlyPayRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(double numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }
    public double grossPay(){
        return getHourlyPayRate()*getNumberOfHoursWorked();
    }

    @Override
    public String toString() {
        return "Payroll{" +
                "employeeName='" + employeeName + '\'' +
                ", hourlyPayRate=" + hourlyPayRate +
                ", numberOfHoursWorked=" + numberOfHoursWorked +
                '}';
    }
}
