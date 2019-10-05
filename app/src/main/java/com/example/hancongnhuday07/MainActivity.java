package com.example.hancongnhuday07;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
        TextView bta;
        TextView btb;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            bta=findViewById(R.id.clicka);
            btb=findViewById(R.id.clickb);
            btb.setOnClickListener(this);
            bta.setOnClickListener(this);


        }

        @Override
        public void onClick(View view) {
            FragmentManager fragmentManager=getSupportFragmentManager();
            final FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            switch (view.getId()){

                case R.id.clickb:
                    Fragment_messages fragmentA=new Fragment_messages();
                    fragmentTransaction.add(R.id.frameContent,fragmentA);
                    fragmentTransaction.commit();
                    break;
                case R.id.clicka:
                   Fragmen_friends fragmentB=new Fragmen_friends();
                    fragmentTransaction.add(R.id.frameContent,fragmentB);
                    fragmentTransaction.commit();
                    break;

            }
        }

    }

