package com.medici.demo.todo.task;

import com.medici.demo.presenter.BasePresenter;
import com.medici.demo.todo.source.TaskRepository;

import javax.inject.Inject;

public class TaskPresenter extends BasePresenter<TaskContract.View> implements TaskContract.Presenter{

    private TaskRepository mTaskRepository;

    @Inject
    public TaskPresenter(TaskRepository taskRepository,TaskContract.View view) {
        super(view);
        this.mTaskRepository = taskRepository;
    }

    @Override
    public void start() {
        super.start();
    }
}
