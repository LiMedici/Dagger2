package com.medici.demo.dagger;

import dagger.Component;

@Component(modules = FirstModule.class)
public interface FirstComponent {

    void inject(FirstActivity activity);

}
