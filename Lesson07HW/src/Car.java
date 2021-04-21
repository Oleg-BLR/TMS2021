class Car extends Ground {

    private static final String TRANSPORT_TYPE_ID = "car";
    public static int count = 0;

    private String bodyType; //
    private int seatCapacity; // units

    public Car(int horsePower, int velocityMax, double mass, String brand,
               int weelsNumber, int fuelConsumption,
               String bodyType, int seatCapacity) {

        super(horsePower, velocityMax, mass, brand, weelsNumber, fuelConsumption);
        this.bodyType = bodyType;
        this.seatCapacity = seatCapacity;
        count++;
    }

    public void displayInfo() {
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.print("id - " + TRANSPORT_TYPE_ID + count);
        super.displayInfo();
        System.out.print(" Тип кузова: " + bodyType + "Кол-во пассажиров: " + seatCapacity);
        double kVt = getHorsePower() * 0.74;
        System.out.println("; Мощность в кВт: " + kVt + " по методу: " + kVtCoversion());
        System.out.println("------------------------------------------------------------------------------------------");
    }

    public String displayInfo2() {
        var s = ("id - " + TRANSPORT_TYPE_ID + count); // String s = не работало. Java поиеняла String на var и все заработало, почему? Как это объяснить?
        return s;
    }

    public double kVtCoversion() {  // Почему не получилось этот метод сделать private
        double kVtMethod = getHorsePower() * 0.74;
        return kVtMethod;
    }

    public static void distanceFuelconsumptionCalculation(int hourInput) { //
//        int distance = getVelocityMax() * hourInput;
        int distance = hourInput; // Почему не могу вставить в формулу velosityMax?
        int fuelConsumptionForInputHour = distance / 100; // Почему не могу вставить в формулу переменную fuelConsumption?
        System.out.println("Расстояние " + distance + " Потребление топлива " + fuelConsumptionForInputHour);
    }


}
