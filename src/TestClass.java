
public class TestClass {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Count down...");
        for (int i =50;i>0;i--){
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("Count Completed!");
    }
}
