public class ConcreteVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle(String vehicleType) {
        if (vehicleType == null) {
            return null;
        }
        if (vehicleType.equalsIgnoreCase("Car")) {
            return new Car();
        } else if (vehicleType.equalsIgnoreCase("Bike")) {
            return new Bike();
        } else if(vehicleType.equalsIgnoreCase("Truck")) {
            return new Truck();
        }
        return null;
    }
}
