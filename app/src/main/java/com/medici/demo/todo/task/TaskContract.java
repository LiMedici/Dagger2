package com.medici.demo.todo.task;

import com.medici.demo.presenter.BaseContract;

public interface TaskContract {

    interface Presenter extends BaseContract.Presenter {

    }

    interface View extends BaseContract.View<Presenter>{

    }

}
