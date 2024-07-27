package com.example.bankdetails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class IFSCactivity extends AppCompatActivity {
    public static final String BANK = "com.example.bankdetails.BANK";
    public static final String CITY = "com.example.bankdetails.CITY";
    public static final String ADDRESS = "com.example.bankdetails.ADDRESS";
    public static final String Rtgs = "com.example.bankdetails.Rtgs";
    public static final String Neft = "com.example.bankdetails.Neft";
    public static final String Bankcode = "com.example.bankdetails.Bankcode";
    public static final String DISTRICT = "com.example.bankdetails.DISTRICT";
    public static final String Contact = "com.example.bankdetails.Contact";
    public static final String Ifsc = "com.example.bankdetails.IFSC";
    public static final String MICR= "com.example.bankdetails.MICR";
    public static final String ISO = "com.example.bankdetails.ISO";
    public static final String Branch = "com.example.bankdetails.Branch";
    public static final String State = "com.example.bankdetails.STATE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ifscactivity);
    }
    public void output(View view){
        EditText ifsc = (EditText) findViewById(R.id.code);
        String cod = ifsc.getText().toString();
        RequestQueue requestQueue;
        requestQueue = Volley.newRequestQueue(this);
        JsonObjectRequest jsonobjectRequest = new JsonObjectRequest(Request.Method.GET, "https://ifsc.razorpay.com/"+cod, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
//                    Log.d("IFSC", "This Responce is ", response.getString("BANK"));
                    String bank = response.getString("BANK");
                    String branch = response.getString("BRANCH");
                    String add = response.getString("ADDRESS");
                    String state = response.getString("STATE");
                    String city = response.getString("CITY");
                    String dis = response.getString("DISTRICT");
                    String contact = response.getString("CONTACT");
                    String micr = response.getString("MICR");
                    String neft = response.getString("NEFT");
                    String rtgs = response.getString("RTGS");
                    String iso = response.getString("ISO3166");
                    String bankcode = response.getString("BANKCODE");
                    String ifsc = response.getString("IFSC");


//                    Toast.makeText(IFSCactivity.this, "BANK : "+bank, Toast.LENGTH_SHORT).show();
//                    SystemClock.sleep(200);
//                    Toast.makeText(IFSCactivity.this, "CITY :"+city, Toast.LENGTH_SHORT).show();
//                    SystemClock.sleep(200);
//                    Toast.makeText(IFSCactivity.this, "STATE : "+state, Toast.LENGTH_SHORT).show();
//                    SystemClock.sleep(200);
//                    Toast.makeText(IFSCactivity.this, "ADDRESS : "+add, Toast.LENGTH_SHORT).show();
//                    SystemClock.sleep(500);
                    Intent inte = new Intent(IFSCactivity.this,outputactivity.class);
                    inte.putExtra(BANK,bank);
                    inte.putExtra(CITY,city);
                    inte.putExtra(ADDRESS,add);
                    inte.putExtra(Contact,contact);
                    inte.putExtra(Branch,branch);
                    inte.putExtra(State,state);
                    inte.putExtra(DISTRICT,dis);
                    inte.putExtra(MICR,micr);
                    inte.putExtra(Neft,neft);
                    inte.putExtra(Rtgs,rtgs);
                    inte.putExtra(ISO,iso);
                    inte.putExtra(Bankcode,bankcode);
                    inte.putExtra(Ifsc,ifsc);
                    Toast.makeText(IFSCactivity.this, "please it may take a while", Toast.LENGTH_SHORT).show();
                    startActivity(inte);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("IFSC","Something Went Wrong");
                Toast.makeText(IFSCactivity.this, "Something Went Wrong Please Try again !", Toast.LENGTH_SHORT).show();
            }
        });
        requestQueue.add(jsonobjectRequest);
    }
}