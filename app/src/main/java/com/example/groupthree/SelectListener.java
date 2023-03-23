package com.example.groupthree;

import android.content.Intent;

import java.io.File;
import java.util.ArrayList;

public interface SelectListener {
    void onItemClicked(File file);

    void onActivityResult(int requestCode, int resultCode, Intent data,ArrayList fileList);

}
