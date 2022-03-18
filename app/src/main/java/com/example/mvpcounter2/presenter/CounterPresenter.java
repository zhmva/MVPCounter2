package com.example.mvpcounter2.presenter;

import com.example.mvpcounter2.data.CounterModel;

public class CounterPresenter implements PresenterContracts.CounterPresenter{
    private PresenterContracts.CounterView counterView;
    private CounterModel counterModel;

    public CounterPresenter() {
        counterModel = new CounterModel();
    }

    @Override
    public void increment() {
        counterModel.increment();
        counterView.updateCounter(counterModel.getCount());
        checkCase5();
        checkCase10();
    }
    @Override
    public void decrement() {
        counterModel.decrement();
        counterView.updateCounter(counterModel.getCount());
        checkCase5();
        checkCase10();
    }

    public void checkCase10() {
        if (counterModel.isEquals10()){
            counterView.setColour();
        }
    }

    public void checkCase5() {
        if (counterModel.isEquals5()){
            counterView.toast();
        }
    }


    @Override
    public void attachView(PresenterContracts.CounterView counterView) {
        this.counterView = counterView;
    }
}
