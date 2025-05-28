package Ride_Sharing;

interface RideService {
    // function
    double calculateFare(double distance);
    boolean isAvailable();
    void rateRide(int rating);
}