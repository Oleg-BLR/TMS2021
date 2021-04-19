class Car extends Ground {
    private String bodyType; //
    private int seatCapacity; // units

    public Car(int horsePower, int velocityMax, int mass, String brand,
               int weelsNumber, int fuelConsumption,
               String bodyType, int seatCapacity) {

        super(horsePower, velocityMax, mass, brand, weelsNumber, fuelConsumption);
        this.bodyType = bodyType;
        this.seatCapacity = seatCapacity;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Тип кузова: " + bodyType + "Кол-во пассажиров: " + seatCapacity);
    }

}
