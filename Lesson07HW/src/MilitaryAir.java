class MilitaryAir extends Air {
    private boolean crewEjection; // true or false
    private int missileNumber; // units

    public MilitaryAir(int horsePower, int velocityMax, int mass, String brand,
                       int wingSpan, int runwayLength,
                       boolean crewEjection, int missileNumber) {

        super(horsePower, velocityMax, mass, brand, wingSpan, runwayLength);
        this.crewEjection = crewEjection;
        this.missileNumber = missileNumber;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Наличие системы катапультирования: " + crewEjection + "Кол-во ракет на борту: " + missileNumber);
    }
}
