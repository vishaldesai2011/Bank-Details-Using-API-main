package com.example.bankdetails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class outputactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outputactivity);
        Intent inte = getIntent();
       String bname = inte.getStringExtra(IFSCactivity.BANK);
       String IFSC = inte.getStringExtra(IFSCactivity.Ifsc);
       String BRANCH = inte.getStringExtra(IFSCactivity.Branch);
       String ADDRESS = inte.getStringExtra(IFSCactivity.ADDRESS);
       String CONTACT = inte.getStringExtra(IFSCactivity.Contact);
       String mic = inte.getStringExtra(IFSCactivity.MICR);
       String City = inte.getStringExtra(IFSCactivity.CITY);
       String Dis = inte.getStringExtra(IFSCactivity.DISTRICT);
       String ISOs = inte.getStringExtra(IFSCactivity.ISO);
       String state = inte.getStringExtra(IFSCactivity.State);
       String neft = inte.getStringExtra(IFSCactivity.Neft);
       String rtgs1 = inte.getStringExtra(IFSCactivity.Rtgs);
       String bankc = inte.getStringExtra(IFSCactivity.Bankcode);

       TextView iifc = (TextView)findViewById(R.id.ifsc);
       iifc.setText(IFSC);
       TextView bankname = (TextView)findViewById(R.id.bank);
       bankname.setText(bname);
       TextView branch = (TextView)findViewById(R.id.branch);
       branch.setText(BRANCH);
       TextView ADDS = (TextView)findViewById(R.id.address);
       ADDS.setText("ADDRESS : "+ADDRESS);
       TextView CON = (TextView)findViewById(R.id.contact);
       CON.setText(CONTACT);
       TextView MICR = (TextView)findViewById(R.id.micr);
       MICR.setText(mic);
       TextView cit = (TextView)findViewById(R.id.city);
       cit.setText(City);
       TextView District = (TextView)findViewById(R.id.district);
       District.setText(Dis);
       TextView isos = (TextView)findViewById(R.id.iso);
       isos.setText(ISOs);
       TextView STATE = (TextView)findViewById(R.id.state1);
       STATE.setText(state);
       TextView NEFT = (TextView)findViewById(R.id.neft);
       NEFT.setText(neft);
       TextView RTGS = (TextView)findViewById(R.id.rtgs);
       RTGS.setText(rtgs1);
       TextView bcode = (TextView)findViewById(R.id.bankcode);
       bcode.setText(bankc);

    }
}