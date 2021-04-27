package robot;

import robot.hands.IHand;
import robot.hands.SamsungHand;
import robot.hands.SonyHand;
import robot.hands.ToshibaHand;
import robot.heads.IHead;
import robot.heads.SamsungHead;
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
        head[0] = new SamsungHead(50); // здесь у меня SamsungHead красным
        head[1] = new ToshibaHead(50);
        head[2] = new ToshibaHead(50);

        IHand[] hand = new IHand[3];
        hand[0] = new SonyHand(3200);
        hand[1] = new SamsungHand(4050);
        hand[2] = new ToshibaHand(3600);

        ILeg[] leg = new ILeg[3];
        leg[0] = new SamsungLeg(4300);
        leg[1] = new SonyLeg(4000);
        leg[2] = new ToshibaLeg(3760);

        IRobot[] robot = new IRobot[3];
        for (int i = 0; i < 3; i++) {
            robot[i] = new Robot(head[i], hand[i], leg[i]);
            System.out.println(robot[i]); // не выводит названия частей робота
        }
    }
}
