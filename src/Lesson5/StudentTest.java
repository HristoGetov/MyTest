package Lesson5;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Hristo Getov",'M',260064);
        Student student2 = new Student("Haralampi",'M',223456);
        Student student3 = new Student("Sonya",'F');

        student2.setName("Kiro");
        student3.setName("Martin");
        student3.setGender('M');
/*        System.out.println("Name: " + student1.getName()+ "\nGender: " + student1.getGender()+
                "\nStudent number: " + student1.getSudentNumber());
        System.out.println("\nName: " + student2.getName()+ "\nGender: " + student2.getGender()+
                "\nStudent number: " + student2.getSudentNumber());
        System.out.println("\nName: " + student3.getName()+ "\nGender: " + student3.getGender()+
                "\nStudent number: " + student3.getSudentNumber());*/

        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
    }
}
