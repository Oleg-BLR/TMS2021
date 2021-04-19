public class Transport {
    private int horsePower; // horsepower
    private int velocityMax; // km/hour
    private int mass; // ton
    private String brand;

    public Transport(int horsePower, int velocityMax, int mass, String brand) {
        this.horsePower = horsePower;
        this.velocityMax = velocityMax;
        this.mass = mass;
        this.brand = brand;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getVelocityMax() {
        return velocityMax;
    }

    public void setVelocityMax(int velocityMax) {
        this.velocityMax = velocityMax;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "horsePower=" + horsePower +
                ", velocityMax=" + velocityMax +
                ", mass=" + mass +
                ", brand='" + brand + '\'' +
                '}';
    }

    public void displayInfo() {
        System.out.println("Марка: " + brand + "Масса, т: " + mass +
                "Максимальная скорость, км/ч: " + velocityMax + "Мощность, л.с.: " + horsePower);
    }
}
