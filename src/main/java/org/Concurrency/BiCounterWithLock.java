package org.Concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {

    private int i = 0;
    private int j = 0;

    Lock lockForI = new ReentrantLock();
    Lock lockForJ = new ReentrantLock();

    public void incrementI(){
        lockForI.lock(); //Get lock I
        i++;
        lockForI.unlock();
        //Release Lock
    }

    public int getI() {
        return i;
    }

    public void incrementJ(){
        lockForJ.lock(); //Get lock J
        j++;
        lockForJ.unlock();
    }

    public int getJ() {
        return j;
    }

}
