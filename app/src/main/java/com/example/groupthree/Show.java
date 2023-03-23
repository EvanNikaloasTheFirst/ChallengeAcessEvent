package com.example.groupthree;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Show extends AppCompatActivity {

    private EditText id,firstname,lastname,contactNum,address,postcode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show);

        id =findViewById(R.id.id);
        firstname = findViewById(R.id.firstName);
        lastname = findViewById(R.id.lastName);
        contactNum = findViewById(R.id.contactNumber);
        address = findViewById(R.id.address);
        postcode = findViewById(R.id.postcode);

        Intent intent = getIntent();
        String idNum =  intent.getStringExtra("id");
        String userName =  intent.getStringExtra("name");
        String userlastName =  intent.getStringExtra("UserLastName");
        String Number = intent.getStringExtra("appUserNumber");
        String userAddress =  intent.getStringExtra("appUserAddress");
        String userPostcode =  intent.getStringExtra("addUserPostCode");


        id.setText(idNum);
        firstname.setText(userName);
        lastname.setText(userlastName);
        contactNum.setText(Number);
        address.setText(userAddress);
        postcode.setText(userPostcode);



    }

}
