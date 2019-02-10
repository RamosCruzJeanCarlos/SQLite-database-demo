package com.ramos.sqlite_database_demo.model;

/**
 * Created by Jean Carlos Ramos Cruz on 2/8/19.
 */
public class Task {

    private int _id;
    private String _taskname;

    public Task(String _taskname) {
        this._taskname = _taskname;
    }

    public void Task(){

    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_taskname() {
        return _taskname;
    }

    public void set_taskname(String _taskname) {
        this._taskname = _taskname;
    }

}
