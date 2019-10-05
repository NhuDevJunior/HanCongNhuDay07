package com.example.hancongnhuday07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class Send extends AppCompatActivity {
    ArrayList<String> type;
    Spinner tvspinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);
        tvspinner=findViewById(R.id.tvspinner);
        type=new ArrayList<>();
        type.add("MRA");
        type.add("MRB");
        type.add("MRC");
        type.add("MRD");
        type.add("MRE");
        type.add("MRF");
        type.add("MRH");
        type.add("MRP");
        type.add("MRK");
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(getBaseContext(),android.R.layout.simple_list_item_1,type);
        tvspinner.setAdapter(arrayAdapter);

    }
}
