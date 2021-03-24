package com.company;

import java.util.Arrays;

public class QMain {
    public static void main(String[] args) throws InterruptedException {
        String[] people = new String[20];
        for(int i = 0; i < people.length; i++){
            people[i] = "A: " + i;
        }
        String[] group1 = Arrays.copyOfRange(people, 0, 10);
        String[] group2 = Arrays.copyOfRange(people, 10, 20);
        Thread t1 = new Thread(new Queue(group1));
        Thread t2 = new Thread(new Queue(group2));

        t1.setName("Queue1");
        t2.setName("Queue2");
        t1.start();
        t2.start();

        t2.join();
    }
}

class Queue implements Runnable{
    private String[] people;

    public Queue(String[] people) {
        this.people = people;
    }

    @Override
    public void run() {
        for(String str : people){
            System.out.println(Thread.currentThread().getName() + " Processing: " + str);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
