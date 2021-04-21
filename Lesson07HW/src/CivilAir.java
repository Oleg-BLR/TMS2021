class CivilAir extends Air {

    private static final String TRANSPORT_TYPE_ID = "cair";
    public static int count = 0;

    private int seatCapacity; // units
    private boolean businessClassAvailability; // true or false

    public CivilAir(int horsePower, int velocityMax, int mass, String brand,
                    int wingSpan, int runwayLength,
                    int seatCapacity, boolean businessClassAvailability) {

        super(horsePower, velocityMax, mass, brand, wingSpan, runwayLength);
        this.seatCapacity = seatCapacity;
        this.businessClassAvailability = businessClassAvailability;
        count++;
    }

    public void displayInfo() {
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.print("id - " + TRANSPORT_TYPE_ID + count);
        super.displayInfo();
        System.out.println("; Кол-во пассажиров: " + seatCapacity + "; Наличие бизнес класса: " + businessClassAvailability);
        System.out.println("------------------------------------------------------------------------------------------");
    }
}
