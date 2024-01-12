package org.ThreadBasics;

import java.util.concurrent.*;

public class CallableRunner {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(1);

        Future<String> welcomeFuture = executorService.submit(new CallableTask(" Karen"));

        System.out.print("exemplo");

        String welcomeMessage = welcomeFuture.get();

        System.out.println(welcomeMessage);

        System.out.println("Done");

        executorService.shutdown();
    }
}
