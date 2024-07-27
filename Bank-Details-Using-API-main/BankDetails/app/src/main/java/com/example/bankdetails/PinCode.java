package com.example.bankdetails;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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

public class PinCode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin_code);
    }
    public void getpin(View view){
        EditText pin = (EditText) findViewById(R.id.code);
        String cod = pin.getText().toString();
        RequestQueue requestQueue;
        requestQueue = Volley.newRequestQueue(this);
        JsonArrayRequest getRequest = new JsonArrayRequest(Request.Method.GET, "https://api.postalpincode.in/postoffice/New Delhi", null,new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
//for (int i=0;i<response.length();i++){
//    JSONArray arr = JSONObject.
//}
                    Log.d("Response",""+response.toString());
                Toast.makeText(PinCode.this, ""+response.toString(), Toast.LENGTH_SHORT).show();
        }
    }, new Response.ErrorListener() {
        @Override
        public void onErrorResponse(VolleyError error) {
            Log.d("PINCODE","Something Went Wrong"+error);
            Toast.makeText(PinCode.this, "Something Went Wrong Please Try again !", Toast.LENGTH_SHORT).show();
        }
    });
        requestQueue.add(getRequest);

}

    }


