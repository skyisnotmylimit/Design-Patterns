class Vehicle {
    private DriveStrategy ds;
    public Vehicle(DriveStrategy ds) {
        this.ds = ds;
    }
    public void setStrategy(DriveStrategy ds) {
        this.ds = ds;
    }
    public void move() {
        ds.drive();
    }
}
