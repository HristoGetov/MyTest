package Lesson4;

import java.util.Scanner;

public class TemperatureTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Temperature temperature = new Temperature(scanner.nextDouble());

        System.out.println(temperature.getFtemp());
        System.out.println(temperature.getCelsius());
        System.out.println(temperature.getKelvin());
    }
}
