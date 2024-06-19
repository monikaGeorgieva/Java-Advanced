package _3_SpeedRacing;

public class Car {
    //Model, fuel amount, fuel cost for 1 kilometer and distance traveled
    //AudiA4 23 0.3
    private String model;
    private double fuelAmount;
    private double consumption;
    private double distanceTraveled;

    public Car(String model, double fuelAmount, double consumption) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.consumption = consumption;
        this.distanceTraveled = 0;
    }

    public  boolean drive(double kilometersToDrive){
        double fuelRequired = kilometersToDrive * consumption;
        if (fuelRequired > this.fuelAmount){
            return  false;
        }else{
            this.fuelAmount -= fuelRequired;
            this.distanceTraveled += kilometersToDrive;
            return  true;
        }
    }
    public String toString(){
        return String.format("%s %.2f %.0f",this.model,this.fuelAmount,this.distanceTraveled);
    }
}
