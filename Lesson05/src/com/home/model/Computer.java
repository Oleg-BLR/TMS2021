package com.home.model;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    String processor;
    int ram;
    int hdd;
    int operationLifeCicles;
    boolean workPc = true;


    void description() {
        System.out.println("Процессор - "+ processor + ", Оперативная память - " + ram + ", Жесткий диск - " + hdd + ", Ресурс - " + operationLifeCicles);
    }

    private void on() {
        boolean workPc = true;
        System.out.println("Внимание! Введите 0 или 1");
        Scanner scan = new Scanner(System.in);
        int myZeroOrOne = scan.nextInt();
        Random randZeroOrOne = new Random();
        while (operationLifeCicles < this.operationLifeCicles) {
            while (this.workPc) {
                if (myZeroOrOne == randZeroOrOne.nextInt(11)) {
                    off();
                } else {
                    System.out.println("Компьютер сгорел!");
                    this.workPc = false;
                }
            }
        }
    }

    private void off() {
        System.out.println("Внимание! Введите 0 или 1");
        Scanner scan = new Scanner(System.in);
        int myZeroOrOne = scan.nextInt();
        Random randZeroOrOne = new Random();
        if (myZeroOrOne == randZeroOrOne.nextInt(11)) {
            on();
        } else {
            System.out.println("Компьютер сгорел!");
            this.workPc = false;
        }
    }
}