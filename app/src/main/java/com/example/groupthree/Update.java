package com.example.groupthree;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Update extends AppCompatActivity {

    private EditText id,firstName,lastName,contactNumber,address,postcode;
    private Button submitBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        id = findViewById(R.id.id);
        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        contactNumber = findViewById(R.id.contactNumber);
        address = findViewById(R.id.address);
        postcode = findViewById(R.id.postcode);

        submitBtn = findViewById(R.id.submitUpdate);

        Intent intent  = getIntent();
       String idNum =  intent.getStringExtra("id");
       String userName =  intent.getStringExtra("name");
       String userlastName =  intent.getStringExtra("UserLastName");
        String Number = intent.getStringExtra("appUserNumber");
       String userAddress =  intent.getStringExtra("appUserAddress");
       String userPostcode =  intent.getStringExtra("addUserPostCode");

        id.setText(idNum);
        firstName.setText(userName);
        lastName.setText(userlastName);
        contactNumber.setText(Number);
        address.setText(userAddress);
        postcode.setText(userPostcode);


        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Update.this,
                        "Your update request has been submitted ", Toast.LENGTH_LONG).show();
            }
        });




    }
}