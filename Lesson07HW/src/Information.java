public interface Information {
    void shoot(Transport transport);

    void catapult(Transport transport);

    void tripInfo(Transport transport, double time);

    void checkWeightCapacity(Transport transport, double weight);

    void checkPassengerCapacity(Transport transport, int people);
}
