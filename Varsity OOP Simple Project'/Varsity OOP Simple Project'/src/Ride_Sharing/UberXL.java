package Ride_Sharing;

class UberXL extends Ride {
    
    UberXL(String driver,double baseFare) {
        super(driver, baseFare);
    }

    @Override
    public double calculateFare(double distance) {
        return baseFare + (distance * 2.0);
    }

    @Override
    public void rateRide(int rating) {
        System.out.println("Rated UberXL: " + rating + " stars");
    }
}