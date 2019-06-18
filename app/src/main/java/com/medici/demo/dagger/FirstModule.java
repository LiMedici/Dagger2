package com.medici.demo.dagger;

import com.medici.demo.presenter.BaseContract;

import dagger.Module;
import dagger.Provides;

@Module
public class FirstModule {

    private FirstContract.View view;

    public FirstModule(FirstContract.View view) {
        this.view = view;
    }

    @Provides
    FirstContract.View provideView(){
        return view;
    }

}
