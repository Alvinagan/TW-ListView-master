package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.time.Year;
import java.util.ArrayList;

public class FirstActivity extends AppCompatActivity {

    ListView lv;
    ArrayList year;
    ArrayAdapter aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = this.findViewById(R.id.lvModule);

        final ArrayList<String>alYear = new ArrayList<>();
        alYear.add("Year 1");
        alYear.add("Year 2");
        alYear.add("Year 3");


        ArrayAdapter<String>aa;
        aa = new ArrayAdapter(this,android.R.layout.simple_list_item_1, alYear);
        lv.setAdapter(aa);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String year = alYear.get(position);

                Intent i = new Intent(FirstActivity.this, SecondActivity.class);
                i.putExtra("year", year);
                startActivity(i);
            }
        });


    }
}
