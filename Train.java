import java.util.ArrayList;

public class Train {

    private final Engine engine;
    private ArrayList<Car> cars; 

    /*
     * constructs a train based on the given information
     * @param fuelType, fuelCapacity, nCars, passengerCapacity
     */
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.engine = new Engine(fuelType, fuelCapacity);
        this.cars = new ArrayList<Car>(nCars); 
    }

    /*
     * returns the constructed engine
     * @return engine
     */
    public Engine getEngine(){
        return engine;
    }

    /*
     * returns the car at the given index
     * @param i
     * @return the car at that index
     */
    public Car getCar(int i){
        return cars.get(i);
    }

    /*
     * returns the maximum cpaacity across all cars 
     * @return maxCap
     */
    public int getMaxCapacity(){
        int maxCap = 0;
        for (Car c: this.cars){
            maxCap += c.getMaxCapacity();
        }
        return maxCap;
    }

    /*
     * provides the amount of seats left to fill in the trian, compiled across all the cars
     * @return remaining 
     */
    public int seatsRemaining(){
        int remaining = 0;
        for (Car c: this.cars){
            remaining += c.seatsRemaining();
        }
        return remaining;

    }

    /*
     * prints out a combination of all the cars' manifests, providing a complete list of all the passengers on board
     * 
     */
    public void printManifest(){
        for (Car c: this.cars){
            c.printManifest();
        }
    }

    public static void main(String[] args) {
        Train myTrain = new Train( FuelType.ELECTRIC, 100, 2, 20);
        Car car1 = new Car();
        Car car2 = new Car();
        myTrain.cars.add(car1);
        myTrain.cars.add(car2);
        Passenger me = new Passenger("Lucy");
        me.boardCar(car2);
        System.out.println(myTrain.getMaxCapacity());
        System.out.println(myTrain.seatsRemaining());
        myTrain.printManifest();

    }
}
