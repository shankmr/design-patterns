package com.practice.kumar.designpatterns.singleton.staticinnerclass;

public class InnerClassSingleTon {

    private InnerClassSingleTon(){}

    public static InnerClassSingleTon getInstance() {
        return SingleTonProvider.instance;
    }

    //This inner class does not loads in memory until client ask for singleton object.
    // Hence it does not require synchronisation.
    private static class SingleTonProvider {
        private static InnerClassSingleTon instance = new InnerClassSingleTon();
    }

}
