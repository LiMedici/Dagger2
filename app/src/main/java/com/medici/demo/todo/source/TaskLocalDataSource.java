package com.medici.demo.todo.source;

import android.content.Context;

import androidx.annotation.NonNull;

import javax.inject.Inject;

public class TaskLocalDataSource {

    private Context context;

    @Inject
    public TaskLocalDataSource(@NonNull Context context) {
        this.context = context;
    }
}
