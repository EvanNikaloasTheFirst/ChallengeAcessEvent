package com.example.groupthree;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Environment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Referal extends AppCompatActivity implements SelectListener {
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.runlist);


        ArrayList<File> fileList = new ArrayList<>();
        RecyclerView recyclerView = findViewById(R.id.rvList);
        RecyclerViewAdapaterClass rvAdapater = new RecyclerViewAdapaterClass(fileList,
              this);
        recyclerView.setAdapter(rvAdapater);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        File dir = new File(Environment.getExternalStorageDirectory().getPath() + "/my_directory/");

        File file = new File(dir,"#1224.txt");

        try {
            FileWriter writer = new FileWriter(file);
            writer.write("This is some sample text.");
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        File file1 = new File(dir,"#1434.txt");

        try {
            FileWriter writer = new FileWriter(file);
            writer.write("This is some sample text.");
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        File file2 = new File(dir,"#1225.txt");

        try {
            FileWriter writer = new FileWriter(file);
            writer.write("This is some sample text.");
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
// Iterate over the files and add their names to the fileList ArrayList

            fileList.add(file);
            fileList.add(file1);
            fileList.add(file2);











    }

    @Override
    public void onItemClicked(File file) {

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data, ArrayList fileList) {

    }
}