public class InformationService implements Information {

    public void shoot(Transport transport) {
        MilitaryAir military = (MilitaryAir) transport;
        int countRockets = military.getMissileNumber();
        if (countRockets > 0) {
            System.out.println("Ракета пошла...");
            military.setMissileNumber(--countRockets);
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public void catapult(Transport transport) {
        MilitaryAir military = (MilitaryAir) transport;
        if (military.isCrewEjection()) {
            System.out.println("Катапультирование прошло успешно");
            military.setCrewEjection(false);
        } else {
            System.out.println("У вас нет такой системы");
        }
    }

    @Override
    public void tripInfo(Transport transport, double time) {
        Car car = (Car) transport;
        System.out.println("За время " + time + " ч, автомобиль " + car.getBrand() + " двигаясь с максимальной скоростью " + car.getVelocityMax() + " км/ч проедет "
                + getWay(car, time) + " км и израсходует " + calculateConsumedFuel(car, time) + " литров топлива.");

    }

    @Override
    public void checkWeightCapacity(Transport transport, double weight) {

    }

    @Override
    public void checkPassengerCapacity(Transport transport, int people) {

    }

    private double calculateConsumedFuel(Car car, double time) {
        return getWay(car, time) * car.getFuelConsumption() / 100;
    }

    private double getWay(Car car, double time) {
        return car.getVelocityMax() * time;
    }

//    @Override
//    public void checkWeightCapacity(Transport transport, double weight) {
//        Freight freight = (Freight) transport;
//        if (weight <= freight.getCarryingCapacity()) {
//            System.out.println("Грузовик загружен");
//        } else {
//            System.out.println("Вам нужен грузовик побольше");
//        }
//    }
//
//    @Override
//    public void checkPassengerCapacity(Transport transport, int people) {
//        Civil civil = (Civil) transport;
//        if (people <= civil.getCountPassengers()) {
//            System.out.println("Самолёт загружен");
//        } else {
//            System.out.println("Вам нужен самолёт побольше");
//        }
//    }
}
