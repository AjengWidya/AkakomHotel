package com.gmail.ajengwidya.akakomhotel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Output extends AppCompatActivity {
    TextView namaCustValue, date1Value, time1Value, date2Value, time2Value, roomValue, facValue, radioGroupValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        namaCustValue = (TextView) findViewById(R.id.namaCustValue);
        date1Value = (TextView) findViewById(R.id.date1Value);
        time1Value = (TextView) findViewById(R.id.time1Value);
        date2Value = (TextView) findViewById(R.id.date2Value);
        time2Value = (TextView) findViewById(R.id.time2Value);
        roomValue = (TextView) findViewById(R.id.roomValue);
        facValue = (TextView) findViewById(R.id.facValue);
        radioGroupValue = (TextView) findViewById(R.id.memberValue);

        Intent intent = getIntent();
        Bundle bukaPaket = intent.getExtras();

        String nama = bukaPaket.getString("namaCust");
        String tgl1 = bukaPaket.getString("date1");
        String wkt1 = bukaPaket.getString("time1");
        String tgl2 = bukaPaket.getString("date2");
        String wkt2 = bukaPaket.getString("time2");
        String kamar = bukaPaket.getString("room_name");
        String fasilitas = bukaPaket.getString("fac");
        String member = bukaPaket.getString("radioGroup");

        namaCustValue.setText(nama);
        date1Value.setText(tgl1);
        time1Value.setText(wkt1);
        date2Value.setText(tgl2);
        time2Value.setText(wkt2);
        roomValue.setText(kamar);
        facValue.setText(fasilitas);
        radioGroupValue.setText(member);
    }
}
