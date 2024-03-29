package com.hkdemircan._05.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newSingleThreadExecutor();

        Runnable r1 = () -> {
            System.out.println("Runnable!");
        };

        Callable<Integer> c1 = () -> {
            System.out.println("Callable!");
            return 1;
        };
        //
        Future<?> f1 = service.submit(r1);
        Future<Integer> f2 = service.submit(c1);
        //
        System.out.println(f1.get());
        System.out.println(f2.get());
    }
}

// The Callable interface was introduced as an alternative to the Runnable
// interface, since it allows more details to be retrieved easily from the task
// after it is completed.
