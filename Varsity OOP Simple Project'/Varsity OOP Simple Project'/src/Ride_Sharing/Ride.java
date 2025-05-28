package Ride_Sharing;

abstract class Ride implements RideService {
    protected String driver;
    protected double baseFare;

    Ride(String driver, double baseFare) {
        this.driver = driver;
        this.baseFare = baseFare;
    }
    
    @Override
    public boolean isAvailable() {
        if(driver==null){
            return false;
        }
        else{
            return true;
        }
    }
}




