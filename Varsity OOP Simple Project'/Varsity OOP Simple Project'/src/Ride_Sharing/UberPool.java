package Ride_Sharing;

class UberPool extends Ride {
    
    
    UberPool(String driver,double baseFare) {
        super(driver, baseFare);
    }

    @Override
    public double calculateFare(double distance) {
        return baseFare + (distance * 1.0);
    }

    @Override
    public void rateRide(int rating) {
        System.out.println("Rated UberPool: " + rating + " stars");
    }
}
