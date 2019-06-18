package com.medici.demo.dagger;

import com.medici.demo.presenter.BaseContract;
import com.medici.demo.presenter.BasePresenter;

import javax.inject.Inject;

public class FirstPresenter extends BasePresenter<FirstContract.View> implements FirstContract.Presenter{
    @Inject
    public FirstPresenter(FirstContract.View view) {
        super(view);
    }

    @Override
    public void start() {
        super.start();
        System.out.println(getView());
    }
}
