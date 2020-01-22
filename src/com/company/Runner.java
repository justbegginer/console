package com.company;

public class Runner extends Thread { // needs for seed for random
    private int count = 0;
    @Override
    public void run() {
        while(true){
            for(;this.count < 11;this.count++){
                try {
                    this.sleep(200);
                } catch (InterruptedException e) {
                    break;
                }
            }
            this.count = 0;
        }
    }
    public int getCount(){
        return this.count;
    }
}
