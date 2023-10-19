public class Engine {
    private FuelType fuelType; 
    double currentFuel;
    double maxFuel;

    public FuelType getFuelType(){
        return fuelType;
    }

    public Engine(FuelType fuelType, double maxFuel){
        this.fuelType = fuelType;
        this.maxFuel = maxFuel;
    }

    public void refuel(){
        currentFuel = maxFuel;
    }

    public void go(){
        if (currentFuel > 0.0){
            currentFuel -= 1.0;
            System.out.println("Current fuel level is: " + currentFuel + " gallons.");
            if (currentFuel == 2.0){
                System.out.println("WARNING! Fuel will run out soon! Refuel immediatly.");
            }
        }
        else if (currentFuel == 0.0){
            throw new RuntimeException("Current fuel level is " + currentFuel + ". You must refuel before continuing.");
        }
    }
}