package com.company;

public class Main {

    public static void main(String[] args) {
        Thread threadFirst = new Thread() {
            @Override
            public void run() {
                Console consoleSession = new Console();
            }
        };
        Thread threadSecond = new Thread() {
            @Override
            public void run() {
                Console consoleSession = new Console();
                System.out.println("interrupted");
            }
        };
        threadFirst.start();
        //threadSecond.start();
    }
}
