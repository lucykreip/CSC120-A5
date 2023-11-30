import java.util.ArrayList;

public class Car {
    private ArrayList<Passenger> passengers; 
    private int maxCapacity;

    /*
     * returns the maximum capacity of the car
     * @return int maxCapacity
     */
    public int getMaxCapacity(){
        return maxCapacity;
    }

    /*
     * constructs a car with an ArrayList of passengers and a set max capacity of 10
     */
    public Car(){
        this.passengers = new ArrayList<Passenger>();
        this.maxCapacity = 10;
    }

    /*
     * returns the amount of seats remaing from the maximum capacity
     * @return int seatsOpen
     */
    public int seatsRemaining(){
        int seatsOpen = maxCapacity - this.passengers.size();
        return seatsOpen;
    }

    /*
     * adds a passeger to the car's ArrayList, and throws an exception if the passenger is already on board or if the max capacity is reached
     * @param Passenger p
     */
    public void addPassenger(Passenger p){
        if (!this.passengers.contains(p)){
            if (this.passengers.size() < maxCapacity){
                this.passengers.add(p); 
            }
        }
        else{
            throw new RuntimeException("This passenger is already on board!");
        }
    }

    /*
     * removes a passenger from the car's ArrayList, throws an exception if the passenger is not on board
     * @param Passenger p
     */
    public void removePassenger(Passenger p){
        if (this.passengers.contains(p)== true){
            this.passengers.remove(p);
        }
        else{
            throw new RuntimeException("This passenger is not on board! Double check and try again!");
        }
    }

    /*
     * prints a list of the car's passengers
     */
    public void printManifest(){
        if (this.passengers.isEmpty() == true){
            System.out.println("This car is EMPTY");
        }
        else {
            System.out.println("MANIFEST:");
            for ( Passenger p: this.passengers){
                System.out.println("- " + p.getName());
            }
        }
    }

    public static void main(String[] args) {
        
    }
}