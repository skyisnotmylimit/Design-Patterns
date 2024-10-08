public class Main {
    public static void main(String[] args) {
        ConcreteVehicleFactory vf = new ConcreteVehicleFactory();
        Vehicle car = vf.createVehicle("car");
        car.drive();
        Vehicle bike = vf.createVehicle("bike");
        bike.drive();
        Vehicle truck = vf.createVehicle("truck");
        truck.drive();
    }
}
