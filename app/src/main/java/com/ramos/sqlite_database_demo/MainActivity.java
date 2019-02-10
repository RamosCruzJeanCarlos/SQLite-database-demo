package com.ramos.sqlite_database_demo;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.ramos.sqlite_database_demo.model.MyDatabaseHelper;
import com.ramos.sqlite_database_demo.model.Task;

public class MainActivity extends AppCompatActivity {

    EditText etTasks;
    TextView tvTasks;
    MyDatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etTasks = (EditText) findViewById(R.id.et_tasks);
        tvTasks = (TextView) findViewById(R.id.tv_tasks);
        databaseHelper = new MyDatabaseHelper(this,null,null,1);
        printDatabase();
    }

    public void addButtonTask(View view) {
        Task task = new Task(etTasks.getText().toString());
        databaseHelper.addTask(task);
        printDatabase();
        cleanTaskField();
        MediaPlayer mp = MediaPlayer.create(this,R.raw.coin_sound);
        mp.start();
    }

    public void removeButtonTask(View view) {
        databaseHelper.removeTask(etTasks.getText().toString());
        printDatabase();
        cleanTaskField();
        MediaPlayer mp = MediaPlayer.create(this,R.raw.coin_sound);
        mp.start();
    }

    public void printDatabase(){
        String dbString = databaseHelper.databaseToString();
        tvTasks.setText(dbString);
    }

    public void cleanTaskField(){
        etTasks.setText("");
    }
}
