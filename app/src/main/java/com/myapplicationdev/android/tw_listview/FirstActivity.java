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
    ArrayList<Module> module;
    ArrayAdapter aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = this.findViewById(R.id.lvModule);

        module = new ArrayList<Module>();
        module.add(new Module("Year 1", false));
        module.add(new Module("Year 2", true));
        module.add(new Module("Year 3", true));


        aa = new ModuleAdapter(this, R.layout.row, module);
        lv.setAdapter(aa);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Module selectedModule = module.get(position);

                String year = lv.getAdapter().getItem(position).toString();
                Intent i = new Intent(FirstActivity.this, SecondActivity.class);
                i.putExtra("year", year);
                startActivity(i);
            }
        });


    }
}
