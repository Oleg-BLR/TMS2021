class Track extends Ground {
    private int loadCapacity; // ton

    public Track(int horsePower, int velocityMax, int mass, String brand,
                 int weelsNumber, int fuelConsumption,
                 int loadCapacity) {

        super(horsePower, velocityMax, mass, brand, weelsNumber, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Грузоподъемность, т: " + loadCapacity);
    }
}
