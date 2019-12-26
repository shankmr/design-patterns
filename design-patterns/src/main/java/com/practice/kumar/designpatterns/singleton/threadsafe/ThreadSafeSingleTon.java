package com.practice.kumar.designpatterns.singleton.threadsafe;

public class ThreadSafeSingleTon {

 private static ThreadSafeSingleTon singletonInstance;

 private ThreadSafeSingleTon(){}

 public static ThreadSafeSingleTon getInstance(){
     if(singletonInstance == null){
         synchronized (ThreadSafeSingleTon.class){
             if(singletonInstance == null){
                 return new ThreadSafeSingleTon();
             }
         }
     }
     return singletonInstance;
 }

}
