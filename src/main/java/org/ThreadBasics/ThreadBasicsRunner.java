package org.ThreadBasics;

class Task1 extends Thread{

    public void run() {  //SIGNATURE

        System.out.println("Task 1 kicked off");

        for(int i = 101; i <= 199; i++)
            System.out.print(i + " ");

        System.out.println("\nTask1 Done");
    }
}

class Task2 implements Runnable{

    @Override
    public void run() {  //SIGNATURE
        System.out.println("Task 2 kicked off");

        for(int i = 201; i <= 299; i++)
            System.out.print(i + " ");

        System.out.println("\nTask2 Done");
    }
}

public class ThreadBasicsRunner {

    public static void main(String[] args) throws InterruptedException {

        Task1 task1 = new Task1();
        task1.setPriority(1);
        task1.start();

        Task2 task2 = new Task2();
        Thread task2Thread = new Thread(task2);  //eh necessario implementar a interface
        task2Thread.setPriority(10);
        task2Thread.start();

        task1.join();

        System.out.println("Task 3 kicked off");

        for(int i = 301; i <= 399; i++)
            System.out.print(i + " ");

        System.out.println("\nTask3 Done");
    }
}
