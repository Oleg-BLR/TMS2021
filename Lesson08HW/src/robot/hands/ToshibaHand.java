package robot.hands;

public class ToshibaHand implements IHand {
    private int price;

    public ToshibaHand(int price) {
        this.price = price;
    }

    public ToshibaHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Toshiba поднял руки");
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return "Toshiba hand";
    }
}
