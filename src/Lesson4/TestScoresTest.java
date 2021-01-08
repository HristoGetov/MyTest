package Lesson4;

import java.util.Scanner;

public class TestScoresTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TestScores scores= new TestScores();
        scores.setTestScore1(scanner.nextInt());
        scores.setTestScore2(scanner.nextInt());
        scores.setTestScore3(scanner.nextInt());

        System.out.println(scores.average());

    }
}
