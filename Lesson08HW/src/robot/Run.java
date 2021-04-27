package robot;

import robot.hands.IHand;
import robot.hands.SamsungHand;
import robot.hands.SonyHand;
import robot.hands.ToshibaHand;
import robot.heads.IHead;
import robot.heads.SamsungHead;
import robot.heads.SonyHead;
import robot.heads.ToshibaHead;
import robot.legs.ILeg;
import robot.legs.SamsungLeg;
import robot.legs.SonyLeg;
import robot.legs.ToshibaLeg;


public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        IHead[] head = new IHead[3];
        head[0] = new SamsungHead(51);
        head[1] = new ToshibaHead(41);
        head[2] = new SonyHead(60);

        IHand[] hand = new IHand[3];
        hand[0] = new SonyHand(33);
        hand[1] = new SamsungHand(40);
        hand[2] = new ToshibaHand(36);

        ILeg[] leg = new ILeg[3];
        leg[0] = new SamsungLeg(43);
        leg[1] = new SonyLeg(40);
        leg[2] = new ToshibaLeg(37);

        IRobot[] robot = new IRobot[3];

        int maxPrice = Integer.MIN_VALUE;
        int iMax = Integer.MIN_VALUE;

        for (int i = 0; i < 3; i++) {
            System.out.println("----------------------------------------------------------");
            System.out.println("     Комплектация и работа робота № " + (i + 1));
            robot[i] = new Robot(head[i], hand[i], leg[i]);
            System.out.println(robot[i].toString());
            robot[i].action();
            System.out.println("     Стоимость робота № " + (i + 1) + ": " + robot[i].getPrice());
            System.out.println();
            if (robot[i].getPrice() > maxPrice) {
                iMax = i;
            }
        }
        System.out.println("----------------------------------------------------------");
        System.out.println("Самый дорогой робот робот №" + (iMax + 1) + ", стоимость которого " + robot[iMax].getPrice() + " у.е.");
    }
}
