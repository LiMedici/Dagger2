package com.medici.demo.todo.task;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.medici.demo.App;
import com.medici.demo.todo.base.BaseActivity;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;

public class TaskActivity extends BaseActivity implements TaskContract.View {

    @Inject
    TaskPresenter mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*((App)getApplication()).getAppComponent()
                .taskComponent()
                .view(this)
                .build()
                .inject(this);*/

        mPresenter.start();
    }

    @Override
    public void showError(int str) {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void setPresenter(TaskContract.Presenter presenter) {

    }
}
