public class Engine {
    private FuelType fuelType; 
    private double currentFuelLevel;
    private double maxFuelLevel;

    /*
     * returns private fuel type
     * @return enum fuelType
     */
    public FuelType getFuelType(){
        return fuelType;
    }

    /*
     * returns current fuel level of train
     * @return double currentFuelLevel
     */
    public double getCurrentFuel(){
        return currentFuelLevel;
    }

    /*
     * provides the double max fuel level of the train
     * @return double maxFuelLevel
     */
    public double getMaxFuel(){
        return maxFuelLevel;
    }

    /*
     * constructs an engine
     * @param fuelType, maxFuel
     */
    public Engine(FuelType fuelType, double maxFuel){
        this.fuelType = fuelType;
        this.maxFuelLevel = maxFuel;
        this.currentFuelLevel = maxFuel;
    }

    /*
     * resets the current fuel level to the max fuel level
     */
    public void refuel(){
        currentFuelLevel = maxFuelLevel;
    }

    /*
     * decrements the fuel level by one as the train goes, until the fuel is 0.0
     */
    public void go(){
        if (currentFuelLevel > 0.0){
            currentFuelLevel -= 1.0;
            System.out.println("Current fuel level is: " + currentFuelLevel + " gallons.");
            if (currentFuelLevel == 2.0){
                System.out.println("WARNING! Fuel will run out soon! Refuel immediatly.");
            }
        }
        else if (currentFuelLevel <= 0.0){
            throw new RuntimeException("Current fuel level is " + currentFuelLevel + ". You must refuel before continuing.");
        }
    }

    public static void main(String[] args) {
        Engine e = new Engine(FuelType.ELECTRIC, 100.0);
        System.out.println(e.getCurrentFuel());            
        // for (int i = 0; i < 98; i++){
        //     e.go();
        // }
        // e.refuel();
        // e.go();
    
    }
}