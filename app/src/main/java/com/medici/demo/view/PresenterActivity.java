package com.medici.demo.view;

import androidx.appcompat.app.AppCompatActivity;

import com.medici.demo.presenter.BaseContract;

public abstract class PresenterActivity<Presenter extends BaseContract.Presenter> extends AppCompatActivity implements BaseContract.View<Presenter> {

    @Override
    public void showError(int str) {

    }

    @Override
    public void showLoading() {

    }
}
