package robot.heads;

public class ToshibaHead implements IHead {
    private int price;

    public ToshibaHead(int price) {
        this.price = price;
    }

    public ToshibaHead() {
    }

    @Override
    public void talk() {
        System.out.println("Говорит голова Toshiba");
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return "Toshiba head";
    }
}
