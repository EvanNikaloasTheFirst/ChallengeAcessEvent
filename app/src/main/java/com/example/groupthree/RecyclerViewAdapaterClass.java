package com.example.groupthree;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.File;
import java.util.ArrayList;

public class RecyclerViewAdapaterClass extends RecyclerView.Adapter<RecyclerViewAdapaterClass.ViewHolder> {
    private ArrayList<File> fileList;
    private SelectListener listener;

    public RecyclerViewAdapaterClass(ArrayList<File> fileList, SelectListener listener) {
        this.fileList = fileList;
        this.listener = listener;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView fileName;
        public Button delete,Edit,View;

        public LinearLayout fileLayout;

        public ViewHolder(View itemView) {
            super(itemView);
//            identifies elements from xml files
            fileName = itemView.findViewById(R.id.displayTxt);
            fileLayout = itemView.findViewById(R.id.lists);
            View = itemView.findViewById(R.id.View);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder,  int index) {
        File file = (File) fileList.get(index);
        holder.fileName.setText(file.getName());


        holder.View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), viewReferal.class);
//                The path of the file is saved in the key as "filepath
                intent.putExtra("filePath", file.getAbsolutePath());
                intent.putExtra("id","#123345");
                intent.putExtra("type","CHC");
                intent.putExtra("status","Completed");
                intent.putExtra("dateCreate","10/05/2022");
                intent.putExtra("dateReviewed","10/01/2023");
                view.getContext().startActivity(intent);
            }
        });

    }


    @Override
    public int getItemCount() {
        return fileList.size();
    }
}

