package com.example.kars_master;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openAddParking(View view){
        Intent intent= new Intent(this,addparkingslot.class);
        startActivity(intent);
    }

    public void openBooking(View view){
        Intent intent= new Intent(this,VIewBookingSlot.class);
        startActivity(intent);
    }

    public void openViewUser(View view){
        Intent intent= new Intent(this,ViewUser.class);
        startActivity(intent);
    }

    public void openViewFeedback(View view){
        Intent intent= new Intent(this,ViewFeedback.class);
        startActivity(intent);
    }

    public void openCancelledSlot(View view){
        Intent intent=new Intent(this,CancelledSlot.class);
        startActivity(intent);
    }

    public void openPayments(View view){
        Intent intent=new Intent(this,Payments.class);
        startActivity(intent);
    }
}