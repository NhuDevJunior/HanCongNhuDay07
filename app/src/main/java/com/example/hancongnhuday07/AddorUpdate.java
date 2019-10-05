package com.example.hancongnhuday07;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddorUpdate extends AppCompatActivity {
    Button addorup;
    EditText addname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addor_update);
        addorup=findViewById(R.id.addorup);
        addname=findViewById(R.id.tvaddname);
        FragmentManager fragmentManager=getSupportFragmentManager();
        final FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        addorup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragmen_friends fragmen_friends=new Fragmen_friends();
                Bundle bundle=new Bundle();
                bundle.putString("name",addname.getText().toString());
                fragmen_friends.setArguments(bundle);

            }
        });

    }
}
