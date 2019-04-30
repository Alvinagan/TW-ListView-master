package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvYear;
    ArrayList<Modules> modules;
    ArrayAdapter aa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        aa = new ModuleAdapter(this, R.layout.modules_row, modules);
        lv.setAdapter(aa);

        lv = (ListView) this.findViewById(R.id.lvModules);
        tvYear = (TextView) findViewById(R.id.tvYear);

        modules = new ArrayList<Modules>();
        modules.add(new Modules("c208", false));
        modules.add(new Modules("c200", true));
        modules.add(new Modules("c346", true));


        Intent i = getIntent();
        String year = i.getStringExtra("year");
        tvYear.setText(year);



    }



}
