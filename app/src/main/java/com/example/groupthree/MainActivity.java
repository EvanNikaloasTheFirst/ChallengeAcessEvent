package com.example.groupthree;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button login;

    private EditText username,password;

    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.signIn);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);


        String[] idArray = {"12345","67891"};
        String[] passwords = {"123","123"};
        String[] nameArray = {"Johnathon","Harry"};
        String[] lastNameArray = {"Stones","Maguire"};
        String[] contactNumberArray = {"07904333295","045887649338"};
        String[] houseAddressArray = {"7 Nether Priors", "155 St Crispin Drive"};
        String[] postcodeArray ={"SS14 1LT", "1QP 4PT"};

        String[] admins = {"Admin"};
        String[] adminPassword = {"123"};


        sp = getSharedPreferences("appUser", Context.MODE_PRIVATE);

        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = sp.edit();
                for (int i = 0; i < idArray.length; i++) {
                    if (username.getText().toString().equals(idArray[i]) && password.getText().toString().equals(passwords[i])) {
                        editor.putString("appUserId", idArray[i]);
                        editor.putString("appUserName", nameArray[i]);
                        editor.putString("appUserLastName", lastNameArray[i]);
                        editor.putString("appUserNumber", contactNumberArray[i]);
                        editor.putString("appUserAddress", houseAddressArray[i]);
                        editor.putString("addUserPostCode", postcodeArray[i]);
                        editor.commit();

                        Toast.makeText(MainActivity.this,
                                "Hello " + nameArray[i], Toast.LENGTH_LONG).show();


                        Intent intent = new Intent(MainActivity.this, Dashboard.class);
                        startActivity(intent);


                    };

                }


            }
        });
    }
}