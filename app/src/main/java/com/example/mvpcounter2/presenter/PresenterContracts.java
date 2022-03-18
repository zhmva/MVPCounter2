package com.example.mvpcounter2.presenter;

public class PresenterContracts {

    public interface CounterView{
      void updateCounter(int counter);
      void toast();
      void setColour();
    }
    public interface CounterPresenter{
      void increment();
      void decrement();

      void checkCase5();
      void checkCase10();

      void attachView(CounterView counterView);
    }
}
