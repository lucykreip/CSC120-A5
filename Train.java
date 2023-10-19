import java.util.ArrayList;

public class Train {

    private final Engine engine;
    private ArrayList<Car> cars; 

    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.engine = new Engine(fuelType, fuelCapacity);
        this.cars = new ArrayList<Car>(nCars);
    }

    public Engine getEngine(){
        return engine;
    }

    public Car getCar(int i){
        return cars.get(i);
    }

    public static void main(String[] args) {
                
    }
}
