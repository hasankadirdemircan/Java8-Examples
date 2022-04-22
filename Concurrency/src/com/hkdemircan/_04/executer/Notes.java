package com.hkdemircan._04.executer;

public class Notes {

    //Executor is an interface that declares only one method: void execute(Runnable).
    // This may not look like a significant interface by itself,
    // but its derived classes (or interfaces), such as ExecutorService, ThreadPoolExecutor, and ForkJoinPool, support useful functionality.


    //İt is recommended that you use this framework anytime you need to create and execute a separate task,
    // even if you need only a single thread.


    //Finally Shutting Down a Thread Executer
    //Resources such as thread executors should be properly closed to prevent memory leaks. U unfortunately, the ExecuterService interface does not implement AutoCloseable, so you cannot use a try-with-resources statement. You can still use a finally block. While not required,, it is considered a good practice to do so.
    //ExecuterService service = null;
    //Try {
    //Service = Execuıtors.newSignleThreadExecutor();
    ////add tasks to thread executer.
    //}finally {
    //if(service !=null) service.shutdown();
    //}

}
