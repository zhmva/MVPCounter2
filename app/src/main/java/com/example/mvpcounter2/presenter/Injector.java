package com.example.mvpcounter2.presenter;


public class Injector {

    public static CounterPresenter getPresenter(){
        return new CounterPresenter();
    }
}
