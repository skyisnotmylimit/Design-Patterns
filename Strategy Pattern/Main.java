class Main {
    public static void main(String[] args) {
        Vehicle vc = new Vehicle(new FourWheelStrategy());
        vc.move();
        vc.setStrategy(new TwoWheelStrategy());
        vc.move();
        vc.setStrategy(new ThreeWheelStrategy());
        vc.move();
    }
}
