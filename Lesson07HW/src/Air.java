class Air extends Transport {
    private int wingSpan; // m
    private int runwayLength; // km

    public Air(int horsePower, int velocityMax, int mass, String brand,
               int wingSpan, int runwayLength) {

        super(horsePower, velocityMax, mass, brand);
        this.wingSpan = wingSpan;
        this.runwayLength = runwayLength;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Размах крыльев, м: " + wingSpan + "Длина взлетной полосы, км: " + runwayLength);
    }
}
