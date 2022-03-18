package com.example.mvpcounter2.data;

public class CounterModel {

    private int count = 0;
    private boolean isEquals5 = false;
    private boolean isEquals10 = false;

    public void increment(){
        ++count;
        switch (count){
            case 5:
                isEquals5 = true;
                isEquals10 = false;
                break;
            case 10:
                isEquals5 =false;
                isEquals10 = true;
                break;
            default:
                isEquals5 = false;
                isEquals10 = false;
                break;
        }
    }

    public void decrement() {
        --count;
        switch (count) {
            case 5:
                isEquals5 = true;
                isEquals10 = false;
                break;
            case 10:
                isEquals5 =false;
                isEquals10 = true;
                break;
            default:
                isEquals5 = false;
                isEquals10 = false;
                break;

        }
    }

    public int getCount() {
        return count;
    }
    public boolean isEquals5(){
        return isEquals5;
    }
    public boolean isEquals10(){
        return isEquals10;
    }


}
