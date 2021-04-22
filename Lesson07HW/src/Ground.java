class Ground extends Transport {
    private int weelsNumber; // units
    private int fuelConsumption; // l/100km

    public Ground(int horsePower, int velocityMax, double mass, String brand,
                  int weelsNumber, int fuelConsumption) {

        super(horsePower, velocityMax, mass, brand);
        this.weelsNumber = weelsNumber;
        this.fuelConsumption = fuelConsumption;
    }

    public int getWeelsNumber() {
        return weelsNumber;
    }

    public void setWeelsNumber(int weelsNumber) {
        this.weelsNumber = weelsNumber;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("; Кол-во колес, шт: " + weelsNumber + "; Расход топлива, л/100км: " + fuelConsumption);
    }
}
