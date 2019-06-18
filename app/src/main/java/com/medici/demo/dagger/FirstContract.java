package com.medici.demo.dagger;

import com.medici.demo.presenter.BaseContract;

public interface FirstContract {

    interface Presenter extends BaseContract.Presenter {

    }

    interface View extends BaseContract.View<Presenter>{

    }

}
