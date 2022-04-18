package com.hkdemircan.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest01 {
    public static void main(String[] args) {
        //Acquiring and releasing locks for such primitive operations is not efficient. In such cases, Java provides an efficient alternative in the form of atomic variables.

        //only AtomicInteger and AtomicLong extend from Number class but not AtomicBoolean. all other classes in the java.util.concurrent.atomic subpackage inherit directly from the Object class.


        // The classes such as AtomicInteger do not use a lock; rather, they
        // internally use volatile variables and a low-level mechanism known as
        // Compare-And-Set (CAS). For this reason, using AtomicInteger and
        // related classes is faster than using locks using synchronized
        // keyword.

        //There is no race condition for atomic
        AtomicInteger atomic = new AtomicInteger();
        atomic.set(10);
        atomic.getAndIncrement(); // c++;
        atomic.incrementAndGet();// ++c;

        System.out.println(atomic);

    }
}
//these steps for c++
// c++ >
// 1 ) read the value of C
// 2 ) increment C
// 3 ) read the current value of C
//it might be race condition here. but we don't have this issue for atomic