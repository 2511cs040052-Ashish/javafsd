class Ride {
    void fare() {
        System.out.println("Calculating fare");
    }
}

class BikeRide extends Ride {
    void fare() {
        System.out.println("Bike fare: ₹80");
    }
}

class CabRide extends Ride {
    void fare() {
        System.out.println("Cab fare: ₹250");
    }
}

class AutoRide extends Ride {
    void fare() {
        System.out.println("Auto fare: ₹120");
    }
}