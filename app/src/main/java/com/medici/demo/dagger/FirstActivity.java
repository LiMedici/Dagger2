package com.medici.demo.dagger;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.medici.demo.R;
import com.medici.demo.WelcomeActivity;
import com.medici.demo.presenter.BaseContract;
import com.medici.demo.todo.task.TaskActivity;

import javax.inject.Inject;

import dagger.Lazy;

public class FirstActivity extends AppCompatActivity implements FirstContract.View {

    private Button mButton;
    @Inject
    Lazy<FirstPresenter> mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        DaggerFirstComponent.builder().firstModule(new FirstModule(this)).build().inject(this);
        System.out.println(mPresenter);


        mButton = findViewById(R.id.button);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this, TaskActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void showError(int str) {



    }

    @Override
    public void showLoading() {

    }

    @Override
    public void setPresenter(FirstContract.Presenter presenter) {

    }
}
