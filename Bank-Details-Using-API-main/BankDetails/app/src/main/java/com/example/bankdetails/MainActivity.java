package com.example.bankdetails;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.android.volley.RequestQueue;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void IFSC(View view){
        Toast.makeText(this, "Please Wait....", Toast.LENGTH_SHORT).show();
        Intent in=new Intent(this,IFSCactivity.class);
        startActivity(in);
    }
    public void pincode(View view){
        Toast.makeText(this, "Please Wait....", Toast.LENGTH_SHORT).show();
        Intent in=new Intent(this,PinCode.class);
        startActivity(in);
    }

}