package com.hkdemircan._06.scheduledExecuterService;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecuterServiceTest02 {
    public static void main(String[] args) {

        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleAtFixedRate(() -> System.out.println("test period message"), 3, 5, TimeUnit.SECONDS);

        // public ScheduledFuture<?> scheduleAtFixedRate(Runnable command,
        // long initialDelay,
        // long period,
        // TimeUnit unit);
    }
}
