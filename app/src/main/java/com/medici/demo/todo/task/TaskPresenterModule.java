package com.medici.demo.todo.task;

import com.medici.demo.todo.annotation.ActivityScope;
import com.medici.demo.todo.source.TaskRepository;

import dagger.Module;
import dagger.Provides;

@Module
public class TaskPresenterModule {

    @Provides
    @ActivityScope
    // 必须具体到类型，不能是超类或者子类
    TaskPresenter provideTaskPresenter(TaskRepository taskRepository,TaskActivity activity){
        return new TaskPresenter(taskRepository,activity);
    }

}
