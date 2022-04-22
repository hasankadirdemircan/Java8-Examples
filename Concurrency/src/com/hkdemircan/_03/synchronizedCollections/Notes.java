package com.hkdemircan._03.synchronizedCollections;

public class Notes {
    //When should you use these methods?
    //If you know at the time of creation that your object requires synchronization, then you should use on of the concurrent collection classes listed.
    //On the other hand, if you are given an existing collection that is not a concurrent class and need to access it among multiple threads, you can wrap it using the methods. (SynchronizedCollection,List,Map..)
    //
    //While the methods in (SynchronizedCollection,List,Map..)
    //Synchronize access to the data elements, such as the get() and set() methods,
    // they do not synchronize access on any iterators that you synchronize may create from the synchronized collection.
    // Therefore, it is imperative that you use a synchronization block
    // if you need to iterate over any of the returned collections is synchronized collection methods.
}
