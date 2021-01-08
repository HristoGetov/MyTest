package Lesson5;

public class Student {
    private String name;
    private char gender;
    private int sudentNumber;

    public Student(String name, char gender, int sudentNumber) {
        this.name = name;
        this.gender = gender;
        this.sudentNumber = sudentNumber;
    }

    public Student(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getSudentNumber() {
        return sudentNumber;
    }

    public String toString(){
        return name + ", " + gender + ", "  + sudentNumber;
    }

}
