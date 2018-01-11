package com.example.aidankosik.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class addSubscription extends AppCompatActivity {

    Button submitButton;
    EditText nameText, dateText, priceText, commentText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_subscription);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        submitButton = (Button) findViewById(R.id.submitButton);
        nameText = (EditText) findViewById(R.id.editName);
        dateText = (EditText) findViewById(R.id.editDate);
        priceText = (EditText) findViewById(R.id.editPrice);
        commentText = (EditText) findViewById(R.id.editComment);

    }

    public void submitClick(View view) {
        //Intent mainIntent = new Intent(this, MainActivity.class);
        subscription newSub = new subscription(nameText.getText().toString(), dateText.getText().toString(), priceText.getText().toString(), commentText.getText().toString());
        MainActivity.subscriptionVector.add(newSub);
        Intent intent = new Intent(this, Home.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

}
