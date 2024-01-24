package org.ExcepcionalHandling;

public class CheckedExeptionRunner {

    public static void main(String[] args) {

        try {
            someOtherMethod();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void someOtherMethod() throws InterruptedException { //another  way to hanndle exception
        Thread.sleep(2000);
    }
}
