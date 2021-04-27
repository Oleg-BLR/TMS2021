package robot.legs;

public class SamsungLeg implements ILeg {
    private int price;

    public SamsungLeg(int price) {
        this.price = price;
    }

    public SamsungLeg() {
    }

    @Override
    public void step() {
        System.out.println("Samsung сделал шаг");
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return "Samsung leg";
    }
}
