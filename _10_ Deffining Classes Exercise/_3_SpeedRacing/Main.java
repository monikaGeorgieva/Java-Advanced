package _3_SpeedRacing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCars = Integer.parseInt(scanner.nextLine());
        Map<String,Car> cars = new LinkedHashMap<>();
        for (int i = 0; i < numberOfCars; i++) {
            String [] input = scanner.nextLine().split(" ");
            String model = input[0];
            double fuelAmount = Double.parseDouble(input[1]);
            double consumption = Double.parseDouble(input[2]);

            Car car = new Car(model,fuelAmount,consumption);
            cars.put(model,car);

        }

        String [] driveCommand = scanner.nextLine().split(" ");
        while (!driveCommand[0].equals("End")){
            String carModel = driveCommand[1];
            Double kilometersToDrive =  Double.parseDouble(driveCommand[2]);
            Car car = cars.get(carModel);
            if (!car.drive(kilometersToDrive)){
                System.out.println("Insufficient fuel for the drive");
            }
            driveCommand = scanner.nextLine().split(" ");
        }
        cars.values().forEach(System.out::println);

    }
}
//2
//AudiA4 23 0.3
//BMW-M2 45 0.42
//Drive BMW-M2 56
//Drive AudiA4 5
//Drive AudiA4 13
//End

//AudiA4 17,60 18
//BMW-M2 21,48 56
