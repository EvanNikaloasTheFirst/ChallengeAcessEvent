package com.example.groupthree;

import static com.example.groupthree.R.id.showCard;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import java.sql.Ref;

public class Dashboard extends AppCompatActivity {

    private CardView updateCard,referalCard,showCard;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        updateCard = findViewById(R.id.updateCard);
        referalCard = findViewById(R.id.referalCard);
        showCard = findViewById(R.id.showCard);


        updateCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sp = getApplicationContext().getSharedPreferences("appUser", Context.MODE_PRIVATE);

                String id = sp.getString("appUserId","");
                String name = sp.getString("appUserName","");
                String appUserLastName = sp.getString("appUserLastName","");
                String appUserNumber = sp.getString("appUserNumber","");
                String appUserAddress = sp.getString("appUserId","");
                String addUserPostCode = sp.getString("appUserId","");

                Intent intent = new Intent(Dashboard.this,Update.class);
                intent.putExtra("id",id);
                intent.putExtra("name",name);
                intent.putExtra("UserLastName",appUserLastName);
                intent.putExtra("appUserNumber",appUserNumber);
                intent.putExtra("appUserAddress",appUserAddress);
                intent.putExtra("addUserPostCode",addUserPostCode);
                startActivity(intent);



            }
        });


        referalCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Dashboard.this,Referal.class);

                startActivity(intent);



            }
        });


        showCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sp = getApplicationContext().getSharedPreferences("appUser", Context.MODE_PRIVATE);

                String id = sp.getString("appUserId","");
                String name = sp.getString("appUserName","");
                String appUserLastName = sp.getString("appUserLastName","");
                String appUserNumber = sp.getString("appUserNumber","");
                String appUserAddress = sp.getString("appUserId","");
                String addUserPostCode = sp.getString("appUserId","");

                Intent intent = new Intent(Dashboard.this, Show.class);
                intent.putExtra("id",id);
                intent.putExtra("name",name);
                intent.putExtra("UserLastName",appUserLastName);
                intent.putExtra("appUserNumber",appUserNumber);
                intent.putExtra("appUserAddress",appUserAddress);
                intent.putExtra("addUserPostCode",addUserPostCode);
                startActivity(intent);
            }
        });



    }
}
