package com.gmail.ajengwidya.akakomhotel;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ReserveActivity extends AppCompatActivity {
    EditText namaCust, date1, date2, time1, time2;
    TextView room_name;
    CheckBox gym, laundry;
    RadioGroup radioGroup;
    Button button;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserve);

        namaCust = (EditText) findViewById(R.id.namaCust);
        date1 = (EditText) findViewById(R.id.date1);
        date2 = (EditText) findViewById(R.id.date2);
        time1 = (EditText) findViewById(R.id.time1);
        time2 = (EditText) findViewById(R.id.time2);
        room_name = (TextView) findViewById(R.id.room_name);
        gym = (CheckBox) findViewById(R.id.gym);
        laundry = (CheckBox) findViewById(R.id.laundry);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        button = (Button) findViewById(R.id.button);
    }

    public void reserve(View view){
        String fac = "";
        if(gym.isChecked()){
            fac += "Additional charge IDR 20,000 will be added to your total bill for using gym facility (cost per use) \n";
        }
        if(laundry.isChecked()){
            fac += "Additional charge IDR 10,000 will be added to your total bill for using laundry facility (cost per use) \n";
        }
        Intent intent = new Intent(ReserveActivity.this, Output.class);
        Bundle b = new Bundle();
        b.putString("namaCust", namaCust.getText().toString());
        b.putString("date1", date1.getText().toString());
        b.putString("time1", time1.getText().toString());
        b.putString("date2", date2.getText().toString());
        b.putString("time2", time2.getText().toString());
        b.putString("room_name", room_name.getText().toString());
        b.putString("fac", fac);

        int id = radioGroup.getCheckedRadioButtonId();
        RadioButton member = (RadioButton) findViewById(id);
        b.putString("radioGroup", member.getText().toString());

        intent.putExtras(b);
        startActivity(intent);
     }

}
