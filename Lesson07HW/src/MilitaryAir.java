class MilitaryAir extends Air {

    private static final String TRANSPORT_TYPE_ID = "mair";
    public static int count = 0;

    private boolean crewEjection; // true or false
    private int missileNumber; // units

    public MilitaryAir(int horsePower, int velocityMax, int mass, String brand,
                       int wingSpan, int runwayLength,
                       boolean crewEjection, int missileNumber) {

        super(horsePower, velocityMax, mass, brand, wingSpan, runwayLength);
        this.crewEjection = crewEjection;
        this.missileNumber = missileNumber;
        count++;
    }

    public void displayInfo() {
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.print("id - " + TRANSPORT_TYPE_ID + count);
        super.displayInfo();
        System.out.println("; Наличие системы катапультирования: " + crewEjection + "; Кол-во ракет на борту: " + missileNumber);
        System.out.println("------------------------------------------------------------------------------------------");
    }
}
