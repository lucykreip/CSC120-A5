import java.util.ArrayList;

public class Car {
    private ArrayList<Passenger> passengers; 
    int maxCapacity;

    public Car(){
        this.passengers = new ArrayList<Passenger>(maxCapacity);
    }

    public int seatsRemaining(){
        int seatsOpen = maxCapacity - this.passengers.size();
        return seatsOpen;
    }

    public void addPassenger(Passenger p){
        if (this.passengers.contains(p) == false){
            if (this.passengers.size() < maxCapacity){
                this.passengers.add(p); 
            }
        }
        else{
            throw new RuntimeException("This passenger is already on board!");
        }
    }

    public void removePassenger(Passenger p){
        if (this.passengers.contains(p)== true){
            this.passengers.remove(p);
        }
        else{
            throw new RuntimeException("This passenger is not on board! Double check and try again!");
        }
    }

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
}