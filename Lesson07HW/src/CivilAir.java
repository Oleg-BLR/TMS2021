class CivilAir extends Air {
    private int seatCapacity; // units
    private boolean businessClassAvailability; // true or false

    public CivilAir(int horsePower, int velocityMax, int mass, String brand,
                    int wingSpan, int runwayLength,
                    int seatCapacity, boolean businessClassAvailability) {

        super(horsePower, velocityMax, mass, brand, wingSpan, runwayLength);
        this.seatCapacity = seatCapacity;
        this.businessClassAvailability = businessClassAvailability;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Кол-во пассажиров: " + seatCapacity + "Наличие бизнес класса: " + businessClassAvailability);
    }
}
