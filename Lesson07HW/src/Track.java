class Track extends Ground {

    private static final String TRANSPORT_TYPE_ID = "track";
    public static int count = 0;

    private int loadCapacity; // ton

    public Track(int horsePower, int velocityMax, int mass, String brand,
                 int weelsNumber, int fuelConsumption,
                 int loadCapacity) {

        super(horsePower, velocityMax, mass, brand, weelsNumber, fuelConsumption);
        this.loadCapacity = loadCapacity;
        count++;
    }

    public void displayInfo() {
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.print("id - " + TRANSPORT_TYPE_ID + count);
        super.displayInfo();
        System.out.println("; Грузоподъемность, т: " + loadCapacity);
        System.out.println("------------------------------------------------------------------------------------------");

    }
}
