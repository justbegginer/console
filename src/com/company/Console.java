package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Console {
    Runner runner;
    public Console() {
        runner = new Runner();
        runner.start();
        session();
    }

    public void session() {
        while (true) {
            Scanner scan = new Scanner(System.in);
            boolean exitCode = commands(scan.nextLine().split(" "));
            if (exitCode){
                break;
            }
        }
        //System.out.println("interrupted");
    }
    private boolean commands(String[] commands){
        for (int i = 0; i < commands.length; i++) {
            switch(commands[i]){
                case "exit":
                    exit();
                    return true;
            }
        }

        return false;
    }
    private String[] slice(String[] initialArray , int begin , int end){ // begin includes , end doesn't include
        String[] slice = new String[end - begin];
        for (int i = begin , index = 0; i < end; i++ , index++) {
            slice[index] = initialArray[i];
        }
        return slice;
    }

    private void ls(String[] attr) {

    }
    private void exit(){
        runner.interrupt();
    }

}
