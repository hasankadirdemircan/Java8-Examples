package com.hkdemircan._04.executer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterTest02 {
    public static void main(String[] args) {

        ExecutorService service = Executors.newSingleThreadExecutor();
        //Executor service2 = Executors.newSingleThreadExecutor();

        System.out.println("begin : " + Thread.currentThread().getName());

        service.execute(() -> { //service.submit
            System.out.println("sample runnable");
            System.out.println("thread execute 1: " + Thread.currentThread().getName());
        });

        service.execute(() -> { //service.submit
            for (int i = 0; i < 3; i++)
                System.out.println("Printing record: " + i);

            System.out.println("thread execute 2: " + Thread.currentThread().getName());
        });

        // single-thread executor, results are guaranteed to be executed in the
        // order in which they are added to the executor service
        // This is because the main() method is still an independent thread from
        // the ExecutorService, and it can perform tasks while the other thread
        // is running

        System.out.println("end : " + Thread.currentThread().getName());

        System.out.println(service.isShutdown());
        System.out.println(service.isTerminated());
        service.shutdown();
        // A thread executor creates a non-daemon thread on the rst task that is
        // executed, so failing to call shutdown() will result in your
        // application never terminating.
        //after shutdown, we can not execute the service. we get an error.
//				service.execute(() -> {
//					System.out.println("java.util.concurrent.RejectedExecutionException");
//				});
    }
}
/*
now 2 threads working on that are main and pool-1-thread-1
begin : main
sample runnable
thread execute 1: pool-1-thread-1
end : main
Printing record: 0
Printing record: 1
Printing record: 2
false
thread execute 2: pool-1-thread-1
false
 */

//if we want to return a result after the thread we need to use Callable. Because Runnable is void and nothing returns.
