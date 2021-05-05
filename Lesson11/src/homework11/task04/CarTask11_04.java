package homework11.task04;

public class CarTask11_04 {

    private String brand;
    private int maxSpeed;
    private int price;

    public CarTask11_04(String brand, int maxSpeed, int price) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Это автомобиль " +
                "марки '" + brand + '\'' +
                ", с максимальной скоростью " + maxSpeed +
                " км/ч, стоимостью " + price +
                " у.е.";
    }
}
