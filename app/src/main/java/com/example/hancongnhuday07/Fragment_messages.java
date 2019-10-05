package com.example.hancongnhuday07;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import java.util.ArrayList;
import java.util.List;

public class Fragment_messages extends Fragment {
        List<Contact> contact;
        ListView ivContact;
        AdapterContact adapterContact;
        LinearLayout maybay;
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View view=inflater.inflate(R.layout.fragment_message,container,false);
            ivContact=view.findViewById(R.id.rvlist2);
            maybay=view.findViewById(R.id.maybay);
            contact=new ArrayList<>();
            contact.add(new Contact("MRA","Hello"));
            contact.add(new Contact("MRB","What is your name"));
            contact.add(new Contact("MRC","oh no"));
            adapterContact=new AdapterContact(contact);
            ivContact.setAdapter(adapterContact);
            maybay.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(getContext(),Send.class);
                    startActivity(intent);
                }
            });
            return view;
        }
    }

