package Lesson11;

public class Exercise2 {
    public static void main(String[] args) {
        double wheat = 1.0;
        double totalWheat=0.0;
        for (int i =0; i<10; i++){
            if (i==0){
                wheat+=wheat;
                totalWheat+=wheat;
            }else{
                wheat=wheat*wheat;
                totalWheat+=wheat;
            }
        }
        System.out.println(wheat);
        System.out.println(totalWheat);

    }
}
