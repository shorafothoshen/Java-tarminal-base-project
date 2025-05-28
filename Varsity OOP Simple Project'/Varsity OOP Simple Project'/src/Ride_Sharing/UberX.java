package Ride_Sharing;

class UberX extends Ride {
    
    
    UberX(String driver,double baseFare) {
        super(driver, baseFare);
    }

    @Override
    public double calculateFare(double distance) {
        return baseFare + (distance * 1.5);
    }

    @Override
    public void rateRide(int rating) {
        System.out.println("Rated UberX: " + rating + " stars");
    }
}
