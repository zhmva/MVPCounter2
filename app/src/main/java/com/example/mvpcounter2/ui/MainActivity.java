package com.example.mvpcounter2.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.example.mvpcounter2.R;
import com.example.mvpcounter2.databinding.ActivityMainBinding;
import com.example.mvpcounter2.presenter.CounterPresenter;
import com.example.mvpcounter2.presenter.Injector;
import com.example.mvpcounter2.presenter.PresenterContracts;

public class MainActivity extends Activity implements PresenterContracts.CounterView {
    ActivityMainBinding binding;
    private CounterPresenter counterPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        counterPresenter = Injector.getPresenter();
        counterPresenter.attachView(this);
        initListeners();
    }

    private void initListeners() {
        binding.incrementBtn.setOnClickListener(view -> counterPresenter.increment());
        binding.decrementBtn.setOnClickListener(view -> counterPresenter.decrement());
    }

    @Override
    public void updateCounter(int counter) {
        binding.counterTv.setTextColor(getResources().getColor(R.color.black));
        binding.counterTv.setText(String.valueOf(counter));
    }

    @Override
    public void toast() {
        Toast.makeText(this, "Ура! Вы достигли 5", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void setColour() {
        binding.counterTv.setTextColor(getResources().getColor(R.color.green));

    }
}
