package com.gmail.ajengwidya.akakomhotel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RoomAdapter adapter;
    private ArrayList<HotelRoom> roomArrayList;
    private Button btnPesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        adapter = new RoomAdapter(roomArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    void addData(){
        roomArrayList = new ArrayList<>();
        roomArrayList.add(new HotelRoom("Standard A","500000","One single bed"));
        roomArrayList.add(new HotelRoom("Standard B","900000","Two single beds"));
        roomArrayList.add(new HotelRoom("Deluxe","1500000","One king size bed"));
        roomArrayList.add(new HotelRoom("Family","2000000","One king size bed, two single beds"));
    }

    public void onClick(View view){
        Intent intent = new Intent(MainActivity.this, ReserveActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }


    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId() == R.id.about){
            startActivity(new Intent(this, AboutMe.class));
        }

        return true;
    }
}
