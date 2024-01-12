package org.ThreadBasics.MultipleCallableRunner;

import org.ThreadBasics.CallableTask;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService = Executors.newFixedThreadPool(1);

        List<CallableTask> tasks = List.of(new CallableTask("Luiz"), new CallableTask("Karina"),
                new CallableTask("Tati"), new CallableTask("Julie"), new CallableTask("Timy"),
        new CallableTask("Gota emã"));

        //List<Future<String>> results = executorService.invokeAll(tasks);

//        for(Future<String> result : results){
//            System.out.println(result.get());
//        }

        String result = executorService.invokeAny(tasks); //usando este novo método - assim que alguma das tasks passadas como parametro
                                                            //eh concluida, um resultado eh retornado e o processo finaliza

        System.out.println(result);

        executorService.shutdown();
    }
}
