public class Passenger {
    
    private String name;

    /*
     * constructs a passenger with a given String name
     * @param String name 
     */
    public Passenger(String name) {
        this.name = name;
    }
    
    /*
     * returns the String name of the passenger 
     * @return String name 
     */
    public String getName(){
        return name;
    }

    /*
     * adds passenger to the chosen car, catches exception if passenger is already on board
     * @param Car c 
     */
    public void boardCar(Car c){
        try {
            c.addPassenger(this);
        }
        catch(Exception e){
            System.out.println("Uh oh! This passenger may already be on board!");
        }

    }

    /*
     * removes passenger from the given car, catches eception if passenger is not on that car
     * @param Car c
     */
    public void getOffCar(Car c){
        try {
            c.removePassenger(this);
        }
        catch(Exception e){
            System.out.println("This passenger is not on board!");
        }
    }

}